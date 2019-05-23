public class Heap {

    private Vet_req Lista;
    private No_req vetNo[];
    private Rand auxRand;


    Heap(Vet_req lista, Rand auxrand){

        this.Lista = lista;
        this.auxRand = auxrand;

    }

    public void startvetNo(){

        vetNo = new No_req[auxRand.getTamanhoHeap()];

    }

    public void preecheVetNo(){
        No_req auxNo;

        if(calcPercent(auxRand.getCont_Id(),auxRand.getTamanhoHeap()) > 50){

            System.out.println("NAO TEM ESPAÇO!"); //TEM QUE SOCAR UM DESALOCADOR E UM BAGULHO QUE SALVE ESSES ESPAÇOS DESALOCADOS
                                                   //DESALOCAR QUEM? MAIS ANTIGO? POR TAMANHO?
        }
        else{

            int i;
            for(i=0;i<auxRand.getCont_Id();i++){

                auxNo = Lista.retornaNos(i);
                vetNo[i] = auxNo;

            }
            for(;i<vetNo.length;i++){

                vetNo[i] = null;

            }
            System.out.println("Vetor Heap Preenchido!");
        }

    }

    public int calcPercent(int requis, int tamHeap){

        return ((requis*100)/tamHeap);

    }

    public void imprime(){

        for(int i=0;i<vetNo.length;i++){

            if(vetNo[i] != null){

                System.out.println("{" + "identificador =" + vetNo[i].identificador + ", tamanho =" + vetNo[i].tam + '}');

            }
            else{

                System.out.println("{" + "identificador = null"+", tamanho = null" + '}');

            }

        }

    }

}