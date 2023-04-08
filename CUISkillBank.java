
import java.util.Scanner;
public class CUISkillBank{

    private static final int MAXIMUM_VOLUNTEERS=100;

    private static final Volunteer[] volunteers=new Volunteer[MAXIMUM_VOLUNTEERS];
    private static int numberOfVolunteers=0;
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
            Volunteer v1=new Volunteer();

            MembershipRegistration m1=new MembershipRegistration();
        while (true){

            System.out.println("Welcome to CUI Skill Bank! ");
            System.out.println("Please select an option : ");
            System.out.println("1. Register as a Volunteer ");
            System.out.println("2. Login as a Volunteer ");
            System.out.println("3. Login as an admin");
            System.out.println("4. Exit");

            int choice=input.nextInt();

            switch (choice){

                case 1:
                    m1.registerStudents(input,MAXIMUM_VOLUNTEERS);
                    continue;
                    //break;
                case 4:
                    System.out.println("Exiting");
                    return;

            }

        }


        }

    }
