import java.util.Scanner;
public class lab3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Komplex[][] arrKomplex = new Komplex[n][m];
        System.out.println("Введите комплексное число");
        for (int i = 0; i < arrKomplex.length; i++) {
            for (int j = 0; j < arrKomplex[i].length; j++) {
                arrKomplex[i][j] = new Komplex();
                arrKomplex[i][j].a = scanner.nextInt();
                arrKomplex[i][j].b = scanner.nextInt();
            }
        }
        for (int i = 0; i < arrKomplex.length; i++) {
            for (int j = 1; j < arrKomplex[i].length; j++) {
                arrKomplex[j][i].a = arrKomplex[j][i].a + arrKomplex[j-1][i].a;
                arrKomplex[j][i].b = arrKomplex[j][i].b + arrKomplex[j-1][i].b;
            }
        }
        int i = 0;
        while ((i)<m){
            if (i+1 == m){
                System.out.print("("+arrKomplex[arrKomplex.length-1][i].a+" + " + arrKomplex[arrKomplex.length-1][i].b + "i)*"+ "a^"+(m-i-1));
            }
            else {
                System.out.print("("+arrKomplex[arrKomplex.length-1][i].a+" + " + arrKomplex[arrKomplex.length-1][i].b + "i)*"+ "a^"+(m-i-1)+" + ");
            }
            i++;
        }
    }
}
