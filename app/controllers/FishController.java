package controllers;

import java.util.LinkedHashMap;

import org.codehaus.jackson.map.ObjectMapper;

import play.mvc.Content;
import play.mvc.Controller;
import play.mvc.Result;
import util.MongoUtil;
import entity.Fish;


public class FishController extends Controller {
	public static Result showFish(String fishId) {
		Content html = views.html.showFish.render(fishId);
		return ok(html);
	}

	public static Result getFish(String fishId) {
		Fish fish = MongoUtil.getFish(fishId);
		
		String jsonString = "";
		LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
		if (fish != null) {
			result.put("fishId", fish.getFishId());
			result.put("name", fish.getName());
			result.put("latin", fish.getLatin());
			result.put("sizeRangeMillimeter", fish.getSizeRangeMillimeter());
			ObjectMapper om = new ObjectMapper();
			try {
				jsonString = om.writeValueAsString(result);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		
		return ok(jsonString).as("application/json");
	}
}
