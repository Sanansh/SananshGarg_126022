import java.util.Scanner;
class GFG  
{ 
      
    
    static boolean isPossible(String str, int n) 
    { 
        
        int len = str.length(); 
      
        
        if (len >= n) 
            return true; 
      
        return false; 
    } 
      
     
    public static void main (String[] args) 
    { 
        Scanner sc=new scanner(System.in);
        String str = sc.nextLine(); 
        int n = str.length; 
      
        if (isPossible(str, n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  