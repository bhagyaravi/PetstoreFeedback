package petstorefeedback.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import petstorefeedback.entity.Feedback;


public interface FeedbackRepository extends MongoRepository<Feedback,Integer> {

}
