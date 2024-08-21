package com.lcwd.RatingService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.RatingService.entity.Rating;
import com.lcwd.RatingService.repo.RatingRepo;
import com.lcwd.RatingService.service.RatingService;
@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	private RatingRepo ratingRepo;

	@Override
	public Rating createRating(Rating rating) {
	
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {


		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {


		return ratingRepo.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {


		return ratingRepo.findByHotelId(hotelId);
	}

}
