/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10456656_prog6112_exam;

/**
 *
 * @author lab_services_student
 */
//code for ourmovie data
public class MovieTicketData {
    
    //code for our private variables
    private String movieName;
    private int numberOfTickets;
    private double ticketPrice;

    // Constructor, getters, and setters
    public MovieTicketData(String movieName, int numberOfTickets, double ticketPrice) {
        this.movieName = movieName;
        this.numberOfTickets = numberOfTickets;
        this.ticketPrice = ticketPrice;
    }

    public String getMovieName() { return movieName; }
    public int getNumberOfTickets() { return numberOfTickets; }
    public double getTicketPrice() { return ticketPrice; }

}
