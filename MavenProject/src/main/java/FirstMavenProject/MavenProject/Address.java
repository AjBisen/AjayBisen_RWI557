package FirstMavenProject.MavenProject;

import java.util.Date;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Loader;

@Entity
@Table(name="student_details")
public class Address {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressId;
	
	@Column(length=20)
	private String street;
	
	@Column(length=30)
	private String city;
	
	@Column(name ="is_open")
	private boolean isopen;
	
//	@Transient
	
	private double x;
	
	@Temporal(TemporalType.DATE)
	private Date addeddate;
	
	@Lob
	private byte[] image;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Address(int addressId, String street, String city, boolean isopen, double x, Date addeddate, byte[] image) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isopen = isopen;
		this.x = x;
		this.addeddate = addeddate;
		this.image = image;
	}



	public int getAddressId() {
		return addressId;
	}



	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public boolean isIsopen() {
		return isopen;
	}



	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}



	public double getX() {
		return x;
	}



	public void setX(double x) {
		this.x = x;
	}



	public Date getAddeddate() {
		return addeddate;
	}



	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}



	public byte[] getImage() {
		return image;
	}



	public void setImage(byte[] image) {
		this.image = image;
	}


	
	
	
	
	

}
