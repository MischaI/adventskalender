import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class main {
  public static void main(String[] args) {

    //tag2_sternchen_rahmen
    Collection<String> stringliste = new ArrayList<>();
    stringliste.add("Hallo");
    stringliste.add("Mein Name ist: ");
    stringliste.add("Michael");
    tag2_sternchen_rahmen.zeicheRahmen(stringliste);

    //tag3_Palindrome
    System.out.println(tag3_Palindrome.isPalindrome("Retter"));
    System.out.println("Tag 3 Ende. \n__________________________ ");

    //tag4_zahlen_sortieren
    int[] zahlen = {1,5,6,8,2,9,3,4,10,7};

    tag4_zahlen_sortieren.zahlenSortieren(zahlen);

    tag7_weihnachtsbaum.drawTree(10);

  }
}
