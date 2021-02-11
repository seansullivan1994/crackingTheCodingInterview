public class Main {

    public static void main(String[] args) {
        System.out.println(isPermutation("duck","kcut"));
        System.out.println(isPermutation("duck","dcuk"));
    }

    public static boolean isPermutation(String a, String b) {
        if (a.equals(b)) {
            return true;
        }else if(a.length() != b.length()){
            return false;
        }
        boolean isPermutation = false;
        char[] charArrayA = a.toCharArray();
        for (char c: charArrayA)
        {
            b = b.toLowerCase().replace(c,' ');
            a = a.toLowerCase().replace(c, ' ');
        }
        return a.trim().equals(b.trim());

    }
}
