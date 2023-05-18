package Hospital;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Patients 
{
	@Id
	private int id;
	private String pname;
	private int age;
	
	@ManyToMany
	private List<Diseases> diseases;
	
	@OneToMany
	private List<Encounters> encounters;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Diseases> getDiseases() {
		return diseases;
	}

	public void setDiseases(List<Diseases> diseases) {
		this.diseases = diseases;
	}

	public List<Encounters> getEncounters() {
		return encounters;
	}

	public void setEncounters(List<Encounters> encounters) {
		this.encounters = encounters;
	}
	
	
	
}
