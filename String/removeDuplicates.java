package String;

public class removeDuplicates {
  public String removeDup(String str) {
    String strNoDup = "";

    for(char ch : str.toCharArray()) {
      if(!strNoDup.contains(String.valueOf(ch))) {
        strNoDup += ch;
      }
    }
    return strNoDup;
  }

}
