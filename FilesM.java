/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FCDSlib;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static FCDSlib.ArrayM.* ;

/**
 *
 * @author AAMY
 */
public class FilesM {
    public static void CreateFile(String FilePath)
    {
        try {
            File file = new File(FilePath) ;
            
            file.createNewFile() ;
        } catch (IOException ex) {
            Logger.getLogger(FilesM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void CreateFolder(String FolderPath)
    {
        File Folder = new File(FolderPath) ;
        
        Folder.mkdir();
    }
    
    public static void WriteInFile(String FilePath , String FileLine)
    {
        
        try {
            File file = new File(FilePath) ;
            
            if(file.exists())
            {
               FileWriter File = new FileWriter(file) ;
            
               File.write(FileLine + "\n") ;
            
               File.close() ; 
            }
            
        } catch (IOException ex) {
            Logger.getLogger(FilesM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void WriteInFile(String FilePath , Vector<String>StringVector)
    {
        try {
            
            File file = new File(FilePath) ;
            
            if(file.exists())
            {
              FileWriter File = new FileWriter(file) ;
            
            for(String Token : StringVector)
            {
                File.write(Token + "\n") ;
            }
            
            File.close() ;  
            }
            
        } catch (IOException ex) {
            Logger.getLogger(FilesM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void WriteInFile(String FilePath , ArrayList<String>StringArrayList) 
    {
        try {
            
            File file = new File(FilePath);
            
            if(file.exists())
            {
                FileWriter File = new FileWriter(file) ;
            
                for(String Token : StringArrayList)
                {
                    File.write(Token + "\n");
                }   
            
                File.close() ;  
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(FilesM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static void WriteInFile(String FilePath , String[] StringArray)
    {
        try {
            
            File file = new File(FilePath) ;
            
            if(file.exists())
            {
               FileWriter File = new FileWriter(FilePath) ;
            
            for(String Token : StringArray)
            {
                File.write(Token + "\n");
            }
            
                File.close() ; 
            }
            
        } catch (IOException ex) {
            Logger.getLogger(FilesM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void AppendInFile(String FilePath , String FileLine)
    {
        try {
            
            File file = new File(FilePath) ;
            
            if(file.exists())
            {
               BufferedWriter File = new BufferedWriter(new FileWriter(file , true)) ;
                File.write(FileLine + "\n");
                File.close(); 
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(FilesM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void AppendInFile(String FilePath , Vector<String>StringVector)
    {
        try {
           
            File file = new File(FilePath) ;
            
            if(file.exists())
            {
                BufferedWriter File = new BufferedWriter(new FileWriter(file , true)) ;
           
                for(String Token : StringVector)
                {
                    File.write(Token + "\n");
                }
            
                File.close();
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(FilesM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void AppendInFile(String FilePath , ArrayList<String>StringArrayList)
    {
        try {
            
            
            File file = new File(FilePath) ;
            
            if(file.exists())
            {
                BufferedWriter File = new BufferedWriter(new FileWriter(file , true)) ;
            
            for(String Token : StringArrayList)
            {
                File.write(Token + "\n");
            }
            
                File.close();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(FilesM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void AppendInFile(String FilePath , String []StringArray)
    {
        try {
            
            File file = new File(FilePath) ;
            
            if(file.exists())
            {
               BufferedWriter File = new BufferedWriter(new FileWriter(file , true)) ;
            
                for(String Token : StringArray)
                {
                    File.write(Token + "\n");
                }
            
                File.close(); 
            }
            
        } catch (IOException ex) {
            Logger.getLogger(FilesM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Vector<String>ReadFileToVector(String FilePath)
    {
        Vector<String> StringVector = new Vector<String>() ;
        
        try {
            
            File file = new File(FilePath) ;
            
            if(file.exists())
            {
            FileReader File = new FileReader(file) ;
            int FileData ;
            String Line = "" ;
            
            while((FileData = File.read()) != -1)
            {
                char Character = (char)(FileData) ;
                if(Character != '\n')
                {
                    Line += Character ;
                }
                
                else 
                {
                    StringVector.add(Line) ;
                    Line = "" ;
                }
            }
            
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilesM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FilesM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return StringVector ;
    }
    
    public static ArrayList<String> ReadFileToArrayList(String FilePath)
    {
        ArrayList<String> StringArrayList = new ArrayList<String>() ;
        
        try {
            
            File file = new File(FilePath) ; 
            
            if(file.exists())
            {
                FileReader File = new FileReader(file) ;
            
            int FileData ;
            
            String Line = "" ;
            
            while((FileData = File.read()) != -1)
            {
                char Character = (char)FileData ;
                
                if(Character != '\n')
                {
                    Line += Character ;
                }
                
                else
                {
                    StringArrayList.add(Line) ;
                    Line = "" ;
                }
            }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilesM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FilesM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return StringArrayList ;
    }
    
    public static String[] ReadFileToArray(String FilePath)
    {
        String[] StringArray = new String[0] ;
        
        try {
            
            File file = new File(FilePath) ;
            
            if(file.exists())
            {
               FileReader File = new FileReader(file) ;
            
            int FileData ;
            
            String Line = "" ;
            
            while((FileData = File.read()) != -1)
            {
                char Character = (char)(FileData) ;
                
                if(Character != '\n')
                {
                    Line += Character ;
                }
                
                else
                {
                    StringArray = AddArrayElement(Line, StringArray);
                    Line = "";
                }
            } 
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilesM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FilesM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return StringArray ;
    }
    
    public static void DeleteFile(String FilePath)
    {
        File file = new File(FilePath) ;
        
        if(file.exists())
        {
            file.delete();
        }
    }
    
    public static void DeleteFolder(String FolderPath)
    {
        File Folder = new File(FolderPath);
        
        if(Folder.exists())
        {
            Folder.delete() ;
        }
    }
    
    
    public static boolean IsFile(String FilePath)
    {
        return new File(FilePath).isFile() ;
    }
    
    public static boolean IsHiddenFile(String FilePath)
    {
        return new File(FilePath).isHidden();
    }
    
    public static boolean IsFolder(String FolderPath)
    {
        return new File(FolderPath).isDirectory();
    }
    
    public static boolean IsDirectory(String DirectoryPath)
    {
        return new File(DirectoryPath).isDirectory();
    }
    
    public static boolean IsFileExists(String FilePath)
    {
        return new File(FilePath).exists();
    }
    
    public static boolean IsFolderExists(String FolderPath)
    {
        return new File(FolderPath).exists() ;
    }
    
    public static String[] ReturnsFoldersContentToArray(String FolderPath)
    {
        String[] FoldersContent = new String[0] ; 
        
        File Folder = new File(FolderPath) ;
        
        if(Folder.exists())
        {
            FoldersContent = Folder.list();
            
            return FoldersContent ;
        }
        
        return FoldersContent ;
    }
    
    public static void RenameFile(String OldFilePath , String NewFilePath)
    {
        File SourceFile = new File(OldFilePath) ;
        
        if(SourceFile.exists())
        {
            File DestinationFile = new File(NewFilePath) ;
        
            SourceFile.renameTo(DestinationFile) ; 
        }
       
    }
    
    
    public static String GetFileName(File file)
    {
        return file.getName();
    }
    public static String GetFileAbsolutePath(File file)
    {
        return file.getAbsolutePath();
    }
    public static String GetFilePath(File file)
    {
        return file.getPath();
    }
}
