import java.util.*;
public class Functions_Product{
public static int CalculateProduct(int a,int b){
 return a*b;
}
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
  
   System.out.println("Product of two numbers is:"+CalculateProduct(a,b));
 }
} 