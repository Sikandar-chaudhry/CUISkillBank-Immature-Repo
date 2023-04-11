import java.util.ArrayList;
import java.util.Scanner;

public class CUISkillBank {
    static final int MAXIMUM_VOLUNTEERS = 100;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array of objects of volunteer class with maximum volunteers limit.
        Volunteer[] volunteers = new Volunteer[100];
        // To count number of Volunteers
        int numberOfVolunteers = 0;
        //Objects of classes
        MembershipRegistration memberLogin = new MembershipRegistration();
        LocalCommunities localCommunities = new LocalCommunities();
        ChatBox chatFeature = new ChatBox();
        Director director = new Director();

        //Boolean type instance variable to control while loop.
        boolean running = true;
            //CLI
            System.out.println("********************************************************************************************************");
            System.out.println("*                                 -------------------------------                                      *");
            System.out.println("*                                 |  Welcome to CUI Skill Bank  |                                      *");
            System.out.println("*                                 -------------------------------                                      *");
            System.out.println("********************************************************************************************************");
            //While loop being controlled by boolean variable
            while (running) {

            //Menu Tab
            System.out.println("\nPlease select an option : ");
            System.out.println("1. Register as a Volunteer ");
            System.out.println("2. Login as a Volunteer ");
            System.out.println("3. Login as an Admin");
            System.out.println("4. Open Local Community ");
            System.out.println("5. Exit\n");

            int choice = input.nextInt();

            // Switch case to easily go around the menu selections
            switch (choice) {

                case 1:

                    input.nextLine();
                    MembershipRegistration.getVolunteer(MAXIMUM_VOLUNTEERS);
                    MembershipRegistration.saveVolunteer();
                    break;

                case 2:

                    input.nextLine();
                    MembershipRegistration.searchVolunteer();
                    System.out.println("\nPlease select an option : ");
                    System.out.println("1. Edit Skills");
                    System.out.println("2. Community Activites");
                    System.out.println("3. Open ChatBox ");
                    int select = input.nextInt();

                    switch (select) {

                        case 1:
                            MembershipRegistration.editVolunteer();
                            break;

                        case 2:
                            if (localCommunities.getNameOfCommunity() != null) {
                                System.out.println(localCommunities);
                            } else {
                                System.out.println("\nCommunity Tab is empty right now. Check back later!");
                            }
                            break;

                        case 3:
                            int chooseChatFeature;
                            System.out.println("Select an Option :");
                            System.out.println("1. Send message to Admin");
                            System.out.println("2. Receive message from Admin");
                            chooseChatFeature = input.nextInt();

                            switch (chooseChatFeature) {

                                case 1:
                                    chatFeature.chatboxForVolunteer();
                                    break;

                                case 2:
                                    if (chatFeature.getMessageForVolunteer() != null) {
                                        System.out.println(chatFeature.getMessageForVolunteer());
                                    } else {
                                        System.out.println("No message for Volunteer from Admin. Check later!");
                                    }
                                    break;

                                default:
                                    System.out.println("Select valid option");
                                    break;
                            }
                            break;

                        default:
                            System.out.println("\nChoose Valid Option : ");
                    }
                    break;

                case 3:
                    System.out.println("\nPlease select an option : ");
                    System.out.println("1. MatchUp Skills : ");
                    System.out.println("2. Director ");
                    System.out.println("3. Open Chatbox");
                    System.out.println("4. Community Activities");
                    int selectAdminOption = input.nextInt();

                    switch (selectAdminOption) {

                        case 1:
                            MembershipRegistration.MatchUp();
                            break;

                        case 2:
                            ArrayList<Volunteer> volunteers1 = MembershipRegistration.getVolunteer(0);
                            Director.printSkills(volunteers1);
                            break;

                        case 3:
                            int chooseChatFeature1;
                            System.out.println("Select an Option :");
                            System.out.println("1. Send message to Volunteer");
                            System.out.println("2. Receive message from Volunteer");
                            chooseChatFeature1 = input.nextInt();

                            switch (chooseChatFeature1) {

                                case 1:
                                    chatFeature.chatboxForAdmin();
                                    break;

                                case 2:
                                    if (chatFeature.getMessageForAdmin() != null) {
                                        System.out.println(chatFeature.getMessageForAdmin());
                                    } else {
                                        System.out.println("No message for Admin from Volunteer. Check later!");
                                    }
                                     break;
                                    }
                                    break;

                                case 4:
                                    if (localCommunities.getNameOfCommunity() != null) {
                                        System.out.println(localCommunities);
                                    } else {
                                        System.out.println("\nCommunity Tab is empty right now. Check back later!");
                                    }
                                    break;

                                default:
                                    System.out.println("Select valid option");
                                    break;

                        }
                        break;
                case 4:

                    input.nextLine();
                    localCommunities.fillCommunityActivities();
                    break;

                case 5:

                    // Controlling while loop and stopping it when user will choose 5.
                    running = false;
                    System.out.println("******************************************************************************************************");
                    System.out.println("*                                     Quiting CUI Skill Bank                                         *");
                    System.out.println("*                                 ------------------------------                                     *");
                    System.out.println("******************************************************************************************************");
                    break;

                default:
                    System.out.println("\nEnter Valid Choice ");
                    break;
            }
        }
        // It is a good practice to close the Scanner object.
        input.close();

    }
}