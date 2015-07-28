package com.lotus.rest.domain;

import javax.xml.bind.annotation.XmlTransient;

public class Animal {
	private long id;
	private String name;
	private String species;
	private int energy;
	private boolean alive=true;
	
	public Animal(String name, String species, int energy, boolean alive) {
		super();
		this.name = name;
		this.species = species;
		this.energy = energy;
		this.alive = alive;
	}

	public Animal(long id, String name, String species, int energy, boolean alive) {
		super();
		this.id = id;
		this.name = name;
		this.species = species;
		this.energy = energy;
		this.alive = alive;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", species=" + species + ", energy=" + energy + ", alive="
				+ alive + "]";
	}

	@XmlTransient
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSpecies() {
		return species;
	}

	public int getEnergy() {
		return energy;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	
}
