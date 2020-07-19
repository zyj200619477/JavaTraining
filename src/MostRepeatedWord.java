import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;   
public class MostRepeatedWord {    
	 public static int mostRepeated = 0;
	    public static String word = "";
	    public static void main(String[] args) throws IOException {

	        //Open file
	        String userDirectory = Paths.get("").toAbsolutePath().toString();
	        System.out.println(userDirectory);
	        FileReader file = new FileReader(userDirectory + "/src/" +"data.txt");
	        BufferedReader br = new BufferedReader(file);

	        //read each line
	        String line = br.readLine();
	        List<String> words = new ArrayList<String>();
	        while (line != null) {
	            String strs[] = line.toLowerCase().split("([,.\\s]+)");
	            for(String str: strs) {
	                words.add(str);
	            }
	            line = br.readLine();
	        }

	        find(words);

	        System.out.println("The most repeated word is: " + word);
	        br.close();
	    }

	    public static void find(List<String> words) {
	        for (int i = 0; i < words.size(); i++) {
	            int count = 1;
	            for (int j = i + 1; j < words.size(); j++) {
	                if (words.get(i).equals(words.get(j))) {
	                    count++;
	                }
	            }

	            if (count > mostRepeated) {
	                mostRepeated = count;
	                word = words.get(i);
	            }
	        }
	    }
}  