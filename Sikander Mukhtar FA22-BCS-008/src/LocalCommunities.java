import java.util.Scanner;
public class LocalCommunities {
    static Scanner scan=new Scanner(System.in);
    private String nameOfCommunity;
    private String descriptionOfCommunity;
    private String dateAndTimeOfActivity;
    private String locationOfActivity;

    //Method to fill Local Community Activities
    public void fillCommunityActivities(){

        System.out.println("Enter Name Of Community : ");
        nameOfCommunity=scan.nextLine();

        System.out.println("Enter description of Community : ");
        descriptionOfCommunity= scan.nextLine();

        System.out.println("Enter Date and Time of Activity ( Format : DD/MM/YY , Day) : ");
        dateAndTimeOfActivity= scan.nextLine();

        System.out.println("Enter Location of Activity : ");
        locationOfActivity= scan.nextLine();
    }
    public LocalCommunities(String nameOfCommunity, String descriptionOfCommunity, String dateAndTimeOfActivity, String locationOfActivity) {

        this.nameOfCommunity = nameOfCommunity;
        this.descriptionOfCommunity = descriptionOfCommunity;
        this.dateAndTimeOfActivity = dateAndTimeOfActivity;
        this.locationOfActivity = locationOfActivity;

    }
    public LocalCommunities(){

    }

    public String getNameOfCommunity() {
        return nameOfCommunity;
    }
    public void setNameOfCommunity(String nameOfCommunity) {
        this.nameOfCommunity = nameOfCommunity;
    }
    public String getDescriptionOfCommunity() {
        return descriptionOfCommunity;
    }
    public void setDescriptionOfCommunity(String descriptionOfCommunity) {
        this.descriptionOfCommunity = descriptionOfCommunity;
    }
    public String getDateAndTimeOfActivity() {
        return dateAndTimeOfActivity;
    }
    public void setDateAndTimeOfActivity(String dateAndTimeOfActivity) {
        this.dateAndTimeOfActivity = dateAndTimeOfActivity;
    }
    public String getLocationOfActivity() {
        return locationOfActivity;
    }
    public void setLocationOfActivity(String locationOfActivity) {
        this.locationOfActivity = locationOfActivity;
    }

    @Override
    public String toString() {
        return "Name Of Community = " + nameOfCommunity +
                "\nDescription Of Community = " + descriptionOfCommunity  +
                "\nDate And TimeOfActivity = " + dateAndTimeOfActivity  +
                "\nLocation Of Activity = " + locationOfActivity;
    }
}