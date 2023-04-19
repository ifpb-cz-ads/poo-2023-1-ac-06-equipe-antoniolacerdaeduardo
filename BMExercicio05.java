//public class timeDeFutebol;
public class BMExercicio05 {
    private String nome;
    private int qtPontos;
    private int posicao;


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQtPontos(int qtPontos){
        this.qtPontos = qtPontos;
    }

    public void setPosicao(int posicao){
        this.posicao = posicao;
    }


    public String getNome(){
        return this.nome;
    }

    public int getQtPontos(){
        return this.qtPontos;
    }

    public int getPosicao(){
        return this.posicao;
    }


    public void addPontos(){
        this.qtPontos += 3;
    }

    public void incrementaPosicao(int qnt){
        this.posicao += qnt;
    }

    public void decrementaPosicao(int qnt){
        this.posicao -= qnt;
    }

    public void consulta(){
        System.out.println("TIME: " + this.nome);
        System.out.println("POSIÇÃO: " + this.posicao);
        System.out.println("PONTUAÇÃO: " + this.qtPontos);
    }
}
