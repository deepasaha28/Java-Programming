import java.util.*;
public class Functions_Average{
public static int CalculateAverage(int a,int b,int c){
return (a+b+c)/3;
}
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 int c=sc.nextInt();

 System.out.println("Average of 3 numbers is:"+CalculateAverage(a,b,c));
}
}