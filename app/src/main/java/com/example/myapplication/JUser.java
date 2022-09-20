package com.example.myapplication;

import org.parceler.Parcel;

@Parcel // ** Required ** Must annotate class with @Parcel
public class JUser {

    // ** Required ** Field cannot be private
    String name;
    int age;


    public JUser(String userName, int userAge) {
        this.name = userName;
        this.age = userAge;
    }

    public JUser() {
    }


//    public String getUserName() {
//        return userName;
//    }

//    public int getUserAge() {
//        return userAge;
//    }

//    @Override
//    public String toString() {
//        return "JUser{" +
//                "userName='" + name + '\'' +
//                ", userAge=" + age +
//                '}';
//    }
}
