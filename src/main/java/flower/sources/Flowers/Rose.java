package flower.sources.Flowers;

import flower.sources.Flower;
import flower.sources.FlowerColor;
import flower.sources.FlowerType;

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
