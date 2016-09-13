import java.util.Arrays;
import java.util.Scanner;
class Second
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int arr[]=new int[a];
	int i=0;
	while(i<a)
	{
		arr[i]=sc.nextInt();
		i++;
	}
	Arrays.sor(arr);
	System.out.println(arr[1]);
  sc.close();	
}
}
