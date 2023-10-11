package flower.store;

import flower.sources.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class TestFlower
{
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;
    private Store store;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @BeforeEach
    public void CreateStore(){store = new Store();}

    @Test
    public void TestStore()
    {
        HashMap<FlowerType, Integer> query1 = new HashMap<>();
        query1.put(FlowerType.CHAMOMILE, 18);
        query1.put(FlowerType.TULIP, 4);
        FlowerBucket queriedBucket = store.Search(query1);
        Assertions.assertEquals(15, queriedBucket.GetPack(FlowerType.CHAMOMILE).getQuantity());
        Assertions.assertEquals(4, queriedBucket.GetPack(FlowerType.TULIP).getQuantity());

        HashMap<FlowerType, Integer> query2 = new HashMap<>();
        query2.put(FlowerType.ROSE, 23);
        query2.put(FlowerType.TULIP, 8);
        queriedBucket = store.Search(query2);
        Assertions.assertEquals(23, queriedBucket.GetPack(FlowerType.ROSE).getQuantity());
        Assertions.assertEquals(7, queriedBucket.GetPack(FlowerType.TULIP).getQuantity());
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }
}
