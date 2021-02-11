
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        panagramDetector("The quick brown fox jumps over the lazy dog.");
    }
    public static void panagramDetector(String sentence){
        Set<Character> alphabet = new HashSet<>();
        String[] wordsInSentence = sentence.toLowerCase().split(" ");
        for (String s: wordsInSentence) {
            for(char c : s.toCharArray()){
                if(Character.isAlphabetic(c))
                    alphabet.add(c);
            }

        }
        if(alphabet.size() == 26){
            System.out.println(reverseSentence(sentence));
        }
        else{
            System.out.println(sentence);
        }
    }
    public static String reverseSentence(String sentence){
        String[] sentenceArray = sentence.split(" ");
        StringBuilder buildReverse = new StringBuilder();
        for(int i = sentenceArray.length-1; i > -1; i--)
        {
            buildReverse.append(sentenceArray[i] +" ");
        }

        return buildReverse.toString();
    }

}
