package somaNumeros;

public class Main {
    public static void main(String[] args){
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.addNumero(1);
        somaNumeros.addNumero(2);
        somaNumeros.addNumero(3);
        somaNumeros.addNumero(4);
        somaNumeros.addNumero(5);

        System.out.println("Soma: " + somaNumeros.calcularSoma());
        System.out.println("Maior: " + somaNumeros.maiorNumero());
        System.out.println("Menor: " + somaNumeros.menorNumero());
    }
}