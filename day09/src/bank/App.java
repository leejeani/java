package bank;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input cmd(q,c,w,d,s) ..");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("c")) {
				try {
					Account a = new Account("11", "11", "11", -10);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				
			}
		}
		sc.close();
	}
}
