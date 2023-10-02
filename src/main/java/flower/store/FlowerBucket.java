package flower.store;

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.*;

public class FlowerBucket
{
    private List<FlowerPack> packs = new ArrayList<FlowerPack>();

    public void AddPack(FlowerPack newPack)
    {
        packs.add(newPack);
    }
    public double GetPrice()
    {
        double sum = 0;
        for(FlowerPack pack : packs)
        {
            sum += pack.GetPrice();
        }
        return sum;
    }
}
