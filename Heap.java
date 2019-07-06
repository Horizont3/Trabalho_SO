import java.net.SocketAddress;

public class Heap {

    private Vet_req Lista;
    private No_req vetHeap[];
    private Lacunas vetLacunas[];
    private Rand auxRand;
    private int tamAtual, limiar;
    private int flag;
    private int contadorDesaloca;


    Heap(Vet_req lista, Rand auxrand){

        this.Lista = lista;
        this.auxRand = auxrand;
        this.limiar = 0;
        this.tamAtual = 0;
        this.flag = 0;
        this.contadorDesaloca = 0;

    }

    public void startVet(){

        vetHeap = new No_req[auxRand.getTamanhoHeap()];
        vetLacunas = new Lacunas[(vetHeap.length/2)];
        this.limiar = auxRand.getLimiar();

    }

    public void alocadorHeap(){
        No_req auxNo;
        int i=0;
        int j=0;
        int k=0;

        /*if(calcTam(auxRand.getCont_Id(),auxRand.getTamanhoHeap()) > 50){

            System.out.println("NAO TEM ESPAÇO!"); //TEM QUE SOCAR UM DESALOCADOR E UM BAGULHO QUE SALVE ESSES ESPAÇOS DESALOCADOS
                                                   //DESALOCAR QUEM? MAIS ANTIGO? POR TAMANHO?
        }
        else{

            if(tamAtual < limiar){

                for(;i<auxRand.getCont_Id();i++){

                    auxNo = Lista.retornaNos(i);

                    if(tamAtual < vetHeap.length){

                        vetHeap[tamAtual] = auxNo;
                        tamAtual++;

                    }

                    if(auxRand.getCont_Id() > vetHeap.length){



                    }

                }

            }

            System.out.println("Vetor Heap Preenchido!");
        }*/

        for(;i<auxRand.getCont_Id();i++){

            auxNo = Lista.retornaNos(i);
            j = auxNo.tam;

            if(calcTam(tamAtual,vetHeap.length) <= limiar){

                do{

                    vetHeap[tamAtual] = auxNo;
                    tamAtual++;
                    j--;

                }while(j != 0);

            }

            else{

                desalocadorHeap();

            }

        }



    }

    public void desalocadorHeap(){

        int i = 0;
        int cont2=0;
        contadorDesaloca++;

          /* do{

               for(;flag<vetHeap.length;flag++){
                   cont++;
                   if(aux == vetHeap[i].identificador){

                       aux=0;
                       break;

                   }

               }

               for(;i<cont;i++){

                   if(cont2 == i){

                       vetLacunas[cont3] = i;
                       cont2+=7;

                   }

                   if(vetHeap[i] != null){

                       vetHeap[i] = null;

                   }

               }


           }while(aux != 0);*/



              do{

                  cont2 = vetHeap[i].tam;

                  do{
                      vetHeap[0] = null;
                      tamAtual--;
                      cont2--;
                      i++;
                      atualizaHeap();

                  }while(cont2 != 0);

              }while(calcTam(tamAtual,vetHeap.length) >= 30);



    }

    public void desalocador_MESMO(){
        int i=0;
        contadorDesaloca++;

        for(;i<tamAtual;i++){

            vetHeap[i] = null;

        }

    }

    public void atualizaHeap(){

        int i=0;
        No_req aux;

        for(;i<=tamAtual+1;i++){

            vetHeap[i] = vetHeap[i+1];

        }

    }

    public int calcTam(int tam_atual, int tamHeap){

        return ((tam_atual*100)/tamHeap);

    }

    public void imprime(){

        int aux=0;

        for(int i = 0; i< vetHeap.length; i++){

            if(vetHeap[i] != null){

                aux = vetHeap[i].identificador;
                System.out.println("{" + "identificador =" + vetHeap[i].identificador + ", tamanho =" + vetHeap[i].tam + '}');

            }
            else{

                System.out.println("{" + "identificador = null, tamanho = null" + '}');

            }

        }

    }

    public int getContadorDesaloca(){ return contadorDesaloca; }

}

