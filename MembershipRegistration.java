
import java.util.Arrays;
import java.util.Scanner;

public class MembershipRegistration extends Volunteer {
    static int i=1;
    Scanner scan=new Scanner(System.in);
    Volunteer[] volunteers;
    Volunteer volunteer=new Volunteer();


    static int counter = 0;

    public MembershipRegistration(String volunteerName, String volunteerEmail, String volunteerPassword, String volunteerPhoneNumber) {
        super(volunteerName, volunteerEmail, volunteerPassword, volunteerPhoneNumber);
    }

        public void registerStudents(Scanner scanner, int ArraySize) {
                volunteers=new Volunteer[ArraySize];
                scanner.nextLine();
                for(int j=0; j<1; j++){
                    System.out.println("Enter Name : "+i);
                    volunteer.setVolunteerName(scanner.nextLine());

                    System.out.println("Enter Email : ");
                    volunteer.setVolunteerEmail(scanner.nextLine());

                    System.out.println("Enter Password : ");
                    volunteer.setVolunteerPassword(scanner.nextLine());

                    System.out.println("Enter Mobile Phone : ");
                    volunteer.setVolunteerPhoneNumber(scanner.nextLine());

                    volunteers[i-1] =
                            new Volunteer(volunteer.getVolunteerName(), volunteer.getVolunteerEmail(), volunteer.getVolunteerPassword(), volunteer.getVolunteerPhoneNumber());
                        i++;
                }
            }


    public String toString() {
        return "-----------------------------------------------------------------------------------------------------"
                +"\n"+volunteers;
    }

    public MembershipRegistration() {
    }
}



