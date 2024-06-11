package DependencyInjection.ConstructorBased.Models;

public class Ticket {
    private int ticketId;
    private String ticketdate;

    public Ticket(){
        System.out.println("Default Constructor!");
    }

    public Ticket(int id){
        this.ticketId = id;
    }

    public Ticket(String ticketdate){
        this.ticketdate = ticketdate;
    }

    public Ticket(int ticketId, String ticketdate){
        this.ticketId = ticketId;
        this.ticketdate = ticketdate;
    }

    public void display(){
        System.out.println(ticketId+" - "+ticketdate);
    }
}
