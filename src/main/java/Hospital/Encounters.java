package Hospital;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Encounters 
{
	@Id
	private int id;
	private String pname;
	private String date;
	private String lastin;
	private String lastout;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLastin() {
		return lastin;
	}
	public void setLastin(String lastin) {
		this.lastin = lastin;
	}
	public String getLastout() {
		return lastout;
	}
	public void setLastout(String lastout) {
		this.lastout = lastout;
	}
	
	
	
}
