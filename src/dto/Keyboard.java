package dto;

import java.sql.Date;

public class Keyboard {
    private int KeyboardId;
    private String serialNumer;
    private String brand;
    private String model;
    private Date purchaseDate;
    private String statusl;
    private int userId;
	private String status;


    public Keyboard(String serialNumer, String brand, String model, Date purchaseDate, String status, int userId){
        this.serialNumer = serialNumer;
        this.brand = brand;
        this.model = model;
        this.purchaseDate = purchaseDate;
        this.status = status;
        this.userId = userId;
    }


	public int getKeyboardId() {
		return KeyboardId;
	}


	public void setKeyboardId(int keyboardId) {
		KeyboardId = keyboardId;
	}


	public String getSerialNumer() {
		return serialNumer;
	}


	public void setSerialNumer(String serialNumer) {
		this.serialNumer = serialNumer;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public Date getPurchaseDate() {
		return purchaseDate;
	}


	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}


	public String getStatusl() {
		return statusl;
	}


	public void setStatusl(String statusl) {
		this.statusl = statusl;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}

}
