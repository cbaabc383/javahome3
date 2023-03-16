import java.util.ArrayList;
import java.util.Arrays;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

/**
 * task2
 */
public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>
        (Arrays.asList(23, 47, 69, 56, 36, 0, 12, 88, 56, 45, -88, -13));
        System.out.println(list1);
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
                i--;
            }
        }
        System.out.println(list1);
    }
}
