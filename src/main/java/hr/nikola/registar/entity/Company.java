package hr.nikola.registar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company {
	
    public Company() {
    }
	
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="taxnumber")
    private Integer taxnumber;
    
    @Column(name="address")
    private String address;
    
    @Column(name="city")
    private String city;
    
    @Column(name="country")
    private String country;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTaxnumber() {
		return taxnumber;
	}

	public void setTaxnumber(Integer taxnumber) {
		this.taxnumber = taxnumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", taxnumber=" + taxnumber + ", address=" + address + ", city="
				+ city + ", country=" + country + "]";
	}
    
    

}
