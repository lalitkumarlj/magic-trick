package com.example.MagicTrick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class MagicTrickApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagicTrickApplication.class, args);
		new MagicTrickApplication().magic();
	}

	public void magic(){
		Scanner scanner = new Scanner(System.in);

		List <Integer> firstArray = new ArrayList<>();
		List<Integer> secondArray =new ArrayList<>();
		List<Integer> thirdArray = new ArrayList<>();
		List<Integer> randomNumberList = getMergedList();
//        (int)(Math.random()*(max-min+1)+min)

		System.out.println("Choose and remind any random number from the below list.");
		System.out.println(randomNumberList.toString()+"\n");
		System.out.println("\nPress ENTER to start the game.");
		scanner.nextLine();

		System.out.println("Select row where your select number exist");
		firstArray.clear();
		secondArray.clear();
		thirdArray.clear();
		for(int i=0;i<randomNumberList.size();i++){
			firstArray.add(randomNumberList.get(i));
			secondArray.add(randomNumberList.get(i+1));
			thirdArray.add(randomNumberList.get(i+2));
			i=i+2;
		}
		System.out.println("First Row (1) : "+firstArray.toString());
		System.out.println("Second Row (2) : "+secondArray.toString());
		System.out.println("Third Row (3) : "+thirdArray.toString()+"\n");

		System.out.print("Enter Row Number : ");
		int selectedRow = Integer.parseInt(scanner.nextLine());

		randomNumberList = getMergedList(selectedRow,firstArray,secondArray,thirdArray);
		System.out.println("-----------------------------------------------------------");

		System.out.println("Select row where your select number exist");
		firstArray.clear();
		secondArray.clear();
		thirdArray.clear();
		for(int i=0;i<randomNumberList.size();i++){
			firstArray.add(randomNumberList.get(i));
			secondArray.add(randomNumberList.get(i+1));
			thirdArray.add(randomNumberList.get(i+2));
			i=i+2;
		}
		System.out.println("First Row (1) : "+firstArray.toString());
		System.out.println("Second Row (2) : "+secondArray.toString());
		System.out.println("Third Row (3) : "+thirdArray.toString()+"\n");
		System.out.print("Enter Row Number : ");
		selectedRow = Integer.parseInt(scanner.nextLine());

		randomNumberList = getMergedList(selectedRow,firstArray,secondArray,thirdArray);
		System.out.println("-----------------------------------------------------------");

		System.out.println("Select row where your select number exist");
		firstArray.clear();
		secondArray.clear();
		thirdArray.clear();
		for(int i=0;i<randomNumberList.size();i++){
			firstArray.add(randomNumberList.get(i));
			secondArray.add(randomNumberList.get(i+1));
			thirdArray.add(randomNumberList.get(i+2));
			i=i+2;
		}
		System.out.println("First Row (1) : "+firstArray.toString());
		System.out.println("Second Row (2) : "+secondArray.toString());
		System.out.println("Third Row (3) : "+thirdArray.toString()+"\n");
		System.out.print("Enter Row Number : ");
		selectedRow = Integer.parseInt(scanner.nextLine());

		randomNumberList = getMergedList(selectedRow,firstArray,secondArray,thirdArray);
		System.out.println("-----------------------------------------------------------");

		System.out.println();
		System.out.println("Your selected Number is : "+randomNumberList.get(10));



	}
	public List getMergedList() {
		int min = 1;
		int max = 100;
		List<Integer> randomNumberList = new ArrayList<>();
		while (randomNumberList.size() < 21) {
			int number = (int) (Math.random() * (max - min + 1) + min);
			if (!randomNumberList.contains(number))
				randomNumberList.add(number);
		}
		return randomNumberList;
	}

	public List getMergedList(int selectedRow,List<Integer> firstList, List<Integer>secondList, List<Integer>thirdList){
		List<Integer> mergedList = new ArrayList<>();
		if(selectedRow == 1){
			mergedList = mergeAllList(secondList,firstList,thirdList);
		}
		else if(selectedRow == 2){
			mergedList = mergeAllList(firstList,secondList,thirdList);
		}
		else {
			mergedList = mergeAllList(firstList,thirdList,secondList);
		}
		return  mergedList;
	}
	public List<Integer> mergeAllList(List<Integer> firstList, List<Integer> secondList, List<Integer> thirdList){
		List<Integer> mergedList=new ArrayList<>();
		mergedList.addAll(firstList);
		mergedList.addAll(secondList);
		mergedList.addAll(thirdList);
		return mergedList;
	}

}
