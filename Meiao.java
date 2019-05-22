import java.util.Scanner;

public class Meiao {

    public Vet_req Lista = new Vet_req();
    public Rand auxRand = new Rand(Lista);
    public Heap auxHeap = new Heap(Lista,auxRand);
    private final Scanner input = new Scanner(System.in);
    int menu = 123;

    Meiao(){


    }

    public void menu(){

        do{

            System.out.println("------------------------");

            System.out.println("[0]Sair");
            System.out.println("[1]Inicializar");
            System.out.println("[2]Imprimir");
            System.out.println("[3]Heap recebe lista");

            System.out.println("------------------------");
            System.out.print("Digite: ");
            menu = input.nextInt();


            switch(menu){

                case 0:

                    System.out.println("Saiu!");

                break;

                case 1: //inicializador

                    auxRand.buscaDados();

                break;

                case 2: //IMPRIMIR

                    Lista.imprimir();

                break;

                case 3:

                    System.out.println("Vai rodar a heap");

                break;

                default:

                    System.out.println("\nNao ha esta opcao!\n");

            }

        }while(menu!=0);


    }

    public Vet_req getLista() {
        return Lista;
    }

}