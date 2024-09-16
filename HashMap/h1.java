package HashMap;

public class h1 {
    public static void main(String[] args) {
        String name = "mohan";
        String num = "-1";
        Integer numb = 12345;
        int code1 = num.hashCode();
        int code = name.hashCode();
        int code2 = numb.hashCode();
        System.out.println(code2);
        System.out.println(code);
        System.out.println(code1);
    }
    
}
