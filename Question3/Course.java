// All classes below utilize encapsulation
// No instructions on building Constructors

class Instructor{
    private String firstName;
    private String lastName;
    private int officeNumber;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setOfficeNumber(int officeNumber){
        this.officeNumber = officeNumber;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getOfficeNumber(){
        return officeNumber;
    }
}

class Textbook{
    private String title;
    private String author;
    private String publisher;

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublisher(){
        return publisher;
    }
}

// Only uses simple arrays,
// since course information is assumed to be static
class Course{
    private Instructor[] instructor;
    private Textbook[] textbook;
    private String name;
    
    public void printInfo(){
        int instructors = instructor.length;
        int textbooks = textbook.length;

        System.out.println("Course Name: " + name + "\n");
        
        for(int i = 0; i < instructors; i++){
            System.out.print("Instructor Name: ");
            System.out.println(instructor[i].getFirstName() + " " + instructor[i].getLastName());
            System.out.println();
        }
        
        for(int i = 0; i < textbooks; i++){
            System.out.println("Textbook title: " + textbook[i].getTitle());
            System.out.println("Author: " + textbook[i].getAuthor());
            System.out.println();
        }
    }

    public static void main(String[] args){
        Course course = new Course();
        course.name = "AOT9999";
        course.instructor = new Instructor[2];
        course.textbook = new Textbook[2];

        course.instructor[0] = new Instructor();
        course.instructor[0].setFirstName("Eren");
        course.instructor[0].setLastName("Yeager");
        course.instructor[0].setOfficeNumber(5);

        course.instructor[1] = new Instructor();
        course.instructor[1].setFirstName("Mikasa");
        course.instructor[1].setLastName("Ackerman");
        course.instructor[1].setOfficeNumber(1);

        course.textbook[0] = new Textbook();
        course.textbook[0].setTitle("How To Basic");
        course.textbook[0].setAuthor("Mr. Limbs");
        course.textbook[0].setPublisher("Franku");

        course.textbook[1] = new Textbook();
        course.textbook[1].setTitle("Bible of the Walls");
        course.textbook[1].setAuthor("Historia Reiss");
        course.textbook[1].setPublisher("Church of the Walls");
    
        course.printInfo();
    }
}