import java.util.*;

public class Recursion010419 {
  public static List<String> makeAllWords(int k, int maxLetter) {
    List<String> data = new ArrayList<>();
    if (k!=0) {
        help(k, data, "", maxLetter);
    }
    return data;
  }

  public static void help(int k, List<String> data, String word, int maxLetter) {
    if (k == 0) {
      data.add(word);
    }
    else {
      for (int i = 0; i < maxLetter; i++) {
        help(k-1, data, word+(char)('a'+i), maxLetter);
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(makeAllWords(1, 10));
    System.out.println(makeAllWords(2, 10));
    System.out.println(makeAllWords(3, 6));
    System.out.println(makeAllWords(0, 10));
  }
}
