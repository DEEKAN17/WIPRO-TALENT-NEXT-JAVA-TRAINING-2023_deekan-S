/******************************************************************************

                          Getting input from user

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static void main(String[] arg)
    
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter you name:");
        String name =scanner.nextLine();
        
        System.out.println("Enter your Rating");
        int rating = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter your Email:");
        String email= scanner.nextLine();
        
        System.out.println("hello "+name);
        System.out.println("your Rating is "+rating);
        System.out.println("your emailid is "+email);
    }
}

