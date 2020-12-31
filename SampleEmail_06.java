/**
 * @author Sandeep_Singh
 * @Functionality Check Email Validity.
 *
 */
import java.util.regex.*;
import java.util.Scanner;
public class SampleEmail_06
{
        void check_Email() {
                Pattern pat = Pattern.compile("^[a-c][.](100)@[a-c][.](com)[.](au)$");
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
        System.out.println("Sixth Sample Email"+" "+"abc@yahoo.com");
        System.out.println("Enter Email");
        SampleEmail_06 e6=new SampleEmail_06();
        e6.check_Email();
    }
}





