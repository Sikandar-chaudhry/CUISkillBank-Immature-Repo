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
        ChatBox chatFeature=new ChatBox();

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
                    MembershipRegistration.saveVolunteer();
                    //MembershipRegistration.printVolunteer();
                    break;
                case 2:
                    input.nextLine();
                    MembershipRegistration.searchVolunteer();
                    System.out.println("\nPlease select an option : ");
                    System.out.println("1. Edit Skills");
                    System.out.println("2. Community Activites");
                    System.out.println("3. Open ChatBox ");
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
                        case 3:
                            int chooseChatFeature;
                            System.out.println("Select an Option :");
                            System.out.println("1. Send message to Admin");
                            System.out.println("2. Receive message from Admin");
                            chooseChatFeature=input.nextInt();

                            switch (chooseChatFeature){
                                case 1:
                                    chatFeature.chatboxForVolunteer();
                                    break;
                                case 2:
                                    if(chatFeature.getMessageForVolunteer()!=null){
                                        System.out.println(chatFeature.getMessageForVolunteer());
                                    }
                                    else{
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
                    System.out.println("2. Community Activites");
                    System.out.println("3. Open Chatbox");
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

                        case 3:
                            int chooseChatFeature1;
                            System.out.println("Select an Option :");
                            System.out.println("1. Send message to Volunteer");
                            System.out.println("2. Receive message from Volunteer");
                            chooseChatFeature1=input.nextInt();

                            switch (chooseChatFeature1){
                                case 1:
                                    chatFeature.chatboxForAdmin();
                                    break;
                                case 2:
                                    if(chatFeature.getMessageForAdmin()!=null){
                                        System.out.println(chatFeature.getMessageForAdmin());
                                    }
                                    else{
                                        System.out.println("No message for Admin from Volunteer. Check later!");
                                    }
                                    break;
                                default:
                                    System.out.println("Select valid option");
                                    break;
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