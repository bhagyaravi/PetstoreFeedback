package petstorefeedback.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import petstorefeedback.entity.Feedback;
import petstorefeedback.model.FeedbackInput;
import petstorefeedback.repositories.FeedbackRepository;

@RestController
public class FeedbackApiController {
	@Autowired
	FeedbackRepository repository;

	@RequestMapping(value = "/createNewFeedback", method = RequestMethod.POST)
	public String createFeedback(@RequestBody FeedbackInput body) {
		
	    Feedback newFeedback = new Feedback();
	    Date d = new Date();
	    newFeedback.setId(repository.count()+1);
	    newFeedback.setCreatedTs(d.toString());
	    newFeedback.setFeedback(body.getFeedback());
	    newFeedback.setName(body.getName());
	    newFeedback.setRating(body.getRating());
	    repository.save(newFeedback);
	    
	    return String.valueOf(newFeedback.getId());
	}
	
	@GetMapping("/allFeedback")
	public List<Feedback> getFeedback() {
		return repository.findAll();
	}
	
	
}
