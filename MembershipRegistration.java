import java.util.Arrays;

public class MembershipRegistration extends Volunteer{

    static int counter=0;
    public MembershipRegistration() {
    }

    public Volunteer[] getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(Volunteer[] volunteers) {
        this.volunteers = volunteers;
    }

    Volunteer volunteers[];
    public MembershipRegistration(String volunteerName, String volunteerEmail, String volunteerPassword, String volunteerPhoneNumber) {
        super(volunteerName, volunteerEmail, volunteerPassword, volunteerPhoneNumber);
    }
    public void registerStudents(Volunteer volunteer){
        volunteers=new Volunteer[5];
        for (int i=0; i<volunteers.length; i++){
            volunteers[i]=new Volunteer(volunteer.getVolunteerName(),volunteer.getVolunteerEmail(),volunteer.getVolunteerPassword(),volunteer.getVolunteerPhoneNumber());
        counter++;
        }
    }


    public String toString() {
        return "Volunteer=" + Arrays.toString(volunteers) ;
    }
}
