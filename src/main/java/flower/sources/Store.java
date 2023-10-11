package flower.sources;
import flower.sources.Flowers.Chamomile;
import flower.sources.Flowers.Rose;
import flower.sources.Flowers.Tulip;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Store
{
    Map<FlowerType, AbstractMap.SimpleEntry<Flower,Integer>> availableFlowers = new HashMap<>();

    public Store()
    {
        availableFlowers.put(FlowerType.CHAMOMILE, new AbstractMap.SimpleEntry<>(new Chamomile(), 15));
        availableFlowers.put(FlowerType.ROSE, new AbstractMap.SimpleEntry<>(new Rose(), 25));
        availableFlowers.put(FlowerType.TULIP, new AbstractMap.SimpleEntry<>(new Tulip(), 7));
    }
    public FlowerBucket Search(HashMap<FlowerType, Integer> query)
    {
        FlowerBucket queryBucket = new FlowerBucket();
        for(FlowerType type : query.keySet())
        {
            if(!availableFlowers.containsKey(type)){continue;}

            int addedQuantity = Math.min(availableFlowers.get(type).getValue(), query.get(type));
            //no 0 quantity check, since we assume that availableFlowers contains no 0 types
            FlowerPack newPack = new FlowerPack(availableFlowers.get(type).getKey(), addedQuantity);
            queryBucket.AddPack(newPack);
        }

        if(queryBucket.GetPrice() == 0){System.out.println("Sadly, out store is not able to satisfy your request at " + "the moment");}
        return queryBucket;
    }
}
