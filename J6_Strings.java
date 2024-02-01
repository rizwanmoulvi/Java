public class J6_Strings {
    public static void main(String[] args) {
        String name = "Jhon";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String nt = " hello";
        System.out.println(nt.trim());
        System.out.println(name.substring(1));
        System.out.println(name.substring(2,4));
        String name2 = "Parry";
        System.out.println(name2.replace('r', 'p'));
        System.out.println(name.startsWith("Jo"));
        System.out.println(name.endsWith("on"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("on"));
        System.out.println(name.indexOf("o",1));
        System.out.println(name2.lastIndexOf("r"));
        System.out.println(name.equals("jhon"));
        System.out.println(name.equalsIgnoreCase("Jhon"));
    }
    
}
