package com.lcwd.RatingService.service;

import java.util.List;

import com.lcwd.RatingService.entity.Rating;

public interface RatingService {

	Rating createRating(Rating rating);
	List<Rating> getAllRatings();
	List<Rating> getRatingByUserId(String userId);
	List<Rating> getRatingByHotelId(String hotelId);
}
