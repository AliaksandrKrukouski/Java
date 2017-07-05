package by.krukouski.train.test;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import by.krukouski.train.action.TrainCount;
import by.krukouski.train.exception.FileNotExistsException;
import by.krukouski.train.exception.InvalidWagonTypeException;
import by.krukouski.train.fileoperation.WagonFileReader;
import by.krukouski.train.train.Train;
import by.krukouski.train.train.TrainBuilder;

public class CountTrainSeatNumberTest {

	@Test
	public void test() throws IOException, FileNotExistsException, InvalidWagonTypeException {
		String testDataFilePath = "resource/CountTrainSeatNumberTest.txt";
		String testResultFilePath = "resource/CountTrainSeatNumberTestResult.txt";
		
		ArrayList<String> wagonListString = WagonFileReader.readFileIntoList(testDataFilePath);
		Train train = TrainBuilder.BuildTrainFromStringList(wagonListString);
		
		double expected = Double.parseDouble(WagonFileReader.readFileIntoList(testResultFilePath).get(0));
		double actual = TrainCount.countTrainSeatNumber(train);
		
		Assert.assertEquals(expected, actual, 0.01);
	}
}
