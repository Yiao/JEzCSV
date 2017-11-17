package sourceCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JEzCSV {

    /**
     * @param dirFile is the directoy file complete (ex. "C:\\JEzCSV\\test.csv")
     * @param delimiter is the delimiter which you want to use in your
     * @return  It will return a list of type (ArrayList<ArrayList<String>>)
     */
    public ArrayList<ArrayList<String>> Parser(String dirFile, String delimiter) {
        Scanner lineScanner = null;
        Scanner columnScanner = null;
        //ArrayList content information of file CSV
        ArrayList<ArrayList<String>> l_infoCSV = new ArrayList<ArrayList<String>>();
        try {
            //The lineScanner will read your file CSV
            lineScanner = new Scanner(new File(dirFile));
            //The loop will read very line of the file CSV
            while (lineScanner.hasNextLine()) {

                ArrayList<String> l_tmpLineInfo = new ArrayList<String>();
                columnScanner = new Scanner(lineScanner.nextLine());
                columnScanner.useDelimiter(delimiter);
                //The scanner will read with delimiter and load in a ArrayList
                while (columnScanner.hasNext()){
                    String tmpInfoColumn = columnScanner.next();
                    l_tmpLineInfo.add(tmpInfoColumn);
                }
                columnScanner.close();
                l_infoCSV.add(l_tmpLineInfo);
            }
            lineScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("File : "+ dirFile +  " Parser");
        return l_infoCSV;
    }


    /**
     * @param dirFile  is the directoy file complete (ex. "C:\\JEzCSV\\test.csv")
     * @param delimiter is the delimiter which you want to use in your
     * @param l_l_Informations is the information which you want to write into a file csv
     */
    public void Create(String dirFile,String delimiter,ArrayList<ArrayList<String>> l_l_Informations) {
        BufferedWriter bufWriter = null;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(dirFile, true);
            bufWriter = new BufferedWriter(fileWriter);

            for (ArrayList<String> l_information :l_l_Informations) {

                for (String informationColone:l_information) {
                    bufWriter.write(informationColone+delimiter);
                }
                bufWriter.newLine();
            }
            bufWriter.close();
            fileWriter.close();
            System.out.println("File : "+ dirFile +  "created");
        } catch (IOException e) {
            System.out.println("Write error : " + e.getMessage());
        }
    }
}
