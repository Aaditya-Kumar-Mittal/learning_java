class FullyQualifiedName1 {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println("Current date and time: " + date.toString());
        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
        System.out.println("Current SQL date: " + sqlDate.toString());

        // java.lang package is imported by default
    }
}