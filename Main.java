import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
          int a,b,c;
          int d;
          a=sc.nextInt();
          b= sc.nextInt();
          c=sc.nextInt();
          d= sc.nextInt();
          int sum=a+b+c+d;

          if(sum%3==0)
          {
              if(a>sum/3 || b>sum/3 || c>sum/3){
                  System.out.println("NO");
              }
              else {
                  System.out.println("YES");
              }
          }
          else {
              System.out.println("NO");
          }
        }


    }
}