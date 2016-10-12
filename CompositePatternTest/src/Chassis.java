/**
 * Created by Joshua on 10/12/2016.
 */
public class Chassis extends CompositeEquipment
{
    //Dummy methods (do nothing but be place holders for functionality
    Chassis(char test)
    {

    }

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
    @Override
    public void Add(Equipment test)
    {

    }

}
