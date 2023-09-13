import java.util.Scanner;
class Leaky
{
    public static void main(String[] args)
    {
        int n,i;
        int pack[]=new int[20];
        Scanner sc=new Scanner(System.in);
       System.out.println("enter no of packets");
        n=sc.nextInt();
        System.out.println("Enter Packets");
        for(i=0;i<n;i++)
        {
         pack[i]=sc.nextInt();   
        }
        int cap=4;
        int rate=3;
        int sent=0;
        int rem=0;
        String accept ;
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n","Clock","PacketSize","Accepted","Sent","Remaining");
        for(i=0;i<n;i++){
        if(pack[i]+rem<=cap)
        {
            rem+=pack[i];
            accept=""+pack[i];
        }
        else{
            accept="dropped";
        }
        if(rem>rate)
        {
            sent=rate;
            rem-=rate;
        }
        else{
            sent=rem;
            rem=0;
        }
         System.out.printf("%-15d%-15d%-15s%-15d%-15d\n",i,pack[i],accept,sent,rem);
         }
    }
}
