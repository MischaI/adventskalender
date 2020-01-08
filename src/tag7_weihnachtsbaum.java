import java.util.Random;

public class tag7_weihnachtsbaum {

  // Weihnachtsbaum generieren lassen.
  /*
  *         ##
  *
  *
  * */

  public static void drawTree(int hoehe){

    System.out.println("Tag 7 Anfang");

    Random random = new Random();

    for (int i = 0; i<hoehe; i++){

      for (int j = 0; j<hoehe-i; j++){
        System.out.print(" ");
      }
      for (int j = 0; j<i; j++){
        if(i < hoehe-1){
          int num = random.nextInt(4);
          if(num < 3){
            System.out.print("#");
          }else {
            System.out.print("O");
          }
        } else {
          System.out.print(" ");
        }
      }

      if(i == 0){
        System.out.println("##");
      }else {
        System.out.println("||");
      }

      for (int j = i; j > 0; j--) {
        if (i < hoehe - 1) {
          int num = random.nextInt(4);

          if (num < 3) {
            System.out.print("#");
          } else {
            System.out.print("O");
          }
        } else {
          System.out.print(" ");
        }
      }

      //System.out.println();



    }


    System.out.println("\nTag 7 Ende. \n__________________________ ");

  }

}
