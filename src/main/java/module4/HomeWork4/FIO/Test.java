package module4.HomeWork4.FIO;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int firstSpaceIndex = text.indexOf(' ');
        int secondSpaceIndex = text.lastIndexOf(' ');
        String familiya = text.substring(0, firstSpaceIndex);
        String imya = text.substring(firstSpaceIndex + 1, secondSpaceIndex);
        String otchestvo = text.substring(secondSpaceIndex + 1);
        System.out.println("Фамилия: " + familiya);
        System.out.println("Имя: " + imya);
        System.out.println("Отчество: " + otchestvo);
    }
}
