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

	public static Object containsSOS(List<String> message) {
		boolean SOS = false;
		for (int i = 0; i < message.size(); i++) {
			if(message.get(i).contains("... --- ...")) {
				SOS = true;
			}
		}
		return SOS;
	
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int k = 0; k < results.size() - 1; k++) {
				if (results.get(k) > results.get(k + 1)) {
				Double tempHighest = results.get(k);
				results.set(k, results.get(k+1));
				results.set(k+1, tempHighest);
			}
			}
		}
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int k = 0; k < unsortedSequences.size() - 1; k++) {
				if (unsortedSequences.get(k).length() > unsortedSequences.get(k+1).length()) {
					String dnaLongest = unsortedSequences.get(k);
					unsortedSequences.set(k, unsortedSequences.get(k+1));
					unsortedSequences.set(k+1,dnaLongest);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			for (int k = 0; k < words.size() - 1; k++) {
				if(words.get(k).compareTo(words.get(k+1)) > 0) {
					String tempMost = words.get(k);
					words.set(k, words.get(k+1));
					words.set(k+1, tempMost);
				}
			}
		
	}
		return words;
	
}
}
