import java.util.Iterator;
import java.util.List;

/**
 * Created by Joshua on 10/12/2016.
 */
abstract public class CompositeEquipment extends Equipment
{
    //Dummy methods (do nothing but be place holders for functionality
    abstract Watt Power();
    abstract Currency NetPrice();
    abstract Currency Discount();
    //Throw an error if no method in the children
    public void Add(Equipment test)
    {
        throw new UnsupportedOperationException();
    }
    public void Remove(Equipment test)
    {
        throw new UnsupportedOperationException();
    }
    public Iterator<Equipment> CreateIterator()
    {
        throw new UnsupportedOperationException();
    }

    protected CompositeEquipment(char test)
    {

    }
    protected CompositeEquipment()
    {

    }


    private List<Equipment> _equipment;
}
