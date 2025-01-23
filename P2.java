import java.util.Scanner;
class P2{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);

       System.out.println("number of correct answer is:  "+args.length);

      
       int ans=s1.nextInt();
     
       
        int tq=20;
        int per=ans/tq*100;

       
        System.out.println("total mark is"+tq);
        System.out.println("total percentage is"+per);

       
       
    }
}