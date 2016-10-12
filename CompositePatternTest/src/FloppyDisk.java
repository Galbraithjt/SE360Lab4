/**
 * Created by Joshua on 10/12/2016.
 */
abstract public class FloppyDisk extends Equipment
{
    //Abstract class
    protected FloppyDisk(char name)
    {

    }
    abstract Watt Power();
    abstract Currency NetPrice();
    abstract Currency Price();

}
