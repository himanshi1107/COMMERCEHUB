package com.pro.service;

import java.util.List;

import com.pro.exception.ProductException;
import com.pro.model.Review;
import com.pro.model.User;
import com.pro.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
}
