package cs181;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
   
public class Mapper1 extends Mapper<LongWritable, Text, Text, Text> {      
		
	/*
	 * TODO - Implement the map function, where each call to the function receives
	 * just 1 line from the input files. Recall, we had two input files feed-in to
	 * our map reduce job, both the adjacency matrix and the vector file. This, our
	 * code must contain some logic to differentiate between the two inputs, and
	 * output the appropriate key-value pair.
	 * 
	 * Input : Adjacency Matrix Format -> M \t i \t j \t value 
	 * Vector Format -> V \t j \t value
	 * 
	 * Output : Key-Value Pairs Key -> j Value -> M \t i \t value or V \t value
	 */

	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException { 
		
		// parse the input to a list of strings
		String input  = value.toString();
		String[] indicesAndValue = input.split("\t"); // tab delimited
	
		// if the first value in indicesAndValue is "M", output (k ,  (i, a_ik)) 
		if(indicesAndValue[0].equals("M")) {
			context.write(new Text(indicesAndValue[2]), new Text("M" + "\t" + indicesAndValue[1] + "\t" + indicesAndValue[3]));
		}else {
		// if the first value in indicesAndValue is "V", output ( k ,  ( v_k) )
			context.write(new Text(indicesAndValue[1]), new Text("V" + "\t" + indicesAndValue[2]));
		}
	}
}
