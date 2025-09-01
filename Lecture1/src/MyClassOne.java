class Aaditya{
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    // Never keep the byte codes and source codes together
    // An IDE keeps your source file and binary files separately for you.
    // javac -d (meaning path) ../ (meaning one folder back) bin
    // javac -d ../bin (Generate the binary code in bin folder)
    // To run the file from the same cmd java -classpath ../bin ClassName
  }
}