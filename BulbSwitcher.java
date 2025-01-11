public class BulbSwitcher {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(bulbSwitch(n));
    }
    public static int bulbSwitch(int n){
        int c = 0;
        for(int i = 1; (i*i) <= n; i++){
            c++;
        }
        return c ;
    }
}
