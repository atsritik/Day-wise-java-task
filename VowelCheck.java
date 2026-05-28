public class VowelCheck {

    // Method to check vowels
    static void checkVowels(String str) throws Exception {

        str = str.toLowerCase();

        if (!(str.contains("a") || str.contains("e") ||
              str.contains("i") || str.contains("o") ||
              str.contains("u"))) {

            throw new Exception("String does not contain vowels");
        }

        else {
            System.out.println("String contains vowels");
        }
    }

    public static void main(String[] args) {

        try {
            checkVowels("Rhythm");
        }

        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}