class Resume {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String summary;
    private String[] skills;
    private String[] experiences;
    private String[] education;

    // Constructor, getters, and setters
    public Resume(String name, String email, String phone, String address, String summary, String[] skills, String[] experiences, String[] education) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.summary = summary;
        this.skills = skills;
        this.experiences = experiences;
        this.education = education;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getSummary() { return summary; }
    public String[] getSkills() { return skills; }
    public String[] getExperiences() { return experiences; }
    public String[] getEducation() { return education; }
}
