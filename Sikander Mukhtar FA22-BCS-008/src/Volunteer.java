class Volunteer {
    private String name;
    private String email;
    private String password;
    private String mobileNumber;
    private String skillToOffer;
    private String noteSection1;
    private String dateAndTimeSection1;
    private String skillToNeed;
    private String noteSection2;
    private String dateAndTimeSection2;

    private String matchedUpSkill;

    // Constructor
    public Volunteer(String name, String email, String password, String mobileNumber, String skillToOffer, String note1, String dateAndTime1,String skillToNeed,String noteSection2,String dateAndTimeSection2) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.skillToOffer = skillToOffer;
        this.noteSection1 = note1;
        this.dateAndTimeSection1= dateAndTime1;
        this.skillToNeed = skillToNeed;
        this.noteSection2 = noteSection2;
        this.dateAndTimeSection2 = dateAndTimeSection2;
    }
    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getSkillToOffer() {
        return skillToOffer;
    }

    public void setSkillToOffer(String skillToOffer) {
        this.skillToOffer = skillToOffer;
    }

    public String getNoteSection1() {
        return noteSection1;
    }

    public void setNoteInSection1(String noteSection1) {
        this.noteSection1 = noteSection1;
    }

    public String getDateAndTimeSection1() {
        return dateAndTimeSection1;
    }

    public void setDateAndTimeSection1(String dateAndTimeSection1) {
        this.dateAndTimeSection1 = dateAndTimeSection1;
    }

    public String getSkillToNeed() {
        return skillToNeed;
    }

    public void setSkillToNeed(String skillToNeed) {
        this.skillToNeed = skillToNeed;
    }

    public String getNoteSection2() {
        return noteSection2;
    }

    public void setNoteSection2(String noteSection2) {
        this.noteSection2 = noteSection2;
    }

    public String getDateAndTimeSection2() {
        return dateAndTimeSection2;
    }

    public void setDateAndTimeSection2(String dateAndTimeSection2) {
        this.dateAndTimeSection2 = dateAndTimeSection2;
    }

    public String getMatchedUpSkill() {
        return matchedUpSkill;
    }

    public void setMatchedUpSkill(String matchedUpSkill) {
        this.matchedUpSkill = matchedUpSkill;
    }

    // ToStrig method to print the volunteer data

    @Override
    public String toString() {
        return
                "Name = " + name+
                "\nEmail = " + email +
                "\nPassword = " + password+
                "\nMobile Number = " + mobileNumber+
                "\nSkill To Offer = " + skillToOffer +
                "\nNote in Section 1 = " + noteSection1 +
                "\nDate and Time in Section 1 = " + dateAndTimeSection1 +
                "\nSkill To Need = " + skillToNeed +
                "\nNote for Section 2 = " + noteSection2 +
                "\nDate and Time in Section 2 = " + dateAndTimeSection2  +
                "\nMatched Up Skill = " + matchedUpSkill;
    }
}