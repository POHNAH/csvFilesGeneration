import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class csvFilesGeneration {
    public static void main(String[] args) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("/home/avolkov/downloads/skuId.csv")))
        {

            for (int i = 0; i < 5000; i++) {
                bw.write(String.format("%6d",i).replaceAll(" ","0") + ";\n");
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
}
