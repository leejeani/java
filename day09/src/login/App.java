package login;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input id:");
			String id = sc.next();
			System.out.println("Input pwd:");
			String pwd = sc.next();
			if(id.equals("id01") && pwd.equals("00")) {
				System.out.println("Login OK");
				System.out.println("Input cmd ..");
				String cmd = sc.next();
				if(cmd.equals("q")) {
					System.out.println("Bye");
					break;
				}
			}else {
				System.out.println("Login Fail");
				continue;
			}
		}
		sc.close();
	}

}
