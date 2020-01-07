final class tag3_Palindrome {

  public static void isPalindrome(String wort){

    System.out.println("Tag 3 Anfang");

    StringBuilder palindrome = new StringBuilder();

    System.out.println(wort);

    for(int i = wort.length()-1; 0 <= i; i--){
      palindrome.append(wort.charAt(i));
    }

    if(wort.equalsIgnoreCase(palindrome.toString())){
      System.out.println("True");
    }else{
      System.out.println("False");
    }

    System.out.println("Tag 3 Ende. \n__________________________ ");
  }
}
