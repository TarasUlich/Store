package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String secondName;
	private int age;
	
	private String login;
	private String password;
	
	private String telephoneNomber;
	private String email;

	@ManyToOne
	private City city;
	
	@OneToMany(mappedBy = "user")
	private List<My_order> my_orders = new ArrayList<My_order>();
	
	
	@OneToOne(fetch = FetchType.LAZY)
	private Cart cart;


	public User() {
	}


	public List<My_order> getMy_orders() {
		return my_orders;
	}


	public void setMy_orders(List<My_order> my_orders) {
		this.my_orders = my_orders;
	}


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


	public String getSecondName() {
		return secondName;
	}


	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getTelephoneNomber() {
		return telephoneNomber;
	}


	public void setTelephoneNomber(String telephoneNomber) {
		this.telephoneNomber = telephoneNomber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}


	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
	
}
