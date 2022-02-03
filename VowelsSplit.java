/*Napisati metodu koja ispisuje samoglasnike u zadatoj reci, kao i njihov broj.*/

public class VowelsSplit {
        public static void main(String[] args) {

            String word = "Amfilohije Marko";
            int numberOfVowels = findNumberOfVowels(word);
            System.out.println(numberOfVowels);

        }

        public static int findNumberOfVowels(String word) {
            StringBuilder stringBuilder = new StringBuilder();
            String[] wordArray = word.split("");
            for (int i = 0; i < wordArray.length; i++) {
                String character = wordArray[i].toLowerCase();
                if (character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o")
                || character.equals("u")) {
                    stringBuilder.append(character);
                }
            }
            System.out.println(stringBuilder.toString());
            return stringBuilder.toString().length();
        }
    }
