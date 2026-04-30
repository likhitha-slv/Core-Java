package CaseStudies;

class DiamondPattern 
{
    public static void main(String[] args) {
    	        int n = 5; 
    	        char ch = 'A';

    	        for (int i = 1; i <= n; i++) {

 
    	            for (int j = i; j < n; j++) {
    	                System.out.print(" ");
    	            }

    	            for (int k = 1; k <= (2 * i - 1); k++) {
    	                System.out.print(ch + " ");
    	            }

    	            ch++; 
    	            System.out.println();
    	        }


    	        for (int i = n - 1; i >= 1; i--) {

    	            for (int j = n; j > i; j--) {
    	                System.out.print(" ");
    	            }

    	            for (int k = 1; k <= (2 * i - 1); k++) {
    	                System.out.print(ch + " ");
    	            }

    	            ch--;
    	            System.out.println();
    	        }
    	    }
    	
    }
//        int n = 5;
//        char[] arr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H','I' };
//		char a = 'a';
//        // Upper part
//        for (int i = 1; i <= n; i++) {
//
//            // spaces
//            for (int j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//
//            char ch = 'A';
//
//            // increasing letters
//            for (int k = 1; k <= i; k++) {
//                System.out.print(ch);
//                ch++;
//            }
//
//            ch -= 2;
//
//            // decreasing letters
//            for (int k = 1; k < i; k++) {
//                System.out.print(ch);
//                ch--;
//            }
//
//            System.out.println();
//        }
//
//        // Lower part
//        for (int i = n - 1; i >= 1; i--) {
//
//            // spaces
//            for (int j = n; j > i; j--) {
//                System.out.print(" ");
//            }
//
//            char ch = 'A';
//
//            // increasing
//            for (int k = 1; k <= i; k++) {
//                System.out.print(ch);
//                ch++;
//            }
//
//            ch -= 2;
//
//            // decreasing
//            for (int k = 1; k < i; k++) {
//                System.out.print(ch);
//                ch--;
//            }
//
//            System.out.println();
//        }
//    }
