package com.promounttest.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.promounttest.attempt.Attempt;
import com.promounttest.dbrepository.DBRepository;
import com.promounttest.inputdata.InputData;
import com.promounttest.result.Result;

@RestController
public class PromountTestController {

//	Result result = new Result();

	private static int totalNoofAttempt = 0;

	@Autowired
	private DBRepository dbRepository;

	@GetMapping("/totalNoofAttempt")
	public int getTotalofAttempt() {

		return totalNoofAttempt;

	}

	
	public Result getInputResult(@RequestBody  InputData inputData) {
		
		Attempt attempt = new Attempt();
		
		Result result = new Result();
		return result;
		
		
	}
	
	
	
	
	
	
	
	@PostMapping("/input")
	public void getInput(@RequestBody InputData inputData) {
		System.out.println(findAllTriplets(inputData.getNumber()));
	}

	public  List<List<Integer>> findAllTrippletsList(int[] nums) {
		
		Arrays.sort(nums);
		
		List<List<Integer>>  ans = new ArrayList<>();
		
		int n= nums.length;
		(int i=1; i<n-2; i++) {
			
			
			int low = i+1, high = n- 1, sum = 0 - nums[i] , mid;
			
			while(low<high)  {
				
				mid = nums[low] + nums[high];
				
				if(mid==sum) {
					
					ans.add(ArrayList<Integer>(nums[i], nums[low], nums[high]));
					
					low++;
					
					(low <high && nums[high] == nums[high-1])
					
					high--;
					low++;
					
					high--;
				}else if(mid > sum) {
					low++;
				}
				else {
					high--;
					
				}
				while(i + 1 < n && nums[i+1]==nums[i])
					
					i++;
			}
		}
		
		return ans;
	}

}
