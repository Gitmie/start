import java.util.Scanner;

public class zadanko {
    public  static void main (String args[])
    {
      int a, b, c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("a=");
        a= scanner.nextInt();
        System.out.print("b=");
        b= scanner.nextInt();
        System.out.print("c=");
        c= scanner.nextInt();

        if(a<b+c || b<a+c || c<b+a)
        {
            System.out.println("tak");
        }
        else
            System.out.println("nie");

    }

}
