public class Peremennye {
    public static void main(String[] args) {
        int x =10;
        System.out.println(x);
        float y =10.15f;
        System.out.println(y);
        double a =10.999999;
        System.out.println(a);
        if((x % 10) ==x){
            System.out.println("1 цифра");}
        if((x % 100) ==x){
            System.out.println("2 цифры");}
        if((x % 1000) ==x){
            System.out.println("3 цифры");}
        if(x>0){
            System.out.println("положительное");}
        if(x<0){
            System.out.println("отрицательное");}




    }

}
