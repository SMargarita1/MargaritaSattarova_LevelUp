package homework_one.task_one;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.startCalculator();
    }

    public void startCalculator() {
        double db1; double db2; //variables for calculation
        int choice; // variable for choosing an action
        String exit;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Выберете желаемое действие:");
            System.out.println("1 - Сложение\n2 - Вычитание\n3 - Умножение\n4 - Возведение в степень\n5 - Вычисление факториала числа\n6- Вычисление значения заданного числа Фибоначчи");
            choice = sc.nextInt();
                    if (choice == 1) { //addition of two numbers
                        System.out.println("Введите первое число:");
                        db1 = sc.nextDouble();
                        System.out.println("Введите второе число:");
                        db2 = sc.nextDouble();

                        System.out.println(db1 + " + " + db2 + " = " + (db1 + db2) + "\n");
                    }
                    else if(choice == 2) { //substraction of two numbers
                        System.out.println("Введите первое число:");
                        db1 = sc.nextDouble();
                        int i = (int) db1;
                        System.out.println("Введите второе число:");
                        db2 = sc.nextDouble();
                        int y = (int) db2;

                        System.out.println(i + " - " + y + " = " + (i - y) + "\n");
                    }
                    else if(choice == 3) { //multiplication of two numbers
                        System.out.println("Введите первое число:");
                        db1 = sc.nextDouble();
                        System.out.println("Введите второе число:");
                        db2 = sc.nextDouble();

                        System.out.println(db1 + " * " + db2 + " = " + (db1 * db2) + "\n");
                    }
                    else if(choice == 4) { //exponentiation
                        System.out.println("Введите число:");
                        db1 = sc.nextDouble();
                        int i = (int) db1;
                        System.out.println("Введите степень:");
                        db2 = sc.nextDouble();
                        int y = (int) db2;
                        int result = 1;
                        for (int x=1; x<=y; x++){
                            result = result*i;
                        }
                        System.out.println(i + " в степени " + y + " = " + result + "\n");
                    }
                    else if(choice == 5){ //calculating factorial
                        System.out.println("Введите число > 0 для вычисления факториала:");
                        db1 = sc.nextDouble();
                        int i = (int) db1;
                        int result = 1;
                        for (int x =1; x <= i; x++){
                            result = result * x;
                        }
                        System.out.println(i + "!  = " + result + "\n");

                    }
                    else if(choice == 6){ //calculating fibonacci sequence
                        System.out.println("Введите число для вычисления числа в последовательности Фибоначчи:");
                        db1 = sc.nextDouble();
                        int n = (int) db1;
                        int a = 0;
                        int b = 1;
                        for (int i = 2; i <= n; ++i) {
                            int next = a + b;
                            a = b;
                            b = next;
                        }
                        System.out.println("Ваше число = " + b + "\n");

                    }
            System.out.println("You want to continue? y : n :");
            exit = sc.next();
        }while ("y".equals(exit));
    }
}

