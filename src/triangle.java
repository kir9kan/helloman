public class triangle {
    public static void main(String[] args) {
        int a =10;
        int b =14;
        int c =20;
        String no =("треугольник не существует");
        String yes =("треугольник существует");
        if (a<b+c | b<a+c |c<a+b){
            System.out.println(yes);}
        else if(a>b+c | b>a+c |c>a+b){
            System.out.println(no);
        }

    }
}
