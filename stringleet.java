public class stringleet {

public static String reverseword(String s){
        String[] word = s.split(" +") ;//any no of space
        StringBuilder sb = new StringBuilder();

        for (int i= word.length-1; i>=0; i--){
            sb.append(word[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String args[]){
      System.out.print( reverseword("the sky is blue"));
      

    }
}
