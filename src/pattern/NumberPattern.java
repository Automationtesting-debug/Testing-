package pattern;

public class NumberPattern {

	 public static void main(String[] args) {
	        int n = 6;

	        // Upper part of the pattern
	        for (int i = 0; i < n; i++) {
	            // Print leading spaces
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }

	            // Print numbers
	            for (int j = i + 1; j <= n; j++) {
	                System.out.print(j);
	            }

	            System.out.println();
	        }

	        // Lower part of the pattern
	        for (int i = n - 2; i >= 0; i--) {
	            // Print leading spaces
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }

	            // Print numbers
	            for (int j = i + 1; j <= n; j++) {
	                System.out.print(j);
	            }

	            System.out.println();
	        }
	    }
	}
