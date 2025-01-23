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
//import java.util.Scanner;
//public class Main {
//    public static void main (String[]args ){
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Введите число А: ");
//        int A = scanner.nextInt();
//        System.out.println("Введите число В: ");
//        int B = scanner.nextInt();
//        if(A<B){
//            System.out.println("Первое число должно быть больше второго ");
//        }
//        System.out.println("Простые числа в диапазоне от " + A + " до " + B + ":");
//        for (int i = A; i <= B; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//        scanner.close();
//    }
//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
//18
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//        int vowelCount = 0;
//        int consonantCount = 0;
//        input = input.toLowerCase();
//        for (char ch : input.toCharArray()) {
//            if (Character.isLetter(ch)) {
//                if ("aeiou".indexOf(ch) != -1) {
//                    vowelCount++;
//                } else {
//                    consonantCount++;
//                }
//            }
//        }
//        System.out.println("Количество гласных: " + vowelCount);
//        System.out.println("Количество согласных: " + consonantCount);
//
//        scanner.close();
//    }
//}
//19
//import java.util.Scanner;
// public class Main {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Введите строку: ");
//            String input = scanner.nextLine();
//            String[] words = input.split(" ");
//            StringBuilder reversed = new StringBuilder();
//            for (int i = words.length - 1; i >= 0; i--) {
//                reversed.append(words[i]).append(" ");
//            }
//            System.out.println("Слова в обратном порядке: " + reversed.toString().trim());
//            scanner.close();
//        }
//    }
//20
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int number = scanner.nextInt();
//        int originalNumber = number;
//        int sum = 0;
//        int digits = String.valueOf(number).length();
//        while (number > 0) {
//            int digit = number % 10;
//            sum += Math.pow(digit, digits);
//            number /= 10;
//        }
//        if (sum == originalNumber) {
//            System.out.println(originalNumber + " является числом Армстронга.");
//        } else {
//            System.out.println(originalNumber + " не является числом Армстронга.");
//        }
//        scanner.close();
//    }
//}



//21
//public class Main {
//        public static void main(String[] args) {
//            try {
//                System.out.println("Максимум: " + findMax(10, 20));
//                System.out.println("Максимум: " + findMax(15, 10));
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
//        public static int findMax(int a, int b) {
//            if (a == b) {
//                throw new IllegalArgumentException("Числа равны, ошибка!");
//            }
//            return Math.max(a, b);
//        }
//    }
//22
//public class Main {
//    public static void main(String[] args) {
//        try {
//            System.out.println("Результат: " + divide(10, 2));
//            System.out.println("Результат: " + divide(10, 0));
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static double divide(double numerator, double denominator) {
//        if (denominator == 0) {
//            throw new ArithmeticException("Недопустимо деление на ноль!");
//        }
//        return numerator / denominator;
//    }
//}
//23
//public class Main {
//    public static void main(String[] args) {
//        try {
//            System.out.println("Конвертированное число: " + convertToInt("123"));
//            System.out.println("Конвертированное число: " + convertToInt("abc")); // Это вызовет исключение
//        } catch (NumberFormatException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static int convertToInt(String str) {
//        try {
//            return Integer.parseInt(str);
//        } catch (NumberFormatException e) {
//            throw new NumberFormatException("Невозможно конвертировать строку в число: " + str);
//        }
//    }
//}
//24
//public class Main {
//    public static void main(String[] args) {
//        try {
//            checkAge(25);
//            checkAge(-5);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static void checkAge(int age) {
//        if (age < 0 || age > 150) {
//            throw new IllegalArgumentException("Возраст должен быть в диапазоне от 0 до 150.");
//        }
//    }
//}
//25
//public class Main {
//    public static void main(String[] args) {
//        try {
//            System.out.println("Корень: " + findSquareRoot(25));
//            System.out.println("Корень: " + findSquareRoot(-9));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static double findSquareRoot(double number) {
//        if (number < 0) {
//            throw new IllegalArgumentException("Невозможно найти корень из отрицательного числа.");
//        }
//        return Math.sqrt(number);
//    }
//}
//26
//public class Main {
//    public static void main(String[] args) {
//        try {
//            System.out.println("Факториал: " + calculateFactorial(5));
//            System.out.println("Факториал: " + calculateFactorial(-3)); // Это вызовет исключение
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static long calculateFactorial(int number) {
//        if (number < 0) {
//            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел.");
//        }
//        long factorial = 1;
//        for (int i = 1; i <= number; i++) {
//            factorial *= i;
//        }
//        return factorial;
//    }
//}
//27
//public class Main {
//    public static void main(String[] args) {
//        try {
//            checkArrayForZeros(new int[]{1, 2, 3});
//            checkArrayForZeros(new int[]{1, 0, 3});
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static void checkArrayForZeros(int[] array) {
//        for (int num : array) {
//            if (num == 0) {
//                throw new IllegalArgumentException("Массив содержит нули.");
//            }
//        }
//    }
//}
//28
//public class Main {
//    public static void main(String[] args) {
//        try {
//            System.out.println("Результат: " + power(2, 3));
//            System.out.println("Результат: " + power(2, -1));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static double power(double base, int exponent) {
//        if (exponent < 0) {
//            throw new IllegalArgumentException("Степень не может быть отрицательной.");
//        }
//        double result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= base;
//        }
//        return result;
//    }
//}
//29
//public class Main {
//    public static void main(String[] args) {
//        try {
//            System.out.println("Обрезанная строка: " + trimString("Hello, World!", 5));
//            System.out.println("Обрезанная строка: " + trimString("Hello", 10));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static String trimString(String str, int length) {
//        if (length > str.length()) {
//            throw new IllegalArgumentException("Число символов больше длины строки.");
//        }
//        return str.substring(0, length);
//    }
//}
//30
//public class Main {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//        try {
//            System.out.println("Элемент найден: " + findElement(array, 3));
//            System.out.println("Элемент найден: " + findElement(array, 6));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static int findElement(int[] array, int element) {
//        for (int num : array) {
//            if (num == element) {
//                return num;
//            }
//        }
//        throw new IllegalArgumentException("Элемент не найден в массиве.");
//    }
//}
//31
//public class Main {
//    public static void main(String[] args) {
//        try {
//            System.out.println("Двоичное представление: " + convertToBinary(10));
//            System.out.println("Двоичное представление: " + convertToBinary(-5)); // Это вызовет исключение
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static String convertToBinary(int number) {
//        if (number < 0) {
//            throw new IllegalArgumentException("Число не может быть отрицательным.");
//        }
//        return Integer.toBinaryString(number);
//    }
//}
//32
//public class Main {
//    public static void main(String[] args) {
//        try {
//            System.out.println("Делится: " + isDivisible(10, 2));
//            System.out.println("Делится: " + isDivisible(10, 0)); // Это вызовет исключение
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static boolean isDivisible(int a, int b) {
//        if (b == 0) {
//            throw new ArithmeticException("Деление на ноль недопустимо.");
//        }
//        return a % b == 0;
//    }
//}
//33
//import java.util.ArrayList;
//import java.util.List;
//public class Main {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Первый");
//        list.add("Второй");
//        list.add("Третий");
//        try {
//            System.out.println("Элемент: " + getElement(list, 1));
//            System.out.println("Элемент: " + getElement(list, 5));
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static String getElement(List<String> list, int index) {
//        if (index < 0 || index >= list.size()) {
//            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка.");
//        }
//        return list.get(index);
//    }
//}
//34
//public class Main {
//    public static void main(String[] args) {
//        try {
//            checkPassword("12345678");
//            checkPassword("short"); // Это вызовет исключение
//        } catch (WeakPasswordException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static void checkPassword(String password) {
//        if (password.length() < 8) {
//            throw new WeakPasswordException("Пароль должен содержать не менее 8 символов.");
//        }
//    }
//}
//class WeakPasswordException extends RuntimeException {
//    public WeakPasswordException(String message) {
//        super(message);
//    }
//}
//35
//import java.time.LocalDate;
//import java.time.format.DateTimeParseException;
//public class Main {
//    public static void main(String[] args) {
//        checkDate("25.12.2023");
//        checkDate("31.05.2023");
//        checkDate("31.05,2023");
//    }
//    public static void checkDate(String date) {
//        try {
//            if (isValidDate(date)) {
//                System.out.println(date + " - корректная дата");
//            }
//        } catch (DateTimeParseException e) {
//            System.out.println(date + " - некорректная дата: " + e.getMessage());
//        }
//    }
//    public static boolean isValidDate(String date) {
//        LocalDate.parse(date, java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//        return true;
//    }
//}
//36
//public class Main {
//    public static void main(String[] args) {
//        try {
//            System.out.println(concatStrings("Hello, ", "World!"));
//            System.out.println(concatStrings("Hello, ", null)); // Это вызовет исключение
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static String concatStrings(String str1, String str2) {
//        if (str1 == null || str2 == null) {
//            throw new NullPointerException("Одна из строк равна null.");
//        }
//        return str1 + str2;
//    }
//}
//37
//public class Main {
//    public static void main(String[] args) {
//        try {
//            System.out.println(getRemainder(10, 3));
//            System.out.println(getRemainder(10, 0)); // Это вызовет исключение
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static int getRemainder(int a, int b) {
//        if (b == 0) {
//            throw new ArithmeticException("Деление на ноль недопустимо.");
//        }
//        return a % b;
//    }
//}
//38
//public class Main {
//    public static void main(String[] args) {
//        try {
//            System.out.println(getSquareRoot(25));
//            System.out.println(getSquareRoot(-9)); // Это вызовет исключение
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static double getSquareRoot(double number) {
//        if (number < 0) {
//            throw new IllegalArgumentException("Невозможно найти квадратный корень из отрицательного числа.");
//        }
//        return Math.sqrt(number);
//    }
//}
//39
//public class Main {
//    public static void main(String[] args) {
//        try {
//            System.out.println(celsiusToFahrenheit(25));
//            System.out.println(celsiusToFahrenheit(-300));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static double celsiusToFahrenheit(double celsius) {
//        if (celsius < -273.15) {
//            throw new IllegalArgumentException("Температура ниже абсолютного нуля недопустима.");
//        }
//        return celsius * 9 / 5 + 32;
//    }
//}
//40
//public class Main {
//    public static void main(String[] args) {
//        try {
//            System.out.println(isEmpty(null)); // Это вызовет исключение
//            System.out.println(isEmpty(""));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static boolean isEmpty(String str) {
//        if (str == null || str.isEmpty()) {
//            throw new IllegalArgumentException("Строка пустая или равна null.");
//        }
//        return false;
//    }
//}


//41
// ООП
//public class Main {
//    private String name;
//    private int age;
//    private String gender;
//
//    public Main(String name, int age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//    public void displayInfo() {
//        System.out.println("Имя: " + name);
//        System.out.println("Возраст: " + age);
//        System.out.println("Пол: " + gender);
//    }
//
//    public void increaseAge() {
//        age++;
//    }
//    public void changeName(String newName) {
//        this.name = newName;
//    }
//    public static void main(String[] args) {
//        Main person = new Main("Иван", 25, "Мужской");
//        person.displayInfo();
//
//        person.increaseAge();
//        System.out.println("После увеличения возраста:");
//        person.displayInfo();
//
//        person.changeName("Сергей");
//        System.out.println("После изменения имени:");
//        person.displayInfo();
//    }
//}

//42
//class Person {
//    String name;
//    int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void displayInfo() {
//        System.out.println("Name: " + name + ", Age: " + age);
//    }
//
//    public static void main(String[] args) {
//        Manager manager = new Manager("John", 40, 80000, 5);
//        manager.displayInfo();
//    }
//}
//
//class Worker extends Person {
//    double salary;
//
//    public Worker(String name, int age, double salary) {
//        super(name, age);
//        this.salary = salary;
//    }
//
//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//        System.out.println("Salary: " + salary);
//    }
//}
//
//class Manager extends Worker {
//    int numberOfSubordinates;
//
//    public Manager(String name, int age, double salary, int numberOfSubordinates) {
//        super(name, age, salary);
//        this.numberOfSubordinates = numberOfSubordinates;
//    }
//
//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//        System.out.println("Number of Subordinates: " + numberOfSubordinates);
//    }
//}

//43
//interface Animal {
//    void makeSound();
//}
//class Dog implements Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("Гав!");
//    }
//}
//class Cat implements Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("Мяу!");
//    }
//}
//class Cow implements Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("Муу!");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Animal[] animals = {new Dog(), new Cat(), new Cow()};
//
//        for (Animal animal : animals) {
//            animal.makeSound();
//        }
//    }
//}

////44
//abstract class Transport {
//    abstract void move();
//}
//class Car extends Transport {
//    @Override
//    void move() {
//        System.out.println("Машина едет.");
//    }
//}
//class Bike extends Transport {
//    @Override
//    void move() {
//        System.out.println("Велосипед едет.");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Transport car = new Car();
//        Transport bike = new Bike();
//        car.move();
//        bike.move();
//    }
//}

//45
//import java.util.ArrayList;
//import java.util.List;
//
//class Book {
//    String title;
//    String author;
//    int year;
//
//    public Book(String title, String author, int year) {
//        this.title = title;
//        this.author = author;
//        this.year = year;
//    }
//}
//
//class Library {
//    private List<Book> books = new ArrayList<>();
//
//    public void addBook(Book book) {
//        books.add(book);
//    }
//
//    public Book searchByAuthor(String author) {
//        for (Book book : books) {
//            if (book.author.equals(author)) {
//                return book;
//            }
//        }
//        return null;
//    }
//
//    public List<Book> searchByYear(int year) {
//        List<Book> result = new ArrayList<>();
//        for (Book book : books) {
//            if (book.year == year) {
//                result.add(book);
//            }
//        }
//        return result;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Library library = new Library();
//        library.addBook(new Book("1984", "Джордж Оруэлл", 1949));
//        library.addBook(new Book("Скотный двор", "Джордж Оруэлл", 1945));
//        System.out.println("Поиск по автору: " + library.searchByAuthor("Джордж Оруэлл").title);
//    }
//}


//46
//class BankAccount {
//    private String accountNumber;
//    private double balance;
//
//    public BankAccount(String accountNumber, double initialBalance) {
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//    }
//
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//        }
//    }
//
//    public void withdraw(double amount) {
//        if (amount > 0 && balance >= amount) {
//            balance -= amount;
//        }
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount("123456", 1000);
//        account.deposit(500);
//        account.withdraw(200);
//        System.out.println("Баланс: " + account.getBalance());
//    }
//}

//47
//class Counter {
//    private static int count = 0;
//
//    public Counter() {
//        count++;
//    }
//
//    public static int getCount() {
//        return count;
//    }
//
//    public static void main(String[] args) {
//        new Counter();
//        new Counter();
//        System.out.println("Количество объектов: " + Counter.getCount());
//    }
//}

//48
//abstract class Shape {
//    abstract double getArea();
//}
//class Circle extends Shape {
//    double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    double getArea() {
//        return Math.PI * radius * radius;
//    }
//}
//
//class Rectangle extends Shape {
//    double width, height;
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//    @Override
//    double getArea() {
//        return width * height;
//    }
//    public static void main(String[] args) {
//        Shape circle = new Circle(5);
//        Shape rectangle = new Rectangle(4, 6);
//        System.out.println("Площадь круга: " + circle.getArea());
//        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
//    }
//}

////49
//class Animal {
//    void move() {
//        System.out.println("Животное движется.");
//    }
//}
//
//class Fish extends Animal {
//    @Override
//    void move() {
//        System.out.println("Рыба плавает.");
//    }
//}
//
//class Bird extends Animal {
//    @Override
//    void move() {
//        System.out.println("Птица летает.");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    void move() {
//        System.out.println("Собака бегает.");
//    }
//
//    public static void main(String[] args) {
//        Animal[] movingAnimals = {new Fish(), new Bird(), new Dog()};
//        for (Animal animal : movingAnimals) {
//            animal.move();
//        }
//    }
//}

////50
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//class Student {
//    String name;
//    String group;
//    double grade;
//
//    public Student(String name, String group, double grade) {
//        this.name = name;
//        this.group = group;
//        this.grade = grade;
//    }
//}
//
//class University {
//    private List<Student> students = new ArrayList<>();
//
//    public void addStudent(Student student) {
//        students.add(student);
//    }
//
//    public List<Student> sortByName() {
//        students.sort(Comparator.comparing(student -> student.name));
//        return students;
//    }
//
//    public List<Student> filterByGrade(double grade) {
//        List<Student> filtered = new ArrayList<>();
//        for (Student student : students) {
//            if (student.grade >= grade) {
//                filtered.add(student);
//            }
//        }
//        return filtered;
//    }
//
//    public static void main(String[] args) {
//        University university = new University();
//        university.addStudent(new Student("Алиса", "КС", 3.8));
//        university.addStudent(new Student("Боб", "Математика", 2.9));
//        university.sortByName().forEach(student -> System.out.println(student.name));
//    }
//}

////51
//import java.util.ArrayList;
//import java.util.List;
//
//class Product {
//    String name;
//    double price;
//    int quantity;
//
//    public Product(String name, double price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }
//}
//class Store {
//    private List<Product> products = new ArrayList<>();
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//    public void removeProduct(String name) {
//        products.removeIf(product -> product.name.equals(name));
//    }
//    public Product searchProduct(String name) {
//        for (Product product : products) {
//            if (product.name.equals(name)) {
//                return product;
//            }
//        }
//        return null;
//    }
//
//    public static void main(String[] args) {
//        Store store = new Store();
//        store.addProduct(new Product("Молоко", 50.5, 100));
//        store.addProduct(new Product("Хлеб", 20.0, 200));
//
//        Product product = store.searchProduct("Молоко");
//        if (product != null) {
//            System.out.println("Найден товар: " + product.name + ", Цена: " + product.price + ", Количество: " + product.quantity);
//        }
//
//        store.removeProduct("Хлеб");
//    }
//}

////52
//interface PaymentSystem {
//    void pay(double amount);
//    void refund(double amount);
//}
//
//class CreditCard implements PaymentSystem {
//    @Override
//    public void pay(double amount) {
//        System.out.println("Оплата картой на сумму: " + amount);
//    }
//
//    @Override
//    public void refund(double amount) {
//        System.out.println("Возврат на карту на сумму: " + amount);
//    }
//}
//
//class PayPal implements PaymentSystem {
//    @Override
//    public void pay(double amount) {
//        System.out.println("Оплата через PayPal на сумму: " + amount);
//    }
//
//    @Override
//    public void refund(double amount) {
//        System.out.println("Возврат через PayPal на сумму: " + amount);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        PaymentSystem paymentSystem = new CreditCard();
//        paymentSystem.pay(100.0);
//        paymentSystem.refund(50.0);
//    }
//}

//53
//class UniqueID {
//    private static int counter = 0;
//
//    public static String generateID() {
//        counter++;
//        return "ID" + counter;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Уникальный идентификатор: " + UniqueID.generateID());
//        System.out.println("Уникальный идентификатор: " + UniqueID.generateID());
//    }
//}

////54
//class Point {
//    int x, y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}
//class Rectangle {
//    Point topLeft;
//    Point bottomRight;
//
//    public Rectangle(Point topLeft, Point bottomRight) {
//        this.topLeft = topLeft;
//        this.bottomRight = bottomRight;
//    }
//
//    public double calculateArea() {
//        int width = Math.abs(topLeft.x - bottomRight.x);
//        int height = Math.abs(topLeft.y - bottomRight.y);
//        return width * height;
//    }
//
//    public static void main(String[] args) {
//        Point topLeft = new Point(0, 10);
//        Point bottomRight = new Point(5, 0);
//        Rectangle rectangle = new Rectangle(topLeft, bottomRight);
//        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
//    }
//}

//55
//class ComplexNumber {
//    double real;
//    double imaginary;
//
//    public ComplexNumber(double real, double imaginary) {
//        this.real = real;
//        this.imaginary = imaginary;
//    }
//
//    public ComplexNumber add(ComplexNumber other) {
//        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
//    }
//
//    public ComplexNumber subtract(ComplexNumber other) {
//        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
//    }
//    public ComplexNumber multiply(ComplexNumber other) {
//        double realPart = this.real * other.real - this.imaginary * other.imaginary;
//        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
//        return new ComplexNumber(realPart, imaginaryPart);
//    }
//
//    public ComplexNumber divide(ComplexNumber other) {
//        double denominator = other.real * other.real + other.imaginary * other.imaginary;
//        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
//        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
//        return new ComplexNumber(realPart, imaginaryPart);
//    }
//
//    public String toString() {
//        return real + " + " + imaginary + "i";
//    }
//
//    public static void main(String[] args) {
//        ComplexNumber num1 = new ComplexNumber(3, 2);
//        ComplexNumber num2 = new ComplexNumber(1, 7);
//
//        ComplexNumber result = num1.add(num2);
//        System.out.println("Сумма: " + result);
//
//        result = num1.subtract(num2);
//        System.out.println("Разность: " + result);
//    }
//}

////56
//class Matrix {
//    private int[][] data;
//
//    public Matrix(int rows, int cols) {
//        data = new int[rows][cols];
//    }
//
//    public void setElement(int row, int col, int value) {
//        data[row][col] = value;
//    }
//
//    public int getElement(int row, int col) {
//        return data[row][col];
//    }
//
//    public Matrix add(Matrix other) {
//        int rows = data.length;
//        int cols = data[0].length;
//        Matrix result = new Matrix(rows, cols);
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                result.setElement(i, j, this.getElement(i, j) + other.getElement(i, j));
//            }
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Matrix matrix1 = new Matrix(2, 2);
//        matrix1.setElement(0, 0, 1);
//        matrix1.setElement(0, 1, 2);
//        matrix1.setElement(1, 0, 3);
//        matrix1.setElement(1, 1, 4);
//
//        Matrix matrix2 = new Matrix(2, 2);
//        matrix2.setElement(0, 0, 5);
//        matrix2.setElement(0, 1, 6);
//        matrix2.setElement(1, 0, 7);
//        matrix2.setElement(1, 1, 8);
//
//        Matrix sum = matrix1.add(matrix2);
//        System.out.println("Результат сложения матриц: ");
//        System.out.println(sum.getElement(0, 0) + " " + sum.getElement(0, 1));
//        System.out.println(sum.getElement(1, 0) + " " + sum.getElement(1, 1));
//   }
//}
//
//57
//class Player {
//    String name;
//    int health;
//
//    public Player(String name) {
//        this.name = name;
//        this.health = 100;
//    }
//
//    public void attack(Enemy enemy) {
//        System.out.println(name + " атакует " + enemy.name);
//        enemy.health -= 10;
//    }
//
//    public static void main(String[] args) {
//        Player player = new Player("Игрок");
//        Enemy enemy = new Enemy("Противник");
//
//        player.attack(enemy);
//        System.out.println("Здоровье противника: " + enemy.health);
//    }
//}
//
//class Enemy {
//    String name;
//    int health;
//
//    public Enemy(String name) {
//        this.name = name;
//        this.health = 50;
//    }
//}
//
//class Weapon {
//    String type;
//
//    public Weapon(String type) {
//        this.type = type;
//    }
//
//    public void use() {
//        System.out.println("Использую оружие: " + type);
//    }
//}

////58
//import java.util.ArrayList;
//import java.util.List;
//
//class Product {
//    String name;
//    double price;
//
//    public Product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//}
//
//class Order {
//    List<Product> products = new ArrayList<>();
//
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public double totalCost() {
//        double total = 0;
//        for (Product product : products) {
//            total += product.price;
//        }
//        return total;
//    }
//}
//
//class Customer {
//    String name;
//    List<Order> orders = new ArrayList<>();
//
//    public Customer(String name) {
//        this.name = name;
//    }
//
//    public void
//
//    addOrder(Order order) {
//        orders.add(order);
//    }
//
//    public static void main(String[] args) {
//        Product product1 = new Product("Товар 1", 20.0);
//        Product product2 = new Product("Товар 2", 30.0);
//
//        Order order = new Order();
//        order.addProduct(product1);
//        order.addProduct(product2);
//
//        Customer customer = new Customer("Иван");
//        customer.addOrder(order);
//
//        System.out.println("Общая стоимость заказа: " + order.totalCost());
//    }
//}

////59
//class Device {
//    String brand;
//
//    public Device(String brand) {
//        this.brand = brand;
//    }
//
//    public void turnOn() {
//        System.out.println("Устройство включено.");
//    }
//
//    public void turnOff() {
//        System.out.println("Устройство выключено.");
//    }
//}
//
//class Smartphone extends Device {
//    public Smartphone(String brand) {
//        super(brand);
//    }
//
//    public void takePhoto() {
//        System.out.println("Сделана фотография.");
//    }
//
//    public static void main(String[] args) {
//        Smartphone smartphone = new Smartphone("Samsung");
//        smartphone.turnOn();
//        smartphone.takePhoto();
//    }
//}
//
//class Laptop extends Device {
//    public Laptop(String brand) {
//        super(brand);
//    }
//
//    public void browseInternet() {
//        System.out.println("Поиск в интернете.");
//    }
//}

////60
//class Player {
//    String name;
//    char symbol;
//
//    public Player(String name, char symbol) {
//        this.name = name;
//        this.symbol = symbol;
//    }
//
//    public void makeMove(Game game, int row, int col) {
//        game.board[row][col] = symbol;
//    }
//}
//
//class Game {
//    char[][] board = new char[3][3];
//
//    public Game() {
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                board[i][j] = '-';
//            }
//        }
//    }
//
//    public void displayBoard() {
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public boolean checkWin() {
//        // Проверка победы по строкам, столбцам и диагоналям
//        for (int i = 0; i < 3; i++) {
//            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
//                return true;
//            }
//            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
//                return true;
//            }
//        }
//        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
//            return true;
//        }
//        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
//            return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Game game = new Game();
//        Player player1 = new Player("Игрок 1", 'X');
//        Player player2 = new Player("Игрок 2", 'O');
//
//        game.displayBoard();
//        player1.makeMove(game, 0, 0);
//        game.displayBoard();
//        player2.makeMove(game, 1, 1);
//        game.displayBoard();
//
//        if (game.checkWin()) {
//            System.out.println("Победитель!");
//        }
//    }
//}





