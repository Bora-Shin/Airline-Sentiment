
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;


import java.util.Collections;


public class AirlineSentiment {



    public static void main(String[] args) {

        System.setProperty("hadoop.home.dir", "C:/winutils");

        // Creating SparkSession instead of SparkConf since I'm using Spark >=2
        SparkSession spark = SparkSession.builder()
                .appName("Airline Sentiment")
                .master("local[4]") // Use local mode and 4 threads
                .config("spark.executor.memory", "1g")
                .getOrCreate();

        Tweets tweet = new Tweets();
        Encoder<Tweets> tweetsEncoder = Encoders.bean(Tweets.class);

        Dataset<Tweets> javaBeanDS = spark.read()
                .option("header", "true")
                .option("inferSchema", "true")
                .csv("./archive/Tweets.csv")
                .as(tweetsEncoder);

        javaBeanDS.show();
    }

}
