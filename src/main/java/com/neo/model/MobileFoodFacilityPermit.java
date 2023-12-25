package com.neo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "mobile_food_facility_permit")
public class MobileFoodFacilityPermit {

	@Id
	@Column(name = "locationid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long locationid;

	@Column(name = "Applicant")
	private String applicant;

	@Column(name = "FacilityType")
	private String facilityType;

	@Column(name = "cnn")
	private int cnn;

	@Column(name = "LocationDescription")
	private String locationDescription;

	@Column(name = "Address")
	private String address;

	@Column(name = "blocklot")
	private int blocklot;

	@Column(name = "block")
	private int block;

	@Column(name = "lot")
	private String lot;

	@Column(name = "permit")
	private String permit;

	@Column(name = "Status")
	private String Status;

	@Column(name = "FoodItems")
	private String FoodItems;

	@Column(name = "X")
	private Double x;

	@Column(name = "Y")
	private Double y;

	@Column(name = "Latitude")
	private Double latitude;

	@Column(name = "Longitude")
	private Double longitude;

	@Column(name = "Schedule")
	private String schedule;

	@Column(name = "dayshours")
	private String dayshours;

	@Column(name = "NOISent")
	private String nOISent;

	@Column(name = "Approved")
	private String approved;

	@Column(name = "Received")
	private String received;

	@Column(name = "PriorPermit")
	private int priorPermit;

	@Column(name = "ExpirationDate")
	private String expirationDate;

	@Column(name = "Location")
	private String location;

	@Column(name = "Fire")
	private int fire;

	@Column(name = "Fire_Prevention_Districts")
	private int firePreventionDistricts;

	@Column(name = "Police_Districts")
	private int policeDistricts;

	@Column(name = "Supervisor_Districts")
	private int supervisorDistricts;

	@Column(name = "Zip_Codes")
	private int zipCodes;

	@Column(name = "Neighborhoods")
	private int neighborhoods;
	public MobileFoodFacilityPermit() {

	}

/*
	public MobileFoodFacilityPermit(String title, String description, boolean published) {
		this.title = title;
		this.description = description;
		this.published = published;
	}
*/

}
