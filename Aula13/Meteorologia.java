import java.util.*;
import java.io.*;

public class Meteorologia {

    static final Scanner sc = new Scanner(System.in);
    static final int maxFileSize = 31;

    public static void main(String[] args) throws IOException{
        int op;
        Data arrData[] = new Data[maxFileSize];
        String fileName = "";

        do {
            op = menu();
            switch (op) {
                case 1:
                    fileName = readDataFile(arrData);
                    break;
                case 2:
                    addRecord(arrData, fileName);
                    break;
                case 3:
                    printValues(arrData);
                    break;
                case 4:
                    printSortedTempValues(arrData);
                    break;
                case 5:
                    printSortedHumValues(arrData);
                    break;
                case 6:
                    getAvgValues(arrData);
                    break;
                case 7:
                    getMaxMinValues(arrData);
                    break;
                case 8:
                    getTempHistogram(arrData);
                    getHumHistogram(arrData);
                    break;
                case 9:
                    System.out.println("A terminar . . .");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while(op != 9);
    }

    public static int menu() {
        System.out.println("Estação meteorológica:");
        System.out.println("    1 - Ler ficheiro de dados");
        System.out.println("    2 - Acrescentar medida");
        System.out.println("    3 - Listar valores de temperatura e humidade");
        System.out.println("    4 - Listar medidas ordenadas por valor de temperatura");
        System.out.println("    5 - Listar medidas ordenadas por valor de humidade");
        System.out.println("    6 - Calcular valores médios de temperatura e humidade");
        System.out.println("    7 - Calcular valores máximos e mínimos de temperatura e humidade");
        System.out.println("    8 - Calcular histograma das temperaturas e humidade");
        System.out.println("    9 - Terminar programa");
        System.out.print("  Opção -> ");
        return sc.nextInt();
    }

    public static String readDataFile(Data[] arrData) throws IOException {
        String fileName;
        File file;
        int n = 0;

        do{
            System.out.print("Nome do ficheiro: ");
            fileName = sc.next();
            file = new File(fileName);
        } while(!file.isFile() || !file.canRead() || !file.exists());

        Scanner scf = new Scanner(file);

        while(scf.hasNextLine()){
            if(n == 31){
                break;
            } else if(!scf.hasNext()){
                break;
            } else {
                arrData[n] = new Data();
                arrData[n].temp = scf.nextInt();
                arrData[n].hum = scf.nextInt();
                n++;
            }
        }

        System.out.println("Valores lidos com sucesso!");
        scf.close();
        return fileName;
    }

    public static void addRecord(Data[] arrData, String fileName) throws IOException {
        int n = dataCount(arrData);
        int temp;

        if(n == 31) {
            System.out.println("A base de dados está cheia!");
        } else {
            arrData[n] = new Data();
            do{
                System.out.println("Insira a temperatura: ");
                temp = sc.nextInt();
            } while(temp < -10 || temp > 40);
            arrData[n].temp = temp;

            do{
                System.out.println("Insira a humidade: ");
                temp = sc.nextInt();
            } while(temp < 0 || temp > 100);
            arrData[n].hum = temp;

            PrintWriter pw = new PrintWriter((new File(fileName)));
            for(int i = 0; i <= n; i++){
                pw.println(arrData[i].temp + "  " + arrData[i].hum);
            }
            pw.close();
            System.out.println("Os novos valores foram introduzidos com sucesso!");
        }
    }

    public static void printValues(Data[] arrData) {
        int n = dataCount(arrData);
        System.out.print("Temperatura:\tHumidade:\n");
        for(int i = 0; i < n; i++) {
            System.out.printf("%12d\t%9d\n", arrData[i].temp, arrData[i].hum);
        }
    }

    public static void printSortedTempValues(Data[] arrData) {
        boolean swap;
        int n = dataCount(arrData);
        do{
            swap = false;
            for(int i = 0; i < n - 1; i++) {
                if(arrData[i].temp > arrData[i+1].temp) {
                    Data[] temp = new Data[1];
                    temp[0] = arrData[i];
                    arrData[i] = arrData[i+1];
                    arrData[i+1] = temp[0];
                    swap = true;
                }
            }
        } while(swap);

        printValues(arrData);
    }

    public static void printSortedHumValues(Data[] arrData) {
        boolean swap;
        int n = dataCount(arrData);
        do{
            swap = false;
            for(int i = 0; i < n - 1; i++) {
                if(arrData[i].hum < arrData[i+1].hum) {
                    Data[] temp = new Data[1];
                    temp[0] = arrData[i];
                    arrData[i] = arrData[i+1];
                    arrData[i+1] = temp[0];
                    swap = true;
                }
            }
        } while(swap);

        printValues(arrData);
    }

    public static void getAvgValues(Data[] arrData) {
        double tempAvg = 0;
        double humAvg = 0;
        int n = dataCount(arrData);
        int i;
        for(i = 0; i < n; i++){
            tempAvg += arrData[i].temp;
            humAvg += arrData[i].hum;
        }
        tempAvg /= i;
        humAvg /= i;

        System.out.printf("O valor médio das temperaturas é %4.2f e o valor médio da humidade é %4.2f \n", tempAvg, humAvg);
    }

    public static void getMaxMinValues(Data[] arrData) {
        int maxTemp = arrData[0].temp;
        int minTemp = arrData[0].temp;
        int maxHum = arrData[0].hum;
        int minHum = arrData[0].hum;
        int n = dataCount(arrData);
        for(int i = 0; i < n - 1; i++) {
            if (arrData[i].temp > maxTemp) {
                maxTemp = arrData[i].temp;
            }
            if (arrData[i].hum > maxHum) {
                maxHum = arrData[i].hum;
            }
        }

        for(int i = 0; i < n - 1; i++) {
            if (arrData[i].temp < minTemp) {
                minTemp = arrData[i].temp;
            }
            if (arrData[i].hum < minHum) {
                minHum = arrData[i].hum;
            }
        }
        System.out.printf("A temperatura máxima é %d e a temperatura minima é %d. \n",maxTemp, minTemp);
        System.out.printf("A humidade máxima é %d e a humidade minima é %d. \n",maxHum, minHum);
    }

    public static void getTempHistogram(Data[] arrData) {
        System.out.println("Histograma das Temperaturas");
        System.out.println("--------------------------------");

        for(int i = -10; i <= 40; i++) {
            System.out.printf("%3d | ", i);
            System.out.println(countValues(arrData, i, 0));
        }
    }

    public static void getHumHistogram(Data[] arrData) {
        System.out.println("Histograma das Humidades");
        System.out.println("--------------------------------");

        for(int i = 0; i <= 100; i++) {
            System.out.printf("%3d | ", i);
            System.out.println(countValues(arrData, i, 1));
        }
    }

    public static String countValues(Data[] arrData, int i, int type) {
        String count = "";
        int n = dataCount(arrData);

        switch(type){
            case 0: //temp
                for(int j = 0; j < n; j++) {
                    if(i == arrData[j].temp){
                        count += "*";
                    }
                }
                break;
            case 1: //hum
                for(int j = 0; j < n; j++) {
                    if(i == arrData[j].hum){
                        count += "*";
                    }
                }
                break;
        }
        return count;
    }

    public static int dataCount(Data[] arrData) {
        int n = 0;

        for(int i = 0; i < arrData.length; i++) {
            if(arrData[i] == null){
                break;
            } else {
                n++;
            }
        }
        return n;
    }
}

class Data {
    int temp;
    int hum;
}