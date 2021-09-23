public class length_of_last_word {
  public int lengthOfLastWord(String s) {
    // int p = s.length() - 1;
    // while(p >= 0 && s.charAt(p) == ' ') {
    //   p--;
    // }
    // int length = 0;
    // while(p >= 0 && s.charAt(p) != ' ') {
    //   p--;
    //   length++;
    // }
    // return length;   
    int p = s.length() - 1; 
    int length = 0;

    while (p > 0){

      if (s.charAt(p) != ' '){
        length++;
      }
      else if (length > 0){
        return length;
      }
    }
    return length;
  }
}