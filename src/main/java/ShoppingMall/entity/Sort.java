package ShoppingMall.entity;

public class Sort {
	private Long id;
	private String name;

	public Sort(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sort [id=" + id + ", name=" + name + "]";
	}

}
