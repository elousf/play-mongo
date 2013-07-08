package entity;

import java.util.List;

import javax.persistence.Id;
import play.modules.mongodb.jackson.KeyTyped;


public class Fish implements KeyTyped<String> {
	@Id
	private String fishId; 
	private String name;
	private String latin;
	private List<Integer> sizeRangeMillimeter;
	private String image;
	
	public String getFishId() {
		return fishId;
	}
	public void setFishId(String fishId) {
		this.fishId = fishId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLatin() {
		return latin;
	}
	public void setLatin(String latin) {
		this.latin = latin;
	}
	public List<Integer> getSizeRangeMillimeter() {
		return sizeRangeMillimeter;
	}
	public void setSizeRangeMillimeter(List<Integer> sizeRangeMillimeter) {
		this.sizeRangeMillimeter = sizeRangeMillimeter;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
