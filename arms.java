import java.util.*;
class Armstrong{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int arm=0,temp;
    System.out.println("Enter the number : ");
    int num=sc.nextInt();
    temp=num;
    while(num>0)
    {
      int r=num%10;
      arm=(r*r*r)+arm;
      num=num/10;
    }
  if(temp == arm)
  {
    System.out.println(temp +" is Arms Num");
  }
  else
  {
    System.out.println(temp + "is not Arms num");
  }
  }
}
