package Practice6_JPA;

import javax.persistence.*;

@Entity
@Table(name = "Lectures")
public class Lecture {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	@Column(name = "name")
	private String name;
	@Basic(fetch = FetchType.LAZY)
	@Column(name="credits")
	private double credits;

	public Lecture() {
	}

	public Lecture(int id, String name, double credits) {
		this.id = id;
		this.name = name;
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Lecture [id=" + id + ", name=" + name + ", credits=" + credits + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

}