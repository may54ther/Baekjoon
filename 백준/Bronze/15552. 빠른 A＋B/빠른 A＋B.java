import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        int T = Integer.parseInt(br.readLine());
        String[] AB;
        int A, B;

        for (int i = 0; i < T; i++) {
            AB = br.readLine().split(" ");
            A = Integer.parseInt(AB[0]);
            B = Integer.parseInt(AB[1]);

            bw.write(String.valueOf(A + B));
            bw.newLine();
        }
        bw.flush();
    }
}