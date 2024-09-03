import java.util.*;
public class Butterfly{
public static void main(String args[]){
int n=5;
//upper half
for(int i=1;i<=n;i++){
//1st Part
for(int j=1;j<=i;j++){
System.out.print("*");
}
//spaces
int spaces=2*(n-i);
for(int j=1;j<=spaces;j++){
System.out.print(" ");
}
//2nd Part
for(int j=1;j<=i;j++){
System.out.println("*");
}
System.out.println();
}
//lower half
for(int i=1;i>=n;i--){
//1st Part
for(int j=1;j<=i;j++){
System.out.print("*");
}
//spaces
int spaces=2*(n-i);
for(int j=1;j<=spaces;j++){
System.out.print(" ");
}
//2nd Part
for(int j=1;j<=i;j++){
System.out.println("*");
}
System.out.println();
}
}
}
