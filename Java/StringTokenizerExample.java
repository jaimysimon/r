import java.util.*;
public class StringTokenizerExample {

	public static void main(String[] args) {
		String add;
		Scanner in =new Scanner(System.in);
		System.out.print("\nEnter the expression: ");
		add = in.nextLine();
		StringTokenizer a = new StringTokenizer(add,"+");
		int n = a.countTokens();
		int sum=0,k;
		System.out.println("\nNumbers:");
		for(int i=0;i<n;i++)
		{
			k=Integer.parseInt(a.nextToken());
			System.out.println(k);
			sum = sum + k;
		}
		System.out.println("\nSum: "+sum);
		System.out.println("\n");
	}

}
