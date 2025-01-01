package com.springpractice.SpringBootRest.repo;

import com.springpractice.SpringBootRest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

}


//// method to return all JobPosts
//public List<JobPost> returnAllJobPosts() {
//	return jobs;
//}
//
//// method to save a job post object into arrayList
//public void addJob(JobPost job) {
//	jobs.add(job);
//
//}
//
//
//public JobPost getJob(int jobId) {
//	for(JobPost job : jobs){
//		if(job.getPostId() == jobId){
//			return job;
//		}
//	}
//
//	return null;
//}
//
//public void updateJob(JobPost jobPost) {
//	for(JobPost job : jobs){
//		if(job.getPostId() == jobPost.getPostId()){
//			job.setPostProfile(jobPost.getPostProfile());
//			job.setPostDesc(jobPost.getPostDesc());
//			job.setReqExperience(jobPost.getReqExperience());
//			job.setPostTechStack(jobPost.getPostTechStack());
//		}
//	}
//}
//
//public void deleteJob(int postId) {
//	for(JobPost job : jobs){
//		if(job.getPostId() == postId){
//			jobs.remove(job);
//		}
//	}
//}