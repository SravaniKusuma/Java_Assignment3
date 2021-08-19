import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ping {

  public static void runSystemCommand(ArrayList<String> command) {

		try {
			//creating a process and executing ping command
			ProcessBuilder build = new ProcessBuilder(command);
			//starts the subprocess which will execute the ping command.
	        Process process = build.start();
	        
			BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(process.getInputStream()));

			String s = "";
			while ((s = inputStream.readLine()) != null) {
				System.out.println(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		String ip;
		ArrayList<String> command = new ArrayList<String>();
		command.add("ping");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ip address");
		ip=sc.nextLine();
		command.add(ip);
		runSystemCommand(command);
		sc.close();
	
	}
}
