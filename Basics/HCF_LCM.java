public class HCF_LCM {
    public static void main(String[] args) {
        int a = 30, b = 40;
        System.out.println("Highest common factor: " + HCF(a,b));
        System.out.println("Lowest Common Facor: " + LCM(a,b));
    }
    public static int HCF(int a, int b){  // Euclidean Algorithmm
        return (b==0)?a:HCF(b,a%b);
    }
    public static int LCM(int a, int b){
        return a*b/HCF(a,b);
    }
}
