import java.util.Scanner;
class StringssCharAtMethod{
  static void getString(String s1){
    System.out.println(s1.charAt(5));
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    System.out.println("enter the string");
    String s2=sc.nextLine();
    getString(s2);
  }
}
