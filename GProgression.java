import java.util.*;
public class GProgression {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first no.");
        int a =sc.nextInt();
        System.out.println("Enter common ratio");
        int r =sc.nextInt();
        System.out.println("Enter upper limit");
        int k =sc.nextInt();
   
    
        new GProgression().series(a,r,k);
    }

        public void series(int a, int r,  int k) {
            ArrayList<Integer> arr=new ArrayList();
            for(int i=a; i<=k; i=i*r){
                arr.add(i);
            }
            System.out.println(arr);
        }
}


