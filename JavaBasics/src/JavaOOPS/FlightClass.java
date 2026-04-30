package JavaOOPS;

public class FlightClass {

	public static void main(String[] args) {
    PassengerEncapsu pe = new PassengerEncapsu();
    pe.setContact(987654321l);
    System.out.println(pe.getContact());
    
    pe.setName("Likhitha");
    System.out.println(pe.getName());
    
    pe.setEmail("likhitha@gmail.com");
    System.out.println(pe.getEmail());
    
    System.out.println(pe.passportNo);
    System.out.println("------------------------");
    
    
    pe.setContact(123522461l);
    System.out.println(pe.getContact());
    
    pe.setName("nithisha");
    System.out.println(pe.getName());
    
    pe.setEmail("nithisha@gmail.com");
    System.out.println(pe.getEmail());
    
    System.out.println(pe.passportNo);
	}

}
