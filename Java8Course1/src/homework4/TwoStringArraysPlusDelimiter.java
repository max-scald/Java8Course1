package homework4;

public class TwoStringArraysPlusDelimiter {
    public static String twoStringArraysPlusDelimiter(String[] key, String[] value, String delimiter){
        StringBuilder builder = new StringBuilder();
        int cout = key.length;

        for (int i = 0; i < cout; i++) {
            builder.append(key[i]).append(delimiter).append(value[i]).append('\n');
        }

         String out = builder.toString();
        return out;
    }
}
