public class Strings1 {
    public static void main(String[] args){
        String name ="sai";
        System.out.println("Length: " +name.length());

        System.out.println("Uppercase: "+name.toUpperCase());
        System.out.println("Lowercase: "+name.toLowerCase());

        System.out.println("Contains 'a': "+name.contains("a"));

        System.out.println("first character: "+name.charAt(0));
    }
}
