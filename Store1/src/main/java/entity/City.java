package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class City {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@OneToMany(mappedBy ="city")
	private List<User> users = new ArrayList<User>();
	
	@OneToMany(mappedBy = "city")
	private List<My_order> my_orders = new ArrayList<My_order>();

	
	
	
	
	
	
	public City() {
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<My_order> getMy_orders() {
		return my_orders;
	}

	public void setMy_orders(List<My_order> my_orders) {
		this.my_orders = my_orders;
	}

	private String name;

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
	
}
