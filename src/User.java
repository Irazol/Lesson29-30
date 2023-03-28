public class User {

    private int user_id ;
    private String first_name;
    private String last_name;
    private int age;
    private boolean married;
    private String phone;
    private String e_mail;

    public User(int user_id, String first_name, String last_name, int age, boolean married, String phone, String e_mail) {
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.married = married;
        this.phone = phone;
        this.e_mail = e_mail;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

    public String getPhone() {
        return phone;
    }

    public String getE_mail() {
        return e_mail;
    }

    @Override
    public String toString() {
        return  user_id + " " + first_name + " " + last_name +" " + age +" " + married +
                " " + phone + "" + e_mail;
    }
}
