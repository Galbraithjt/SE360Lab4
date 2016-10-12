import java.util.Iterator;

/**
 * Created by Joshua on 10/12/2016.
 */
public abstract class Equipment
{

    //Abstract methods
    abstract Watt Power();
    abstract Currency NetPrice();
    abstract Currency Discount();

    abstract void Add(Equipment test);
    abstract void Remove(Equipment test);
    abstract Iterator<Equipment> CreateIterator();




}