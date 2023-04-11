import java.util.Scanner;
public class ChatBox {
    static Scanner scan=new Scanner(System.in);
    private String messageForAdmin;
    private String messageForVolunteer;
    public void chatboxForVolunteer(){

        System.out.println("Write the message you want to send to Admin : ");
        messageForAdmin= scan.nextLine();

    }
    public void chatboxForAdmin(){

        System.out.println("Write the message you want to send to Volunteer : ");
        messageForVolunteer= scan.nextLine();

    }
    // Constructors
    public ChatBox(){
    }

    public ChatBox(String messageForAdmin, String messageForVolunteer) {
        this.messageForAdmin = messageForAdmin;
        this.messageForVolunteer = messageForVolunteer;
    }
    // Getters and Setters
    public String getMessageForAdmin() {
        return messageForAdmin;
    }
    public void setMessageForAdmin(String messageForAdmin) {
        this.messageForAdmin = messageForAdmin;
    }
    public String getMessageForVolunteer() {
        return messageForVolunteer;
    }
    public void setMessageForVolunteer(String messageForVolunteer) {
        this.messageForVolunteer = messageForVolunteer;
    }

}
