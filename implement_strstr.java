
public class implement_strstr {
  public int strStr(String haystack, String needle) {

    int hLength = haystack.length(), nLength = needle.length();

    for (int i = 0; i< hLength - nLength + 1;i++ ){
      if(haystack.substring(i, i+nLength).equals(needle)){
        return i;
      }
    }
    return -1;
  }
  
  // int L = needle.length(), n = haystack.length();
  // if (L == 0) return 0;

  // int pn = 0;
  // while (pn < n - L + 1) {
  //   // find the position of the first needle character
  //   // in the haystack string
  //   while (pn < n - L + 1 && haystack.charAt(pn) != needle.charAt(0)) ++pn;

  //   // compute the max match string
  //   int currLen = 0, pL = 0;
  //   while (pL < L && pn < n && haystack.charAt(pn) == needle.charAt(pL)) {
  //     ++pn;
  //     ++pL;
  //     ++currLen;
  //   }

  //   // if the whole needle string is found,
  //   // return its start position
  //   if (currLen == L) return pn - L;

  //   // otherwise, backtrack
  //   pn = pn - currLen + 1;
  // }
  // return -1;
  
  // }

}