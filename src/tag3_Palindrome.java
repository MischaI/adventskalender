final class tag3_Palindrome {

  private tag3_Palindrome() {
  }


  public static boolean isPalindrome(String wort){

    System.out.println("Tag 3 Anfang");

    StringBuilder palindrome = new StringBuilder();

    System.out.println(wort);

    for(int i = wort.length()-1; 0 <= i; i--){
      palindrome.append(wort.charAt(i));
    }

    return wort.equalsIgnoreCase(palindrome.toString());
  }
}
