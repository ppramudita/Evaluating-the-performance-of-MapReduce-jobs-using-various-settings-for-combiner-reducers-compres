// cc MaxTemperature Application to find the maximum temperature in the weather dataset
// vv MaxTemperature
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.io.compress.CompressionCodec;
import org.apache.hadoop.io.compress.GzipCodec;
import org.apache.hadoop.io.compress.SnappyCodec;

public class MaxTemperature {

  public static void main(String[] args) throws Exception {
    if (args.length != 2) {
      System.err.println("Usage: MaxTemperature <input path> <output path>");
      System.exit(-1);
    }
    
    Job job = new Job();
    job.setJarByClass(MaxTemperature.class);
    //job.setJobName("Max temperature");

    FileInputFormat.addInputPath(job, new Path(args[0]));
    FileOutputFormat.setOutputPath(job, new Path(args[1]));
    
    job.setMapperClass(MaxTemperatureMapper.class);
    job.setReducerClass(MaxTemperatureReducer.class);

    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(IntWritable.class);
  
    //Your job name
	String myjobname = "PP_Exp4-red8-comp-comb-off";
	//Change number in () to the number of reducers
  //Changed Reducers to 8
  job.setNumReduceTasks(8);
	
	//Compression logic
	//Uncomment the below to use Gzip compression
	
	//job.getConfiguration().setBoolean("mapreduce.map.output.compress", true);
	//job.getConfiguration().setClass("mapreduce.map.output.compress.codec",GzipCodec.class, CompressionCodec.class);
	
	// or Uncomment the below to use Snappy compression
	
	//job.getConfiguration().setBoolean("mapreduce.map.output.compress", true);
	//job.getConfiguration().setClass("mapreduce.map.output.compress.codec",SnappyCodec.class, CompressionCodec.class);
	
	// set each job name with parameters and your initials in the job object
	job.setJobName(myjobname);
    
    System.exit(job.waitForCompletion(true) ? 0 : 1);
  }
}
// ^^ MaxTemperature
