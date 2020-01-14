package piano;

import java.util.Date;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

import javax.sound.midi.MidiUnavailableException;
import midi.Instrument;
import midi.Midi;
import music.Pitch;
import music.NoteEvent;
import piano.PianoApplet;



public class PianoMachine {
	
	private Midi midi;
	private int testpitch = 0;
	private Set<Integer> noDuplicateNotes = new HashSet<Integer>();
	private boolean isRecording = false;
	private boolean isPlayingBack = false;
	private ArrayList<music.NoteEvent> eventHistory = new ArrayList<music.NoteEvent>();
	public long whenfinish = 0;
//	private State state;

	
	static Instrument CURRENT_INSTRUMENT = Instrument.PIANO;
	
//	EnumMap<Instrument,Integer> Instrument_numbers = new EnumMap(Instrument.class);
//	for(Instrument instruments: Instrument) {
//		Instrument_numbers.put(instruments, instrument_counter);
//		instrument_counter++;
//		
//	}

    
	/**
	 * constructor for PianoMachine.
	 * 
	 * initialize midi device and any other state that we're storing.
	 */
    public PianoMachine() {
    	try {
            midi = Midi.getInstance();
        } catch (MidiUnavailableException e1) {
            System.err.println("Could not initialize midi device");
            e1.printStackTrace();
            return;
        }
    }
    
    //TODO write method spec
    public void beginNote(Pitch rawPitch) {
//    	midi.beginNote(new Pitch(0).toMidiFrequency());
    	//TODO implement for question 1
    	
    	if(noDuplicateNotes.add(rawPitch.toMidiFrequency())) {
    		midi.beginNote(rawPitch.transpose(testpitch).toMidiFrequency(), CURRENT_INSTRUMENT);
    		if(this.isRecording) {
    			long time = (new Date()).getTime();
    			NoteEvent note = new NoteEvent(rawPitch.transpose(testpitch), time, this.CURRENT_INSTRUMENT	, NoteEvent.Kind.start);
    			eventHistory.add(note);
    		}
    	}
    }
    
    //TODO write method spec
    public void endNote(Pitch rawPitch) {
//    	midi.endNote(new Pitch(0).toMidiFrequency());
    	//TODO implement for question 1
    	if(noDuplicateNotes.remove(rawPitch.toMidiFrequency())) {
    		midi.endNote(rawPitch.transpose(testpitch).toMidiFrequency(), CURRENT_INSTRUMENT);
    	}
    	if(this.isRecording) {
			long time = (new Date()).getTime();
			NoteEvent note = new NoteEvent(rawPitch.transpose(testpitch), time, this.CURRENT_INSTRUMENT	, NoteEvent.Kind.stop);
			eventHistory.add(note);
		}
    	
    }
    
    //TODO write method spec
    public void changeInstrument() {
    	CURRENT_INSTRUMENT = CURRENT_INSTRUMENT.next();
       	//TODO: implement for question 2
    }
    
    //TODO write method spec
    public void shiftUp() {
    	//TODO: implement for question 3
    	if(this.testpitch!=24) {
    		this.testpitch+=12;
    	}
    	
    }
    
    //TODO write method spec
    public void shiftDown() {
    	//TODO: implement for question 3
    	if(this.testpitch!=-24) {
    		this.testpitch-=12;
    	}
    }
    
    public void togglePlayback() {
    	this.isPlayingBack = !this.isPlayingBack;
    }
    
    public boolean isPlayingBack() {
    	return isPlayingBack;
    }
    
    
    //TODO write method spec
    public boolean toggleRecording() {
    	this.isRecording = !this.isRecording;
    	if(this.isRecording) {
    		this.eventHistory = new ArrayList<music.NoteEvent>();
    	}
    	return this.isRecording;
    	
    	
    	
    	//TODO: implement for question 4
    }
    
    //TODO write method spec
    public void playback() {    	
        //TODO: implement for question 4
    	long delay = 0;
    	for(int z=0;z<eventHistory.size();z++) {
    		if(delay!=0) {
    			int waitingTime = (int) Math.round((eventHistory.get(z).getTime() - delay)/10.0);
    			Midi.rest(waitingTime);
    		}
    		delay = eventHistory.get(z).getTime();
    		NoteEvent.Kind kind = eventHistory.get(z).getKind();
            int pitchFrequency = eventHistory.get(z).getPitch().toMidiFrequency();
            Instrument noteEventInstrument = eventHistory.get(z).getInstr();
            if (kind == NoteEvent.Kind.start) {
                midi.beginNote(pitchFrequency, noteEventInstrument);
            }
            else {
                midi.endNote(pitchFrequency, noteEventInstrument);
            }

    	}
    	
    	}
    }


