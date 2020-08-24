import java.util. *;
class SuperPalindrome
{
public static void main()
{
Scanner in=new Scanner(System.in);
int n,n1=0,s=0,s1=0;
System.out.println("Enter number");
n=in.nextInt();
n1=n*n;
int a=n;
int b=n1;
while(n>0)
{
int c=n%10;
s=s*10+c;
n/=10;
}
while(n1>0)
{
int c=n1%10;
s1=s1*10+c;
n1/=10;
}
if(a==s&&b==s1)
System.out.println("Super Palindrome");
else
System.out.println("Not super palindrome");
in.close();
}
}
