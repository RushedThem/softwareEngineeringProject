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
            bw.append("HOLY,FUCKING,SHIT,IT,WORKS");
            bw.newLine();
            bw.flush();
            File f = new File(fiile);
            Scanner reader = new Scanner(f);
            while(reader.hasNextLine()){
                String[] currLine = reader.nextLine().split(",");
                for(int i = 0; i < currLine.length; i++){
                    System.out.print(currLine[i] + " ");
                }
                System.out.println();
            }
        }catch(Exception e){

            System.out.println(e.getMessage());
        }

    }
    public static String getDir(){
        String dir = System.getProperty("user.dir");
        //commented code removes last portion of the running file's directory, allowing you to put the csv one level upward
        /*while(!dir.substring(dir.length() - 1, dir.length()).equals("\\")){
            dir = dir.substring(0, dir.length() - 1);
        }
        */
        return dir + "\\";
    }
}