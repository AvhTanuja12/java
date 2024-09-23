import java.util.Scanner;
class slip3{
    public static void main(String[]args)
    {
        int check,rem;
        int sum=0,num;
        System.out.println("Enter the number to check armstrong number or not");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        check=num;
        while(check!=0)
        {
            rem=check%10;
            sum=sum+(rem*rem*rem);
            check=check/10;
         }
         if(num==sum)
         System.out.println("The number is armstrong number");
         else
         System.out.println("The number is not armstrong number");
    }
}