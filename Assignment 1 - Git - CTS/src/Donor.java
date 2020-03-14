

public class Donor implements Interface{
	
	private String name;
	private int age;
	private String bloodType;
	private int kg;
	
	
	public Donor(String name, int age, String bloodType, int kg) {
		super();
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
		this.kg = kg;
	}
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String blodType) {
		this.bloodType = blodType;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = 45;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name=" + getName() + ", age=" + getAge() + ", blood type =" +getBloodType() + ", kg=" +getKg();
	}

	@Override
	public void donate() {
		// TODO Auto-generated method stub
		if(kg<50) {
			System.out.println("You can't donate blood, because your weight is: " + getKg() + " which is less than 50, the minimum kg you need to be able to donate.");
		}
	}
	
	
}
