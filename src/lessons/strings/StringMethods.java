package lessons.strings;

public class StringMethods {
    public static void main(String[] args) {
        /*
         * methods 
         * 1)charAt()
         * 2)length()
         * 3)substring(int fristIdenx)
         * 4)substring(int firstIndex , lastIndex)
         * 5)toLowerCase()
         * 6)toUpperCase()
         * 7)equals(object obj)
         * 8)equalsIgnoreCase(object obj)
         * 9)indexOf(String str)
         * 10)lastIndexOf(Strng str)
         * 11)startsWith(String str)
         * 12)endsWith(String str)
         * 13)contains(String str)
         * 14)replace(char oldChar , char newChar)
         * 15)trim()
         * 16)isEmpty()
         * 17)split()
         * 18)join()
         * 19)toCharArray()
         * 
         * 
         */
        String name = "Hima Hardeep";
        System.out.println(name);

        System.out.println(name.charAt(3));

        System.out.println(name.length());

        System.out.println(name.substring(5));
        
        System.out.println(name.substring(0, 5));

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        System.out.println("hima".equals("hima"));
        
        System.out.println(name.substring(0 , 4).equalsIgnoreCase("hima"));

        System.out.println(name.indexOf("e"));

        System.out.println(name.lastIndexOf("e"));

        System.out.println(name.startsWith("Hima"));

        System.out.println(name.endsWith("deep"));

        System.out.println(name.contains("deep"));

        System.out.println(name.replace("e", "x"));

        System.out.println("  himaahardeep".trim());

        String[] arr = "this is hima hardeep".split(" ");
        for(String i : arr){
            System.out.println(i);
        }

        String join = String.join(" ", arr);
        System.out.println(join);
        
    }
}
