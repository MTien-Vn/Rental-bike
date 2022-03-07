package application.model;
// Generated Dec 4, 2021, 8:58:47 PM by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * EBike generated by hbm2java
 */
@Entity
@Table(name = "e_bike", schema = "public")
public class EBike implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int bikeCode;
	private Bike bike;
	private int bateryPercentage;
	private Integer usageTimeRemain;
	private Integer loadCycles;

	public EBike() {
	}

	public EBike(Bike bike, int bateryPercentage, Integer usageTimeRemain, Integer loadCycles) {
		this.bike = bike;
		this.bateryPercentage = bateryPercentage;
		this.usageTimeRemain = usageTimeRemain;
		this.loadCycles = loadCycles;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "bike"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "bike_code", unique = true, nullable = false)
	public int getBikeCode() {
		return this.bikeCode;
	}

	public void setBikeCode(int bikeCode) {
		this.bikeCode = bikeCode;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Bike getBike() {
		return this.bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	@Column(name = "batery_percentage", nullable = false)
	public int getBateryPercentage() {
		return this.bateryPercentage;
	}

	public void setBateryPercentage(int bateryPercentage) {
		this.bateryPercentage = bateryPercentage;
	}

	@Column(name = "usage_time_remain")
	public Integer getUsageTimeRemain() {
		return this.usageTimeRemain;
	}

	public void setUsageTimeRemain(Integer usageTimeRemain) {
		this.usageTimeRemain = usageTimeRemain;
	}

	@Column(name = "load_cycles")
	public Integer getLoadCycles() {
		return this.loadCycles;
	}

	public void setLoadCycles(Integer loadCycles) {
		this.loadCycles = loadCycles;
	}

}
