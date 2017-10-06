package cs181;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
 
public class Reducer1 extends Reducer<Text, Text, Text, Text> {

	/* TODO - Implement the reduce function. 
	 * 
	 * 
	 * Input :    Adjacency Matrix Format       ->	( j   ,   M  \t  i	\t value 
	 * 			  Vector Format					->	( j   ,   V  \t   value )
	 * 
	 * Output :   Key-Value Pairs               
	 * 			  Key ->   	i
	 * 			  Value -> 	M_ij * V_j  
	 * 						
	 */

	public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
			
		// local variables used to store vector value and matrix values corresponding to column number
		double vVal = 0;
		ArrayList<String> mList = new ArrayList<String> ();
		
		// Loop through values, to add m_ij term to mList and save v_j to variable v_j
		for(Text val: values) {
			String input  = val.toString();
			String[] valueList = input.split("\t"); // tab delimited
			
			if(valueList.length == 2) {
				vVal += Double.parseDouble(valueList[1]);
			}else {
				mList.add(valueList[1] + "\t" + valueList[2]);
			}
		}
		
		// Then Iterate through the terms in mList, to multiply each term by variable v_j.
		for(String mval: mList) {
			String[] mvalList = mval.split("\t");
			Double product = Double.parseDouble(mvalList[1]) * vVal;
			
			// Each output is a key-value pair  ( i  ,   m_ij * v_j)
			context.write(new Text(mvalList[0]), new Text(Double.toString(product)));
		}
	}

}
