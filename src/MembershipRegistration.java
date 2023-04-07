import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class MembershipRegistration extends Volunteer {

    Scanner scan=new Scanner(System.in);
    String nameVolunteer;
    String emailVolunteer;
    String passwordVolunteer;
    String phoneNumberVolunteer;
    Volunteer volunteers = new Volunteer();
    static int counter = 0;

    public MembershipRegistration(String volunteerName, String volunteerEmail, String volunteerPassword, String volunteerPhoneNumber, String nameVolunteer, String emailVolunteer, String passwordVolunteer, String phoneNumberVolunteer) {
        super(volunteerName, volunteerEmail, volunteerPassword, volunteerPhoneNumber);
        this.nameVolunteer = nameVolunteer;
        this.emailVolunteer = emailVolunteer;
        this.passwordVolunteer = passwordVolunteer;
        this.phoneNumberVolunteer = phoneNumberVolunteer;
    }

        public void registerStudents(@NotNull Scanner scanner){
            scanner.nextLine();
            System.out.println("Enter Name : ");
            volunteers.setVolunteerName(scanner.nextLine());

            System.out.println("Enter Email : ");
            volunteers.setVolunteerEmail(scanner.nextLine());

            System.out.println("Enter Password : ");
            volunteers.setVolunteerPassword(scanner.nextLine());

            System.out.println("Enter Mobile Phone : ");
            volunteers.setVolunteerPhoneNumber(scanner.nextLine());

            volunteers = new Volunteer(nameVolunteer, emailVolunteer, passwordVolunteer, phoneNumberVolunteer);
     }

    public MembershipRegistration() {
    }
}



