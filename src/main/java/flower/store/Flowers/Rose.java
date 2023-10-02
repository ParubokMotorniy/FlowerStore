package flower.store.Flowers;

import flower.store.Flower;
import flower.store.FlowerColor;
import flower.store.FlowerType;

public class Rose extends Flower
{
    public Rose()
    {
        super();
        price = 50;
        sepalLength = 1.5;
        flowerType = FlowerType.ROSE;
        color = FlowerColor.RED;
    }
    public Rose(Flower item)
    {
        super(item);
    }
}
