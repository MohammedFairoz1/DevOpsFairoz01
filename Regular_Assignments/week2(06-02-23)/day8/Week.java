import java.util.*;
class Week{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    int week = sc.nextInt();
    if(week==1)
    {
      System.out.println("Sunday");
    }
    else if(week==2){
      System.out.println("Monday");
    }
    else if(week==3){
      System.out.println("Tuesday");
    }
    else if(week==4){
      System.out.println("Wednesday");
    }
    else if(week==5){
      System.out.println("Thursday");
    }
    else if(week==6){
      System.out.println("Friday");
    }
    else if(week==7){
      System.out.println("Saturday");
    }
  }
}