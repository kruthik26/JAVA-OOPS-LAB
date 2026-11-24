
/*5. Develop a Java program to create a class Reservation in Railway Reservation Management System with methods to reserve seats.
The application should:Handle invalid seat numbers.Handle incorrect user input.Throw a custom exception Seat Already Booked Exception.
Use multiple catch clauses.Use finally to display transaction completion status.*/

import java.util.Scanner;

class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class Reservation {
    boolean seats[];

    Reservation(int n) {
        seats = new boolean[n + 1];
    }

    void reserveSeat(int seatNo)
            throws SeatAlreadyBookedException {

        if (seatNo <= 0 || seatNo >= seats.length) {
            throw new IllegalArgumentException("Invalid seat number");
        }

        if (seats[seatNo]) {
            throw new SeatAlreadyBookedException("Seat already booked");
        }

        seats[seatNo] = true;
        System.out.println("Seat " + seatNo + " booked successfully");
    }
}

public class LAB5_RailwayException {
    public static void main(String[] args) {
    
     System.out.println("NAME : Kruthik D");
     System.out.println("USN : 1WN25CS115");

        Scanner sc = new Scanner(System.in);
        Reservation r = new Reservation(10);

        try {
            System.out.print("Enter seat number: ");
            int seat = sc.nextInt();

            r.reserveSeat(seat);

        } catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (java.util.InputMismatchException e) {
            System.out.println("Incorrect input! Enter an integer.");

        } finally {
            System.out.println("Reservation transaction completed.");
            sc.close();
        }
    }
}
