package FA22BCS008;

import java.util.Scanner;

public class CUISkillBank {

    static final int MAXIMUM_VOLUNTEERS=100;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Volunteer[] volunteers = new Volunteer[100];
        int numberOfVolunteers = 0;
        MembershipRegistration memberLogin=new MembershipRegistration();
        LocalCommunities localCommunities=new LocalCommunities();

        boolean running = true;
        while (running) {

            System.out.println("\nWelcome to CUI Skill Bank! ");
            System.out.println("Please select an option : ");
            System.out.println("1. Register as a Volunteer ");
            System.out.println("2. Login as a Volunteer ");
            System.out.println("3. Login as an Admin");
            System.out.println("4. Open Local Community ");
            System.out.println("5. Exit\n");

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
                    System.out.println("\nPlease select an option : ");
                    System.out.println("1. Edit Skills : ");
                    System.out.println("2. Community Activites : ");
                    int select=input.nextInt();
                    switch (select) {

                        case 1:
                        MembershipRegistration.editVolunteer();
                        break;

                        case 2:
                        if(localCommunities.getNameOfCommunity()!=null) {
                            System.out.println(localCommunities);
                        }
                        else{
                            System.out.println("\nCommunity Tab is empty right now. Check back later!");
                        }
                        break;

                        default:
                            System.out.println("\nChoose Valid Option : ");
                    }
                    break;

                case 3:
                    System.out.println("\nPlease select an option : ");
                    System.out.println("1. MatchUp Skills : ");
                    System.out.println("2. Community Activites : ");
                    int selectAdminOption=input.nextInt();
                    switch (selectAdminOption) {
                        case 1:
                            break;
                        case 2:
                            if (localCommunities.getNameOfCommunity() != null) {
                                System.out.println(localCommunities);
                            } else {
                                System.out.println("\nCommunity Tab is empty right now. Check back later!");
                            }
                            break;
                        default:
                            System.out.println("\nChoose Valid Options ");
                      }
                      break;
                case 4:
                    input.nextLine();
                    localCommunities.fillCommunityActivities();
                    break;
                case 5:
                    running = false;
                    System.out.println("Quiting CUI Skill Bank");
                    break;

                default:
                    System.out.println("\nEnter Valid Choice ");
                    break;
            }
        }

        input.close();

    }
}