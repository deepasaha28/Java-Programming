import java.util.*;
public class Array2D{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int rows = sc.nextInt();
  int columns = sc.nextInt();

  int[][] array = new int[rows][columns];
  
  //input
    //rows:outer loop
    for(int i=0; i<rows; i++){
       //columns:outer loop
         for(int j=0; j<columns; j++){
           array[i][j]= sc.nextInt();
         }
    }
 //output
   for(int i=0; i<rows; i++){
      for(int j=0; j<columns; j++){
        System.out.println(array[i][j]);
      }
      System.out.println();
   }
 }
}