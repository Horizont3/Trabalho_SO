import java.util.Scanner;

public class Meiao {

    Vet_req Lista = new Vet_req();
    Rand aux = new Rand(Lista);
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

            System.out.println("------------------------");
            System.out.print("Digite: ");
            menu = input.nextInt();


            switch(menu){

                case 0:

                    System.out.println("Saiu!");

                break;

                case 1: //inicializador

                    aux.buscaDados();

                break;

                case 2: //IMPRIMIR

                    Lista.imprimir();

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