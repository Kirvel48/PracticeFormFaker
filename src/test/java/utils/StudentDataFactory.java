package utils;

import models.StudentData;

import java.util.Date;

public class StudentDataFactory {
    FakePersonMethods fakePerson = new FakePersonMethods();

    public StudentData generateStudentModelFull() {
        StudentData studentModel = new StudentData();
        studentModel.setFirstName(fakePerson.getFirstName());
        studentModel.setLastName(fakePerson.getLastName());
        studentModel.setPhoneNumber(fakePerson.getPhoneNumber());
        studentModel.setEmail(fakePerson.getEmail());
        studentModel.setSubject(fakePerson.getSubject());
        studentModel.setHobbies(fakePerson.getHobbies());
        studentModel.setAddress(fakePerson.getAddress());
        studentModel.setGender(fakePerson.getGender());
        studentModel.setState(fakePerson.getState());
        studentModel.setCity(fakePerson.getCity(studentModel.getState()));
        studentModel.setFileName(fakePerson.getFileName());

        Date birthdayDate = fakePerson.getBirtdayDate();
        studentModel.setDay(fakePerson.getDay(birthdayDate));
        studentModel.setMonth(fakePerson.getMonth(birthdayDate));
        studentModel.setYear(fakePerson.getYear(birthdayDate));


        return studentModel;
    }

    public StudentData generateStudentModelMandatory() {
        StudentData studentModelMandatory = new StudentData();
        studentModelMandatory.setFirstName(fakePerson.getFirstName());
        studentModelMandatory.setLastName(fakePerson.getLastName());
        studentModelMandatory.setGender(fakePerson.getGender());
        studentModelMandatory.setPhoneNumber(fakePerson.getPhoneNumber());

        Date birthdayDate = fakePerson.getBirtdayDate();
        studentModelMandatory.setDay(fakePerson.getDay(birthdayDate));
        studentModelMandatory.setMonth(fakePerson.getMonth(birthdayDate));
        studentModelMandatory.setYear(fakePerson.getYear(birthdayDate));


        return studentModelMandatory;
    }
}
