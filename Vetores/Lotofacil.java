public class Lotofacil {
    public static void main(String [] args) {
        int i = 0, numero, k = 0;
        int vet[] = new int[15];
        while (i < 15) {
            do {
                k = 0;
                numero = (int)(Math.random() * 26);
                while (k < i && numero != vet[k]) {
                    k++;
                }
            } while (k < i);
            vet[i] = numero;
            i++;
        }
        i = 0;
        ordena(vet);
        while (i < 15) {
            System.out.print(vet[i] + (i < 14 ? " " : " \n"));
            i++;
        }
    }
    public static void ordena (int vet[]) {
        int i = 0, j = 1, aux;
        while (i < 14) {
            while (j < 15) {
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