package Basics;
public class MaxOf3 {
    public static void main(String[] args) {
        int a = 20, b = 90, c = 70;
        System.out.println(helper(a,b,c));
    }
    public static int helper(int a , int b , int c){
        return (a>b)?(a>c)?a:c:(b>c)?b:c;
    }    
}

