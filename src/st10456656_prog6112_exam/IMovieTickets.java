/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package st10456656_prog6112_exam;

/**
 *
 * @author lab_services_student
 */
public interface IMovieTickets {
    //code for interface and abstract methods to be overridded in other class
    double calculateTotalTicketPrice(int numberOfTickets, double ticketPrice);
    boolean validateData(MovieTicketData movieTicketData);
}
