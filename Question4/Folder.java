import java.util.ArrayList;

public class Folder{
    private String folderName;
    private ArrayList<Folder> folders;
    private ArrayList<File> files;
    
    public Folder(String folderName){
        this.folderName = folderName;
        folders = new ArrayList<Folder>();
        files = new ArrayList<File>();
    }

    public void setFolderName(String folderName){
        this.folderName = folderName;
    }

    public void addFile(File file){
        files.add(file);
    }

    public void addFolder(Folder folder){
        folders.add(folder);
    }

    public void removeFile(int index){
        files.remove(index);
    }

    public void removeFolder(int index){
        folders.remove(index);
    }

    public String getFolderName(){
        return folderName;
    }

    public ArrayList<Folder> getFolders(){
        return folders;
    }

    public ArrayList<File> getFiles(){
        return files;
    }
}