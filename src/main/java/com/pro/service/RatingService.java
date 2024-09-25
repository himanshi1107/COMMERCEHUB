package com.pro.service;

import java.util.List;

import com.pro.exception.ProductException;
import com.pro.model.Rating;
import com.pro.model.User;
import com.pro.request.RatingRequest;

public interface RatingService {

public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);
}
