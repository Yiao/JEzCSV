# JEzCSV
JEzCSV is a lib Java 8 for Parser file CSV or Create file CSV in a easy way, you can [Download](https://github.com/Yiao/JEzCSV/blob/master/JExCSV.jar) Java Lib JEzCSV.jar or [Read the source code](https://github.com/Yiao/JEzCSV/blob/master/src/sourceCSV/JEzCSV.java)

You need to update your jdk if you want to use lib direct, or you can use code source.

How to use it in your project :

    Download the JEzCSV.jar and add it to your library
    
    1. Exemple for Paser a file CSV : 
    
         JEzCSV jEzCSV = new JEzCSV();
         
         //Store informations CSV in a list 
         ArrayList<ArrayList<String>> l_l_informations = new ArrayList<ArrayList<String>>();
         
         l_l_informations = jEzCSV.Parser("C:\\JEzCSV\\test.csv",",");
         
         
         
         
    2. Exemple for create a file CSV (If I have put informations to a ArrayList<ArrayList<String>> listInfomation,
       I want to create a file csv named "MyFile" and with dimiliter ";"):
    
         JEzCSV jEzCSV = new JEzCSV();
         
         jEzCSV.Create("C:\\JEzCSV\\MyFile.csv",";",listInfomation);
         
         You can find your file CSV in C:\JEzCSV
         
         
    3. Exemple for changing the delimiter of a CSV file :
    
         JEzCSV jEzCSV = new JEzCSV();
         
         jEzCSV.ChangeDelimiter("C:\\JEzCSV\\MyFile.csv","C:\\JEzCSV\\New_MyFile.csv",",",";");
         
         Then you can find the new CSV file with ";" named "New_MyFile" in the "C:\\JezCSV"
         
    4. Exemple to use MergeCSV :
    
        a. I will put all the CSV files in a directory which named ("C:\\JEzCSV\\AllFileCSV")
           All my file CSV used "," like delimiter and each one has the header
           
        b. I will call my function like this in my code :
        
            JEzCSV jEzCSV = new JEzCSV();
         
            jEzCSV.MergeCSV("C:\\JEzCSV\\AllFileCSV",",",true);
            
            
            You could fin a file named "Result" in the directory "C:\\JEzCSV\\AllFileCSV"
            
            
            
Structure JEzCSV

    JEzCSV
    |
    ----- ArrayList<ArrayList<String>> Parser(String directoryFile,String demiliter)
    |
    ----- void Create (String directoryFile,String demiliter,ArrayList<ArrayList<String>> l_l_informations)
    |
    ----- void ChangeDilimiter(String oldDirFile, String newDirFile, String oldDelimiter, String newDelimiter)
    |
    ----- void MergeFile (String directory,String delimiter,boolean hasHeader)
    
   

    Parser : Parser file and return a ArrayList<ArrayList<String>> list
    
    Create  : Create a file csv and write informations type ArrayList<ArrayList<String>>
    
    directoryFile : is the directoy file complete (ex. "C:\\JEzCSV\\test.csv")
    
    directory : is the directory you put all yours CSV file that you want to merge together (ex. "C:\\JezCSV\\AllCSVFile")
    

    
