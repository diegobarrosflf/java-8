package model;

public class Usuario {
	private String name;
	private int score;
	private boolean moderator;

	public Usuario(String name, int score) {
		super();
		this.name = name;
		this.score = score;
		this.moderator = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isModerator() {
		return moderator;
	}

	public void setModerator() {
		this.moderator = true;
	}

}
