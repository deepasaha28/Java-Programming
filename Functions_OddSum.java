import java.util.*;
public class Functions_OddSum{
public static void OddSum(int n){
//loop
int sum=0;
for(int i=1;i<=n;i++){
if(i%2!=0){
sum=sum+i;
}
}
System.out.println(sum);
return;
}
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 OddSum(n);
 }
}
