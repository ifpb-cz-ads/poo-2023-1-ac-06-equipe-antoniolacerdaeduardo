public class CBBAtividadePratica03 {
    public static void main(String[] args) {
        String frase1 = new String("Testando igualdade!");
        String frase2 = new String("Testando igualdade!");
        System.out.println("Frase 1: " + frase1);
        System.out.println("Frase 2: " + frase2);
        System.out.println("Frase 1 e Frase 2 são iguais? R: " + (frase1.equals(frase2)));
        // "==" compara primitivos, para equals compara o conteúdo de um atributo do objeto, por isso o teste é verdadeiro
    }
}
