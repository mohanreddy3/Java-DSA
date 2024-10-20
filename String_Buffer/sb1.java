package String_Buffer;

public class sb1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); //-> Mutable ->Efficient
        System.out.println(sb.capacity());    //-> Thread Safe (doesn't allow other threads to work on the same task) (Slow)
        sb.append("Mohan Sai Reddy");
        System.out.println(sb);
        sb.replace(6, 9, "SAI");
        sb.deleteCharAt(9);
        sb.delete(0, 6);
        sb.reverse();
        System.out.println(sb);
        
    }
    
}
