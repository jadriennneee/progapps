import java.util.*;

public class Solutions {
	public static void main (String[] args) {
		Scanner kbd = new Scanner(System.in);
		int choice = 0;

		choice = menu(kbd);

		while(choice != 9) {
			switch(choice) {
				case 1: 
					ashtonAndDanik(kbd);
					choice = menu(kbd);
					break;
				case 2:
					brainsPhoto(kbd);
					choice = menu(kbd);
					break;
				case 3:
					hulk(kbd);
					choice = menu(kbd);
					break;
				case 4:
					mikeAndPalindrome(kbd);
					choice = menu(kbd);
					break;
				case 5:
					mikeAndStrings(kbd);
					choice = menu(kbd);
					break;
				case 6:
					mishkaAndGame(kbd);
					choice = menu(kbd);
					break;
				case 7:
					password(kbd);
					choice = menu(kbd);
					break;
				case 8:
					System.out.println("WALA PA");
					choice = menu(kbd);
					break;
				case 9: 
					System.out.println("Exiting the program...");
					System.exit(0);
				default: 
					System.out.println("Please Try Again!");
					break;
			}	
		}
	}

	public static int menu(Scanner kbd) {
		System.out.println();
		System.out.println();
		
		System.out.println("Choose A Problem: ");
		System.out.println("1. Anton and Danik");
		System.out.println("2. Brains Photo");
		System.out.println("3. Hulk");
		System.out.println("4. Mike and Palindrome");
		System.out.println("5. Mike and Strings");
		System.out.println("6. Mishka and Game");
		System.out.println("7. Password");
		System.out.println("8. ");
		System.out.println("9. Quit");

		System.out.println("");

		System.out.print("Your Choice: ");
		int i = kbd.nextInt();

		return i;
	}

	public static void ashtonAndDanik(Scanner kbd){
		System.out.println("Awan pay bes");
		kbd.close();
	}

	public static void brainsPhoto(Scanner kbd){
		int a = kbd.nextInt();
        int b = kbd.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                String current = kbd.next();
                if (current.charAt(0) == 'C' || current.charAt(0) == 'M'
                        || current.charAt(0) == 'Y') {
                    System.out.println("#Color");
                    System.exit(0);
                }
            }
        }
        
        System.out.println("#Black&White");
	}

	public static void hulk(Scanner kbd){
		int in = kbd.nextInt();

		for(int i = 1; i <= in; i++) {
			if(i == 1) {
				System.out.print("I hate");
			} else if (i % 2 == 0) {
				System.out.print(" that I love");
			} else {
				System.out.print(" that I hate");
			}
		}

		System.out.print(" it");
	}

	public static void mikeAndPalindrome(Scanner scan){
		String s = scan.nextLine();
    	int ctr = (s.length()/2);
    
    	String isPalindrome = "NO";
        boolean q = true;
    	for(int x = 0; x < ctr; x++)
    	{
    	
    		
    	 	if (s.substring(x,x+1).equals(s.substring(s.length()-1-x,s.length()-x)))
    		{
    	
    		}else 
    		{
    			if (q)
    			{
    				q=false;
    				isPalindrome="YES";
    					
    			} else
    			{
    				isPalindrome = "NO";
    				break;
    			}    		    			
    		}	
    	
    			
    	}
    	System.out.println(isPalindrome);
	}

	public static void mikeAndStrings(Scanner in){
		int n = in.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = in.next();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < words[0].length(); i++) {
            String str = words[0].substring(i) + words[0].substring(0,i);
            int total = 0;
            for (int j = 0; j < words.length; j++) {
                boolean flag = false;
                for (int k = 0; k < words[j].length(); k++) {
                    String dakroony = words[j].substring(k)+words[j].substring(0,k);
                    if(dakroony.equals(str))
                    {
                        flag=true;
                        total+=k;
                        break;
                    }
                }
                if(!flag)
                {
                    System.out.println(-1);
                    return;
                }
            }
            min=Math.min(total,min);
        }
        System.out.println(min);
	}

	public static void mishkaAndGame(Scanner kbd){
		int rounds = kbd.nextInt();
        int mishka = 0;
        int chris = 0;
        int draw = 0;
        for (int i = 0; i < rounds; i++) {
            int x = kbd.nextInt();
            int y = kbd.nextInt();
            if (x > y) {
                mishka++;
            } else if (y > x) {
                chris++;
            } else {
                draw++;
            }
        }
        if (mishka == chris) {
            System.out.println("Friendship is magic!^^");
        } else if ((mishka > chris && mishka > draw) || (mishka >= rounds - draw)) {
            System.out.println("Mishka");
        } else if (chris > mishka && chris > draw || (chris >= rounds - draw)) {
            System.out.println("Chris");
        } else {
            System.out.println();
        }
	}

	public static void password(Scanner in){
		System.out.println("Awan pay bes");
		in.close();
	}
}