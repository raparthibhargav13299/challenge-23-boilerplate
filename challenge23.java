import java.util.Scanner;
public class challenge23
{
    public static void main(String args[])
    {
        int  j,n,k;
        
       
        Scanner obj = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("enter no of towns");
        n=obj.nextInt();
        k=n;
        String[] routes = new String[n];
        String[] route = new String[k];
        System.out.println("enter:- source town, destination town, distance in kms, typical flight time, typical ticket fare");
        for (int i = 0; i < n; i++) 
        {
            routes[i]=scan.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            System.out.println(routes[i]);
        }
        System.out.println("Sno.\tFrom\tTo\tDistance in Kms\tTravel Time\tTypical Airfare");
        for (int i=0;i<n;i++)
        {
        route=routes[i].split(", ");
         System.out.print(i+1+"\t");
         for(j=0;j<5;j++)
         {
                System.out.print(route[j]+"\t");
                if(j>=1)
                {
                    System.out.print("\t");
                }
          }
        System.out.println();
        }
    }
}