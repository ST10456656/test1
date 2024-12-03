/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package st10456656_prog6112_exam;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
import org.junit.jupiter.api.Test;

//code to test all classes
class MovieTicketsTest {
    private final MovieTickets movieTickets = new MovieTickets();

    @Test
    void testCalculateTotalTicketPrice() {
        double result = movieTickets.calculateTotalTicketPrice(3, 100.0);
        assertEquals(342.0, result, 0.01);
    }

    @Test
    void testValidateData_ValidData() {
        MovieTicketData validData = new MovieTicketData("Napoleon", 3, 100.0);
        assertTrue(movieTickets.validateData(validData));
    }

    @Test
    void testValidateData_InvalidData() {
        MovieTicketData invalidData = new MovieTicketData("", 0, -50.0);
        assertFalse(movieTickets.validateData(invalidData));
    }
}