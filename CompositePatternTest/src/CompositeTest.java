/**
 * Created by Joshua on 10/12/2016.
 */
public class CompositeTest
{

    public static void main(String[] args)
    {
        //new cabinet and chassis
        Cabinet PC_Cabinet = new Cabinet();
        Chassis PC_Chassis = new Chassis('t');
        //put the chassis inside the cabinet
        PC_Cabinet.Add(PC_Chassis);
        //put the bus into the chassis
        Bus MCA_Bus = new Bus();
        PC_Chassis.Add(MCA_Bus);
        //Print out the price
        System.out.printf("The net price is:%s ",PC_Chassis.NetPrice() );


    }//End Main
}
