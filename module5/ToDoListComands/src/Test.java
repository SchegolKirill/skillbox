import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> todoList = new ArrayList<>();
        for(int i = 0; i < 30; i++){
            todoList.add("дело" + i);
        }

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String[] commands = command.split(" ");
        String delo = "";

        if(commands[0].equals("LIST")){
            for(String item : todoList){
                System.out.println(item);
            }
        }
        else if(commands[0].equals("ADD") && command.replaceAll("[^0-9]", "").equals("")){
            for(int i = 1; i < commands.length; i++){
                delo = delo + commands[i] + " ";
            }
            todoList.add(delo);
        }
        else if(commands[0].equals("ADD") && Integer.parseInt(commands[1]) == Integer.parseInt(command.replaceAll("[^0-9]", ""))){
            for (int i = 2; i < commands.length; i++){
                delo = delo + commands[i] + " ";
            }
            todoList.add(Integer.parseInt(commands[1]), delo);
        }
        else if(commands[0].equals("EDIT") && Integer.parseInt(commands[1]) == Integer.parseInt(command.replaceAll("[^0-9]", ""))){
            for (int i = 2; i < commands.length; i++){
                delo = delo + commands[i] + " ";
            }
            todoList.set(Integer.parseInt(commands[1]), delo);
        }
        else if(commands[0].equals("DELETE") && Integer.parseInt(commands[1]) == Integer.parseInt(command.replaceAll("[^0-9]", ""))){
            todoList.remove(Integer.parseInt(commands[1]));
        }
    }
}
