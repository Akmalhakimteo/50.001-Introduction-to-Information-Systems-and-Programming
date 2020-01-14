package q3;


public class Fish implements Observer  {
    private String id;
    private Subject subject;
    public static String outputMessage = "";

    public Fish(String id) {
        this.id = id;

    }
    

	@Override
	public void update(int t) {
		String s = this.id + " received temperature alert:" + t;
		System.out.println(s);
		outputMessage += (s + " ");
		
	}


	public Fish(String id, Subject subject) {
		super();
		this.id = id;
		this.subject = subject;
		this.subject.register(this);
	}

}

