package FA22BCS008;

import java.util.Scanner;

public class CUISkillBank {

    static final int MAXIMUM_VOLUNTEERS=100;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Volunteer[] volunteers = new Volunteer[100];
        int numberOfVolunteers = 0;
        MembershipRegistration memberLogin=new MembershipRegistration();

        boolean running = true;
        while (running) {

            System.out.println("Welcome to CUI Skill Bank! ");
            System.out.println("Please select an option : ");
            System.out.println("1. Register as a Volunteer ");
            System.out.println("2. Login as a Volunteer ");
            System.out.println("3. Login as an admin");
            System.out.println("4. Exit");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    input.nextLine();
                    MembershipRegistration.getVolunteer(MAXIMUM_VOLUNTEERS);
                    //MembershipRegistration.printVolunteer();
                    break;
                case 2:
                    input.nextLine();
                    MembershipRegistration.searchVolunteer();
                    MembershipRegistration.editVolunteer();
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Enter Valid Choice ");
                    break;
            }
        }

        input.close();

    }
}