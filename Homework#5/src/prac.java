public class prac {
    public static void main(String[] args) {
        String string = "www.google.com";

        StringBuilder s = new StringBuilder(string.length());
        int i = string.indexOf("\\.");

        while(i>0){
            StringBuilder s_ = new StringBuilder(string.substring(0,i));
            s = s_.append(string.substring(0,i));
            s = s_.append('.');
            string = string.substring(i+1);

            i = string.indexOf("\\.");

        }
        StringBuilder s_ = new StringBuilder(string.substring(string.length()));
        s = s_.append(string.substring(0));


    }
}
