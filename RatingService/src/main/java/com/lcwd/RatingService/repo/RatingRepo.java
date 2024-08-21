package com.lcwd.RatingService.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lcwd.RatingService.entity.Rating;

public interface RatingRepo extends MongoRepository<Rating, String>{
	
	List<Rating> findByUserId(String userId);
	
	List<Rating> findByHotelId(String hotelId);

}
