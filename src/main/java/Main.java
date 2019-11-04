import org.jetbrains.annotations.NotNull;
import zoo.Zoo;

public class Main {

    /**
     * 0. Print program arguments
     * Print arguments passed to the main method.
     * Run -> Edit Configurations -> Program arguments
     */
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println("String[] args(foreach loop): " + s);
            if (containJava(s)) {
                System.out.println("This is java: " + s);
            }
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println(String.format("String[] args(for loop): %d: %s", i, args[i]));
            if (containJava(args[i])) {
                System.out.println("This is java: " + args[i]);
            }
        }

        int i = 0;
        while (i < args.length) {
            System.out.println("String[] args(while loop): " + args[i]);
            if (containJava(args[i])) {
                System.out.println("This is java: " + args[i]);
            }
            i++;
        }

        try {
            System.out.println("2. Reverse String(reverseString method) (expected output is dcba): \nActual output: " + reverseString("abcd"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("2. Reverse String (reverseStringWithReverseMethod method )(expected output is dcba): \nActual output: " + reverseStringWithReverseMethod("abcd"));
        System.out.println("3. Palindrome - input: rotor (expected output is true): \nActual output: " + isPalindrome("rotor"));
        System.out.println("3. Palindrome - input: abcd (expected output is false): \nActual output: " + isPalindrome("abcd"));
        System.out.println("4. isUpperCase() - input: ABCD (expected output is true): \nActual output: " + isUpperCase("ABCD"));
        System.out.println("4. isUpperCase() - input: ABcd (expected output is false): \nActual output: " + isUpperCase("ABcd"));
        System.out.println("5. Headliner - input: hello How are you (expected output is Hello How Are You): \nActual output: " + headliner("hello How are you"));
        System.out.println("6. Char counter - input: aaab && a (expected output is 3): \nActual output: " + charCounter("aaab", 'a'));
        String[] resultFrom7th = lengthyAndShorty("a bb ccc ddda dddb");
        System.out.println("7. Lengthy and shorty - input: a bb ccc ddda dddb (expected output is a && ddda): \nActual output: shorty: " + resultFrom7th[0] + " Lengthy: " + resultFrom7th[1]);
        charCounter2("aabcc");

        Zoo.run();
    }

    /**
     * 1. "Java" in the arguments
     * Determine if program arguments contain Java word.
     * use .equals() instead ==
     * WHY?
     * RESULT:
     * method .equals() compare value of object
     * == compare if values has same address in memory
     **/
    static boolean containJava(String word) {
        return word.toLowerCase().equals("java");
    }


    /**
     * 2. Reverse String
     * Reverse a String variable.
     * <p>
     * Input: "abcd"
     * <p>
     * Output: "dcba"
     * <p>
     * StringBuilder - why?when?
     * StringBuffer - why?when?
     */
    static String reverseString(@NotNull String word) throws Exception {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbWhile = new StringBuilder();
        for (int i = word.toCharArray().length - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        int j = word.toCharArray().length - 1;
        while (j >= 0) {
            sbWhile.append(word.charAt(j));
            j--;
        }
        if (sb.toString().equals(sbWhile.toString())) {
            return sbWhile.toString();
        } else {
            throw new Exception("Something is wrong!");
        }
    }

    static String reverseStringWithReverseMethod(@NotNull String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }


    /**
     * 3. Palindrome
     * Determine if a word is a palindrome.
     * <p>
     * Input: "rotor"
     * <p>
     * Output: "true"
     * <p>
     * Input: "abcd"
     * <p>
     * Output: "false"
     */
    static boolean isPalindrome(@NotNull String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 4. isUpperCase()
     * Determine if a String contains only upper case characters.
     * <p>
     * Input: "ABCD"
     * <p>
     * Output: true
     * <p>
     * Input: "ABcd"
     * <p>
     * Output: false
     */
    static boolean isUpperCase(@NotNull String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 5. Headliner
     * Rewrite the first character of every word to upper case.
     * <p>
     * Input: "hello How are you"
     * <p>
     * Output: "Hello How Are You"
     */
    static String headliner(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ");
        }
        return sb.toString();
    }

    /**
     * 6. Char counter
     * Count number of occurences of given character in a given String.
     * <p>
     * Input: String -> "aaab"  char -> 'a'
     * <p>
     * Output: 3
     */
    static int charCounter(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    /**
     * 7. Lengthy and shorty
     * Find the shortest and the longest word in a String. In case of multiple words with the same length, return the first one.
     * <p>
     * Input: "a bb ccc ddda dddb"
     * <p>
     * Output: "a" "ddda"
     */
    static String[] lengthyAndShorty(@NotNull String sentence) {
        String[] arr = sentence.split(" ");
        String[] result = new String[2];
        result[0] = arr[0];
        result[1] = arr[0];

        if (arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                if (result[0].length() > arr[i].length()) {
                    result[0] = arr[i];
                }
                if (result[1].length() < arr[i].length()) {
                    result[1] = arr[i];
                }
            }
        }
        return result;
    }

    /**
     * 8. Char counter 2
     * Print all the characters in a String with their respective counts.
     * <p>
     * Input: "aabcc"
     * <p>
     * Output:
     * 'a' 2
     * 'b' 1
     * 'c' 2
     */
    static void charCounter2(String word) {
        char[] arr = getUniqueChars(word).toCharArray();

        System.out.println("8. Char counter 2 - input: aabcc(expected output is \n'a' 2\n'b' 1\n'c' 2): \nActual output: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(String.format("'%s' %d", arr[i], charCounter(word, arr[i])));
        }
    }


    /**
     * get unique sorted char String
     */
    private static String getUniqueChars(String word) {
        return word.chars().sorted().distinct()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

}
