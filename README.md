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
         
Structure JEzCSV

    JEzCSV
    |
    ----- ArrayList<ArrayList<String>> Parser(String directoryFile,String demiliter)
    |
    ----- void Create (String directoryFile,String demiliter,ArrayList<ArrayList<String>> l_l_informations)
    
   

    Parser : Parser file and return a ArrayList<ArrayList<String>> list
    
    Create  : Create a file csv and write informations type ArrayList<ArrayList<String>>
    
    directoryFile : is the directoy file complete (ex. "C:\\JEzCSV\\test.csv")
    

    
