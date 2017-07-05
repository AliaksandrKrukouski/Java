package by.krukouski.train.test;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import by.krukouski.train.action.TrainSearch;
import by.krukouski.train.exception.FileNotExistsException;
import by.krukouski.train.exception.InvalidWagonTypeException;
import by.krukouski.train.fileoperation.WagonFileReader;
import by.krukouski.train.train.Train;
import by.krukouski.train.train.TrainBuilder;
import by.krukouski.train.wagon.Wagon;

public class SearchWagonBySeatNumberTest {

	@Test
	public void test() throws IOException, FileNotExistsException, InvalidWagonTypeException {
		String testDataFilePath = "resource/SearchWagonBySeatNumberTest.txt";
		String testResultFilePath = "resource/SearchWagonBySeatNumberTestResult.txt";
		
		ArrayList<String> expectedWagonListString = WagonFileReader.readFileIntoList(testResultFilePath);
		Train expectedTrain = TrainBuilder.BuildTrainFromStringList(expectedWagonListString);
		ArrayList<Wagon> expectedWagons = expectedTrain.getTrain();  
		
		ArrayList<String> actualWagonListString = WagonFileReader.readFileIntoList(testDataFilePath);
		Train actualTrain = TrainBuilder.BuildTrainFromStringList(actualWagonListString);
		ArrayList<Wagon> actualWagons = TrainSearch.searchWagonBySeatNumber(actualTrain, 10, 25);
		
		Object[] expectedArray = expectedWagons.toArray();
		Object[] actualArray = actualWagons.toArray();
		
		Assert.assertArrayEquals(expectedArray, actualArray);
	}
}
