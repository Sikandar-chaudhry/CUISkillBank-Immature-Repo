import java.util.Scanner;



public class Volunteer {

    Scanner scan=new Scanner(System.in);
    private String volunteerName;
    private String volunteerEmail;
    private String volunteerPassword;
    private String volunteerPhoneNumber;

    public Volunteer() {
    }

    public Volunteer(String volunteerName, String volunteerEmail, String volunteerPassword, String volunteerPhoneNumber) {
        this.volunteerName = volunteerName;
        this.volunteerEmail = volunteerEmail;
        this.volunteerPassword = volunteerPassword;
        this.volunteerPhoneNumber = volunteerPhoneNumber;
    }

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public String getVolunteerEmail() {
        return volunteerEmail;
    }

    public void setVolunteerEmail(String volunteerEmail) {
        this.volunteerEmail = volunteerEmail;
    }

    public String getVolunteerPassword() {
        return volunteerPassword;
    }

    public void setVolunteerPassword(String volunteerPassword) {
        this.volunteerPassword = volunteerPassword;
    }

    public String getVolunteerPhoneNumber() {
        return volunteerPhoneNumber;
    }

    public void setVolunteerPhoneNumber(String volunteerPhoneNumber) {
        this.volunteerPhoneNumber = volunteerPhoneNumber;
    }


    public String toString() {
        return "----------------------------------------------------------------------------------------------------"+
               "\n| Name= " + volunteerName +"                                                                                     |"+
               "\n| Email= " + volunteerEmail +"                                                                                   |"+
               "\n| Password= " + volunteerPassword +"                                                                             |"+
               "\n| PhoneNumber= " + volunteerPhoneNumber+"                                                                        |"+
               "\n-----------------------------------------------------------------------------------------------------";
    }
}
