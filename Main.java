package guvi;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static <T> boolean isSubset(Set<T> setA, Set<T> setB) {
    return setB.containsAll(setA);
  }
  public static void main(String args[]) {
    Set<Character> set1 = new TreeSet<Character>();
    Set<Character> set2 = new TreeSet<Character>();

    set1.add('A');
    set1.add('B');
    set1.add('C');
    set1.add('D');

    set2.add('C');
    set2.add('D');
    set2.add('E');
    set2.add('F');

    System.out.println("set1: " + set1);
    System.out.println("set2: " + set2);

    System.out.println("isSubset: " + isSubset(set1, set2));
  }
}
