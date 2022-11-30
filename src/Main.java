import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {



        //1
        System.out.println("ВВедите число типа int");
        int a=scanner.nextInt();
        System.out.println("Вы ввели число :"+a);



        //3
        System.out.println("ВВедите число типа int");
        int e=scanner.nextInt();
        System.out.println("ВВедите число типа int");
        int f=scanner.nextInt();
        System.out.println(dif(e,f));



        //2
       System.out.println(sum());

    }
    //2
    static int sum() {
        System.out.println("ВВедите число типа int");
        int b = scanner.nextInt();


        System.out.println("ВВедите число типа int");
        int c = scanner.nextInt();


        System.out.println("ВВедите число типа int");
        int d = scanner.nextInt();

        return b + d + c ;
    }


    //3
    static int dif (int x, int y){

        return x-y;
    }


}
























/*First level:  1) Метод(процедура), которая будет считывать значения и выводить их на консоль
    2) Метод(Функция), которая будет считывать 3 значения и возвращать их сумму
    3*) Сделать глобальную переменную static Scanner и считать два значения в метое main, передать их в функцию, вычислить
    их разность и вывести на консоль их метода main

 */