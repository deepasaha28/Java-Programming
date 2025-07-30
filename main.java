import java.util.*;
public class main{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    String strg = sc.next();
    String rev =" ";
    for(int i=strg.length()-1; i>=0; i--){
      rev =rev+ strg.charAt(i);
    }
    System.out.println(rev);
  }
}