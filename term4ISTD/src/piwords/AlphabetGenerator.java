package piwords;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class AlphabetGenerator {
    /**
     * Given a numeric base, return a char[] that maps every digit that is
     * representable in that base to a lower-case char.
     * 
     * This method will try to weight each character of the alphabet
     * proportional to their occurrence in words in a training set.
     * 
     * This method should do the following to generate an alphabet:
     *   1. Count the occurrence of each character a-z in trainingData. DONE
     *   2. Compute the probability of each character a-z by taking
     *      (occurrence / total_num_characters). DONE
     *   3. The output generated in step (2) is a PDF of the characters in the
     *      training set. Convert this PDF into a CDF for each character.
     *   4. Multiply the CDF value of each character by the base we are
     *      converting into.
     *   5. For each index 0 <= i < base,
     *      output[i] = (the first character whose CDF * base is > i)
     * 
     * A concrete example:
     * 	 0. Input = {"aaaaa..." (302 "a"s), "bbbbb..." (500 "b"s),
     *               "ccccc..." (198 "c"s)}, base = 93
     *   1. Count(a) = 302, Count(b) = 500, Count(c) = 198
     *   2. Pr(a) = 302 / 1000 = .302, Pr(b) = 500 / 1000 = .5,
     *      Pr(c) = 198 / 1000 = .198
     *   3. CDF(a) = .302, CDF(b) = .802, CDF(c) = 1
     *   4. CDF(a) * base = 28.086, CDF(b) * base = 74.586, CDF(c) * base = 93
     *   5. Output = {"a", "a", ... (29 As, indexes 0-28),
     *                "b", "b", ... (46 Bs, indexes 29-74),
     *                "c", "c", ... (18 Cs, indexes 75-92)}
     * 
     * The letters should occur in lexicographically ascending order in the
     * returned array.
     *   - {"a", "b", "c", "c", "d"} is a valid output.
     *   - {"b", "c", "c", "d", "a"} is not.
     *   
     * If base >= 0, the returned array should have length equal to the size of
     * the base.
     * 
     * If base < 0, return null.
     * 
     * If a String of trainingData has any characters outside the range a-z,
     * ignore those characters and continue.
     * 
     * @param base A numeric base to get an alphabet for.
     * @param trainingData The training data from which to generate frequency
     *                     counts. This array is not mutated.
     * @return A char[] that maps every digit of the base to a char that the
     *         digit should be translated into.
     */
    public static char[] generateFrequencyAlphabet(int base,
                                                   String[] trainingData) {
        // TODO: Implement (Problem f)
    	if(base<0) {
    		return null;
    	}
    	char [] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    	Map<Character,Integer> answer = new HashMap<>();
    	
    	for(int i=0; i<trainingData.length;i++) {
    		char [] chars = trainingData[i].toCharArray();
    		for(int j=0; j<chars.length; j++) {
    			char thischar = chars[j];
    			if(Character.isAlphabetic(thischar)) {
    				char lowercasechar = Character.toLowerCase(thischar);
    				if(answer.containsKey(lowercasechar)) {
    					answer.put(lowercasechar, answer.get(lowercasechar) + 1);
    				}
    				else {
    					answer.put(lowercasechar,1);
    				}
    			}
    		}
    	}
    	
    	double totalCount = 0;
    	for (Character name: answer.keySet()){
            String key = name.toString();
            String value = answer.get(name).toString();  
            System.out.println(key + " " + value);  
    		int valueInt = answer.get(name);
    		totalCount+= (double) valueInt;
    		
} 
    	int counter1 = 0;
    	double [] PDF = new double [26];
    	for (Character name: answer.keySet()){
    		int valueInt2 = answer.get(name);
    		PDF[counter1] = (double) valueInt2/totalCount;
    		counter1++;
    	}
    	
    	double cumulative = 0;
    	int counter2 = 0;
    	double [] CDF = new double [26];
    	for( double iterateThroughPDF : PDF) {
    		cumulative += iterateThroughPDF;
    		CDF[counter2] = cumulative;
    		counter2++;
    	}
    	int counter3 = 0;
    	char [] finaloutput = new char[base];
    	for(int b=0; b<base;b++) {
//    		if((CDF[counter3] * base) - b > 0.00000001 ) {
//    			finaloutput[b] = alphabet[counter3];
//    		}
//    		while((CDF[counter3]*base - b) < 0.00000001) {
//    		}
    		while((CDF[counter3] * base) - b < 1e-10 ){
    			counter3++;
    		}
    		finaloutput[b] = alphabet[counter3];
    	}

        return finaloutput;
    }
    	
    
    public static void main(String[] args) {
    	
    	String a = "a";
    	String multipleA = a.repeat(302);
    	String b = "b";
    	String multipleB = b.repeat(500);
    	String c = "c";
    	String multipleC = c.repeat(198);
    	
    	String [] trialdata = {multipleA,multipleB,multipleC};
    	
    	System.out.println(generateFrequencyAlphabet(93, trialdata));
    	String [] trialdata1 = {"a", "a", "a", "b", "c", "d", "e", "f"};
    	System.out.println(generateFrequencyAlphabet(4, trialdata1));
    	
    	String [] trainingData2 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    	System.out.println(generateFrequencyAlphabet(26, trainingData2));
	}
}
