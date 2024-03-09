import java.util.Random;
import java.util.Scanner;
public class guessno {
    public static void main(String[] args)
    {
Random no=new Random();
int x = no.nextInt(5000);
int y;
int i=0;
System.out.println("Enter your guess upto 5000");
Scanner scan=new Scanner(System.in);
y=scan.nextInt();
    while(x!=y){
    System.out.println("Wrong guess!");
    if (y>x)
    {
        System.out.println("\nPut Lower values");
        y= scan.nextInt();
    }
    else if (y<x)
    {
        System.out.println("\n Put Higher values\n");
        y= scan.nextInt();
    } 
i++;
}
 if (x==y)
{
    System.out.println("\n Success!\nThe no is " + y);
}
    }
}
