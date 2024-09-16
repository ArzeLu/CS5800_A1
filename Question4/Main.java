import java.util.ArrayList;

// ArrayList provides the ability to remove an element,
// for a simple file deletion simulation
public class Main{

    // Using recursion and iteration to print the folder structure
    // recursion for folder level
    // iteration for same-level folders and files
    public static void printFolderStructure(Folder root, int level){
        ArrayList<Folder> folders = root.getFolders();
        ArrayList<File> files = root.getFiles();
        
        String spacing = "";
        for(int i = 0; i < level; i++)
            spacing += "  |  ";

        System.out.println(spacing + root.getFolderName());

        if(folders == null && files == null)
            return;

        if(folders != null)
            for(Folder folder: folders)
                printFolderStructure(folder, level + 1);
        
        if(files != null)
            for(File file: files)
                System.out.println(spacing + file.getFileName());
    }

    public static void main(String[] args){
        // Adding all necessary folder and files to build up the structure
        Folder app = new Folder("app");
        app.addFolder(new Folder("config"));
        app.addFolder(new Folder("controllers"));
        app.addFolder(new Folder("library"));
        app.addFolder(new Folder("migrations"));
        app.addFolder(new Folder("models"));
        app.addFolder(new Folder("views"));

        Folder sourceFiles = new Folder("SourceFiles");
        sourceFiles.addFolder(app);
        sourceFiles.addFolder(new Folder(".phalcon"));
        sourceFiles.addFolder(new Folder("cache"));
        sourceFiles.addFolder(new Folder("public"));
        sourceFiles.addFile(new File(".htaccess"));
        sourceFiles.addFile(new File(".htrouter.php"));
        sourceFiles.addFile(new File("index.html"));

        Folder php = new Folder("php_demo1");
        php.addFolder(sourceFiles);
        php.addFolder(new Folder("Include Path"));
        php.addFolder(new Folder("Remote Files"));

        printFolderStructure(php, 0);
        System.out.println("\n");
        
        // Removing the "app" folder
        sourceFiles.removeFolder(0);

        printFolderStructure(php, 0);
        System.out.println("\n");

        // Removing the "public" folder
        sourceFiles.removeFolder(2);

        printFolderStructure(php, 0);
        System.out.println("\n");
    }
}
        