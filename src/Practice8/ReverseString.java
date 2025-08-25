package Practice8;

public class ReverseString {
    public static void main(String[] args) {
        String[] names = {"Ratul", "Nandy", "At", "Present"};

        // Reverse the array
        for (int i = 0; i < names.length / 2; i++) {
            String temp = names[i];
            names[i] = names[names.length - 1 - i];
            names[names.length - 1 - i] = temp;
        }

        // Print the reversed array
        System.out.println("Reversed Array:");
        for (String name : names) {
            System.out.print(name + " ");
        }

    }
}
