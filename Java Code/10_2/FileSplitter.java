import java.io.*;
import java.util.ArrayList;

public class FileSplitter {

    public void splitListIntegers(String fileName) {
        try {
            if (fileName.isEmpty()) {
                throw new IllegalArgumentException("Ten file rong");
            }
            
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line = reader.readLine();
            if (line == null) {
                throw new IOException("File rong");
            }
            int count = Integer.parseInt(line);

            ArrayList<Integer> numbers = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    throw new IOException("Khong phai so nguyen");
                }
            }
            reader.close();

            if (numbers.size() != count) {
                throw new IOException("Sai so luong");
            }

            int partitionSize = count / 4;

            for (int i = 0; i < 4; i++) {
                String outputFileName = "part_" + (i + 1) + ".txt";
                try {
                    PrintWriter writer = new PrintWriter(new FileWriter(outputFileName));
                    for (int j = i * partitionSize; j < (i + 1) * partitionSize; j++) {
                        writer.println(numbers.get(j));
                    }
                    writer.close();
                } catch (IOException e) {
                    System.err.println("Khong ghi duoc file " + outputFileName + ": " + e.getMessage());
                }
            }

            System.out.println("Da xong!");
        } catch (FileNotFoundException e) {
            System.err.println("Khong tim thay file: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Loi: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        FileSplitter splitter = new FileSplitter();
        splitter.splitListIntegers("input.txt");
    }
}
