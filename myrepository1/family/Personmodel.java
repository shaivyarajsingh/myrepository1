
package com.niit.family;


public class Personmodel {
    public static void main(String[] args)
    {
    Person father =new Person("Suresh","Rawat",'M',"Noida","blue");
    Person mother =new Person("Sunita","Rawat",'F',"black");
    Person child=new Person("Sakshi",'M',father,mother);
    child.get_iris_color();
    }  
}
