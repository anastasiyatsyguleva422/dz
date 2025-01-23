//3
// import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        int num = 5;
//        for (int i = 1; i <=10; i++){
//            System.out.println(num + "*" + i + "=" +(num * i));
//        }
//    }
//}
//6
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        if (!scanner.hasNextInt()) {
//            System.out.println("Пожалуйста, введите корректное число!");
//            return;
//        }
//        int number = scanner.nextInt();
//        if (isPrime(number)) {
//            System.out.println(number + " является простым числом.");
//        } else {
//            System.out.println(number + " не является простым числом.");
//        }
//    }
//    public static boolean isPrime(int num) {
//        // Простые числа начинаются с 2
//        if (num < 2) return false;
//
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) return false; // Если есть делитель, то число не простое
//        }
//        return true; // Если делителей нет, число простое
//    }
//}
//7
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//    Scanner scanner= new Scanner(System.in);
//    System.out.print("Введите целое число N: ");
//    int n = scanner.nextInt();
//    System.out.print("Введите целое число N: ");
//    for (int i = n;  i >= 1; i--) {
//        System.out.print(i+" ");
//        }
//    }
//
//}
//8
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner scanner= new Scanner(System.in);
//        System.out.print("Введите целое число A: ");
//        int a = scanner.nextInt();
//        System.out.print("Введите целое число B: ");
//        int b = scanner.nextInt();
//        int sum =0;
//        for (int i = a;  i <= b; i++) {
//            if (i% 2 == 0){
//                sum +=i;
//            }
//            System.out.println("Сумма четных чисел: "+ a +" до " +b+ "= "+ sum );
//        }
//    }
//
//}
//9
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Ввод строки
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//
//        // Реверс строки
//        String reversed = new StringBuilder(input).reverse().toString();
//
//        // Вывод результата
//        System.out.println("Строка в обратном порядке: " + reversed);
//    }

//10
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int number = scanner.nextInt();
//        int digitCount = String.valueOf(Math.abs(number)).length();
//        System.out.println("Количество цифр в числе: " + digitCount);
//    }
//}

//11
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args ){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число N: ");
//        int n = scanner.nextInt();
//        if (n < 0 ){
//            System.out.println("Введите положительное число");
//            return;
//        }
//        long factorial = 1; // Используем long для больших значений
//        for (int i = 1; i <= n; i++) {
//            factorial *= i;
//        }
//        // Вывод результата
//        System.out.println("Факториал числа " + n + " равен " + factorial);
//    }
//}
//12
//import java.util.Scanner;
//public class Main {
//    public static void main (String [] args){
//        Scanner scanner = new Scanner (System.in);
//        System.out.print("Введите число N: ");
//        int n = scanner.nextInt();
//        int sum = 0;
//        int temp = Math.abs(n);
//        while (temp > 0) {
//            sum += temp % 10;
//            temp /= 10;
//        }
//        System.out.println("Сумма цифр числа " + n + " равна " + sum);
//    }
//}
//13
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число N: ");
//        int n = scanner.nextInt();
//    }
//}
//14
