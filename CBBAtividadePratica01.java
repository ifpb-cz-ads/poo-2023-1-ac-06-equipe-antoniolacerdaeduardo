public class CBBAtividadePratica01 {
    public static void main(String[] args) {
        String frase1 = new String("Testando igualdade!");
        String frase2 = new String("Testando igualdade!");
        //cada vez que usamos o método construtor um novo objeto é criado obrigatoriamente, por isso o teste é falso
        System.out.println("Frase 1: " + frase1);
        System.out.println("Frase 2: " + frase2);
        System.out.println("Frase 1 e Frase 2 são iguais? R: " + (frase1 == frase2));
    }
}