public class JavaStringTwo {
  public static void main(String[] args) {

    String string1 = "Ram";
    String string2 = "Ram";
    String string3 = "ram";

    System.out.println(string1.length());
    System.out.println(string1.charAt(0));
    System.out.println(string1.charAt(2));
    System.out.println(string1.equals(string2));
    System.out.println(string1.compareTo(string2));
    System.out.println(string1.equalsIgnoreCase(string3));

    String a = "remote";
    String b = "ramote";

    System.out.println(a.compareTo(b));
    System.out.println(b.compareTo(a));

    String c = "Random Name";
    System.out.println(c.substring(5));
    System.out.println(c.substring(0, 5)); // last character is excluded

    System.out.println(c.toUpperCase());
    System.out.println(c.toLowerCase());
    System.out.println(c.toCharArray());

    String d = "          Random Name           ";
    System.out.println(d.trim());

    // The changes are being made and stored as new string. Strings are stored in
    // String pool for optimization.
    // All these methods return a new string. Changes are not being made on the
    // original string.

    String d_new = d.replace("Name", "New_Name");
    System.out.println(d_new);
    System.out.println(d.contains("ame"));
    System.out.println(c.startsWith("Ra"));
    System.out.println(c.endsWith("Ra"));
    System.out.println(c.endsWith("me"));
    System.out.println(c.indexOf("m"));
    System.out.println(c.lastIndexOf("m"));

    String formattedString = String.format("My name is %s and my age is %d.", "John", 25);
    System.out.println(formattedString);
  }
}
