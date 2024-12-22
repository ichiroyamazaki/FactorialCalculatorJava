import java.util.*;
public class FactorialCalculator
{
    static public int fact(int n){
         int ai,afact=1;  
 
  for(ai=1;ai<=n;ai++){    
      afact=afact*ai;    
  }   
  return afact;
    }
 public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int aan=0;
     while(aan<6){
    System.out.println("Enter a positive integer: ");
     int n=s.nextInt();
     if(n>=0){
           System.out.print(n+"!"+"=");
           for(int i=1;i<n;i++){
                  System.out.print(i+"*");
           }System.out.println(n);
           
           System.out.println("The factorial of "+n+" is: "+fact(n));
     }
     else{
          System.out.println("Invalid Input! Program stopped!");
          break;
     }
     aan+=1;
     }
 }
}
