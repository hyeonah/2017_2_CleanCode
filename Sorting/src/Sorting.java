import java.util.Scanner;

public class Sorting {
	protected static int[] datum = null;
	protected static int menuNum, size;
	protected static char typeOfData;
	protected static boolean showInitialScreen = true;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		while (showInitialScreen == true) {
			showMenu();
			menuNum = scan.nextInt();
			selectMenu(menuNum);
		}
	}

	public static void showMenu() {
		System.out.println("[ ID: 1312197 ]");
		System.out.println("[ Name: ÃÖÇö¾Æ ]");
		System.out.println();
		System.out.println("1. Input data");
		System.out.println("2. Print data in increasing order");
		System.out.println("3. Print data in decreasing order");
		System.out.println("4. Quit");
		System.out.println();
	}

	protected static int[] selectMenu(int menuNum) {
		if (menuNum == 1) {
			return selectTypeOfData();
		} else if (menuNum == 2) {
			return sortAscendingOrder(datum);
		} else if (menuNum == 3) {
			return sortDescendingOrder(datum);
		} else if (menuNum == 4) {
			return escapeMenu();
		}
		return null;
	}

	protected static int[] selectTypeOfData() {
		System.out.print("The type of data (n or c): ");
		typeOfData = scan.next().charAt(0);
		return checkType(typeOfData);
	}

	protected static int[] checkType(char typeOfData) {
		if (typeOfData == 'n' || typeOfData == 'c') {
			return inputNumberOfData(typeOfData);
		} else
			return null;
	}

	protected static int[] inputNumberOfData(char typeOfData) {
		System.out.print("The number of Data: ");
		size = scan.nextInt();
		return setSizeOfdatum(size);
	}

	protected static int[] setSizeOfdatum(int size) {
		datum = new int[size];
		return inputElementsOfdatum();
	}

	protected static int[] inputElementsOfdatum() {
		System.out.print("data: ");
		for (int i = 0; i < size; i++) {
			if (typeOfData == 'n') {
				datum[i] = scan.nextInt();
			} else if (typeOfData == 'c') {
				datum[i] = (int) scan.next().charAt(0);
			}
		}
		System.out.println();
		return datum;
	}

	protected static int[] sortAscendingOrder(int[] datum) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (datum[i] > datum[j]) {
					swapOfDatum(i, j);
				}
			}
		}
		printDatum(datum);
		return datum;
	}

	protected static int[] sortDescendingOrder(int[] datum) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (datum[i] < datum[j]) {
					swapOfDatum(i, j);
				}
			}
		}
		printDatum(datum);
		return datum;
	}

	protected static int[] swapOfDatum(int i, int j) {
		int temp = datum[i];
		datum[i] = datum[j];
		datum[j] = temp;
		return datum;
	}

	protected static void printDatum(int[] datum) {
		if (typeOfData == 'n') {
			printNumbers(datum);
		} else if (typeOfData == 'c') {
			printCharacters(datum);
		}
	}

	protected static int[] printNumbers(int[] datum) {
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = datum[i];
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		return numbers;
	}

	protected static char[] printCharacters(int[] datum) {
		char[] characters = new char[size];
		for (int i = 0; i < size; i++) {
			characters[i] = (char) datum[i];
			System.out.print(characters[i] + " ");
		}
		System.out.println();
		return characters;
	}

	protected static int[] escapeMenu() {
		showInitialScreen = false;
		return null;
	}
}