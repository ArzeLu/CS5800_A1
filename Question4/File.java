// Utilizes encapsulation
// No instructions on building a Constructor
public class File{
    private String fileName;
    
    public File(String fileName){
        this.fileName = fileName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getFileName(){
        return fileName;
    }
}