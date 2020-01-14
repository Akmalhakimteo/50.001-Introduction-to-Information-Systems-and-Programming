package piano;

import java.util.Collection;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

import midi.Instrument;
import midi.Midi;
import piano.PianoMachine;

public class testcode {
	public enum Instrument1{
		PIANO,
		BRIGHT_PIANO;
		
		
		
	}
	
	
	public static void main(String[] args) {
		Midi midi;
        PianoMachine pm = new PianoMachine();
    
        EnumMap<Instrument1,Integer> trialstuff = new EnumMap(Instrument1.class);
        trialstuff.put(Instrument1.PIANO, 1);
        trialstuff.put(Instrument1.BRIGHT_PIANO,2);
        System.out.println(trialstuff);
        
        
}
	
}
