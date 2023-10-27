import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		int val;
		String strn1 = "12546";

		val = Integer.parseInt(strn1);
		System.out.println("String value = " + strn1);
		System.out.println("Integer value = " + val);

		String strn2 = "GeeksforGeeks";
		try {
			val = Integer.parseInt(strn2);
			System.out.println("String value = " + strn2);
			System.out.println("Integer value = " + val);
		}
		catch (NumberFormatException e) {
			val = 0;
			System.out.println("String value = " + strn2);
			System.out.println("Integer value = " + val);
		}
	}
}
