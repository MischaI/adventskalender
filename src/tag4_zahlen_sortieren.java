public final class tag4_zahlen_sortieren {
  private tag4_zahlen_sortieren() {
  }

  // array 1-10 zufällige reihenfolge sortieren und return

  public static void zahlenSortieren(int[] zahlenArray){
    System.out.println("Tag 4 Anfang");

    int temp;

    for (int i = 0; i<zahlenArray.length -1; i++){
      for (int j = 0; j<zahlenArray.length-(1+i); j++){
        if(zahlenArray[j] > zahlenArray[j+1]){
          temp = zahlenArray[j+1];
          zahlenArray[j+1] = zahlenArray[j];
          zahlenArray[j] = temp;
        }
      }
    }

    for (int value : zahlenArray) {
      System.out.print(value + " ");
    }
    System.out.println();
    System.out.println("Tag 4 Ende. \n__________________________ ");
  }

}
