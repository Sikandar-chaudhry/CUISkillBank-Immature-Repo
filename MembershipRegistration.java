package FA22BCS008;

import java.util.ArrayList;
import java.util.Scanner;

public class MembershipRegistration {
    private static String dateAndTime;
    static Scanner scan = new Scanner(System.in);

    static ArrayList<Volunteer> volunteers = new ArrayList<>();

    public static ArrayList<Volunteer> getVolunteer(int maxVolunteers) {

        int numVolunteers = 0;
        while (numVolunteers < maxVolunteers) {
            System.out.println("Enter Name: ");
            String name = scan.nextLine();

            System.out.println("Enter Email : ");
            String email = scan.nextLine();

            System.out.println("Enter Password : ");
            String password = scan.nextLine();

            System.out.println("Enter Mobile Phone : ");
            String mobileNumber = scan.nextLine();

            System.out.println("Skill to Offer : ");
            String skillToOffer = scan.nextLine();

            System.out.println("Note : ");
            String noteInSection1 = scan.nextLine();

            System.out.println("Date and Time : ");
            dateAndTime = scan.nextLine();

            System.out.println("Skills to need : ");
            String skillToNeed=scan.nextLine();

            System.out.println("Note : ");
            String noteSection2=scan.nextLine();

            System.out.println("Date And Time : ");
            String dateAndTimeSection2=scan.nextLine();

            Volunteer volunteer = new Volunteer(name, email, password, mobileNumber, skillToOffer, noteInSection1, dateAndTime,skillToNeed,noteSection2,dateAndTimeSection2);

            volunteers.add(volunteer);
            numVolunteers++;

            if (numVolunteers == maxVolunteers) {
                break;
            }

            System.out.println("Enter 'q' to quit or any other key to continue: ");
            String quit = scan.nextLine();

            if (quit.equals("q")) {
                break;
            }
        }

        return volunteers;
    }

    public static void printVolunteer() {
        for (Volunteer volunteer : volunteers) {
            System.out.println(volunteer);
        }
        for (int j = 0; j < volunteers.size(); j++) {
            Volunteer volunteer = volunteers.get(j);
            System.out.println("Volunteer " + (j+1) + ": " + volunteer.getName());
        }
    }

    public static void searchVolunteer() {


        System.out.println("Enter Email: ");
        String email = scan.nextLine();
        boolean found = false;
        for (Volunteer volunteer : volunteers) {
            if (volunteer.getEmail().equals(email)) {
                //System.out.println(volunteer);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No volunteer found with this email");
        }
        System.out.println("Enter Password: ");
        String password = scan.nextLine();
        boolean foundPass = false;
        for (Volunteer volunteer : volunteers) {
            if (volunteer.getPassword().equals(password)) {
                //System.out.println(volunteer);
                foundPass = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Incorrect Password");
        }

    }

    public static void editVolunteer() {

        System.out.println("Enter Email : ");
        String email = scan.nextLine();
        System.out.println("Enter PAssword : ");
        String pass = scan.nextLine();
        boolean found = false;
        for (Volunteer volunteer : volunteers) {
            if (volunteer.getEmail().equals(email) && volunteer.getPassword().equals(pass)) {
                System.out.println(volunteer);
                System.out.println("Enter New Skill to Offer: ");
                String newSkillToOffer = scan.nextLine();
                volunteer.setSkillToOffer(newSkillToOffer);
                System.out.println("Skill to Offer has been updated");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No volunteer found with this email or Incorrect Password");
        }
    }
}
