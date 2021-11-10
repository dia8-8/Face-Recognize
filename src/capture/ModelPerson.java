package capture;

import java.sql.Timestamp;
import java.util.Date;

public class ModelPerson {

    private int id;
    private String first_name, last_name, phone, major, birthdate, place, year, language, image;
    private Date register_date;
    private Timestamp last_detected;

    public ModelPerson() {
    }

    public ModelPerson(String first_name, String major, String image) { //LastPerson
        this.first_name = first_name;
        this.major = major;
        this.image = image;
    }

    public ModelPerson(int id, String first_name, String last_name, String phone, String major, String birthdate, String place, String year, String language, Date register_date) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.major = major;
        this.birthdate = birthdate;
        this.place = place;
        this.year = year;
        this.language = language;
        this.register_date = register_date;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getRegisterDate() {
        return register_date;
    }

    public void setRegisterDate(Date date) {
        this.register_date = date;
    }
    public Timestamp getLastDetected() {
        return last_detected;
    }

    public void setLastDetected(Timestamp date) {
        this.last_detected = date;
    }

}
