package Hospital;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Diseases 

{
	@Id
	private int id;
	private String dname;
	private String symtoms;
	
	@ManyToMany
	private List<Patients> patients;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getSymtoms() {
		return symtoms;
	}

	public void setSymtoms(String symtoms) {
		this.symtoms = symtoms;
	}

	public List<Patients> getPatients() {
		return patients;
	}

	public void setPatients(List<Patients> patients) {
		this.patients = patients;
	}
	
	
	
	
	
}
