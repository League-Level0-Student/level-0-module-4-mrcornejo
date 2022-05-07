package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String scores = JOptionPane.showInputDialog("What is your test score");
			double score = Double.parseDouble(scores);
			
			// question about line 10? what is Double.parseDouble
			// it converts a String to a number that has a decimal pt
			
					// class is almost over
					// can i show you the idea and
					// then help you save work?yes
		//i dont know...how then will put the answer
				
			
	// ok let me explain some things.  let's say you
	// enter 75.5, then there are different ways the computer
	// can store that: as a String "75.5" which has 4 characters,
	// 7 ... 5 .. period .. 5.  OR as a double 75.5, which
	// is a single number.  confusing, but do you understand what
	// i mean so far? no but what is this used for like in this program

	// JOptionPane always saves the user's answer as a String.
				// but in this program we want to convert
				// it to a number.
				// do you want me to show you?
				// in the last program we had to
				// convert String to int.  we did this:
			//	int numQuarters = Integer.parseInt(quarters);
				
				// can you use that idea here BUT convert
				// from String to double?
				
		
	}

}

/*     Write code to ask the user for their test score.
    Your program MUST allow the user to enter a test score that has a DECIMAL, e.g. 75.5
    Give them a different message according to their score.
    Example, for a good score: "Wow! You must have studied really hard for that test!"

    HINT: Think about how you would convert a String to an int and use SIMILAR code to convert their test score to a double. 
*/