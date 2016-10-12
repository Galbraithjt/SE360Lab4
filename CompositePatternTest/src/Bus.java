/**
 * Created by Joshua on 10/12/2016.
 */
public class Bus extends CompositeEquipment
{
    //place holders for functionality
    public Watt Power()
    {
        return new Watt();
    }
    public Currency NetPrice()
    {
        return new Currency();
    }
    public Currency Discount()
    {
        return new Currency();
    }
}