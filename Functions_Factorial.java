import java.util.*;
public class Functions_Factorial{
public static void Factorial(int n){
 //loop
 if(n<0){
  System.out.println("Invalid no.");
  return;
  }
  int factorial=1;
  for(int i=n;i>=1;i--){
   factorial=factorial*i;
  }
 System.out.print(factorial);
 return;
}
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   Factorial(n);
  }
}
   

