package flower.store.Flowers;

import flower.store.Flower;
import flower.store.FlowerColor;
import flower.store.FlowerType;

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
