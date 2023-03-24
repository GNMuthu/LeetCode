package studentManagement;

public class studDataProcessing
{
    studDataCollection std;

    studDataProcessing(studDataCollection std){
        this.std = std;
    }
    public void StudMarkResult()
    {
        std.total=std.Tamil+std.Eng+std.Major+std.Allied+std.majorPractical;
        std.Average= Double.valueOf(std.total/6);
        if(std.Tamil>=40 && std.Eng>=40 && std.Major>=40 && std.Allied>=40 && std.majorPractical>=40)
            std.Result="Pass";
        else
            std.Result="Fail";
    }

    public void StudMarkClass()
    {
        if(std.Average>85)
        {
            std.Rank="Out Standing";
        }
        else if(std.Average>=70 && std.Average<85)
        {
            std.Rank="First Class";
        }
        else if (std.Average<70 && std.Average>=60)
        {
            std.Rank = "Second Class";
        }
        else if(std.Average<60 && std.Average>50)
        {
            std.Rank="Third Class";
        }

        else
            std.Rank="Nil";
    }
    public void StudOutput()
    {
        System.out.println("The Collected Data are:");
        System.out.println("Student Name is:  "+std.StudName);
        System.out.println("Student Gender is:  "+std.Gender);
        System.out.println("Student Department is:  "+std.DeptName);
        System.out.println("Class is:  "+std.StudClass);
        System.out.println("Tamil:  "+std.Tamil);
        System.out.println("English:  "+std.Eng);
        System.out.println("Major:  "+std.Major);
        System.out.println("Allied:  "+std.Allied);
        System.out.println("Major Practical:  "+std.majorPractical);
        System.out.println("After Processing");
        System.out.println("The Total is:  "+std.total);
        System.out.println("The Average is:  "+std.Average);
        System.out.println("Your Result is:  "+std.Result);
    }
}
