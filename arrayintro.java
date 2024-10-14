import java.util.*;
class arrayIntro
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the size:");
int size=sc.nextInt();
int[] arr=new int[size];
System.out.println("Enter elements:");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Elements present in array are:");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}