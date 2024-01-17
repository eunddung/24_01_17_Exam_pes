
public class WiseSaying {
	public WiseSaying(int id, String writer, String wisesaying) {
		this.id=id; this.writer=writer; this.wisesaying=wisesaying;
		
	}
	int id;
	String writer;
	String wisesaying;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWisesaying() {
		return wisesaying;
	}
	public void setWisesaying(String wisesaying) {
		this.wisesaying = wisesaying;
	}

}
