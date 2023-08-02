import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        calc1();
        calc2();
       calc3();
    }

    static void calc1() {
        String fname1 = "a1.txt";
        try {
            Scanner sc = new Scanner(new File(fname1));
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println("Сумма чисел равна " + (n + m));

        } catch (FileNotFoundException e) {
            System.out.println("Исключение");
            ;
        }
    }

    static void calc2() {
//Из исходного файла a2.txt прочитать массив целых чисел и вывести значение среднего арифметического.
//структура файла: в первой строке записано количество элементов массива,
//во второй строке через пробел записаны элементы.

        String fname2 = "a2.txt";
        Scanner sc = null;
        try {
            sc = new Scanner(new File(fname2));
            int n = sc.nextInt();
            int[] result = new int[n];
            int sum = 0;
            for (int i = 0; i < result.length; i++) {
                result[i] = sc.nextInt();
                sum = sum + result[i];}
            System.out.println("Среднее арифметическое равно " + sum/n);
        } catch (FileNotFoundException e) {
            System.out.println("Исключение");
        }

        }


    static void calc3(){
        //Прочитать файл b2.txt и вывести из него такие строки, каких нет в файле b1.txt
        //делаем с помощью списка
        try {
            Scanner fileScanner = new Scanner(new File("b1.txt"));
            Stack<String> lines = new Stack<>();

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lines.push(line);

            }
            while (!lines.empty()) {
                System.out.println(lines.pop());
            }
        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }

    static void calc4(){


    }

}