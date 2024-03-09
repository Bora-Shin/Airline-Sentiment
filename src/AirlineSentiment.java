import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;


public class AirlineSentiment {

    Tweets tweet = new Tweets();


    Encoder<Tweets> tweetsEncoder = Encoders.bean(Tweets.class);


}
