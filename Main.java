import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    

    Person[] people = new Person[] { 
    
    new Person("Cleopatra", "Egypt", "69 BC", 1),
    new Person("Alexander the Great", "Macedon", "356 BC", 1),
    new Person("Julius Caesar", "Rome", "100 BC", 1),
    new Person("Hannibal", "Carthage", "247 BC", 1),
    new Person("Confucius", "China", "551 BC", 1),
    new Person("Pericles", "Greece", "429 BC", 2),
    new Person("Spartacus", "Thrace", "111 BC", 2),
    new Person("Marcus Aurelius", "Rome", "121 AD", 2),
    new Person("Leonidas", "Greece", "540 BC", 2),
    new Person("Sun Tzu", "China", "544 BC", 2),
    new Person("Hammurabi", "Babylon", "1750 BC", 2),
    };
    
    Airline airline = new Airline();
    for (int i = 0; i < people.length; i++) {
        if(people[i].applyPassport() == true){
            people[i].setPassport();
            airline.createReservation(people[i]);
        }
    }

    System.out.println("********************** RESERVATIONS COMPLETE! **********************\n");
    System.out.println(airline);

    

    // for (int i = 0; i < people.length; i++) {
    //     airline.setPerson(people[i]);
    // }

    // System.out.println();
    // System.out.println(airline.getPerson(1));
    // System.out.println(airline.getPerson(5));
    // System.out.println(airline.getPerson(10));

    // Person firstPerson = new Person("Reydel Ladaga", "Filipino", "11/11/1111", 5);
    
    // if (firstPerson.applyPassport() == true) {
    //     firstPerson.setPassport();
    // }

    // System.out.println(firstPerson);
    
        // Person firstPerson = new Person("Reydel Ladaga", "Filipino", "11/11/1111", 5);
        // Person secondPerson = new Person(firstPerson);

        // System.out.print("\n");
        // System.out.println(firstPerson.getName());
        // System.out.println(firstPerson.getNationality());
        // System.out.println(firstPerson.getDateOfBirth());
        // System.out.println(Arrays.toString(firstPerson.passport));
        // System.out.println(firstPerson.getSeatNumber());
        // System.out.print("\n");
        // firstPerson.chooseSeat();

        // System.out.println("Name: " + firstPerson.getName() + "\n" + 
        //                    "Nationality: " + firstPerson.getNationality() + "\n" +
        //                    "Date of Birth: " + firstPerson.getDateOfBirth() + "\n" +
        //                    "Seat Number: " + firstPerson.getSeatNumber() + "\n");
        
        // if(firstPerson.applyPassport() == true) {
        //     System.out.println("Congratulations " + firstPerson.getName() + ". Your passport application was approved!\n");
        // } 
        // else {
        //     System.out.println("We're sorry " + firstPerson.getName() + ". We cannot process your passport application.\n");
        // }
    }     
  
}

    /*
        Workbook Part - 1
        firstPerson.name = "Reydel Ladaga";
        firstPerson.nationality = "Filipino";
        firstPerson.dateOfBirth = "11/11/1111";
        firstPerson.passport = new String[]{firstPerson.name, firstPerson.nationality, firstPerson.dateOfBirth};
        firstPerson.seatNumber = 5;

    **/

    // secondPerson.setName("John Mark");
        // secondPerson.setSeatNumber(9);
        
        // System.out.println("Name: " + secondPerson.getName() + "\n" + 
        //                    "Nationality: " + secondPerson.getNationality() + "\n" +
        //                    "Date of Birth: " + secondPerson.getDateOfBirth() + "\n" +
        //                    "Seat Number: " + secondPerson.getSeatNumber() + "\n");