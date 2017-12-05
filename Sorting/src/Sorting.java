import java.util.Scanner;

public class Sorting {
	private static int[] numbers;
	private static char[] characters;
	private static int menuNum, size;
	private static char typeOfData;
	private static boolean showInitialScreen = true;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (showInitialScreen == true) {      
	        showMenu();
	        selectMenuNum();
		}
	}
	
	private static void showMenu() {
		System.out.println("[ ID: 1312197 ]");
        System.out.println("[ Name: ÃÖÇö¾Æ ]");
        System.out.println();
        System.out.println("1. Input data");
        System.out.println("2. Print data in increasing order");
        System.out.println("3. Print data in decreasing order");
        System.out.println("4. Quit");
        System.out.println();
	}
	
	private static void selectMenuNum() {
		menuNum = scan.nextInt();
		if (menuNum == 1) {
			inputData();
        }
        else if (menuNum == 2) {
        	sortAscendingOrder();        	
        }
        else if (menuNum == 3) {
        	sortDescendingOrder();       
        }
        else if (menuNum == 4) {
        	showInitialScreen = false; 
        } 
	}
	
	private static void inputData() {
		selectTypeOfData();
	}
	
	private static void selectTypeOfData() {
		System.out.println("The type of data (n or c): ");
    	typeOfData = scan.next().charAt(0);
    	inputNumberOfData();
	}
	
	private static void inputNumberOfData() {
		System.out.println("The number of Data: ");
    	size = scan.nextInt();
    	setSizeOfArray();
	}
	
	private static void setSizeOfArray() {
		if (typeOfData == 'n') {
    		numbers = new int[size];
    	}
    	else if (typeOfData == 'c') {
    		characters = new char[size];
    	}
		inputElements();
	}
	
	private static void inputElements() {
		System.out.println("data: ");
    	if (typeOfData == 'n') {
    		inputElementsOfNumbers();
    	}
    	else if (typeOfData == 'c') {
    		inputElementsOfCharacters();
    	}
	}
	
	private static void inputElementsOfNumbers() {
    	for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }
    	System.out.println();
	}
	
	private static void inputElementsOfCharacters() {
    	for (int i = 0; i < size; i++) {
    		characters[i] = scan.next().charAt(0);
        }
    	System.out.println();
	}
	
	private static void sortAscendingOrder() {
		if (typeOfData == 'n') {
			sortAscendingOrderOfNumbers();	        
		}
		else if (typeOfData == 'c') {
			sortAscendingOrderOfCharacters();	        
		}
		printData( );
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
	
	private static void sortDescendingOrder() {
		if (typeOfData == 'n') {
			sortDescendingOrderOfNumbers();	        
		}
		else if (typeOfData == 'c') {
			sortDescendingOrderOfCharacters();	        
		}
		printData( );
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
	
	private static void printData() {
		if (typeOfData == 'n') {
			printNumbers();
		}
		else if (typeOfData == 'c') {
			printCharacters();
		}
	}
	
	private static void printNumbers() {
		for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
	}
	
	private static void printCharacters() {
		for (int i = 0; i < size; i++) {
            System.out.print(characters[i] + " ");
        }
	}
}
