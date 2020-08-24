import java.util.*;
class SpecialNumberCheck
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number to be checked.");
        int num=ob.nextInt();
        int sum=0;int temp=num;
        while(temp!=0)
        {
            int a=temp%10;int fact=1;
            for(int i=1;i<=a;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(sum==num)
        {
            System.out.println(num+" is a Special Number.");
        }
        else
        {
            System.out.println(num+" is not a Special Number.");
        }
    }
}