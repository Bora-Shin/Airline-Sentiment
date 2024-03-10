
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;

public class AirlineSentiment {



    public static void main(String[] args) {

        System.setProperty("hadoop.home.dir", "C:/winutils");

        // Creating SparkSession instead of SparkConf since I'm using Spark >=2
        SparkSession spark = SparkSession.builder()
                .appName("Airline Sentiment")
                .master("local[4]") // Use local mode and 4 threads
                .config("spark.executor.memory", "1g")
                .getOrCreate();

        // creating tweets dataset using encoder
        Tweets tweet = new Tweets();
        Encoder<Tweets> tweetsEncoder = Encoders.bean(Tweets.class);

        Dataset<Tweets> tweetsDS = spark.read()
                .option("header", "true")
                .option("inferSchema", "true")
                .csv("./archive/Tweets.csv")
                .as(tweetsEncoder);

        // creating tweets dataset using encoder
        Geonames geonames = new Geonames();
        Encoder<Geonames> geonamesEncoder = Encoders.bean(Geonames.class);

        Dataset<Geonames> geonamesDS = spark.read()
                .json("./archive/geonames-all-cities-with-a-population-1000.json")
                .as(geonamesEncoder);

        geonamesDS.show();


//        // creating geonames dataset
//        Dataset<Row> geonamesDS = spark.read()
//                .option("header", "true")
//                .option("sep", ";") // reference: https://spark.apache.org/docs/latest/sql-data-sources-load-save-functions.html
//                .option("inferSchema", "true")
//                .csv("./archive/geonames-all-cities-with-a-population-1000.csv");
//
//        geonamesDS.show();

//        tweetsDS.join(geonamesDS, tweetsDS.col("tweet_location").equalTo(geonamesDS.col("Name")).or(tweetsDS.col("tweet_location").equalTo(geonamesDS.col("ASCII Name")).or(tweetsDS.col("tweet_location").equalTo(geonamesDS.col("Alternate Names")))), "left_outer")
//                .select(tweetsDS.col("*"), geonamesDS.col("Coordinates"))
//                .show();

//        tweetsDS.map((MapFunction<Tweets, Geonames>) t -> {
//           if((t.getTweet_coord()).equals(geonamesDS.col("Coordinates")))
//               t.setTweet_location(geonamesDS.col("Name"));
//        });

    }

}
