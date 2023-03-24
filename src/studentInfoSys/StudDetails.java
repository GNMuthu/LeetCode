
package studentInfoSys;
import java.sql.SQLOutput;
import java.util.*;

class StudInformation
{
    String StudName, Gender, DeptName, StudClass;
    int Tamil, Eng, Major, Allied, majorPractical, total;
    String Result,Rank;
    Double Average;
    Scanner sc=new Scanner(System.in);
    public void GetDetails()
    {
        System.out.println("Enter the Student Name");
        StudName=sc.next();
        System.out.println("Enter Gender");
        Gender=sc.next();
        System.out.println("Enter Department Name");
        DeptName=sc.next();
        System.out.println("Enter Student Class");
        StudClass=sc.next();
        System.out.println("Enter Tamil Mark");
        Tamil=sc.nextInt();
        System.out.println("Enter Eng Mark");
        Eng=sc.nextInt();
        System.out.println("Enter Major Mark");
        Major=sc.nextInt();
        System.out.println("Enter Allied Mark");
        Allied=sc.nextInt();
        System.out.println("Enter Major Practical Mark");
        majorPractical=sc.nextInt();
    }
    public void StudMarkResult()
    {
        total=Tamil+Eng+Major+Allied+majorPractical;
        Average= Double.valueOf(total/6);
        if(Tamil>=40&&Eng>=40&&Major>=40&&Allied>=40&&majorPractical>=40)
            Result="Pass";
        else
            Result="Fail";


    }

    public void StudMarkClass()
    {
        if(Average>85)
        {
            Rank="Out Standing";
        }
        else if(Average>=70 && Average<85)
        {
            Rank="First Class";
        }
        else if (Average<70 && Average>=60)
        {
        Rank = "Second Class";
        }
        else if(Average<60 && Average>50)
        {
            Rank="Third Class";
        }

        else
            Rank="Nil";
    }
    public void StudOutput()
    {
        System.out.println("The Collected Data are:");
        System.out.println("Student Name is:  "+StudName);
        System.out.println("Student Gender is:  "+Gender);
        System.out.println("Student Department is:  "+DeptName);
        System.out.println("Class is:  "+StudClass);
        System.out.println("Tamil:  "+Tamil);
        System.out.println("English:  "+Eng);
        System.out.println("Major:  "+Major);
        System.out.println("Allied:  "+Allied);
        System.out.println("Major Practical:  "+majorPractical);
        System.out.println("After Processing");
        System.out.println("The Total is:  "+total);
        System.out.println("The Average is:  "+Average);
        System.out.println("Your Result is:  "+Result);
    }
}

 class StudDetails
        {
         public static void main(String args[])
         {
             StudInformation Stud=new StudInformation();
             Stud.GetDetails();
             Stud.StudMarkResult();
             Stud.StudMarkClass();
             Stud.StudOutput();
         }
        }