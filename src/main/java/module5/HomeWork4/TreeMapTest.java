package module5.HomeWork4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, String> phoneList = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        for(;;){
            String textString = scanner.nextLine();

            Pattern p1 = Pattern.compile("[0-9]+");
            Matcher m1 = p1.matcher(textString);

            Pattern p2 = Pattern.compile("[а-яА-Я]+");
            Matcher m2 = p2.matcher(textString);

            if(textString.equals("LIST")){
                printMap(phoneList);
            }

            while (m1.find() || m2.find()) {
                if (m1.matches()){
                    if(phoneList.containsKey(textString.substring(m1.start(), m1.end())) && !phoneList.containsValue("No name")){
                        System.out.println(textString.substring(m1.start(), m1.end()) + " => "
                                + phoneList.get(textString.substring(m1.start(), m1.end())));
                    }else if(phoneList.containsKey(textString.substring(m1.start(), m1.end())) && phoneList.containsValue("No name")){
                        System.out.println("Введите имя");
                    }else if(phoneList.containsKey("No key")){
                        phoneList.put(textString.substring(m1.start(), m1.end()), phoneList.get("No key"));
                        phoneList.remove("No key");
                    }else{
                        phoneList.put(textString.substring(m1.start(), m1.end()), "No name");
                        System.out.println("Введите имя");
                    }
                }else if (m2.matches()){
                    if(phoneList.containsValue(textString.substring(m2.start(), m2.end())) && !phoneList.containsKey("No key")){
                        for(Map.Entry<String, String> item : phoneList.entrySet()){
                            if(item.getValue().equals(textString.substring(m2.start(), m2.end()))){
                                System.out.println(item.getKey() + " => " + item.getValue());
                            }
                        }
                    }else if(phoneList.containsValue(textString.substring(m2.start(), m2.end())) && phoneList.containsKey("No key")){
                        System.out.println("Введите номер телефона");
                    }else if(phoneList.containsValue("No name")){
                        for(Map.Entry<String, String> item : phoneList.entrySet()){
                            if(item.getValue().equals("No name")){
                                item.setValue(textString.substring(m2.start(), m2.end()));
                            }
                        }
                    }else{
                        phoneList.put("No key", textString.substring(m2.start(), m2.end()));
                        System.out.println("Введите номер телефона");
                    }
                }
            }
        }
    }

    private static void printMap(Map<String, String> map){
        map.entrySet().stream().sorted(Map.Entry.<String, String>comparingByValue())
                .forEach(s-> System.out.println(s.getKey() + " => " + s.getValue()));
    }
}
