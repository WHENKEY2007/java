class Main {
    public static void main(String[] args) {
    String st1="Tyson ";
    String st2="Classy  ";
    String st3="Daichi  ";
    System.out.println(st1.length());
    System.out.println(st2.charAt(4));
    System.out.println(st3.equals(st2));
    System.out.println(st3.indexOf('i'));
    System.out.println(st3.lastIndexOf('i'));
    System.out.println(st2.replace('s','a'));
    System.out.println(st1.replaceFirst("Ty","My"));
    System.out.println(st2.replaceAll("a","@"));
    }
}