package homework1;

public class CharArrayUtil {
    static void main() {
        char[] chars = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
        //Խնդիր 1 — Տպել բոլոր սիմվոլները
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        //Խնդիր 2 — Հաշվել սիմվոլների քանակը
        System.out.println("Characters count" + ":" + chars.length);
        System.out.println("First character" + ":" + chars[0]);
        System.out.println("Last character" + ":" + chars[chars.length - 1]);
        //Խնդիր 3 — Հաշվել տրված սիմվոլի հանդիպումների քանակը
        char c = 'a';
        int cCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                cCount++;
            }
        }
        System.out.println("Character'" + c + "'count" + ":" + cCount);

        //Խնդիր 4 — Հաշվել ձայնավորների քանակը
        int vowlsCount = 0;
        //Խնդիր 5 — Հաշվել բաղաձայնների քանակը
        int consonantsCount = 0;
        // Խնդիր 6 — Հաշվել բացատների քանակը
        int spacesCount = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'
                    || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                vowlsCount++;

            } else if (ch != ' ' && ch != '!') {
                consonantsCount++;
            } else if (ch == ' ') {
                spacesCount++;
            }
        }

        System.out.println("Vowls Cout" + ":" + vowlsCount);
        System.out.println("Consonants Cout" + ":" + consonantsCount);
        System.out.println("Spaces Cout" + ":" + spacesCount);
        //Խնդիր 8 — Փոխել մեծատառերը և փոքրատառերը
        for (char aChar : chars) {
            if ((int) aChar > 96) {
                aChar = (char) (aChar - 32);
            }
            System.out.print(aChar);
        }

        System.out.println();

        for (char aChar : chars) {
            if ((int) aChar > 65 && (int) aChar < 90) {
                aChar = (char) (aChar + 32);

            }
            System.out.print(aChar);

        }
        System.out.println();
        //Խնդիր 9 — Փոխարինել տրված սիմվոլը
        char[] task9Chars = new char[chars.length];
        for (int k = 0; k < chars.length; k++) {
            task9Chars[k] = chars[k];
        }
        char oldChar = 'a';
        char newChar = '*';

        for (int z = 0; z < task9Chars.length; z++) {
            if (task9Chars[z] == oldChar) {
                task9Chars[z] = newChar;
            }
        }

        for (int z = 0; z < task9Chars.length; z++) {
            System.out.print(task9Chars[z]);
        }
        System.out.println();
        //Խնդիր 10 — Ստուգել Palindrome-ը
        boolean isPalindrome = false;
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                isPalindrome = true;
                break;
            }
        }

        System.out.println("Is palindrome: " + isPalindrome);

        //Խնդիր 7 — Շրջել սիմվոլների հերթականությունը (Reverse)
        int i = 0;
        int lastIndex = chars.length - 1;
        for (char a : chars) {
            if (i < chars.length / 2) {
                chars[i] = chars[lastIndex - i];
                chars[lastIndex - i] = a;
            }
            i++;

        }
        System.out.println(chars);

    }
}
