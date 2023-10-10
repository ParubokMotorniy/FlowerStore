package flower.sources.Flowers;

import flower.sources.Flower;
import flower.sources.FlowerColor;
import flower.sources.FlowerType;

public class Tulip extends Flower
{
    public Tulip()
    {
        super();
        price = 40;
        sepalLength = 1.3;
        flowerType = FlowerType.TULIP;
        color = FlowerColor.RED;
    }
    public Tulip(Flower item)
    {
        super(item);
    }
}
