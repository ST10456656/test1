/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10456656_prog6112_exam;

/**
 *
 * @author lab_services_student
 */
public class MovieTickets implements IMovieTickets {

    //code to create a constant variable for VAT
      private static final double VAT = (14/100);

      //override codefrom interface class
    @Override
    public double calculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        double total = numberOfTickets * ticketPrice;
        return total + (total * VAT);
    }

    //override codefrom interface class
    @Override
    public boolean validateData(MovieTicketData data) {
        return data.getMovieName() != null && !data.getMovieName().isEmpty() &&
               data.getTicketPrice() > 0 &&
               data.getNumberOfTickets() > 0;
    }
    
    
}
