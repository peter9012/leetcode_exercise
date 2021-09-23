import java.util.*;

public class ransom_note {
  private Map<Character, Integer> makeCountsMap(String s) {
    Map<Character, Integer> counts = new HashMap<>();
    for (char c : s.toCharArray()) {
        int currentCount = counts.getOrDefault(c, 0);
        counts.put(c, currentCount + 1);
    }
    return counts;
  }

  public boolean canConstruct(String ransomNote, String magazine) {
        
    // Check for obvious fail case.
    if (ransomNote.length() > magazine.length()) {
        return false;
    }

    // Make the count maps.
    Map<Character, Integer> ransomNoteCounts = makeCountsMap(ransomNote);
    Map<Character, Integer> magazineCounts = makeCountsMap(magazine);
    
    // For each unique character, c, in the ransom note:
    for (char c : ransomNoteCounts.keySet()) {
        // Check that the count of char in the magazine is equal
        // or higher than the count in the ransom note.
        int countInMagazine = magazineCounts.getOrDefault(c, 0);
        int countInRansomNote = ransomNoteCounts.get(c);
        if (countInMagazine < countInRansomNote) {
            return false;
        }
    }
    
    // If we got this far, we can successfully build the note.
    return true;
  }
}