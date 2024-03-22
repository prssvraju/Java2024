import java.util.*;
class InvalidAge extends Exception
{
    InvalidAge(String st)
    {
        super(st);
    }

}
class UserDefinedEx 
{
    public static void main(String args[])
    {
        System.out.println("Enter age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try
        {
            if(age<18)
            {
                throw new InvalidAge("Invalid Age");
            }
        }
        catch(InvalidAge e)
        {
            e.printStackTrace();
        }
    }
}