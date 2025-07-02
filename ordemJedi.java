import java.util.Scanner;

public class ordemJedi {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        while (LER.hasNext()) {
            int soma = 0;
            int n = LER.nextInt();
            int k = LER.nextInt();

            int[] vet = new int[n];

            for (int i = 0; i < vet.length; i++) {
                vet[i] = LER.nextInt();
            }

            mergeRec(vet, 0, vet.length);

            for (int i = vet.length - 1; i >= k; --i) {
                soma += vet[i];

            }
            System.out.println(soma);
        }

    }

    

    public static void mergeRec(int[] vetor, int inicio, int fim) {
        int meio = 0;
        if (inicio < fim - 1) {
            meio = (inicio + fim) / 2;
            mergeRec(vetor, inicio, meio);
            mergeRec(vetor, meio, fim);
            doMerge(vetor, inicio, meio, fim);
        }
    }

    public static void doMerge(int[] vetor, int inicio, int meio, int fim) {
        int i = inicio;
        int j = meio;
        int k = 0;

        int[] vetAux = new int[fim - inicio];

        while (i < meio && j < fim) {
            if (vetor[i] <= vetor[j]) {
                vetAux[k++] = vetor[i++];
            } else {
                vetAux[k++] = vetor[j++];
            }
        }

        while (i < meio) {
            vetAux[k++] = vetor[i++];
        }

        while (j < fim) {
            vetAux[k++] = vetor[j++];
        }

        for (i = inicio, k = 0; i < fim; ++i, ++k) {
            vetor[i] = vetAux[k];
        }
    }
}
