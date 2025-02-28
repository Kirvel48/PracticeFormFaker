package utils;

import models.StudentData;

import java.util.Date;

public class StudentDataFactory {
    public StudentData generateStudentModelFull() {
        StudentData studentModel = new StudentData();
        studentModel.setFirstName(FakePersonMethods.getFirstName());
        studentModel.setLastName(FakePersonMethods.getLastName());
        studentModel.setPhoneNumber(FakePersonMethods.getPhoneNumber());
        studentModel.setEmail(FakePersonMethods.getEmail());
        studentModel.setSubject(FakePersonMethods.getSubject());
        studentModel.setHobbies(FakePersonMethods.getHobbies());
        studentModel.setAddress(FakePersonMethods.getAddress());
        studentModel.setGender(FakePersonMethods.getGender());
        studentModel.setState(FakePersonMethods.getState());
        studentModel.setCity(FakePersonMethods.getCity(studentModel.getState()));
        studentModel.setFileName(FakePersonMethods.getFileName());

        Date birthdayDate = FakePersonMethods.getBirtdayDate();
        studentModel.setDay(FakePersonMethods.getDay(birthdayDate));
        studentModel.setMonth(FakePersonMethods.getMonth(birthdayDate));
        studentModel.setYear(FakePersonMethods.getYear(birthdayDate));


        return studentModel;
    }

    public StudentData generateStudentModelMandatory() {
        StudentData studentModelMandatory = new StudentData();
        studentModelMandatory.setFirstName(FakePersonMethods.getFirstName());
        studentModelMandatory.setLastName(FakePersonMethods.getLastName());
        studentModelMandatory.setGender(FakePersonMethods.getGender());
        studentModelMandatory.setPhoneNumber(FakePersonMethods.getPhoneNumber());

        Date birthdayDate = FakePersonMethods.getBirtdayDate();
        studentModelMandatory.setDay(FakePersonMethods.getDay(birthdayDate));
        studentModelMandatory.setMonth(FakePersonMethods.getMonth(birthdayDate));
        studentModelMandatory.setYear(FakePersonMethods.getYear(birthdayDate));


        return studentModelMandatory;
    }
}
