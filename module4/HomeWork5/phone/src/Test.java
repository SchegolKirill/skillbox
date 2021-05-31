import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        String phoneNumber = number.replaceAll("[^0-9]", "");
        System.out.println(phoneNumber);
         if(phoneNumber.length() == 11 && phoneNumber.charAt(0) == 7){
             System.out.println(phoneNumber);
         }else if(phoneNumber.length() == 11 && phoneNumber.charAt(0) == 8){
             System.out.println(phoneNumber.replace(phoneNumber.charAt(0), '7'));
         }else if(phoneNumber.length() == 11 && phoneNumber.charAt(0) != '7' && phoneNumber.charAt(0) != '8'){
             System.out.println("Неверный формат номера");
         }else if(phoneNumber.length() > 11){
             System.out.println("Неверный формат номера");
         }else if(phoneNumber.length() < 10){
             System.out.println("Неверный формат номера");
         }else if (phoneNumber.length() == 10) {
             System.out.println(7 + phoneNumber);
         }

    }

}
