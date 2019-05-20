package so;

import java.util.Scanner;

public class Meiao {
    
   Vet_req Lista = new Vet_req(); 
   Rand aux;
   private final Scanner input = new Scanner(System.in);
   int quantidadeRequisicao;
   int valorMinimo;
   int valorMaximo;
   int tamanhoHeap;
   int menu = 123;
   
   //gambiarra
   
   int cont_Id=1; 
   
   //gambiarra 
        
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
                    
                    if(cont_Id == 1){
                     
                        System.out.println("Digite a quantidade de requisições: ");
                        quantidadeRequisicao = input.nextInt();
                        System.out.println("Digite o tamanho da heap: ");
                        tamanhoHeap = input.nextInt();
                        System.out.println("Digite o valor mínimo: ");
                        valorMinimo = input.nextInt();
                        System.out.println("Digite o valor máxmio: ");
                        valorMaximo = input.nextInt();
                    
                        aux = new Rand(Lista,quantidadeRequisicao,valorMinimo,valorMaximo,cont_Id);
                        aux.Random();
                        cont_Id = aux.getCont_Ident();
                        
                    }
                    else{
                        
                        System.out.println("Digite a quantidade de requisições: ");
                        quantidadeRequisicao = input.nextInt();
                    
                        aux = new Rand(Lista,quantidadeRequisicao,valorMinimo,valorMaximo,cont_Id);
                        aux.Random();
                        cont_Id = aux.getCont_Ident();
                        
                    }                  
                    
                break;
                
                case 2: //IMPRIMIR
                    
                    Lista.imprimir();
                    
                break;
                
            }
        
        }while(menu!=0);
            
        
    }
        
 
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    

    public Vet_req getLista() {
        return Lista;
    }
  
}
