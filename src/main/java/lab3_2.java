import java.util.Scanner;
public class lab3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = scanner.nextInt();
        Komplex[] arrKomplex = new Komplex[n];
        System.out.println("Введите комплексное число");
        for (int i = 0; i < arrKomplex.length; i++) {
            arrKomplex[i] = new Komplex();
            arrKomplex[i].a = scanner.nextInt();
            arrKomplex[i].b = scanner.nextInt();
        }
        additionKomplex(arrKomplex);
        System.out.println("Сумма комлексных числе равна:");
        System.out.println(arrKomplex[arrKomplex.length-1].a + " + " + arrKomplex[arrKomplex.length-1].b + " i");
    }
    public static Komplex[] additionKomplex(Komplex[] arrKomplex){
        for (int i = 1; i < arrKomplex.length; i++) {
            arrKomplex[i].a = arrKomplex[i].a + arrKomplex[i-1].a;
            arrKomplex[i].b = arrKomplex[i].b + arrKomplex[i-1].b;
        }
        return arrKomplex;
    }
}
