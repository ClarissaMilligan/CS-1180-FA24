public class MovieRatingActivity
{
    public static void main(String[] args)
    {
        // initialize an array with the ratings for 3 movies
        int[][] movieRatings = { {3, 3, 5}, {7, 6, 9}, {10, 10, 10} };
        // initialize an array with the movie names
        String[] movieNames = {"Jaws", "Ghostbusters", "The LEGO Movie"};

        // initialize variables for the movie with the highest average rating
        double maxAvgRating = 0.0;
        int maxIndex = 0;

        // loop through each movie
        for (int i = 0; i < movieRatings.length; i++)
        {
            // find each movie's average rating
            double currAvg = findAvgReview(movieRatings[i]);

            // check if that average rating is higher than the max
            if (currAvg > maxAvgRating)
            {
                // update the max average rating if it is larger
                maxAvgRating = currAvg;
                maxIndex = i;
            }
        }
        // print out the result
        System.out.println(movieNames[maxIndex] + " is the movie with the highest average rating of " + maxAvgRating);

    }

    // method to find the average of all the values in an integer array
    // in this case, the array represents the ratings for a particular movie
    public static double findAvgReview (int[] movie)
    {
        // initialize the sum
        double sum = 0.0;

        // sum all the ratings
        for (int i : movie)
        {
            sum += i;
        }

        // return the average
        return sum / movie.length;
    }
}
