package Basics;
// 1 -> It is a Leap Year
// 0 -> Not a Leap Year
public class LeapYear {
    public static void main(String[] args) {
        int year = 2100;
        if(helper(year) == 1) System.out.println("It is a Leap Year");
        else System.out.println("It is not a Leap Year");
    }
    public static int helper(int year){
        return (year%4==0 && year%100!=0 || year%400==0)?1:0;
    }    
}
