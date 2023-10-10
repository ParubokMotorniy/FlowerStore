package flower.sources.Flowers;

import flower.sources.Flower;
import flower.sources.FlowerColor;
import flower.sources.FlowerType;

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
