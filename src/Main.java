//1
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int number = scanner.nextInt();
//        if (number % 2 == 0) {
//            System.out.println("Четное");
//        } else {
//            System.out.println("Не четное");
//        }
//        scanner.close();
//    }
//}

//2
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите 1 число: ");
//        int num1 = scanner.nextInt();
//        System.out.print("Введите 2 число: ");
//        int num2 = scanner.nextInt();
//        System.out.print("Введите 3 число: ");
//        int num3 = scanner.nextInt();
//        int min =num1;
//        if (num2<min ) {
//            min=num1;
//        }
//        if (num3< min){
//            min=num3;
//        }
//        System.out.println("Минимальное число: "+ min);
//
//        scanner.close();
//    }
//}

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
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        if (size <= 0) {
//            System.out.println("Размер массива должен быть больше 0.");
//            return;
//        }
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int max = array[0];
//        for (int i = 1; i < size; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println("Максимальное число в массиве: " + max);
//    }
//}
//15
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        if (size <= 0) {
//            System.out.println("Размер массива должен быть больше 0.");
//           return;
//       }
//        int[] array = new int[size];
//        System.out.println("Введте элементы массива: ");
//        for( int i = 0; i <size ; i++ ){
//            array[i]= scanner.nextInt();
//        }
//        int sum = 0;
//        for( int num : array){
//            sum +=num;
//        }
//        System.out.println("Сумма всех элементов массива : "+ sum);
//   }
//}
//16
//import java.util.Scanner;
//public class Main {
//    public static void main(String[]args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите колличеств чисел в массиве: ");
//        int size= scanner.nextInt();
//        if (size <= 0 ){
//            System.out.println("Колличество чисел должно быть больше 0 ");
//        }
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//            System.out.print("Элемент " + (i + 1) + ": ");
//            array[i] = scanner.nextInt(); // Считываем каждый элемент массива
//        }
//    int pol = 0;
//    int otr = 0;
//        for( int num : array){
//            if(num >0 ){
//                pol++;
//            }
//         else if (num<0){
//             otr++;
//            }
//        }
//        System.out.println("Количество положительных чисел: " + pol);
//        System.out.println("Количество отрицательных чисел: " + otr);
//        scanner.close();
//    }
//}
//17

