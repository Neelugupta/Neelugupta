public class ReverseString {
    public static void main(String[] args) {
        String original="This is my taddy";
        String reverse=" ";
        int len= original.length();
        for(int i=len - 1; i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        System.out.println(reverse);
    }
}
