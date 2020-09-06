import java.lang.reflect.Array;
import java.util.Arrays;

public class Radix_sort {
static int maxy(int arr[], int n) {
	int i;
	int max=arr[0];
	for(i=1;i<n;i++)
		if(arr[i]>max)
			max=arr[i];
	return max;
}
static void sort(int arr[],int n,int k)
{int i=0;
	int count[]=new int[10];
	int a[]=new int[n];
	Arrays.fill(count,0);
	for(i=0;i<n;i++)
	{count[(arr[i]%k)*10/k]++;}
	for(i=1;i<10;i++)
		count[i]+=count[i-1];
	
	for(i=n-1;i>=0;i--)
	{
		a[count[(arr[i]%k)*10/k]-1]=arr[i];
		count[(arr[i]%k)*10/k]--;
	}
	for(i=0;i<n;i++)
		arr[i]=a[i];
	
}
static void  radix(int arr[], int n)
{int max=maxy(arr,n);
int i=1;
for(i=10;i<max*10;i*=10)
{
sort(arr,n,i);	
}
	
}
static void print(int arr[],int n)
{
	int i=0;
	for(i=0;i<n;i++)
		System.out.print(arr[i]+" ");
}
	
	
public static void main(String args[])
{
	int arr[]= {900,551,58,2,0,5941,151,15812,2,151,98,798888,36,8};
	int n=Array.getLength(arr);
	radix(arr,n);
	print(arr,n);

}
	
}
