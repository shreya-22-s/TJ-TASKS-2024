public class Q4 {
    public static int compress(char[] chars) {
        //write your code here
                int index = 0; // Index to place the compressed character
        int i = 0; // Index to iterate through the chars array

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Place the character
            chars[index++] = currentChar;

            // If the count is greater than 1, place the digits of the count
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        // Return the new length of the compressed array
        return index;

    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newSize = compress(chars);
        System.out.println("New length: " + newSize);
        for (int i = 0; i < newSize; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
    }
}
