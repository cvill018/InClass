
public abstract class NameHolder {
	protected String firstName;
	
	public abstract String describeSelf();
	
	public String toString() {
		return "First name: " + firstName;
	}
	
	public void setFirstName(String firstName) throws NameException {
		if(firstName.isEmpty()) {
			
			this.firstName = firstName;
			
		}
		else {
			throw new NameException("wrong");
		}
		
	}
	
	protected String getFirstName() {
		return firstName;
	}

}
