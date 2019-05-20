import java.util.Scanner;
import java.util.Random;

/*-------CRIADOR DE VALORES PARA A LITA-------*/

public class Rand {

    private final Scanner input = new Scanner(System.in);
    private final Random gerador = new Random();
    private final Vet_req Lista;
    public int quantidadeRequisicao;
    public int valorMinimo;
    public int valorMaximo;
    public int tamanhoHeap;
    public int cont_Id = 1;


    Rand(Vet_req lista){

        this.Lista = lista;

    }

    public int buscaDados(){

        if(cont_Id == 1){

            System.out.println("Digite a quantidade de requisições: ");
            quantidadeRequisicao = input.nextInt();
            System.out.println("Digite o tamanho da heap: ");
            tamanhoHeap = input.nextInt();
            System.out.println("Digite o valor mínimo: ");
            valorMinimo = input.nextInt();
            System.out.println("Digite o valor máxmio: ");
            valorMaximo = input.nextInt();

            Random();
            return tamanhoHeap;

        }
        else{

            System.out.println("Digite a quantidade de requisições: ");
            quantidadeRequisicao = input.nextInt();

            Random();
            return tamanhoHeap;

        }

    }

    public void Random(){

        for(int i = 0; i< quantidadeRequisicao; i++){

            Lista.inserir(cria_No());

        }

    }

    private No_req cria_No(){

        No_req novo = new No_req();
        int x;

        x = sem_repeticao();

        novo.setIdentificador(x);
        novo.setTam(gerador.nextInt((valorMaximo - valorMinimo)+1)+ valorMinimo);


        return novo;
    }

    public int sem_repeticao(){

        int i = cont_Id;
        cont_Id++;
        return i;

    }

    //-------------GETTERS------------------------

    public int getCont_Id() {
        return cont_Id;
    }

    public int getQuantidadeRequisicao() {
        return quantidadeRequisicao;
    }

    public int getValorMinimo() {
        return valorMinimo;
    }

    public int getValorMaximo() {
        return valorMaximo;
    }

    public int getTamanhoHeap() {
        return tamanhoHeap;
    }
}