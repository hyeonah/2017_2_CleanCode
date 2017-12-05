import java.util.Scanner;

public class Sorting {
	private static int[] numbers = null;
	private static char[] characters = null;
	private static int menuNum, size;
	private static char typeOfData;
	private static boolean showInitialScreen = true;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (showInitialScreen == true) {      
	        showMenu();
	        selectMenu();
		}
	}
	
	private static void showMenu() {
		System.out.println("[ ID: 1312197 ]");
        System.out.println("[ Name: 최현아 ]");
        System.out.println();
        System.out.println("1. Input data");
        System.out.println("2. Print data in increasing order");
        System.out.println("3. Print data in decreasing order");
        System.out.println("4. Quit");
        System.out.println();
	}
	
	private static void selectMenu() {
		menuNum = scan.nextInt();
		if (menuNum == 1) {
			selectTypeOfData(); 			
		}
		else if ((typeOfData == 'n') && (menuNum != 4)) { //괄호 안 수정하기!!!!!!
			selectMenuForNumber(menuNum);
		}
		else if ((typeOfData == 'c') && (menuNum != 4)) {
			selectMenuForCharacter(menuNum);
		}
		else if (menuNum == 4) {
			showInitialScreen = false; 
		}
	}
	
	private static void selectTypeOfData() {
		System.out.print("The type of data (n or c): ");
    	typeOfData = scan.next().charAt(0);
    	inputNumberOfData();
	}
	
	private static void inputNumberOfData() {
		System.out.print("The number of Data: ");
    	size = scan.nextInt();
    	if (typeOfData == 'n') {
    		setSizeOfnumbers();
    	}
    	else if (typeOfData == 'c') {
    		setSizeOfCharacters();
    	}
	}
	
	private static void setSizeOfnumbers() {
    	numbers = new int[size];
    	inputElementsOfNumbers();
	}
	
	private static void inputElementsOfNumbers() {
		System.out.print("data: "); //중복!!!!!!!!!!!!!!!!
    	for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }
    	System.out.println();
	}
	
	private static void setSizeOfCharacters() {
    	characters = new char[size];
    	inputElementsOfCharacters();
	}
	
	private static void inputElementsOfCharacters() {
		System.out.print("data: "); //중복!!!!!!!!!!!!!!!!!
    	for (int i = 0; i < size; i++) {
    		characters[i] = scan.next().charAt(0);
        }
    	System.out.println();
	}
	
	private static void selectMenuForNumber(int num) {
		if (num == 2) {
        	sortAscendingOrderOfNumbers();        	
        }
        else if (num == 3) {
        	sortDescendingOrderOfNumbers();       
        }
		printNumbers( );
	}
	
	private static void selectMenuForCharacter(int num) {
		if (num == 2) {
        	sortAscendingOrderOfCharacters();        	
        }
        else if (num == 3) {
        	sortDescendingOrderOfCharacters();       
        }
		printCharacters( );
	}
	
	private static void sortAscendingOrderOfNumbers() {
    	for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] > numbers[j]) {
                	swapOfNumbers(i,j);
                }
            }
        }
	}
	
	private static void sortAscendingOrderOfCharacters() { 
    	for (int i = 0; i < size-1; i++) {
            for (int j = 1; j < size-i; j++) {
                if (characters[j-1] > characters[j]) {
                	swapOfCharacters(i, j);            
                }
            }
        }
	}
	
	private static void sortDescendingOrderOfNumbers() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] < numbers[j]) {
                	swapOfNumbers(i,j);
                }
            }
        }
	}
	
	private static void sortDescendingOrderOfCharacters() {
		for (int i = 0; i < size-1; i++) {
            for (int j = 1; j < size-i; j++) {
                if (characters[j-1] < characters[j]) {
                	swapOfCharacters(i, j);            
                }
            }
		}
	}
	
	private static void swapOfNumbers(int i, int j) {
		int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
	}
	
	private static void swapOfCharacters(int i, int j) {
		char temp = characters[j-1];
    	characters[j-1] = characters[j];
    	characters[j] = temp; 
	}
	
	private static void printNumbers() {
		for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
		System.out.println();
	}
	
	private static void printCharacters() {
		for (int i = 0; i < size; i++) {
            System.out.print(characters[i] + " ");
        }
		System.out.println();
	}
}
