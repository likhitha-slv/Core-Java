package basics;

public class TcsPracticeCoding {
	public static void main(String args[]) {
		String s1 = "hari";
		String s2 = "hira";
		if (s1.length() != s2.length()) {
			System.out.println("Not a Anagram");
		}
		int freq[] = new int[256];
		for (int i = 0; i < s1.length(); i++) {
			freq[s1.charAt(i)]++;
			freq[s2.charAt(i)]--;
		}
		boolean isAnagram = true;
		for (int i = 0; i < 256; i++) {
			if (freq[i] != 0) {
				isAnagram = false;
				break;
			}
		}
		if (isAnagram) {
			System.out.println("Anagram");
		} else {
			System.out.println("not an anagram");
		}
	}
}
/*
 * public class TcsPracticeCoding { public static void main(String[] args) {
 * 
 * String s1 = "hari"; String s2 = "rahi";
 * 
 * // If lengths differ, not anagram if (s1.length() != s2.length()) {
 * System.out.println("Not anagrams"); return; }
 * 
 * int[] freq = new int[256];
 * 
 * for (int i = 0; i < s1.length(); i++) { freq[s1.charAt(i)]++;
 * freq[s2.charAt(i)]--; }
 * 
 * boolean isAnagram = true;
 * 
 * for (int i = 0; i < 256; i++) { if (freq[i] != 0) { isAnagram = false; break;
 * } }
 * 
 * if (isAnagram) { System.out.println("Anagrams"); } else {
 * System.out.println("Not anagrams"); } } }
 */
