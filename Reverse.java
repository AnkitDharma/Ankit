import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(system.in);
		//System.out.println("Enter the String");
		String myString="Hello";
		StringBuffer S1=new StringBuffer(myString);
		System.out.println("String is" +S1);
		S1.reverse();
		String S2=S1.toString();
		if(myString.equals(S2))
		{
		System.out.println("The String is a Pallindrome");
	}
	else
	{System.out.println("The String is not a Pallindrone");
}
}
}














































