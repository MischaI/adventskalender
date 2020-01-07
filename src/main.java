import java.util.ArrayList;
import java.util.Collection;

public class main {
  public static void main(String[] args) {

    //tag2_sternchen_rahmen tag2 = new tag2_sternchen_rahmen();
    Collection<String> stringliste = new ArrayList<String>();
    stringliste.add("Hallo");
    stringliste.add("Mein Name ist: ");
    stringliste.add("Michael");
    tag2_sternchen_rahmen.zeicheRahmen(stringliste);

    //tag3_Palindrome tag3 = new tag3_Palindrome();
    tag3_Palindrome.isPalindrome("Retter");
  }
}
