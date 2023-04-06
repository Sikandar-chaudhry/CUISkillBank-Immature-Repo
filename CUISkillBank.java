
import java.util.Scanner;
public class CUISkillBank{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String nameVolunteer;
        String emailVolunteer;
        String passwordVolunteer;
        String phoneNumberVolunteer;
        Volunteer[] v1;


        MembershipRegistration m1=new MembershipRegistration();
        int memberOrNot;
        System.out.println("-> Press 1 if you are already on CUI Skill Bank : ");
        System.out.println("-> Press 2 to register yourself on CUI Skill Bank : ");
        memberOrNot= input.nextInt();
        switch(memberOrNot){
            case 1: {
                System.out.println();
                break;
            }
            case 2:{

                    v1=new Volunteer[5];
                for(int i=0; i<5; i++ ) {
                 //   System.out.println("Membership Number: " + MembershipRegistration.counter);
                    input.nextLine();
                    System.out.println("Enter Name : ");
                    nameVolunteer = input.nextLine();
                  //  v1[i].setVolunteerName(nameVolunteer);
                    System.out.println("Enter Email : ");
                    emailVolunteer = input.nextLine();
                  // v1[i].setVolunteerEmail(emailVolunteer);
                    System.out.println("Enter Password : ");
                    passwordVolunteer = input.nextLine();
                  //  v1[i].setVolunteerPassword(passwordVolunteer);
                    System.out.println("Enter Mobile Phone : ");
                    phoneNumberVolunteer = input.nextLine();
                  //  v1[i].setVolunteerPhoneNumber(phoneNumberVolunteer);
                    //m1.registerStudents(v1[i]);
                    v1[i]=new Volunteer(nameVolunteer,emailVolunteer,passwordVolunteer,phoneNumberVolunteer);

                }
                System.out.println(v1[0]);

                break;
            }
            default: {
                break;
            }

        }

        //MembershipRegistration m1=new MembershipRegistration();






    }
}