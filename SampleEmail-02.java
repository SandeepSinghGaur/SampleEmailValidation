/**
 * @author Sandeep_Singh
 * @Functionality Check Second Email Validity. 
 *
 */
import java.util.regex.*;
import java.util.Scanner;
public class SampleEmail-02
{
	void check_Email() {
		Pattern pat = Pattern.compile("^[a-z]+[-](100)@(yahoo)[.](com)");  
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
        System.out.println("Second Sample Email"+" "+"abc-100@yahoo.com");
        System.out.println("Enter Email");
        SampleEmail-02 e2=new SampleEmail-02();
        e2.check_Email();
    }
}
