package strings;

public class palindromo {
    
    public static void main(String[] args) {
        
        StringBuilder palabra = new StringBuilder("sometemos");
        
        if(palabra.toString().equals(palabra.reverse().toString())){
            System.out.println("ES UN PALINDROMO");
        } else {
            System.out.println("NO ES UN PALINDROMO");
        }
    }
}
