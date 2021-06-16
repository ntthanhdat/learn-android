package com.example.myapplication;

public class Contact {
    private String name;
    private String phone, email;
    private int avatar;
    public Contact(String Name, String Phone, String Email , int avt) {
        this.name= Name;
        this.phone= Phone;
        this.email= Email;
        this.avatar= avt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone1) {
        this.phone = phone1;
    }

    public String getMail() {return email; }

    public void setMail(String Email) {
        this.email = Email;
    }
    public int getImage() {
        return avatar;
    }

    public void setImage(int image) {
        this.avatar = image;
    }
    @Override
    public String toString()  {
        return this.name+" (Phone: "+ this.phone+" Email:"+ this.email+")";
    }
}
