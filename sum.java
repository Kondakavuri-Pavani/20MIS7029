import java.util.*;
public class Nnat {
 public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 int n=s.nextInt();
 int p=n+1;
 int sum=0;
 int[] a=new int[p];
 for(int i=0; i a[i]=i;
 }
 for(int i=0; i sum=sum+a[i];
 }
 System.out.println(sum);
 }
}
