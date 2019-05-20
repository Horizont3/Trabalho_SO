package so;

import java.util.Random;

/*-------CRIADOR DE VALORES PARA A LITA-------*/

public class Rand {

    private final Random gerador = new Random();
    private final int quantidade;    
    private final int min_Value;
    private final int max_Value;
    private final Vet_req Lista;
    public int Cont_Ident;
        
    
    
    Rand(Vet_req lista,int tam, int min, int max, int id){
        
        this.quantidade = tam;
        this.min_Value = min;
        this.max_Value = max;
        this.Lista = lista;
        this.Cont_Ident = id;
        
    }
            
    public void Random(){
                 
        for(int i=0;i<quantidade;i++){
            
            Lista.inserir(cria_No());
                        
        }                 
        
    }
    
    private No_req cria_No(){
        
        No_req novo = new No_req();
        int x;
        
        x = sem_repeticao();     
            
            novo.setIdentificador(x);
            novo.setTam(gerador.nextInt((max_Value-min_Value)+1)+min_Value);  
        
        
        return novo;        
    } 
    
    public int sem_repeticao(){
        
        int i = Cont_Ident;
        Cont_Ident++;
        return i;
        
    }

    public int getCont_Ident() {
        return Cont_Ident;
    }  
   
}