package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@OneToOne(cascade = CascadeType.ALL)
	
	private User user;
	
	@ManyToMany
	@JoinTable(name = "cart_commodity",
	joinColumns	= @JoinColumn(name = "id_cart"),
	inverseJoinColumns = @JoinColumn(name = "id_commodity"))
	private List<Commodity> commodities =  new ArrayList<Commodity>();

	public Cart() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
}
