import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String dir = getDir();

        System.out.println(dir);
        String fiile = dir + "datastoragesheet.csv";
        System.out.println(fiile);
        try {
            FileWriter fw = new FileWriter(fiile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append("Hello" + ",");
            bw.append("There");
            bw.newLine();
            bw.append("HOLY,FUCKING,SHIT,BALLS");
            bw.flush();
            bw.newLine();
            bw.flush();
            File f = new File(fiile);
            Scanner reader = new Scanner(f);
            while(reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static String getDir(){
        String dir = System.getProperty("user.dir");
        while(!dir.substring(dir.length() - 1, dir.length()).equals("\\")){
            dir = dir.substring(0, dir.length() - 1);
        }
        return dir;
    }
}