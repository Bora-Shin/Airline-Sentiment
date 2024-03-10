import java.io.Serializable;
import java.util.List;


// creating JavaBean class 'Tweets'
public class Tweets implements Serializable {

    private String tweet_id;
    private String airline_sentiment;
    private double airline_sentiment_confidence;
    private String negativereason;
    private double negativereason_confidence;
    private String airline;
    private String airline_sentiment_gold;
    private String name;
    private String negativereason_gold;
    private int retweet_count;
    private String text;
    private String tweet_coord;
    private String tweet_created;
    private String tweet_location;
    private String user_timezone;


    // constructor
    public Tweets(){

    }

    // getters and setters


    public String getTweet_id() {
        return tweet_id;
    }

    public void setTweet_id(String tweet_id) {
        this.tweet_id = tweet_id;
    }

    public String getAirline_sentiment() {
        return airline_sentiment;
    }

    public void setAirline_sentiment(String airline_sentiment) {
        this.airline_sentiment = airline_sentiment;
    }

    public double getAirline_sentiment_confidence() {
        return airline_sentiment_confidence;
    }

    public void setAirline_sentiment_confidence(double airline_sentiment_confidence) {
        this.airline_sentiment_confidence = airline_sentiment_confidence;
    }

    public String getNegativereason() {
        return negativereason;
    }

    public void setNegativereason(String negativereason) {
        this.negativereason = negativereason;
    }

    public double getNegativereason_confidence() {
        return negativereason_confidence;
    }

    public void setNegativereason_confidence(double negativereason_confidence) {
        this.negativereason_confidence = negativereason_confidence;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getAirline_sentiment_gold() {
        return airline_sentiment_gold;
    }

    public void setAirline_sentiment_gold(String airline_sentiment_gold) {
        this.airline_sentiment_gold = airline_sentiment_gold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNegativereason_gold() {
        return negativereason_gold;
    }

    public void setNegativereason_gold(String negativereason_gold) {
        this.negativereason_gold = negativereason_gold;
    }

    public int getRetweet_count() {
        return retweet_count;
    }

    public void setRetweet_count(int retweet_count) {
        this.retweet_count = retweet_count;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTweet_coord() {
        return tweet_coord;
    }

    public void setTweet_coord(String tweet_coord) {
        this.tweet_coord = tweet_coord;
    }

    public String getTweet_created() {
        return tweet_created;
    }

    public void setTweet_created(String tweet_created) {
        this.tweet_created = tweet_created;
    }

    public String getTweet_location() {
        return tweet_location;
    }

    public void setTweet_location(String tweet_location) {
        this.tweet_location = tweet_location;
    }

    public String getUser_timezone() {
        return user_timezone;
    }

    public void setUser_timezone(String user_timezone) {
        this.user_timezone = user_timezone;
    }

    // toString()
    @Override
    public String toString() {
        return "Tweets{" +
                "tweet_id=" + tweet_id +
                ", airline_sentiment='" + airline_sentiment + '\'' +
                ", airline_sentiment_confidence=" + airline_sentiment_confidence +
                ", negativereason='" + negativereason + '\'' +
                ", negativereason_confidence=" + negativereason_confidence +
                ", airline='" + airline + '\'' +
                ", airline_sentiment_gold='" + airline_sentiment_gold + '\'' +
                ", name='" + name + '\'' +
                ", negativereason_gold='" + negativereason_gold + '\'' +
                ", retweet_count=" + retweet_count +
                ", text='" + text + '\'' +
                ", tweet_coord=" + tweet_coord +
                ", tweet_created='" + tweet_created + '\'' +
                ", tweet_location='" + tweet_location + '\'' +
                ", user_timezone='" + user_timezone + '\'' +
                '}';
    }
};



