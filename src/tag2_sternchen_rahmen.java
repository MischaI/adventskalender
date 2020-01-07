final class tag2_sternchen_rahmen {
  /*Der Sternchen-Rahmen
  * Ein Beispiel
  *     ******************
  *     *hallo           *
  *     *mein            *
  *     *name ist Michael*
  *     ******************
  */

  public static void zeicheRahmen(Iterable<String> stringliste){
    System.out.println("Tag 2 Anfang");

    // Die längste Zeile ermitteln
    int laengste = 0;
    for (String str: stringliste) {
      if(str.length() >= laengste){
        laengste = str.length();
      }
    }

    // Dach zeichnen
    for(int j = 0; j<=laengste+1; j++){
      System.out.print("*");
    }
    // ende Dach zeichnen

    System.out.println();

    // Zeilen ausgeben
    for (String str: stringliste) {
      StringBuilder ausgabe = new StringBuilder('*' + str);
      int length = str.length();
      //System.out.println(laengste-length);
      int insg = laengste-length;
      for(int i = 0; i<insg; i++){
        ausgabe.append(' ');

      }
      ausgabe.append('*');
      System.out.println(ausgabe);
    }

    // fehlende >Leerzeichen hinzufügen

    // Boden zeichnen
    for(int j = 0; j<=laengste+1; j++){
      System.out.print("*");
    }
    // ende Boden zeichnen

    System.out.println();
    System.out.println("Tag 2 Ende. \n__________________________ ");

  }

}
