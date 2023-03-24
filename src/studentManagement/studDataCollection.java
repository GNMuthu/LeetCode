package studentManagement;

import java.util.Scanner;

public class studDataCollection
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
}
