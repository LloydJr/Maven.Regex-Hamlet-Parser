import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    public String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }

    public String changeHamletToLeon(String loadFile){
        StringBuilder sb = new StringBuilder(loadFile);
        Pattern p = Pattern.compile("Hamlet", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(sb);
        System.out.println(m.replaceAll("Leon"));
        return m.replaceAll("Leon");
    }

    public String changeHoratioToTariq(String loadFile){
        StringBuilder sb = new StringBuilder(loadFile);
        Pattern p = Pattern.compile("Horatio", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(sb);
        System.out.println(m.replaceAll("Tariq"));
        return m.replaceAll("Tariq");
    }

    public Matcher findHamlet(){
        Pattern p = Pattern.compile("Hamlet", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(hamletData);
        return m;

    }

    public Matcher findHoratio(){
        Pattern p = Pattern.compile("Horatio", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(hamletData);
        return m;
    }
}
