package StreamFilesExercise;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws IOException {

        String path="D:\\Работен плот\\Java документи и снимки\\Java Advanced\\StreamAndFilesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));

//        List<String> lines= Files.readAllLines(Path.of(path));
//
//       for (String line:lines){
//           bw.write(line.toUpperCase());
//           bw.newLine();
//       }
//       bw.close();

        BufferedReader br=new BufferedReader(new FileReader(path));

        String line = br.readLine();

        while (line!=null){
            bw.write(line.toUpperCase());
            bw.newLine();

            line=br.readLine();
        }
        bw.close();
    }
}
