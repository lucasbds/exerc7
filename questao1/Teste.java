package questao1;

public class Teste {
    public static void main(String[]args){
        Pessoa p1=new Pessoa("Lucas","Rua: presidente costa e silva :239","(66)4002-8922");
        Fornecedor f1=new Fornecedor("Steve Rogers","brooklin - Rua xxx","(61) 3741-1411",1.87,1.71);
        Empregado e1=new Empregado("O proximo numero","É uma frase >.<","xxx xxx xxxx xxx",8888,9999,5);
        
        
        System.out.println(f1.obterSaldo());
        System.out.println(e1.calcularSalario());
    }
}
