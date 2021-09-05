package helloWorld.sample;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

import java.util.Arrays;
public class WordCount {
	
	    public static void main(String[] args) {

			 SparkConf sparkConf = new SparkConf().setMaster("local").setAppName("JD Word Counter");

		        JavaSparkContext sparkContext = new JavaSparkContext(sparkConf);

		        JavaRDD<String> inputFile = sparkContext.textFile("./input.txt");
		        
		        System.out.println(inputFile.count());
	    }
}
