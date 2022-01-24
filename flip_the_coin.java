import java.util.Scanner;
import java.util.Random;
public class flip_the_coin
{   
    public void data()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many coins do you want to flip?");
        int no1= sc.nextInt();
        String [] no={"H ", "T "};
        
        for(int i=1; i<=no1;i++)
        {
            Random r=new Random();        
            int rn=r.nextInt(no.length);
            System.out.println(no[rn]);
        }
    }
    public static void main()
    {
        flip_the_coin flip= new flip_the_coin();
        flip.data();
    }
}