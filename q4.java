import java.util.Scanner;
class Emirp { 

    public static boolean isPrime(int n) 
    { 
         
        if (n <= 1) 
            return false; 
  
        
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 
  
    
    public static boolean isEmirp(int n) 
    { 
        
        if (isPrime(n) == false) 
            return false; 
  
        
        int rev = 0; 
        while (n != 0) { 
            int d = n % 10; 
            rev = rev * 10 + d; 
            n /= 10; 
        } 
  
        
        return isPrime(rev); 
    } 
  
    
    public static void main(String args[]) throws IOException 
    { 
        Scanner sc= new Scanner(System.in)
        int n = sc.nextInt;
        if (isEmirp(n) == true) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 