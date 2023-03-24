package studentManagement;

public class studManagement
{
    public static void main(String args[])
    {
        studDataCollection studDC=new studDataCollection();
        studDC.GetDetails();
        studDataProcessing stud=new studDataProcessing(studDC);
        stud.StudMarkResult();
        stud.StudMarkClass();
        stud.StudOutput();

    }
}
