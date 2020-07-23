import java.util.Scanner;

public class linear_search {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		int arr[]= { 1,5,8,2,9};
		int j=0;
		Scanner scan=new Scanner(System.in);
		int data=scan.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==data)
				{System.out.print("Element found at location "+i );
			j=1;}
		}
		if(j==1)
		{}
		
		else
			System.out.print("Element not found" );
	}

	
}

