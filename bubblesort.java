import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
int j=0;
Scanner scan = new Scanner(System.in);
int n=scan.nextInt();//number of elements
int a[]= new int [n];
int temp=0;
for(i=0;i<n;i++)
{
	a[i]= scan.nextInt();
}System.out.println("Array without sorting");   
for(i=0;i<n;i++)
{
	System.out.print(a[i]+" ");    
}
for(i=0;i<n;i++)
{
	for(j=i+1;j<n-1;j++)
	{if(a[i]>a[i+1])
	{temp=a[i];
	a[i]=a[i+1];
	a[i+1]=temp;
	}
		
	}
}
System.out.println("");
System.out.println("Array with sorting");   
for(i=0;i<n;i++)
{
	System.out.print(a[i]+" ");    
}
	}

}
