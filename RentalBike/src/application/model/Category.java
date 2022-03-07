package application.model;
// Generated Dec 4, 2021, 8:58:47 PM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category", schema = "public")
public class Category implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int categoryCode;
	private String categoryName;
	private Integer baseFee;
	private Integer minuteFee;
	private Integer depositFee;
	private Float coefficient;
	private Set<Bike> bikes = new HashSet<Bike>(0);

	public Category() {
	}

	public Category(String categoryName, Integer baseFee, Integer minuteFee, Integer depositFee,
			Float coefficient, Set<Bike> bikes) {
		this.categoryName = categoryName;
		this.baseFee = baseFee;
		this.minuteFee = minuteFee;
		this.depositFee = depositFee;
		this.coefficient = coefficient;
		this.bikes = bikes;
	}

	@Id

	@Column(name = "category_code", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCategoryCode() {
		return this.categoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}

	@Column(name = "category_name")
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Column(name = "base_fee")
	public Integer getBaseFee() {
		return this.baseFee;
	}

	public void setBaseFee(Integer baseFee) {
		this.baseFee = baseFee;
	}

	@Column(name = "minute_fee")
	public Integer getMinuteFee() {
		return this.minuteFee;
	}

	public void setMinuteFee(Integer minuteFee) {
		this.minuteFee = minuteFee;
	}

	@Column(name = "deposit_fee")
	public Integer getDepositFee() {
		return this.depositFee;
	}

	public void setDepositFee(Integer depositFee) {
		this.depositFee = depositFee;
	}

	@Column(name = "coefficient", precision = 8, scale = 8)
	public Float getCoefficient() {
		return this.coefficient;
	}

	public void setCoefficient(Float coefficient) {
		this.coefficient = coefficient;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Bike> getBikes() {
		return this.bikes;
	}

	public void setBikes(Set<Bike> bikes) {
		this.bikes = bikes;
	}

}
