public class colaOficial {
    public static void main(String[] args) {
        
    }



    public static void quickSort(int[] vetor){
        doQuick(vetor,0,vetor.length-1);
    }

    public static void doQuick(int[] vet, int ini, int fim){

        int meio = 0;
        int pivo = 0;
        int i = ini;
        int j = fim;

        if (ini < fim) {
            meio = (ini + fim)/2;
            pivo = vet[meio];

        }

    }
}
