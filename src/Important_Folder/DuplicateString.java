package Important_Folder;

public class DuplicateString {
    public static void main(String[] args) {
        String str = "programming";   // Example string
        int[] freq = new int[256];    // ASCII size (can handle normal characters)

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Duplicate characters:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println((char) i + " - " + freq[i] + " times");
            }
        }
    }
}
