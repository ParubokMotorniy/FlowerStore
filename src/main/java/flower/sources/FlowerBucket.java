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
    public FlowerPack GetPack(FlowerType type)
    {
        FlowerPack newPack = null;
        for(FlowerPack pack : packs)
        {
            if(pack.getFlower().flowerType == type)
            {
                newPack = pack;
                break;
            }
        }
        return newPack;
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
