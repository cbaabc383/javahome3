import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка.

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>
        (Arrays.asList(23, 47, 69, 56, 36, 0, 12, 88, 56, 45, -88, -13, -9));
        System.out.println(list1);
        System.out.println("Min element is " + Collections.min(list1));
        System.out.println("Max element is " + Collections.max(list1));
        int sum = 0;
        for (int i = 0; i < list1.size(); i++) {
            sum += list1.get(i);
        }
        double aver = ((float)sum /list1.size());
        System.out.println("Average is ");
        System.out.printf("%.2f", aver);
    }
}
