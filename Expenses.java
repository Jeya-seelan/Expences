import java.util.*;

class Expenses{
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  int salary = in.nextInt();
  int b_int = in.nextInt();
  int h_fees = in.nextInt();
  int f_exp = in.nextInt();
  int home = in.nextInt();
  
  if((b_int+h_fees+f_exp+home)<salary)
   System.out.println("He has not to work hard");
  else
   System.out.println("He has to work hard");
 } 
}