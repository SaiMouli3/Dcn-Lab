import java.util.Scanner;
public class tdm {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0,i,sq=0,temp,qt,n;
        int rembt[],tat[],wt[],bt[];
        rembt=new int[10];
        tat=new int[10];
        wt=new int[10];
        bt=new int[10];
        System.out.println("enter the number of stations (max 10)");
        n=sc.nextInt();
        System.out.println("enter the processing time ");
        for(i=0;i<n;i++)
        {
            bt[i]=sc.nextInt();
            rembt[i]=bt[i];
        }
        System.out.println("enter the frame size ");
        qt=sc.nextInt();
        while(true)
        {
            for(i=0,count=0;i<n;i++)
            {
                temp=qt;
                if(rembt[i]==0)
                {
                    count++;
                    continue;
                }
                if(rembt[i]>qt)
                rembt[i]=rembt[i]-qt;
                else 
                // if
                {
                    temp=rembt[i];
                    rembt[i]=0;
                }
                sq=sq+temp;
                tat[i]=sq;
            }
            if(count==n)
            break;
        }
        

    System.out.println("-------------------------------------------------- "); 
     System.out.println("station    processing time   completion time   waiting time");     
     System.out.println("-------------------------------------------------- ");  
     for(i=0;i<n;i++)
     {
        wt[i]=tat[i]-bt[i];
         System.out.println(i+1+"\t\t"+bt[i]+"\t\t"+tat[i]+"\t\t"+wt[i]);  
     }
    }   
}
