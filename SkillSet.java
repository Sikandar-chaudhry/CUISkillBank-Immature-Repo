package FA22BCS008;

public class SkillSet {
    private String[] skills=new String[10];

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public void addSkill(String skill){

        for (int j=0;j< skills.length;j++){
            if(skills[j]==null){
                skills[j]=skill;
                break;
            }
        }
    }

    public void removeSkill(String skill){

        for (int j=0;j< skills.length;j++){
            if(skills[j]!=null && skills[j].equals(skill)){
                skills[j]=null;
                break;
            }
        }
    }

    public String[] getSkills(){
        return skills;
    }

}
