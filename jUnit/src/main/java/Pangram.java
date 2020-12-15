import java.util.HashSet;
import java.util.Set;

public class Pangram {

    public boolean check(String sentence){
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll("[^a-z]", "");

        char[] chars = sentence.toCharArray();

        Set<Character> set = new HashSet<Character>();

        for( int i = 0; i < chars.length; i++ ) set.add(chars[i]);

        return set.size() == 26 ? true : false;

    }
}