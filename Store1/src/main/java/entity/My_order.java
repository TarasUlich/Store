package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class My_order {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int serialNomber;
	
	
	@ManyToOne
	private User user;
	
	@OneToMany(mappedBy = "my_order")
	private List<Commodity> commodities = new ArrayList<Commodity>();
	
	@ManyToOne
	private Delivery delivery;
	
	
	public My_order() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSerialNomber() {
		return serialNomber;
	}


	public void setSerialNomber(int serialNomber) {
		this.serialNomber = serialNomber;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public List<Commodity> getCommodities() {
		return commodities;
	}


	public void setCommodities(List<Commodity> commodities) {
		this.commodities = commodities;
	}


	public Delivery getDelivery() {
		return delivery;
	}


	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}


	@ManyToOne
	private City city;
	
	
	
}
