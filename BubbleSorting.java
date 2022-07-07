import java.util.*;
public class BubbleSorting
{
    public static void main(String args[])
    {
        System.out.println("Enter the size of array : ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        System.out.println("Enter the values of the array : ");
        int arr[]=new int[number];
        for(int i=0; i<number;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Your unsorted array is : ");
        for(int i=0; i<number;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        //bubble sort
        System.out.println("Your sorted array is : ");
        for(int i=0; i<number-1; i++)
        {
            for (int j=0; j<number-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<number;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
