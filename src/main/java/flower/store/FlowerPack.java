package flower.store;

import javax.naming.directory.InvalidAttributeValueException;

public class FlowerPack extends Item {
    private Flower flower;
    private int quantity = 1;

    public FlowerPack(Flower item)
    {
        flower = new Flower(item);
    }
    public FlowerPack(Flower item, int quantity) throws IllegalArgumentException
    {
        if(quantity <= 0)
        {
            throw new IllegalArgumentException();
        }
        flower = item;
        this.quantity = quantity;
    }

    public Flower getFlower()
    {
        return flower;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity) throws IllegalArgumentException
    {
        if(quantity <= 0)
        {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double GetPrice()
    {
        return flower.getPrice() * quantity;
    }
}
