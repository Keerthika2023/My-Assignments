package week1.day2;
import java.util.Arrays;
public class SecondSmallestNumber {
	public static void main(String[] args) {
	int number[]={23,45,67,32,89,22};
	Arrays.sort(number);
	int n=number.length;
	System.out.println("Arrange in Assending order");
	for (int i=0;i<n;i++) {
		System.out.println(number[i]);}
	System.out.println("The second smallest number is "+number[1]);
}}



