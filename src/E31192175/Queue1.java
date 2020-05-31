package E31192175;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Queue1 {

    private static int ukuran;
    private static java.util.Queue<Integer> queue;

    public static void main(String[] args) {
        System.out.println("Berapa ukuran queue di inginkan");
        ukuran = inputData();
        buatQueue();
        bacaData();
        tulisData();
    }

    private static void buatQueue() {
        queue = new LinkedList<Integer>();
    }

    private static int inputData() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String angkaInput = null;
        try {
            angkaInput = bfr.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        int Data = Integer.valueOf(angkaInput).intValue();
        return Data;
    }

    private static void tulisData() {
        Integer data;
        System.out.println("\nUkuruan keluar elemen dari QUEUE : ");
        for (int i = 0; i < ukuran; i++) {
            data = queue.remove();
            System.out.println("Data ke-" + (i + 1) + ":" + data);
        }
        data = queue.size();
        System.out.println("Ukuran Queue Sekarang adalah" + data);
    }

    private static void bacaData() {
        Integer data;
        for (int i = 0; i < ukuran; i++) {
            System.out.println("Data ke-" + (i + 1) + " : ");
            data = inputData();
            queue.add(data);
        }
        data = queue.size();
        System.out.println("Ukuran QUEUE sekarang adalah" + data);
    }
}
