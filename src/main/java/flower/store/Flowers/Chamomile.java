package flower.store.Flowers;

import flower.store.Flower;
import flower.store.FlowerColor;
import flower.store.FlowerType;

public class Chamomile extends Flower
{
    public Chamomile()
    {
        super();
        price = 20;
        sepalLength = 1.0;
        flowerType = FlowerType.CHAMOMILE;
        color = FlowerColor.WHITE;
    }
    public Chamomile(Flower item)
    {
        super(item);
    }
}
