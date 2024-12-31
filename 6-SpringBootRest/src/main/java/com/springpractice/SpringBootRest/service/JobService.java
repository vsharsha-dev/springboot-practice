package com.springpractice.SpringBootRest.service;

import com.springpractice.SpringBootRest.model.JobPost;
import com.springpractice.SpringBootRest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
	@Autowired
	public JobRepo repo;
	
	
	
	//method to return all JobPosts
	public List<JobPost> getAllJobs() {
		return repo.returnAllJobPosts();
	}
	
	// method to add a jobPost
	public void addJobPost(JobPost jobPost) {
		 repo.addJobPost(jobPost);
	
	}


    public JobPost getJob(int i) {
		return repo.getJob(i);
    }

	public void updateJob(JobPost jobPost) {
		repo.updateJob(jobPost);
	}

	public void deleteJob(int postId) {
		repo.deleteJob(postId);
	}
}
