package com.crawling;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter @Setter
@Entity @ToString
public class Price {
	@Id
	@GeneratedValue
	@Column(name = "PRICE_ID")
	private Long id;
	private String name;
	private int price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INTERPARK_ID")
	private InterPark interpark;

	public Price(Long id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
