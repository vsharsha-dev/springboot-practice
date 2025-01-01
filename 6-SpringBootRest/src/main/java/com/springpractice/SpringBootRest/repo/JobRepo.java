package com.springpractice.SpringBootRest.repo;

import com.springpractice.SpringBootRest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

	// arrayList to store JobPost objects
	List<JobPost> jobs = new ArrayList<>(Arrays.asList(
			new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
					new ArrayList<>(List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"))),
			new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
					3, new ArrayList<>(List.of("HTML", "CSS", "JavaScript", "React")))
	));

	// method to return all JobPosts
	public List<JobPost> returnAllJobPosts() {
		return jobs;
	}

	// method to save a job post object into arrayList
	public void addJob(JobPost job) {
		jobs.add(job);

	}


	public JobPost getJob(int jobId) {
		for(JobPost job : jobs){
			if(job.getPostId() == jobId){
				return job;
			}
		}

		return null;
	}

	public void updateJob(JobPost jobPost) {
		for(JobPost job : jobs){
			if(job.getPostId() == jobPost.getPostId()){
				job.setPostProfile(jobPost.getPostProfile());
				job.setPostDesc(jobPost.getPostDesc());
				job.setReqExperience(jobPost.getReqExperience());
				job.setPostTechStack(jobPost.getPostTechStack());
			}
		}
	}

	public void deleteJob(int postId) {
		for(JobPost job : jobs){
			if(job.getPostId() == postId){
				jobs.remove(job);
			}
		}
	}
}
