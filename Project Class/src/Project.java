
public class Project {
	private String name;
	private String description;
	
	public String ElevatorPitch() {
	        return String.format("Name: %s Description %s", name,  description);
	    }
	public Project() {
		
	}
	public Project(String name) {
		this.name = name;
	}
	public Project(String name, String description) {
		this.name = name;
		this.description = description;
	}
	public String getname() {
		return name;
	}
	public String getdescription() {
		return description;
	}
	public void setname(String name) {
		this.name= name;
	}
	public void setdescription(String description) {
		this.description= description;
	}
	}

