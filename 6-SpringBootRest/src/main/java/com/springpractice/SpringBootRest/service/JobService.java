package com.springpractice.SpringBootRest.service;

import com.springpractice.SpringBootRest.model.JobPost;
import com.springpractice.SpringBootRest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {



	@Autowired
	public JobRepo repo;

	//method to return all JobPosts
	public List<JobPost> getAllJobs() {
		return repo.findAll();

	}

	// method to add a jobPost
	public void addJob(JobPost jobPost) {
		 repo.save(jobPost);
	
	}

	public JobPost getJob(int jobId) {
		return repo.findById(jobId).orElse(new JobPost());
	}

	public void updateJob(JobPost jobPost) {
		repo.save(jobPost);
	}

	public void deleteJob(int postId) {
		repo.deleteById(postId);
	}

	public void load() {
		List<JobPost> jobs = new ArrayList<>(Arrays.asList(
				new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
						new ArrayList<>(List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"))),
				new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
						3, new ArrayList<>(List.of("HTML", "CSS", "JavaScript", "React")))
		));

		repo.saveAll(jobs);
	}

	public List<JobPost> search(String keyword) {
		return repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
	}
}
