package busbooking;

public class Bus
{
    private int busNo;
    private boolean ac;
    private int capacity;
    Bus(int busNo, boolean ac, int capacity)
    {
        this.busNo=busNo;
        this.ac=ac;
        this.capacity=capacity;
    }
    public int getCapacity()
{
    return capacity;
}
public void setCapacity(int c)
{
    capacity=c;
}
public int getbusNo()
{
    return busNo;
}
//public void setBusNo(int bno)
//{
//    busNo=bno;
//}
public boolean getac()
{
    return ac;
}
public void displayBusinfo()
{
    System.out.println("Bus No:"+ busNo+"AC:"+ac+"Capacity:"+capacity);
}
}
