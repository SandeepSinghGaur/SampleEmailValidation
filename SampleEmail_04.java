/**
 * @author Sandeep_Singh
 * @Functionality Check Email Validity.
 *
 */
import java.util.regex.*;
import java.util.Scanner;
public class SampleEmail_04
{
        void check_Email() {
                Pattern pat = Pattern.compile("^(abc)(100)+@(yahoo)[.](com)");
                Scanner sc=new Scanner(System.in);
                try {
                String insert_Email=sc.nextLine();
                Matcher match = pat.matcher(insert_Email);
                boolean result1 = match.matches();
                if(result1==false)
                        System.out.println("Email is Invalid");
                else
                System.out.println("Email is Valid");}
                finally {
                             sc.close();}
                }
    public static void main( String[] args ) {
        System.out.println("Fourth Sample Email"+" "+"abc@yahoo.com");
        System.out.println("Enter Email");
        SampleEmail_04 e4=new SampleEmail_04();
        e4.check_Email();
    }
}

