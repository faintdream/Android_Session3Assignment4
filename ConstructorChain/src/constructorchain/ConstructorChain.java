/*
 * This program demonstrates use of constructor chaining
 * Constructor chain : calling one class's constructor from same class
 * or from parent class .
 * calling same calss constructor uses  this() keyword
 * calling Parent class constuctor uses super() keyword
 */
package constructorchain;

public class ConstructorChain {                            // empty class

    public static void main(String[] args) {
        City myCity =new City();                           // object inititalization using default constructor of City class
        System.out.println("=====================================");
        System.out.println("    Changing to my dream city");
        System.out.println("======================================");
        City dreamCity= new City ("Palo Alto");            // object initialization using parameterised constructor of City class
                                                           // note: except for caling constructors we actually haven't
                                                           //        used above objects
    }
    
}

class Country{                                              // country class
    String country;                                         // string variable to hold country name
    
// here we initialize this country
    Country(){                                                              //default constructor
        this.country="Bharat";                                              // setting default country
        System.out.println("Deafult Country : " + this.country);            // output to console
    }

// country initialization at object creation
    Country(String country){                                              // parametrised constructor
        this.country=country;                                             // set country variable to whatever passed
        System.out.println("Current Country : " + this.country);          // output console
    }
    
}

class State extends Country{                                                // State class  inherits Country
    String state;                                                           // variable to hold state information
    
    // here we initialize state
    State(){                                                                // default constructor
        super();                                                            // calling default constructor of parent class (  Country)
        this.state="MadhyPradesh";                                          // setting default state
        System.out.println("Deafult State : " + this.state);                // output to console
    }
    
    State(String state){                                                    // parametrised constructor
        super("USA");                                                       // calling parameterised constructor of parent class ( Country )
        this.state=state;                                                   // set state to what is passed to it
        System.out.println("Current State : " + this.state);                // output to console
    }
        
    
}

class City extends State{                                                   //City class created , inherits State
    String city;                                                            // variable to hold city name 
    City(){                                                                 //setting default constructor
       this.city="Jabalpur";                                                // setting default city
        System.out.println("Default City : " + this.city);                  // output to cosole
    }
    
    City ( String city){                                                    // parametrised constructor
        super("California");                                                // calling parameterised constructor of parent class ( State)
        this.city=city;                                                     // set city variable to whatever passed to it.
        System.out.println("Current City : " + this.city);                  //output to console
    }
}                                                                           