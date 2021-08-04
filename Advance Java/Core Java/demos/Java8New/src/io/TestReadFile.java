package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class TestReadFile {

	public static void main(String args[]) {

		String fileName = "lines.txt";

		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName));BufferedWriter br=new BufferedWriter(new FileWriter(fileName,true)); Scanner scanner = new Scanner(new File(fileName))) {

			stream
			.filter(s->s.contains("Java"))
			.map(String::toUpperCase)
			.forEach(System.out::println);
			
			 //to write in file
			System.out.println("Enter data to write in file: ");

				while (scanner.hasNext()){
			//		System.out.println();
					br.write(scanner.nextLine());
				}

		} catch (IOException e) {
			e.printStackTrace();
		}

		//read file into stream, try-with-resources
				try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

					stream.forEach(System.out::println);

				} catch (IOException e) {
					e.printStackTrace();
				}

	}

}
