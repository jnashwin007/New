class Palindrome{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num=sc.nextInt();
    int reverse=0,temp=num;
    while(temp > 0){
      int rem = temp%10;
      reverse=(reverse*10)+rem;
      temp=temp/10;
    }
    if(num==reverse)
    System.out.println(num + "is a Palindrome.");
    else
    System.out.println(num + "is a not Palindrome.");
  }
  
}
