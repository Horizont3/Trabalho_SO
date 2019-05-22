//--------VETOR DE REQUISIÇÕES(FILA CIRCULAR)------------

public class Vet_req {

    No_req inicio;



    Vet_req(){

        this.inicio = null;

    }

    // INICIO INSERIR !!!!!!!!!

    void inserir(No_req novo){

        if(inicio == null){

            inicio = novo;
            inicio.proximo = novo;

        }
        else{

            No_req ultimo = inicio;

            while(ultimo.proximo != inicio){

                ultimo = ultimo.proximo;

            }

            ultimo.proximo = novo;
            novo.proximo = inicio;

        }

    }

    //---------------------------------

    //INICIO IMPRIMIR!!!!!!!!!!!

    void imprimir(){

        if(inicio == null){

            System.out.println("Lista Vazia !");

        }
        else{

            No_req ultimo = inicio;

            do{

                System.out.println(ultimo.toString());
                ultimo = ultimo.proximo;

            }while(ultimo != inicio);

        }

    }

    //---------------------------------

    //INICIA REMOÇÃO !!!!!!!!!!!!!!!!

    void remover(){

        if (inicio != null) {

            No_req anterior = inicio;
            No_req atual = inicio.proximo;

            while (atual != inicio) {

                anterior = atual;
                atual = atual.proximo;

            }

            if (atual == anterior) {

                inicio = null;

            }
            else if (atual == inicio) {

                inicio = inicio.proximo;
                anterior.proximo = inicio;

            }
            else {

                anterior.proximo = atual.proximo;

            }
        }

    }

    //----------------------------------------------

    //------------MANDA NO POR NO-------------------

    public No_req retornaNos(int qual){ //funçao de deve retornar o no requisitado pelo for que esta na heap

        No_req ultimo = inicio;

        do{

            qual--;

            if(qual==0){



            }
            ultimo = ultimo.proximo;

        }while(ultimo != inicio);

    }

}