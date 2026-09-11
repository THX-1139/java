import java.util.Scanner;

public class sum {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = input.GetInput(scan, "premier");
		int b = input.GetInput(scan, "deuxième");
		output.DisplayResult(a, b);	
		scan.close();
	}
}

class input {
	static int GetInput(Scanner scan, String order) {

        System.out.println("Remplissez "+order+ " nombre : ");
        int a = scan.nextInt();
		return a;
    }
}

class output {
	static void DisplayResult(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
		return;
	}	
}
