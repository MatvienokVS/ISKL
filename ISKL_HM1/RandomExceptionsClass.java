
 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.util.ArrayList; 
import java.util.Collection; 
import java.util.LinkedList; 
 
public class RandomExceptionsClass { 
    public static void main(String[] args) throws IOException { 
        callMethod6(""); 
        ArrayList<String> stringArraysList = new ArrayList<>(); // Создаем пустой ArrayList 
        callMethod1(); // Метод callMethod1() больше не возвращает ничего 
        int a = 10, b = 2; // Изменено значение b чтобы избежать деления на ноль 
        int div = callMethod2(a, b); 
        System.out.println(div); 
        callMethod3(stringArraysList); 
    } 
 
    private static void callMethod6(String s) { 
        System.out.println("Hello World, it's me!"); 
    } 
 
    private static void callMethod3(ArrayList<String> stringArraysList) { 
        callMethod6(""); 
        // Здесь должно быть условие выхода из рекурсии, например, проверка размера списка 
        if (stringArraysList.size() > 0) { 
            stringArraysList.remove(0); // Просто для примера, как можно изменить список 
            callMethod3(stringArraysList); 
        } 
    } 
 
    private static void callMethod1() throws IOException { 
        callMethod2(100000000, 10 - 10); 
    } 
 
    public static int callMethod2(int a, int b) throws IOException { 
        callMethod6(""); 
        FileInputStream fis = new FileInputStream("1.txt"); 
        fis.read(); 
 
        if (fis.available() > 0) { 
            throw new RuntimeException(); 
        } 
         
        int num = callMethod4("124"); // Убрана лишняя буква 'O' в строке 
        return a / b; 
    } 
 
    private static int callMethod4(String s) { 
        callMethod5(s); 
        return Integer.parseInt(s); 
    } 
 
    private static void callMethod5(String s) { 
        callMethod6(""); 
        String[] strings = new String[5]; 
        for (int i = 0; i < strings.length; i++) { // Исправлено начальное значение i 
            strings[i] = s; 
        } 
    } 
}