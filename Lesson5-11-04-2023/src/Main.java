import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(readFile());
        System.out.println(readFile1());
    }

    public static String readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        String line;
        String result = " ";
        while ((line = br.readLine()) != null) {
            result += line + " ";
        }
        br.close();
        return result;
    }
    public static String readFile1() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        String line;
        String result = " ";
        while ((line = br.readLine()) != null) {
            if(line.length() >result.length())
                result = line;
        }
        br.close();
        return result;
    }
}


