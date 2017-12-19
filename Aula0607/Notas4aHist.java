/*
 * jam, out-2017
 * Ler notas de 0 a 20, calcular media
 *  e imprimir notas > média
 */
import java.util.Scanner;

public class Notas4aHist {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);

        float media;

        int[] notas = {11,5,12,15,7,13,11,10}; // int notas[]
        //~ notas = new int[4];
        //~ gerarNotas(notas);
        notas = gerarNotas2(12);
        media = media(notas);
        for (int i=0; i<notas.length; i++) {
            if (notas[i] > media)System.out.printf("Nota %d > média %n",i+1);
        }
        System.out.printf("Media = %4.1f%n",media);

        System.out.printf("%s %n",aToString(notas));
        System.out.println(notaExtenso(2));

        // calculo do histograma
        int[][] histo;
        histo = hist(notas,notas.length);
        for (int i=0;i<histo.length;i++)System.out.printf("%3d %3d %n",histo[i][0],histo[i][1]);

    }
    static float media(int[] n) {
        int soma =0;
        for (int i=0; i < n.length; i++ ) {
            soma = soma + n[i];
        }
        //~ n[0]=99;
        return (float)soma/n.length;
    }
    // f array to string
    static String aToString(int[] a) {
        String s = "";
        for (int i=0; i<a.length; i++)s = s + a[i] + " ";
        return s;
    }
    // gerar array de n notas entre 0 e 20;
    static void gerarNotas(int[] a) {
        for (int i=0; i<a.length; i++)a[i]=(int)(Math.random()*21);

    }
    static int[] gerarNotas2(int n) {
        int[] a = new int[n];
        for (int i=0; i<a.length; i++)a[i]=(int)(Math.random()*21);
        return a;
    }
    // f devolve nota inteira por extenso
    static String notaExtenso(int v) {
        String[] s = {"zero","um","dois","tres"};
        return s[v];
    }
    // arrays 2d
    // f histograma
    static int find(int[][] a, int n, int v){
        int indice = -1;
        for (int i=0;i<n;i++){
            if(a[i][0] == v) indice = i;
        }
        return indice;
    }
    static int[][] hist(int[] a, int n){
        int nc=0;
        int[][] h = new int[a.length][2];
        for (int i=0;i<n; i++){
            int indice = find(h,nc,a[i]);
            if ( indice == -1) { // cria novo num
                h[nc][0]=a[i];
                h[nc][1]=1;
                nc++;
            } else {             // num existe, atualiza freq
                 h[indice][1]++;
            }
        }
        // devolve array completo, só com numeros válidos
        int[][] h2 = new int[nc][2];
        System.arraycopy(h,0,h2,0,nc);
        return h2;
    }
    // arrays 2d
}
