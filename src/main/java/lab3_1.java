
import java.util.Scanner;
import java.util.Arrays;

public class lab3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Abiturient[] abiturients = new Abiturient[4];
        int[] markCurrentAbi;
        markCurrentAbi = changeMarkAbi(scanner);
        abiturients[0] = new Abiturient(1, "Lazarev", "Ilya", "Sergeevich", "Ryazan", "89155996021", markCurrentAbi);
        markCurrentAbi = changeMarkAbi(scanner);
        abiturients[1] = new Abiturient(2, "Senkin", "Sergey", "Sergeevich", markCurrentAbi);
        markCurrentAbi = changeMarkAbi(scanner);
        abiturients[2] = new Abiturient(3, "Larin", "Anton", "Sergeevich", "Ряжск", "89155996021", markCurrentAbi);
        markCurrentAbi = changeMarkAbi(scanner);
        abiturients[3] = new Abiturient(4, "Мелехин", "Денис", "Егвеньевич", "Ryazan", "89155996021", markCurrentAbi);
        /*  for (int i = 2; i < abiturients.length; i++) {
            abiturients[i] = new Abiturient();
            abiturients[i].setAbiturient(abiturients[i]);
        }*/
        System.out.println("Список абитуриентов имеющих не удовлетворительные оценки: ");
        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].findUnsatisfactoryMark(abiturients[i]).equals("")) {
                System.out.print("");
            } else {
                System.out.println(abiturients[i].findUnsatisfactoryMark(abiturients[i]));
            }
        }
        System.out.println("Введите выше какого числа, сумма оценок должна быть:");
        int currentMark = scanner.nextInt();
        System.out.println("Абитуриенты:");
        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].findSumCurrentMark(abiturients[i], currentMark).equals("")) {
                System.out.print("");
            } else {
                System.out.println(abiturients[i].findSumCurrentMark(abiturients[i], currentMark));
            }
        }
        System.out.println("Введите количество абитуриентов, имеющих самую высокую сумму баллов");
        int n = scanner.nextInt();
        findBestAbiturient(abiturients);
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+" Абитуриент - " + abiturients[i].lastName);
        }

        System.out.println("Cписок абитуриентов, имеющих полупроходную сумму");
        for (int i = 0; i < abiturients.length; i++) {
            System.out.println(abiturients[i].findSumCurrentMark(abiturients[i], (currentMark/2)));
        }
    }


    public static int[] changeMarkAbi(Scanner scanner) {
        int[] markCurrentAbi = new int[5];
        System.out.println("Введите пять оценок абитуриента:");
        for (int i = 0; i < markCurrentAbi.length; i++) {
            markCurrentAbi[i] = scanner.nextInt();
        }
        return markCurrentAbi;
    }

/*    public static String findBestAbi(Abiturient[] abiturient, int n) {
        int sumAbi = 0;
        int sumCurrentAbi;
        int[] index = new int[n];
        while (n > 0) {
            for (int i = 0; i < abiturient.length; i++) {
                sumCurrentAbi = 0;
                for (int j = 0; j < abiturient[i].mark.length; j++) {
                    sumCurrentAbi += abiturient[i].mark[j];
                }
                if (sumCurrentAbi > sumAbi) {
                    sumCurrentAbi = sumAbi;
                    index[n-1] = i;
                }
                for (int j = 0; j< n ; j++){
                    if (index[j]==i){
                        continue;
                    }
                }
                sumAbi = sumCurrentAbi;
            }
            System.out.println(" Абитуриент " + abiturient[index[n-1]].lastName);
            n -= 1;
        }
    }*/

/*    public Abiturient[] listAbiturients(Abiturient[] abiturients){
        Abiturient newMassObjects[] = new Abiturient[5];
        int [] massIndex = new int[5];
        for (int i =0;i<5;i++){
            massIndex[i] = i+1;
        }
        for (int i = 0; i < abiturients.length; i++) {
            for (int j = 0; j < abiturients[i].mark.length; j++) {

            }
        }
        int permutationMass = 0;
        for (int i = 0;i<4;i++){
            for (int j=i+1;j<5;j++){
                if(massObjects[i]<massObjects[j]){
                    permutationMass = massObjects[i];
                    massObjects[i] = massObjects[j];
                    massObjects[j] = permutationMass;
                    permutationMass = massIndex[i];
                    massIndex[i] = massIndex[j];
                    massIndex[j] = permutationMass;
                }
            }
        }
        int j=0;
        while(j<massiv.length) {
            for (int i = 0; i <massiv.length; i++) {
                if (massiv[i]==null){
                    break;
                }
                if (massIndex[j] == massiv[i].id-1) {
                    newMassObjects[j] = massiv[i];
                }
            }
            j =j +1;
        }
        return newMassObjects;
    }*/

    public static Abiturient[] findBestAbiturient(Abiturient[] abiturients){
        int[] arrMarkAbiturients = new int[4];
        int[] indexAbiturients = new int[4];
        Abiturient changeAbiturient;
        for (int i = 0; i < abiturients.length; i++) {
            indexAbiturients[i] = i+1;
            for (int j = 0; j < abiturients[i].mark.length; j++) {
                arrMarkAbiturients[i] += abiturients[i].mark[j];
            }
        }
        int sumMarkCurrentabiturients = 0;
        for (int i = 0; i < arrMarkAbiturients.length-1; i++) {
            for (int j = i+1; j < arrMarkAbiturients.length; j++) {
                if (arrMarkAbiturients[i] < arrMarkAbiturients[j]){
                    int changeMark = 0;
                    changeMark = arrMarkAbiturients[i];
                    arrMarkAbiturients[i] = arrMarkAbiturients[j];
                    arrMarkAbiturients[j] = changeMark;

                }
            }
        }
/*        for (int i = 0; i < abiturients.length; i++) {
            for (int j = 0; j < abiturients[i].mark.length; j++) {
                sumMarkCurrentabiturients += abiturients[i].mark[j];
            }
            for (int k = 0; k < arrMarkAbiturients.length; k++) {
                if (arrMarkAbiturients[k] == sumMarkCurrentabiturients) {
                    changeAbiturient = abiturients[i];
                    abiturients[i] = abiturients[k];
                    abiturients[k] =changeAbiturient;
                }
            }
        }*/
        for (int i = 0; i < arrMarkAbiturients.length; i++) {
            for (int j = 0; j < abiturients.length; j++) {
                sumMarkCurrentabiturients = 0;
                for (int k = 0; k < abiturients[j].mark.length; k++) {
                    sumMarkCurrentabiturients += abiturients[j].mark[k];
                }
                if (arrMarkAbiturients[i] == sumMarkCurrentabiturients){
                    changeAbiturient = abiturients[i];
                    abiturients[i] = abiturients[j];
                    abiturients[j] =changeAbiturient;
                }
            }
        }
        return abiturients;
    }
}
