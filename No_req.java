//----------FAZ O NÓ PARA AS FILAS ----------

public class No_req {

    public int identificador;
    public int tam;
    public No_req proximo;


    No_req(){

        this.identificador = 0;
        this.tam = 0;

    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getTam() {
        return tam;
    }

    @Override
    public String toString() {
        return "{" + "identificador =" + identificador + ", tamanho =" + tam + '}';
    }

}