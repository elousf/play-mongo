package util;

import net.vz.mongodb.jackson.JacksonDBCollection;
import play.modules.mongodb.jackson.MongoDB;
import entity.Fish;


public class MongoUtil {
	public static Fish getFish(String fishId) {
		JacksonDBCollection<Fish, String> fishes = MongoDB.getCollection("fakeFish", Fish.class);
		Fish dao = fishes.findOneById(fishId);
		return dao;
	}

}
