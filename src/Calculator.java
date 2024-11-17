/**Создайте консольное приложение “Калькулятор”. Приложение должно читать из консоли введенные пользователем арифметические операции и выводить в консоль результат их выполнения.

        Требования:
        - Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотрите пример)! Решения, в которых каждое число и арифмитеческая операция передаются с новой строки считаются неверными.

        - Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.

        - Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.

        - Калькулятор умеет работать только с целыми числами.

        - Калькулятор умеет работать только с арабскими или римскими цифрами одновременно, при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.

        - При вводе римских чисел, ответ должен быть выведен римскими цифрами, соответственно, при вводе арабских - ответ ожидается арабскими.

        - При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.

        - При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.*/
import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
       // int num = sc.nextInt();char symbol = sc.next().charAt(0);int num2 = sc.nextInt();
       while (true){
        int []arab = new int[10];
        arab[0]=10;
        arab[1]=1;
        arab[2]=2;
        arab[3]=3;
        arab[4]=4;
        arab[5]=5;
        arab[6]=6;
        arab[7]=7;
        arab[8]=8;
        arab[9]=9;

        //int[]arab = {10,1,2,3,4,5,6,7,8,9};

        String[]rome = new String[10];//римские цифры
        rome[0]="X";
        rome[1]="I";
        rome[2]="II";
        rome[3]="III";
        rome[4]="IV";
        rome[5]="V";
        rome[6]="VI";
        rome[7]="VII";
        rome[8]="VIII";
        rome[9]="IX";
        if (sc.hasNextInt()){
            try{int num = sc.nextInt();char symbol = sc.next().charAt(0);int num2 = sc.nextInt();
            if (1<=num&& num<=10&&1<=num2&& num2<=10) {
                int num3=num + num2;
                int num4 = num - num2;
                int num5 = num / num2;
                int num6 = num * num2;
                if (symbol == '+') {
                    System.out.print("="+ num3);
                }else if (symbol == '-') {
                    System.out.println(num4);
                }else if (symbol == '*') {
                    System.out.println(num6);
                }else if (symbol == '/') {
                    System.out.println(num5);
                }else {
                    System.out.println("Введите корректное значение");
                }}else{
                System.out.println("Введите корректное значение");
            System.exit(0);}
        }catch (Exception e){
                System.out.println("Введите корректное значение");
            System.exit(0);}
        }
           /** for (int i = 0; i < arab.length; i++)
           {if(Objects.equals(num,arab[i])){
                System.out.println(rome[i]);}}*/
        else if(sc.hasNextLine()) {
           try{ String s = sc.next(); char symbol = sc.next().charAt(0);  String s2 = sc.next();


            int num = 0;
            int num1 = 0 ;

            for (int j = 0; j < rome.length; j++) {
                if (Objects.equals(s, rome[j])) {

                 num = arab[j];
                    //System.out.println(num);

                }
                if (Objects.equals(s2, rome[j])){
                    num1 = arab[j];
                   // System.out.println(num1);
                }

            }

            int num3 = num + num1;
            int num4 = num / num1;
            int num5 = num * num1;
            int num6 = num - num1;
            if (symbol == '+') {
                if (num3< 10){
                    System.out.println(rome[num3]);
                    ;
                } else if (num3 == 10) {
                    System.out.println("X");
                } else if (num3<=20) {
                    int value = num3%10;
                    System.out.println("X"+rome[value]);
            }}else if (symbol == '-') {
                System.out.println(rome[num6]);
            }else if (symbol == '*') {
                if (num5 < 10){
                    System.out.println(rome[num5]);
                }else if (num5<=20) {
                    int value = num5%10;
                    System.out.println("X"+rome[value]);
                } else if (num5<=30) {
                    int value = num5%10;
                    System.out.println("XX"+rome[value]);
                }else if (num5<40){
                    int value = num5%10;
                    System.out.println("XXX"+rome[value]);
                } else if (num5 ==40) {
                    System.out.println("XL");
                } else if (num5<50) {
                    int value = num5%10;
                    System.out.println("XL"+rome[value]);
                } else if (num5==50) {
                    System.out.println("L");
                }else if (num5<=60) {
                    int value = num5%10;
                    System.out.println("L"+rome[value]);
                }else if (num5<=70) {
                    int value = num5%10;
                    System.out.println("LX"+rome[value]);
                }else if (num5<=80) {
                    int value = num5%10;
                    System.out.println("LXX"+rome[value]);
                }else if (num5<90) {
                    int value = num5%10;
                    System.out.println("LXXXX"+rome[value]);
                }else if (num5==90) {
                    System.out.println("XC");
                } else if (num5<100) {
                    int value = num5%10;
                    System.out.println("XC"+rome[value]);
                }else if (num5==100) {
                    System.out.println("C");
                }
                ;
            }else if (symbol == '/') {
                System.out.println(rome[num4]);
            }else {
                System.out.println("Введите корректное значение");}
            //System.out.println(num3);

        }catch (Exception e){
               System.out.println("Введите корректное значение");
           System.exit(0);}
        }else {
            System.out.println("Введите корректное значение");
        }}



    }}





