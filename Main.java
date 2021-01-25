class Main {
  public static void main(String[] args) {
    // decode_string_01 pa = new decode_string_01();
    // String str = "3[a]2[bc]";
    // System.out.println(pa.decodeString(str)); 

    // zigzag_conversion zigzag_cov = new zigzag_conversion();
    // String str = "PAYPALISHIRING";
    // System.out.println(zigzag_cov.zigzagConversion(str, 3));

    decode_ways decode_ways = new decode_ways();
    String str = "23212";
    System.out.println(decode_ways.numDecodings(str));

  }
}