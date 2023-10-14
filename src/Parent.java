import java.sql.SQLOutput;

public class Parent {
    int number;
    String name;

    //parameterized constructor
    /*Parent(int number,String name){
        this.number=number;
        this.name=name;
    }*/

    //by using method
    /*void setValues(int number, String name){
        this.number=number;
        this.name=name;
    }*/

    void setNumber(int number){
        this.number=number;

    }
    int getNumber(){
        return this.number;
    }





    // to print the result
    void printDetails(){
        System.out.println("his name is "+name+" his number is "+number);
    }

}
