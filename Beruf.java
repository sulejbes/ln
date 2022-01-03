package ch.zhaw.springboot.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Beruf {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String branche;
	
	public Beruf() {
		
	}
	
	public Beruf(String name, String branche) {
		this.name = name;
		this.branche = branche;
	}

	public String getName() {
		return name;
	}

	public String getBranche() {
		return branche;
	}

	public void setName(String name) {
		this.name = name;
	} 

	public void setBranche(String branche) {
		this.branche = branche;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	



	

}
