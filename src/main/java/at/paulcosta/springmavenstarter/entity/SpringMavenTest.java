package at.paulcosta.springmavenstarter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="spring_maven_test")
public class SpringMavenTest {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="text")
	private String text;
	
	public SpringMavenTest() {}

	
	
	
	
	@Override
	public String toString() {
		return "SpringMavenTest [id=" + id + ", text=" + text + "]";
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}