package fr.eni.bo;

public class Meal {

	public int id;
	public String createdDate;
	public String createdHour;
	public String aliments;
	
	/**
	 * @param id
	 * @param createdDate
	 * @param createdHour
	 * @param aliments
	 */
	public Meal(int id, String createdDate, String createdHour, String aliments) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.createdHour = createdHour;
		this.aliments = aliments;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the createdDate
	 */
	public String getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the createdHour
	 */
	public String getCreatedHour() {
		return createdHour;
	}

	/**
	 * @param createdHour the createdHour to set
	 */
	public void setCreatedHour(String createdHour) {
		this.createdHour = createdHour;
	}

	/**
	 * @return the aliments
	 */
	public String getAliments() {
		return aliments;
	}

	/**
	 * @param aliments the aliments to set
	 */
	public void setAliments(String aliments) {
		this.aliments = aliments;
	}
	
}
