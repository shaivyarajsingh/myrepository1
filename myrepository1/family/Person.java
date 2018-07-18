
package com.niit.family;


public class Person {
    String firstname,lastname,address,child_iris_color,fatheriris,motheriris,firis,miris;
    char gender;
  public  Person(String firstname,String lastname,char gender,String address,String fatheriris)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.gender=gender;
        this.address=address;
        //this.iriscolor=iriscolor;
        this.fatheriris=fatheriris;
        
       
    }
   public Person(String firstname,String lastname,char gender,String motheriris)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.gender=gender;
        this.motheriris=motheriris;
       
    }
    Person (String firstname,char gender, Person father,Person mother)
    {
    
       this.firstname=firstname;
       this.gender=gender;
       this.address=father.address;
       this.lastname=father.lastname;
       this.firis=father.fatheriris;
       this.miris=mother.motheriris;
    
    }
    public void get_iris_color(){
        if(firis.equals(miris) &&(gender=='M'))
        {
            child_iris_color="blue";
        }
        else{ 
             if(gender=='M'){
                 child_iris_color=miris;
                 }
                 else{
                child_iris_color=firis;
                 }
                
                }
System.out.println("color of child iris is"+child_iris_color);
    }
}

