import java.util.Scanner;
import java.util.Random;
public class dice
{   
    public void data()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many coins do you want to dice?");
        int no1= sc.nextInt();
        String [] no={"1 ", "2 ", "3 ","4 ","5 ","6 "};
        
        for(int i=1; i<=no1;i++)
        {
            Random r=new Random();        
            int rn=r.nextInt(no.length);
            System.out.println(no[rn]);
        }
    }
    public static void main()
    {
        dice d= new dice();
        d.data();
    }
}