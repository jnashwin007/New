import java.util.*;
class Prime{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num=sc.nextInt();
    for(int i=2; i<num; i++){
      if(num%i==0){
        System.out.println(num + "is a not prime");
        return;
      }
    } 
    System.out.println(num + " is a prime");
  }
  
}
