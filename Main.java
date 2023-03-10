package com.company;
import java.util.*;


public class Main
{
        public static void main(String [] args)
        {
                ArrayList<Person> people= new ArrayList<Person>();

                Person person1=new Person ("Temirlan", 21);
                Person person2=new Person ("Shabdan", 22);
                Person person3 = new Person("Farukh", 21);
                people.add(person1);
                people.add(person2);
                people.add(person3);


                people.remove(1);

                for(Person human:people)
                {
                        System.out.println(human.getName()+" — "+ human.getAge()+ "   Years old");
                }
        }
}
class Person {
        private String name;
        private int age;

        Person(String name, int age) {
                this.name = name;
                this.age = age;
        }

        String getName() {
                return name;
        }

        int getAge() {
                return age;
        }

}