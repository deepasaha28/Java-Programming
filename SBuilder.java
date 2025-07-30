import java.util.*;
public class SBuilder {
    public static void main(String args[]){
         StringBuilder sb =  new StringBuilder("Deepa");
         System.out.println(sb);

         //char at index 0
          System.out.println(sb.charAt(0));

         //set char at index 0
          sb.setCharAt(0, 'S');
          System.out.println(sb);

         //insert 
          sb.insert(0, 'S');
          System.out.println(sb);
       
         //set char at index 0
          sb.setCharAt(0, 'D');
          System.out.println(sb);

         //delete 'e'
          sb.delete(2,3);
          System.out.println(sb);  

         // append at last
          sb.append("S");//in string it would be as str=str+"S"
          sb.append("a");
          sb.append("i");
          System.out.println(sb);

          //set char at index 0
          sb.setCharAt(1, 'e');
          System.out.println(sb);  

          // append at last
          sb.append("k");
          sb.append("a");
          sb.append("t");
          System.out.println(sb);

          System.out.println(sb.length());


        }
}