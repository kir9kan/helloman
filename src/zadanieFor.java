public class zadanieFor {
    public static void main(String[] args) {
        int a =10;
        int b =-10;
        int c =99;
        int x=0;
        int y =0;
        if(a>=0) x=x+1; else y=y+1;
        if(b>=0) x=x+1; else y=y+1;
        if(c>=0) x=x+1; else y=y+1;
        System.out.println("количество положительных цифр " + x);
        System.out.println("количество отрицательных цифр "+ y);

    }
}
