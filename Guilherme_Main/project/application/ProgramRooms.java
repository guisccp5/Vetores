package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class ProgramRooms {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rooms[] vect = new Rooms[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":" );
			System.out.println("Name: ");
			sc.nextLine();
			String namestudent = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rooms(namestudent, email);
		}
		System.out.println();
		System.out.println("Busy Rooms: ");
		for(int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();

	}

}
