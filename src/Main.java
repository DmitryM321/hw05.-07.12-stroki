import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1"); //  Данные сотрудников хранятся в неструктурированном формате. Бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);


        System.out.println("Задача 2"); //  Ф. И. О. сотрудников, полностью написанные заглавными буквами (верхним регистром)..
        String fullName1 = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1.toUpperCase());


        System.out.println("Задача 3"); //  Система, в которой мы работаем, не принимает символ «ё». Напишите программу, которая заменяет символ «ё» на символ «е»
        String fullName3 = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName3.replace("ё", "е"));


        System.out.println("Задача 4"); //  Напишите программу, которая считывает имя пользователя и затем поприветствуйте его.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");

        System.out.println("Задача 5"); //  Напишите программу, которая считывает целое число t - температуру воздуха, и выводит фразу:.
        Scanner sc1 = new Scanner(System.in);
        int tempt = sc1.nextInt();
        System.out.println("Температура воздуха сегодня: " + tempt + " градусов.");


        System.out.println("Задача 6"); //  Напишите программу, которая принимает три числа — год, месяц и день и выводит на печать фразу:.
        Scanner sc2 = new Scanner(System.in);
        String year = sc2.next();
        String mounth = sc2.next();
        String day = sc2.next();
        System.out.println(day + ":" + mounth + ":" + year);


        System.out.println("Задача 7"); //  Давайте напишем программу-помощника, которая сообщает, сколько у вас новых сообщений на почте.
        Scanner sc3 = new Scanner(System.in);
        String nameOuner = sc3.nextLine();
        String nameHelpBot = sc3.nextLine();
        int messeges = sc3.nextInt();

        System.out.println("Привет, " + nameOuner + "! Это твой помощник" + nameHelpBot + "." + "\n" + "У тебя " + messeges + " новых писем.");

    }
}

