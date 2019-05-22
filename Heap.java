public class Heap {

    private Vet_req Lista;
    private Rand auxRand;
    private No_req vetNo[];

    Heap(Vet_req lista, Rand suporte){

        this.Lista = lista;
        this.auxRand = suporte;
        vetNo = new No_req[auxRand.quantidadeRequisicao];

    }

    public void preecheVetNo(){

        for(int i=1;i<=vetNo.length;i++){

            vetNo[i] =

        }

    }

    public void imprime(){

        for(int i=0;i<=vetNo.length;i++){

            System.out.println("Numero "+i+": "+vetNo[i]);

        }

    }

}