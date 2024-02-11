import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

     String firstName = "Ivan";
     String middleName = "Ivanovich";
     String lastName = "Ivanov";
     String fullName = lastName + " " + firstName + " " + middleName;
     System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("Задача 2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName);
        String fullname1 = "Иванов Семён Семёнович";

        System.out.println("Задача 3");

        fullname1 = fullname1.replace('ё', 'е');
        System.out.println("Даннные Ф.И.О. сотрудника - " + fullname1);
    }
}
