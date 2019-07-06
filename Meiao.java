import java.util.Scanner;

public class Meiao {

    public Vet_req Lista = new Vet_req();
    public Rand auxRand = new Rand(Lista);
    public Heap auxHeap = new Heap(Lista,auxRand);
    private final Scanner input = new Scanner(System.in);
    int menu = 123;
    int flag = 0;

    Meiao(){


    }

    public void menu(){

        /*do{

            System.out.println("------------------------");

            System.out.println("[0]Sair");
            System.out.println("[1]Inicializar");
            System.out.println("[2]Imprimir");
            System.out.println("[3]Heap recebe lista");
            System.out.println("[4]Imprime vetor heap");

            System.out.println("------------------------");
            System.out.print("Digite: ");
            menu = input.nextInt();


            switch(menu){

                case 0:

                    System.out.println("Saiu!");

                break;

                case 1: //inicializador

                    auxRand.buscaDados();
                    if(flag==0){auxHeap.startVet();flag++;} //gambiarra do krl

                break;

                case 2: //IMPRIMIR

                    Lista.imprimir();

                break;

                case 3:

                    auxHeap.alocadorHeap();

                break;

                case 4:

                    auxHeap.imprime();

                break;

                default:

                    System.out.println("\nNao ha esta opcao!\n");

            }

        }while(menu!=0); */


    }

    public void vai_Caralho(){

        long tempoInicial = System.currentTimeMillis();
        auxRand.Random();
        auxHeap.startVet();
        //Lista.imprimir();
        System.out.println("------------------------");
        auxHeap.alocadorHeap();
        //auxHeap.imprime();
        System.out.println("------------------------");
        auxHeap.desalocador_MESMO();
        //auxHeap.imprime();
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Demorou: "+(tempoFinal-tempoInicial)+"ms");
        System.out.println("O Desalocador foi utilizado: "+auxHeap.getContadorDesaloca()+" vezes");

    }


    public Vet_req getLista() { return Lista; }

    public Rand getAuxRand() { return auxRand; }

    public Heap getAuxHeap() { return auxHeap; }

}