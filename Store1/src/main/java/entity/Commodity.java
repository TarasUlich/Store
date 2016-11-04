package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Commodity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@ManyToOne
	private Color color;
	
	@ManyToOne
	private Size size;
	
	@ManyToOne
	private Material material;
	
	
	@ManyToMany
	@JoinTable(name = "cart_commodity",
	joinColumns = @JoinColumn(name="id_commodity"),
	inverseJoinColumns = @JoinColumn(name="id_cart"))
	private List<Cart> carts = new ArrayList<Cart>();

	@ManyToOne
	private My_order my_order;
	
	public My_order getMy_order() {
		return my_order;
	}


	public void setMy_order(My_order my_order) {
		this.my_order = my_order;
	}


	public Commodity() {
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


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public Size getSize() {
		return size;
	}


	public void setSize(Size size) {
		this.size = size;
	}


	public Material getMaterial() {
		return material;
	}


	public void setMaterial(Material material) {
		this.material = material;
	}


	public List<Cart> getCarts() {
		return carts;
	}


	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}
	
	
	
}
