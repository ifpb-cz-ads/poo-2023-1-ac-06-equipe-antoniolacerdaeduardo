//public class Lampada;
public class BMExercicio04{
    private String marca;
    private String voltagem;
    private double preco;
    private String status = "Desligado";


    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setVoltagem(String voltagem){
        this.voltagem = voltagem;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }


    public String getMarca(){
        return this.marca;
    }

    public String getVoltagem(){
        return this.voltagem;
    }

    public double getPreco(){
        return this.preco;
    }


    public void ligarLampada(){
        if(status.equals("Desligado")){
            status = "Ligado";
        }else{
            System.out.println("Lâmpada já ligada!");
        }
    }

    public void desligarLampada(){
        if(status.equals("Ligado")){
            status = "Desligado";
        }else{
            System.out.println("Lâmpada já desligada!");
        }
    }
}