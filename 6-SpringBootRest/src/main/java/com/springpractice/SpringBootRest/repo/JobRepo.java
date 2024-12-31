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
			new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2, List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
			new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3, List.of("HTML", "CSS", "JavaScript", "React"))
	));

	// ****************************************************************************

	// constructor->injecting objects into ArrayList defined above.
	public JobRepo() {

//		// Java Developer Job Post
//		jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//				new ArrayList<>(List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"))));
//
//		// Frontend Developer Job Post
//		jobs.add(new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
//						3, new ArrayList<>(List.of("HTML", "CSS", "JavaScript", "React"))));

	}


	// method to return all JobPosts
	public List<JobPost> returnAllJobPosts() {
		return jobs;
	}

	// method to save a job post object into arrayList
	public void addJobPost(JobPost job) {
		jobs.add(job);

	}


    public JobPost getJob(int postId) {
		for(JobPost job : jobs){
			if(job.getPostId() == postId){
				return job;
			}
		}
		return null;
    }

	public void updateJob(JobPost jobPost) {
		for(JobPost jobPost1 : jobs){
			if(jobPost1.getPostId() == jobPost.getPostId()){
				jobPost1.setPostProfile(jobPost.getPostProfile());
				jobPost1.setPostDesc(jobPost.getPostDesc());
				jobPost1.setReqExperience(jobPost.getReqExperience());
				jobPost1.setPostTechStack(jobPost.getPostTechStack());
			}
		}
	}

	public void deleteJob(int postId) {
		for(JobPost jobPost : jobs){
			if(jobPost.getPostId() == postId){
				jobs.remove(jobPost);
			}
		}
	}
}
