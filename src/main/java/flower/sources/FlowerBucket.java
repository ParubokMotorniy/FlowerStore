package flower.sources;
import java.util.ArrayList;
import java.util.*;

public class FlowerBucket
{
    private List<FlowerPack> packs = new ArrayList<>();

    public void AddPack(FlowerPack newPack)
    {
        packs.add(newPack);
    }
    public double GetPrice()
    {
        double sum = 0;
        for (FlowerPack pack : packs)
        {
            sum += pack.GetPrice();
        }
        return sum;
    }
}
