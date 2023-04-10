package FA22BCS008;

import java.util.ArrayList;
import java.util.Scanner;

public class Director {
    ArrayList<Volunteer> volunteers;
    public static void printSkills(ArrayList<Volunteer> volunteers) {
        System.out.println("Volunteer Skills:");
        System.out.println("------------------");

        for (Volunteer volunteer : volunteers) {
            System.out.println("Name : "+volunteer.getName());
            System.out.println("Skills to Offer : " + volunteer.getSkillToOffer());
            System.out.println("Skills Needed : " + volunteer.getSkillToNeed());
            System.out.println("");
        }
    }
}






