package Tutorial2;

public class Student{
    private String SID;
    private String firstname;
    private String lastname;
    
    public Student(String SID,String firstname,String lastname){
        this.SID = SID ;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getSID(){
        return this.SID;
    }

    public String getfirtname(){
        return this.firstname;
    }

    public String getlastname(){
        return this.lastname;
    }
    public String toString(){
        return this.SID + " " + this.firstname + " " + this.lastname;
    }
}