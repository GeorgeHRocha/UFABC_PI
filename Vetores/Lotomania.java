public class Lotomania {
    public static void main(String[] args) {
        int numero, i = 0, k = 0;
        int vet[] = new int[50];
        while (i < 50) {
            do {
                k = 0;
                numero = (int)(Math.random() * 100);
                while (k < i && numero != vet[k]) {
                    k++;
                }
            } while (k < i);
            vet[i] = numero;
            i++;

        }
        ordena(vet);
        for (i = 0; i < 50; i++) {
            System.out.print(vet[i] + (i  < 49 ? " " : "\n"));
        }
    }
    public static void ordena (int vet[]) {
        int i = 0, j = 1, aux;
        while (i < 49) {
            while (j < 50) {
                if (vet[j] < vet[i]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
                j++;
            }
            i++;
            j = i + 1;
        }
    }
}