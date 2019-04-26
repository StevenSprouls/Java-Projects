import java.util.Scanner;
class MadLibs {
	public static void main(String[] args) {
		//Our 12 Questions
		Scanner scanner = new Scanner(System.in);
			System.out.print("Type an adjective: ");
		String first_adjective = scanner.next();
		System.out.print("Type a name: ");
		String third_name = scanner.next();
		System.out.print("Type a name: ");
		String first_name = scanner.next();
		System.out.print("Type an adjective: ");
		String second_adjective = scanner.next();
		System.out.print("Type a noun: ");
		String first_noun = scanner.next();
		System.out.print("Type a name: ");
		String second_name = scanner.next();
		System.out.print("Type an adjective: ");
		String third_adjective = scanner.next();
		System.out.print("Type an activity: ");
		String activity = scanner.next();
		System.out.print("Type a super power: ");
		String super_power = scanner.next();
		System.out.print("Type a verb: ");
		String first_verb = scanner.next();
		System.out.print("Type a verb: ");
		String second_verb = scanner.next();
		System.out.print("Type a color: ");
		String color_one = scanner.next();
		System.out.print("Type a color: ");
		String color_two = scanner.next();
		

	//Story 
	System.out.println("My first Mad Lib Story");
	System.out.println("======================");
	System.out.println("There once was a  " + first_adjective + "  cat" +
	" who was named " + third_name + ".");
	System.out.println("His worst enemy was named " + first_name);
	System.out.println("His enemy lived in a " + second_adjective + first_noun);
	System.out.println("With his partner in crime " + second_name);
	System.out.println("They were known for " + third_adjective + " things");
	System.out.println("Today they are planning to do " + activity);
	System.out.println(third_name + " With his power of " + super_power + " Must stop the evil doers!");
	System.out.println(first_name + " Screamed, you will never " + first_verb + "me!");
	System.out.println(third_name + " Sprung into action as he " + second_verb + first_name + " and " + second_name + ".");
	System.out.println("He beat the criminals" + color_one + "and" + color_two + "making him victorious!");
	System.out.println("The End");
		}
	} 