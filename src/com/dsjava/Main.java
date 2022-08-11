package com.dsjava;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	System.out.println(
            "\nВыберите структуру данных:\n"
            + "1) Массив\n"
            + "2) Стек\n"
            + "3) Очередь\n"
            + "4) Связанный список\n"
            + "5) Двоичное дерево\n"
            + "6) Красно-черное дерево\n"
            + "7) Дерево 2-3-4\n"
            + "8) Хэш таблица\n"
            + "9) Пирамида\n"
            + "10) Граф\n"
            + "11) Взвешенный граф\n"
    );

    Scanner scanner = new Scanner(System.in);
    String dsindex = scanner.nextLine();
    switch (dsindex){
        case ("1"):
            System.out.println(dsindex);
            break;
        case ("2"):
            System.out.println(dsindex);
            break;
        case ("3"):
            System.out.println(dsindex);
            break;
        case ("4"):
            System.out.println(dsindex);
            break;
        case ("5"):
            System.out.println(dsindex);
            break;
        case ("6"):
            System.out.println(dsindex);
            break;
        case ("7"):
            System.out.println(dsindex);
            break;
        case ("8"):
            System.out.println(dsindex);
            break;
        case ("9"):
            System.out.println(dsindex);
            break;
        case ("10"):
            System.out.println(dsindex);
            break;
        case ("11"):
            System.out.println(dsindex);
            break;
        default:
            System.out.println("Такого нет");
            break;
    }
    }
}
