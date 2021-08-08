package com.tts;

public class Pet {

        private String name;
        private int age;
        private String location;
        private String type;

        public Pet(){}
        public Pet(String name, int age, String location, String type) {
            this.name = name;
            this.age = age;
            this.location = location;
            this.type = type;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public String getLocation(){
            return location;
        }

        public String getType(){
            return type;
        }


        public void setAge(int age) {
            this.age = age;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public void setType(String type) {
            this.type = type;
        }
}
