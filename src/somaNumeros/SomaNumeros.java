package somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributo
    private List<Integer> numerosList;

    public SomaNumeros(){
        this.numerosList = new ArrayList<>();
    }

    //adicionando numeros a lista
    public void addNumero(int numero){
        this.numerosList.add(numero);
    }

    //somando os valores da lista
    public int calcularSoma(){
        int soma = 0;
        for(int i = 0; i < this.numerosList.size(); i++){
            soma += this.numerosList.get(i);
        }
        return soma;
    }

    //encontrando o maior numero da lista
    public int maiorNumero(){
        int maior = 0;
        for(int i =0; i < this.numerosList.size(); i++){
            if(this.numerosList.get(i) > maior){
                maior = this.numerosList.get(i);
            }
        }
        return maior;
    }

    //encontrando o menor numero da lista
    public int menorNumero(){
        int menor = Integer.MAX_VALUE;
        for(int i =0; i < this.numerosList.size(); i++){
            if(this.numerosList.get(i) < menor){
                menor = this.numerosList.get(i);
            }
        }
        return menor;
    }

    //exibindo os numeros da lista
    public void exixbirNumeros(){
        for(int i = 0; i < numerosList.size(); i++){
            System.out.println(numerosList.get(i));
        }
    }


}
