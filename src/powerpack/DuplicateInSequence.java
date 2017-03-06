package powerpack;

import java.util.ArrayList;
import java.util.List;

public class DuplicateInSequence {
	public int findDuplicate(List<Integer> sequence) {
		int size = sequence.size()-1;
		int sum = getSum(sequence);
		int duplicate;
		duplicate = sum - (size*(size+1)/2);
		return duplicate;
	}
	public int getSum(List<Integer> seq) {
		int sum = 0;
		for (int num : seq) {
			sum += seq.get(num);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new  ArrayList<Integer>();
		for(int i =0; i<30;i++){
			list.add(i);
		}
		list.add(44);
		DuplicateInSequence duplicateInSequence = new DuplicateInSequence();
		System.out.println("the Duplicate Number is "+duplicateInSequence.findDuplicate(list));
	}
}
