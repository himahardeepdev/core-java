package lessons.strings;

public class StringBuuffer1 {
   public static void main(String[] args) {
    StringBuffer name = new StringBuffer("Hima Hardeep");
    System.out.println(name);

    /* StringBuffer methods
     * 1) append
     * 2) insert
     * 3) replace
     * 4) delete
     * 5) reverse
     */
    
    // Append " kondeti" to the end of the name
    name.append(" kondeti");
    System.out.println(name);

    // Insert " Hardeep" at the 4th position
    name.insert(4, " Hardeep");
    System.out.println(name);

    // Delete the characters from position 4 to 12 (exclusive)
    name.delete(4, 12);
    System.out.println(name);

    // Reverse the entire name
    name.reverse();
    System.out.println(name);

    name.reverse();
    name.replace(5, 7, "sai");
    System.out.println(name);
   }
    
}
