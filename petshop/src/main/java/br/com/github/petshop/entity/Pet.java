package br.com.github.petshop.entity;

import java.text.MessageFormat;
import java.time.LocalDate;

public class Pet extends BaseEntity {
	private String name;
	private String type;
	private String observations;
	private String photo;
	
	@Override
	public LocalDate getCreatedDate() {
		return createdAt;
	}
	
	@Override
	public void setCreatedDate(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the observations
	 */
	public String getObservations() {
		return observations;
	}

	/**
	 * @param observations the observations to set
	 */
	public void setObservations(String observations) {
		this.observations = observations;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return MessageFormat.format("Name: (1), Type: (2), Observations: (3)", name, type, observations);
	}
}
