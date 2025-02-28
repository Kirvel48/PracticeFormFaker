package utils;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FakePersonMethods {
    static Faker faker = new Faker();
    private static final Locale locale = Locale.US;


    public static String getFirstName() {
        return faker.name().firstName();
    }

    public static String getLastName() {
        return faker.name().lastName();
    }

    public static String getEmail() {
        return faker.internet().emailAddress();
    }

    public static String getPhoneNumber() {
        return faker.phoneNumber().subscriberNumber(10);
    }

    public static String getAddress() {
        return faker.address().fullAddress();
    }

    public static Date getBirtdayDate() {
        return faker.date().birthday(18, 70);
    }

    public static String getDay(Date birthdayDate) {
        return new SimpleDateFormat("dd").format(birthdayDate);
    }

    public static String getMonth(Date birthdayDate) {
        return new SimpleDateFormat("MMMM", locale).format(birthdayDate);
    }

    public static String getYear(Date birthdayDate) {
        return new SimpleDateFormat("yyyy").format(birthdayDate);
    }

    public static String getHobbies() {
        return faker.options().option("Sports", "Reading", "Music");
    }

    public static String getSubject() {
        return faker.options().option("Biology", "Chemistry", "Economics", "English", "Hindi", "History", "Maths");
    }

    public static String getFileName() {
        return faker.options().option("1.jpg", "2.jpg");
    }

    public static String getGender() {
        return faker.options().option("Male", "Female", "Other");
    }

    public static String getState() {
        return faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    }

    public static String getCity(String state) {
        return switch (state) {
            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> "";
        };
    }
}

