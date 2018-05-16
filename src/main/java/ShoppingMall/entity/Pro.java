package ShoppingMall.entity;

import org.springframework.web.multipart.MultipartFile;

public class Pro {
	private Long id;
	private String name;
	private String printUrl;
	private Long price;
	private String describe;
	private MultipartFile print;
	private Sort sort;

	public Pro(Long id, String name, String printUrl, Long price, String describe, MultipartFile print, Sort sort) {
		this.id = id;
		this.name = name;
		this.printUrl = printUrl;
		this.price = price;
		this.describe = describe;
		this.print = print;
		this.sort = sort;
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

	public String getPrintUrl() {
		return printUrl;
	}

	public void setPrintUrl(String printUrl) {
		this.printUrl = printUrl;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public MultipartFile getPrint() {
		return print;
	}

	public void setPrint(MultipartFile print) {
		this.print = print;
	}

	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "Pro [id=" + id + ", name=" + name + ", printUrl=" + printUrl + ", price=" + price + ", describe="
				+ describe + ", print=" + print + ", sort=" + sort + "]";
	}
}
