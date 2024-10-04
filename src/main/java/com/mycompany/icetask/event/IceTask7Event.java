/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask.event;

/**
 *
 * @author disha
 */
public class IceTask7Event {

    public static void main(String[] args) {
        // Test the reservation system
        String bookingCode = "Event_123";
        String password = "Password@123";
        
        // Attempt to make a reservation
        String result = makeReservation(bookingCode, password);
        System.out.println(result);
    }

    // Method to check if booking code is valid
    public static boolean checkBookingCode(String code) {
        // Booking code must contain an underscore and not exceed 12 characters
        return code.contains("_") && code.length() <= 12;
    }

    // Method to check if password meets complexity requirements
    public static boolean checkPasswordComplexity(String password) {
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        if (password.length() >= 8) {
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                }
                if (Character.isDigit(ch)) {
                    hasNumber = true;
                }
                if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialChar = true;
                }
            }
        }
        
        // Check if password contains at least one capital letter, one number, and one special character
        return hasUpperCase && hasNumber && hasSpecialChar;
    }

    // Method to make a reservation
    public static String makeReservation(String bookingCode, String password) {
        // Validate the booking code
        if (!checkBookingCode(bookingCode)) {
            return "Booking code is incorrectly formatted.";
        }

        // Validate the password complexity
        if (!checkPasswordComplexity(password)) {
            return "Password does not meet the complexity requirements.";
        }

        // If both are valid, confirm the reservation
        return "Reservation successfully made!";
    }
}
