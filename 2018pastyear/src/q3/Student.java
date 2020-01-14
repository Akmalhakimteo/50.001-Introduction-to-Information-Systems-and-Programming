package q3;

//starting code
public class Student implements Observer {
    private String id;
    private Subject subject;
    public static String outputMessage = "";

    public Student(String id) {
        this.id = id;

    }
    

	@Override
	public void update(int t) {
		String s = this.id + " received temperature alert:" + t;
		System.out.println(s);
		outputMessage += (s + " ");
		
	}


	public Student(String id, Subject subject) {
		super();
		this.id = id;
		this.subject = subject;
		this.subject.register(this);
	}
    

}
