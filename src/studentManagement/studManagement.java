package studentManagement;

public class studManagement
{
    public static void main(String args[])
    {
        studDataCollection studDC=new studDataCollection();
        studDataProcessing stud=new studDataProcessing(studDC);
        studDC.GetDetails();
        stud.StudMarkClass();
        stud.StudMarkResult();
        stud.StudOutput();

    }
}
