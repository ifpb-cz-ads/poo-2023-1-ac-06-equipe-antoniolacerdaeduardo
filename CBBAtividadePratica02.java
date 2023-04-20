public class CBBAtividadePratica02 {
    public static void main(String[] args) {
        String frase3 = new String("Testando igualdade!");
        String frase4 = frase3;
        //Foi atribuída a referência do mesmo objeto para as duas variáveis, por isso o teste é verdadeiro
        System.out.println("Frase 3: " + frase3);
        System.out.println("Frase 4: " + frase4);
        System.out.println("Frase 3 e Frase 4 são iguais? R: " + (frase3 == frase4));
    }
}
