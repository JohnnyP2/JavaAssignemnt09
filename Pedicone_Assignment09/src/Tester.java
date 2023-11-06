
public class Tester {

	public static void main(String[] args) {
		Computer myPC = new Computer();
		OutputDevice myPrinter = new Printer(150);
		OutputDevice myMonitor = new Monitor(50);
		myPC.setContent("Hello World!");
		myPC.output(myMonitor);
		myPC.output(myPrinter);
		System.out.println("-----------");
		myPC.setContent("Hello World! Delaware Technical Community College's George campus is located in Wilmington, DE.");
		myPC.output(myMonitor);
		myPC.output(myPrinter);

	}

}
