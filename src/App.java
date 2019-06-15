import java.util.*;

public class App {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set2.add("0");
        set2.add("1");
        set2.add("2");
        System.out.println(symmetricDifference(set1, set2));
        reversePairedArraysElements();

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        HashSet<T> set = new HashSet<>(set1);
        HashSet<T> set1Copy = new HashSet<>(set1);
        HashSet<T> set2Copy = new HashSet<>(set2);
        set.removeAll(set2Copy);
        set2Copy.removeAll(set1Copy);
        set.addAll(set2Copy);
        return  set;
    }
    public static void reversePairedArraysElements() {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        int i = 0;
        while (scanner.hasNextInt()) {
            if (i % 2 != 0) {
                arrayDeque.add(scanner.nextInt());
            } else {
                scanner.nextInt();
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < arrayDeque.size(); ) {
            sb.append(arrayDeque.getLast()).append(" ");
            arrayDeque.removeLast();
        }
        System.out.print(sb.toString());
    }
}
