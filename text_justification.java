import java.util.*;

public class text_justification  {

  public List<String> fullJustidy(String[] words, int maxWidth) {
    List<String> result = new ArrayList<>();
    int i =0, n = words.length;
    while (i< n){
      int j=i+1;
      int lineLength = words[i].length();
      while(j<n && (lineLength + words[j].length() + (j - i - 1) < maxWidth)) {
        lineLength += words[j].length();
        ++j;
      }
      int diff = maxWidth - lineLength;
      int numberOfWords = j - i;
      if (numberOfWords == 1 || j >= n) result.add(leftJustify(words, diff, i, j));
      else result.add(middleJustify(words, diff, i, j));

      i = j;
      }

    return result;
  }

  private String leftJustify(String[] words, int diff, int i, int j){
    int spaceOnRight = diff - (j -i -1);
    StringBuilder result = new StringBuilder();
    for (int k= i+1; k<j; ++k){
      result.append(" "+ words[k]);
    }
    result.append(" ".repeat(spaceOnRight));
    return result.toString();
  }

  private String middleJustify(String[] words, int diff, int i, int j){
    int spaceNeeded = j - i -1;
    int spaces = diff / spaceNeeded;
    int extraSpaces = diff % spaceNeeded;

    StringBuilder result = new StringBuilder();
    for (int k= i+1; k<j; ++k){
      int spacesToApply = spaces + (extraSpaces-- > 0 ? 1: 0);
      result.append(" ".repeat(spacesToApply) + words[k]);
    }
    return result.toString();
  }
}