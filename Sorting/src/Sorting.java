import java.util.Scanner;

public class Sorting {
	public static int[] numbers;
	public static int menuNum, size;
	public static boolean showInitialScreen = true;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (showInitialScreen == true) {      
	        ShowMenu();
	        SelectMenuNum();
		}
	}
	
	public static void ShowMenu() {
		System.out.println("[ ID: 1312197 ]");
        System.out.println("[ Name: ÃÖÇö¾Æ ]");
        System.out.println();
        System.out.println("1. Input numbers");
        System.out.println("2. Print numbers in increasing order");
        System.out.println("3. Print numbers in decreasing order");
        System.out.println("4. Quit");
        System.out.println();
	}
	
	public static void SelectMenuNum() {
		menuNum = scan.nextInt();
		if (menuNum == 1) {
			InputNumberOfNumbers();
        }
        else if (menuNum == 2) {
        	SortAscendingOrder();        	
        }
        else if (menuNum == 3) {
        	SortDescendingOrder();       
        }
        else if (menuNum == 4) {
        	showInitialScreen = false; 
        } 
	}
	
	public static void InputNumberOfNumbers() {
		System.out.println("The number of numbers: ");
    	size = scan.nextInt();
    	numbers = new int[size];
    	InputElementsOfNumbers();
	}
	
	public static void InputElementsOfNumbers() {
		System.out.println("numbers: ");
    	for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }
    	System.out.println();
	}
	
	public static void SortAscendingOrder() {
    	for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] > numbers[j]) {
                	Swap(i,j);
                }
            }
        }
    	PrintNumbers( );
	}
	
	public static void SortDescendingOrder() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] < numbers[j]) {
                	Swap(i,j);
                }
            }
        }
        PrintNumbers( );
	}
	
	public static void Swap(int i, int j) {
		int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
	}
	
	public static void PrintNumbers( ) { 
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
	}
}
