package com.devwilliam.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	
	private Integer position;
	
	public Belonging() {
		
	}

	public Belonging( Game game,GameList list, Integer position) {
		
		id.setGame(game);
		id.setList(list);
		this.position = position;
	}

	public BelongingPK getId() {
		return id;
	}

	public void setId(BelongingPK id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}
	
	
}
