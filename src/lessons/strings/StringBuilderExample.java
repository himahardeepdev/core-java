package lessons.strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Hima Hardeep");
        System.out.println(name);

        /* StringBuilder methods
         * 1) append
         * 2) insert
         * 3) replace
         * 4) delete
         * 5) reverse
         */
        
        // Append " Kondeti" to the end of the name
        name.append(" Kondeti");
        System.out.println(name);

        // Insert " Hardeep" at the 4th position
        name.insert(4, " Hardeep");
        System.out.println(name);

        // Replace "Hima" with "Hi"
        name.replace(0, 4, "Hi");
        System.out.println(name);

        // Delete the characters from position 3 to 11 (exclusive)
        name.delete(3, 11);
        System.out.println(name);

        // Reverse the entire name
        name.reverse();
        System.out.println(name);
    }
}
