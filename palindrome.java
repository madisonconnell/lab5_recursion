/**
 *@author Madison Connell
 *@version 24601
 *@date 9/26/17
 */
import java.util.Scanner;
public class palindrome {

	public static  boolean isaPalindrome ( String expr)
	{
		boolean checkPal = false;
		if( expr.length() == 0 || expr.length() == 1)
			checkPal = true;
		
		else if (expr.length() == 2)
			{if(expr.charAt(0) == expr.charAt(expr.length()-1))
				checkPal = true;
			}
		else if( expr.length() > 2)
		{
			if ( expr.charAt(0) == (expr.charAt(expr.length() -1)))
			{	checkPal = true;
				return isaPalindrome( expr.substring(1, expr.length()-1));
			}
				
		}
		return checkPal;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in a possible palindrome: ");
		String maybePal;
		maybePal = scan.nextLine().toLowerCase();
		if( isaPalindrome(maybePal))
		{
			System.out.println(maybePal + " is a palindrome.");
		}
		else
		{
			System.out.println(maybePal + " is NOT a palindrome.");
		}
		
	}

}
