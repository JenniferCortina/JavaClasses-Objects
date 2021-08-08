package com.tts;

public class Character {

    private String name;
    private int age;
    private String location;

    public Character() {

    }

    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Character(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isFunny() {
        return true;
    }

    public String banana() {
        return "Banana! Bershks jgdwdbj banana!";
    }

    public String followsCommands(String list) {
        //there is now a variable called list, that exists in this code
        return list;

    }

    public static void main(String[] args) {
        Character character = new Character("Bob", 26, "Gru's house");
        System.out.println(character.followsCommands("Banana!"));
        //String list = "banana";
    }



}