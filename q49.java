import java.util.*; 
  
class ReverseString 
{ 
    public static void main(String[] args) 
    { 
        Scanner jj=new Scanner(System.in);
        String input = jj.nextLine(); 
      int l=input.length();
      String tm="";
      for(int i=l-1;i>=0;i--)
      {
          char c=input.charAt(i);
          tm=tm+c;
      }
      System.out.println("The Reverse String is "+tm);
      jj.close();
    } 

}