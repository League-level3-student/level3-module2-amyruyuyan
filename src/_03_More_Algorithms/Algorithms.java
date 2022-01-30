package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return null;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	for (int i = 0; i < eggs.size(); i++) {
    		if (eggs.get(i).equals("cracked")) {
    			return i;
    		}
    	}
        return 0;
    }

	public static Object countPearls(List<Boolean> oysters) {
		int withPearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i).equals(true)) {
				withPearls += 1;
			}
		}
		return withPearls;
		
	}

	public static double findTallest(List<Double> peeps) {
		for (int i = 0; i < peeps.size(); i++) {
    		for (int k = 0; k < peeps.size() - 1; k++) {
    			if (peeps.get(k) < peeps.get(k + 1)) {
    				Double temporary = peeps.get(k);
    				peeps.set(k, peeps.get(k+1));
    				peeps.set(k+1, temporary);
    			}
    		}
    	}
		return peeps.get(0);
	}

	public static Object findLongestWord(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			for (int k = 0; k < words.size() - 1; k++) {
				if (words.get(k).length() < words.get(k + 1).length()) {
					String tempLongest = words.get(k);
					words.set(k, words.get(k+1));
					words.set(k+1, tempLongest);
					
				}
			}
		}
		return words.get(0);
	}

	public static Object containsSOS(List<String> message2) {
		boolean SOS = false;
		for (int i = 0; i < message2.size(); i++) {
			if(message2.get(i).contains("... --- ...")) {
				SOS = true;
			}
			else {
				SOS = false;
			}
		}
		return SOS;
	
	}
}
