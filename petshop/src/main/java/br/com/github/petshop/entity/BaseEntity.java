package br.com.github.petshop.entity;

import java.text.MessageFormat;
import java.time.LocalDate;

public abstract class BaseEntity {
	private Integer id;
	protected LocalDate createdAt;
	
	public abstract LocalDate getCreatedDate();
	public abstract void setCreatedDate (LocalDate createdAT);
    
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return MessageFormat.format("Id: {0}", id);
	}
}

