package com.example.Employee_Management.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="rating")
public class RatingEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long rating_id;
	private int rating;
	public long getRating_id() {
		return rating_id;
	}
	public void setRating_id(long rating_id) {
		this.rating_id = rating_id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}