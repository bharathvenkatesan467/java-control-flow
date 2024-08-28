import java.util.*;
public class Controlflow{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=1;
        if(num>=0)
        {
            System.out.println("The given number is positive:"+num);
        }
        else
        {
            System.out.println("The given number is negative:"+num);
        }
        switch(num){
                case 1:
                    System.out.print("Sunday");
                    break;
                case 2:
                    System.out.print("Monday");
                    break;
                case 3:
                    System.out.print("Thusday");
                    break;
                case 4:
                    System.out.print("Wednesday");
                    break;
                case 5:
                    System.out.print("Thursday");
                    break;
                case 6:
                    System.out.print("Friday");
                    break;
                case 7:
                    System.out.print("Saturday");
                    break;
                default:
                    System.out.print("Enter the valid number");
            }
        System.out.println("\n"+"The number from 1 to usre's  number is");
        for(int i=1;i<=num;i++)
        {
            System.out.print(i+" ");   
        }
        System.out.println("\n"+"The number as down from the user's number is");
        while(num!=1)
        {
            num=num-1;
            System.out.print(num+" ");
        }
        System.out.println("\n"+"The number 1 to 3 ,demonstrate that the block executed at least once");
        do{
            System.out.print(temp+" ");
            temp=temp+1;
        }
        while(temp<=3);
        
    }
}