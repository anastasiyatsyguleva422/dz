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
