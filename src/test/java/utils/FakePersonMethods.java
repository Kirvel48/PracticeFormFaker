package utils;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FakePersonMethods {
    static Faker faker = new Faker();
    private static final Locale locale = Locale.US;


    public String getFirstName() {
        return faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }

    public String getEmail() {
        return faker.internet().emailAddress();
    }

    public String getPhoneNumber() {
        return faker.phoneNumber().subscriberNumber(10);
    }

    public String getAddress() {
        return faker.address().fullAddress();
    }

    public Date getBirtdayDate() {
        return faker.date().birthday(18, 70);
    }

    public String getDay(Date birthdayDate) {
        return new SimpleDateFormat("dd").format(birthdayDate);
    }

    public String getMonth(Date birthdayDate) {
        return new SimpleDateFormat("MMMM", locale).format(birthdayDate);
    }

    public String getYear(Date birthdayDate) {
        return new SimpleDateFormat("yyyy").format(birthdayDate);
    }

    public String getHobbies() {
        return faker.options().option("Sports", "Reading", "Music");
    }

    public String getSubject() {
        return faker.options().option("Biology", "Chemistry", "Economics", "English", "Hindi", "History", "Maths");
    }

    public String getFileName() {
        return faker.options().option("1.jpg", "2.jpg");
    }

    public String getGender() {
        return faker.options().option("Male", "Female", "Other");
    }

    public String getState() {
        return faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    }

    public String getCity(String state) {
        return switch (state) {
            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> "";
        };
    }
}

