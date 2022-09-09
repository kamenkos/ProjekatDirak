
public abstract class Game {
	
	private String name;
	private int id;

	public Game() {
	}
	public Game(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
}