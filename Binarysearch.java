import java.io.*;
import java.util.*;
class Binarysearch
{
    public static void main(String args[])
    {
        int pos=-1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter"+n+" elements of the array in sorted(ascending) order : ");
        for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
                System.out.println("Enter key element to search");
        int key = sc.nextInt();
        int low=0,high=n-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                 pos=mid+1;
                break;
            }
            else if(arr[mid]<key)
                    low=mid+1;
            else
                    high=mid-1;
        }
            if(pos==-1)
            System.out.println(key+"not found in the array,search unsuccessful");
             else
            System.out.println(key+"found at position "+pos+" in the array");           
   }
}
