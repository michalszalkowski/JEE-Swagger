package pl.btbw.modules.post;

public class PostDto {

	private int id;
	private String title;

	public int getId() {
		return id;
	}

	public PostDto setId(int id) {
		this.id = id;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public PostDto setTitle(String title) {
		this.title = title;
		return this;
	}

	@Override
	public String toString() {
		return "PostDto{" +
				"id=" + id +
				", title='" + title + '\'' +
				'}';
	}
}
