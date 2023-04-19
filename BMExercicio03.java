//public class ContaBancariaSimplificada;
public class BMExercicio03{
    public static void main(String[] args){
        String nomeDoCorrentista = "Antonio Lacerda";
        Boolean contaEEspecial = true;
        int saldo = -10;

        System.out.print("O nome do correntista é: ");
        System.out.println(nomeDoCorrentista);
        if(contaEEspecial){
            System.out.println("A conta é especial");
            if(saldo<0){
                System.out.println("ALERTA: Seu saldo está negativo!");
            }
        }else{
            System.out.println("A conta é comum");
        }
    }
}