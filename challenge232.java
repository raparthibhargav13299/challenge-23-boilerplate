import java.util.Scanner;
public class challenge232
{
    public static void main(String args[])
    {
        int  j,n;
        String a;
        Scanner obj = new Scanner(System.in);
        Scanner strobj = new Scanner(System.in);
        System.out.println("enter no of towns");
        n=obj.nextInt();
        String[] routes = new String[n];
        String[] route = new String[n];
        System.out.println("enter:- source town, destination town, distance in kms, typical flight time, typical ticket fare");
        for (int i = 0; i < n; i++) 
        {
            routes[i]=strobj.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            System.out.println(routes[i]);
        }
        System.out.println("Sno.\tFrom\tTo\tDistance in Kms\tTravel Time\tTypical Airfare");
        for (int i=0;i<n;i++)
        {
        route=routes[i].split(",");
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
        showDirectFlight(routes,route,n);
       
    }
    public static String showDirectFlight(String[] routes,String[] route,int n)
    {  int k=0;
        String a;
       Scanner strobj = new Scanner(System.in);
         System.out.println("enter the fromcity");
         a=strobj.nextLine();
        for(int i=0;i<n;i++)
        {
            route=(routes[i].split(", "));
            if(a.equals(route[0]))
            {
                if(i==0)
                {
                    System.out.println("Sno.\tFrom\tTo\t\tDistance in Kms\t\tTravel Time\tTypical Airfare");
                }
                k++;
            System.out.print(i+"\t");
            for(int j=0;j<5;j++)
            {
                System.out.print(route[j]+"\t");
                if(j==1)
                {
                    System.out.print("\t");
                }
                if(j>=1)
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
            }
        }
        if(k==0)
        {
            System.out.println("We are sorry. At this point in time we do not have any information on flights in the specified route");
        }
        return a;
    }
 
}
