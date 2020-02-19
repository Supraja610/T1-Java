package com.cts.training.hibernatemapping.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.training.hibernatemapping.HibernateMappingApplication;
import com.cts.training.hibernatemapping.entity.Course;
import com.cts.training.hibernatemapping.entity.Review;
@RunWith(SpringRunner.class)
@SpringBootTest(classes=HibernateMappingApplication.class)

public class ReviewDaoTest {
	
	@Autowired
	private CourseDao courseDao;
	
	@Autowired
	private ReviewDao reviewDao;



@Test
 public void testaddReviewAndCourse() {
	Review review = new Review();
	review.setReview("excellent");
	Course course = new Course();
	course.setName("Java");
	
	Review added = this.reviewDao.addReviewAndCourse(review, course);
	assertEquals("Java", added.getCourse().getName());
	
}
@Test
public void testAddReviewToExistingCourse() {
	Course course=this.courseDao.findById(1);
	Review review = new Review();
	review.setReview("average");
	Review added = this.reviewDao.addReviewtoExistingCourse(review, course);
	assertEquals("average", added.getReview());
	
}

}