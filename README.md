<h1>Atividade Compartilhada 6.03 Batista & Moraes</h1>
<h2>1. Escreva um modelo para representar uma lâmpada que está à venda em um supermercado. Que dados devem ser representados por esse modelo?</h2>
<p>Os dados que devem representar uma lâmpada vendida no mercado são: Marca, voltagem e o preço. Os métodos que devem conter uma classe do tipo lâmpada são as responsáveis por ligar e desligar a lâmpada.</p>
<img src="./img/BMExercicio01.png"/>

<h2>2. Crie um modelo para representar um time de um esporte qualquer em um campeonato desse esporte. Que dados e operações esse modelo deve ter?</h2>
<p>Os dados que devem representar um time de futebol, por exemplo, em um campeonato são: Nome, qt. de Pontos e a posição no campeonato. Os métodos que devem conter uma classe do tipo time de futebol são as responsáveis por somar pontos, incrementar ou diminuir a posição na tabela e consultar as informações do time.</p>
<img src="./img/BMExercicio02.png"/>

<h2>6. Modifique o método “abreContaSimples” da classe “ContaBancariaSimplificada” de forma que o cliente só possa abrir uma conta com um valor mínimo de R$ 100,00</h2>

```java
public void abreContaSimples(String nome, double valorInicialConta){
    const double valorMinimo = 100.00;

    nomeDoCorrentista = nome;
    saldo = 0.00;
    contaÉEspecial = false;

    if(valorInicialConta < 100){
        System.out.println("Você está tentando criar uma conta com um valor abaixo do mínimo que é de R$" + valorMinimo + ". Tente novamente com um valor correto!");
    }
}
```

<h2>7. Identifique e explique o(s) erro(s) na classe abaixo:</h2>

```java
class Registro De Eleitor {
    //Declaração dos campos desta classe
    int tituloDeEleitor; // número do título do eleitor
    String nome; // nome do eleitor
    short zonaEleitoral; // número da zona eleitoral
} // fim da classe
```

<p>O Erro principal deste código é que a classe foi nomeada de forma incorreta. para nomeação de classe é preciso que apenas um nome seja indicado. A prática recomendada é utilizar o sistema de camelCase. Exemplo: "registroDeEleitor".</p>

<h2>8. Identifique e explique o(s) erro(s) na classe abaixo:</h2>

```java
class Teste2 {
    //Declaração dos campos desta classe
    int num1,num2;
    //Declaração dos métodos desta classe
    int maior() {
        if (num1 > num2)
        return true;
        else return false;
    }
    void menor() {
        if (num1 < num2)
        return num1;
        else return num2;
    }
} // fim da classe
```

<p>Foi possível identificar dois erros de sintaxe: não é possível retornar valor booleano no método "maior" que teve o retorno declarado como "int", nem é possível retornar qualquer valor no método "menor" que foi declarado sem retorno "void".</p>

<h2>9. Identifique e explique o(s) erro(s) na classe abaixo:</h2>

```java
class TesteImpressao {
    main(String[] args) {
        System.out.println("7+2="+(7+2));
        System.out.println("7-2="+(7-2));
        System.out.println("7*2="+(7*2));
        System.out.println("7/2="+(7/2));
        return true;
    }
} // fim da classe
```

<p>A declaração do método "main" está incompleta. Falta definir o escopo "public", que o método é estático "static" e que não deve retornar nenhum valor ao final "void" (também, na contramão, ele define um valor booleano como retorno). </p>