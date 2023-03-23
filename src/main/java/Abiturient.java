
import java.util.Scanner;


public class Abiturient {
    Scanner scanner = new Scanner(System.in);
     int id;
     String lastName;
     String firstName;
     String surName;
     String addres;
     String phone;
     int[] mark = new int[5];
    {
        this.id = 0;
        this.lastName = "Unindintify";
        this.firstName = "Unindintify";
        this.surName = "Unindintify";
        this.addres = "Unindintify";
        this.phone = "Unindintify";
    }

    public Abiturient (){
this.id = 2;
    }


    public Abiturient(int id, String lastName, String firstName, String surName, String addres, String phone, int[] mark){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
        this.addres = addres;
        this.phone = phone;
        for (int i = 0; i<mark.length; i++) {

            this.mark[i] =mark[i];
        }
    }
    public Abiturient(int id, String lastName, String firstName, String surName, int[] mark){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
        for (int i = 0; i< mark.length; i++) {

            this.mark[i] =mark[i];
        }
    }

    public Abiturient setAbiturient(Abiturient abiturients){
            abiturients = new Abiturient();
            System.out.println("Введите id");
            abiturients.id = scanner.nextInt();
            System.out.println("Введите фамилию:");
            abiturients.lastName = scanner.next();
            System.out.println("Введите Имя");
            abiturients.firstName = scanner.next();
            System.out.println("Введите отчество");
            abiturients.surName = scanner.next();
            System.out.println("Введите адрес");
            abiturients.addres = scanner.next();
            System.out.println("Введите номер телефона");
            abiturients.phone = scanner.next();
            System.out.println("Введите оценки");
            for (int j = 0; j < abiturients.mark.length; j++) {
                abiturients.mark[j] = scanner.nextInt();
            }
        return abiturients;
    }
    public String findUnsatisfactoryMark(Abiturient abiturients){
        for (int i = 0; i < abiturients.mark.length; i++) {
            if (abiturients.mark[i]==2){
                return abiturients.lastName;
            }
        }
        return "";
    }

    public String findSumCurrentMark (Abiturient abiturient, int currentMark){
        int sum = 0;
        for (int i = 0; i < abiturient.mark.length; i++) {
            sum += abiturient.mark[i];
        }
        if (currentMark<= sum){
            return abiturient.lastName;
        }
        return "";
    }


}

