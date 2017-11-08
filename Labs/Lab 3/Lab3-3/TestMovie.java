
public class TestMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie.MPAArating mpaa;

		Movie one = new Movie("Logan");
		mpaa = Movie.MPAArating.R;

		one.addRating(5);
		one.addRating(4);
		one.addRating(3);
		one.addRating(2);
		one.addRating(1);
		// 15 / 5 = 3
		System.out.println("The movie " + one.getMovieName() + " is Rated " + mpaa.getRating()
				+ " and has an Average rating of: " + one.getAverage());

		Movie two = new Movie("Shin Godzilla");
		mpaa = Movie.MPAArating.valueOf("N");

		two.addRating(1);
		two.addRating(1);
		two.addRating(2);
		two.addRating(2);
		two.addRating(3);
		// 9 / 5 = 1.8
		System.out.println("The movie " + two.getMovieName() + " is Rated " + mpaa.getRating()
				+ " and has an Average rating of: " + two.getAverage());

		// for testing purposes
		// Movie.MPAArating mpaa = Movie.MPAArating.valueOf("N");
		// Movie.MPAArating mpaa1 = Movie.MPAArating.N;
		// String testmpaa = mpaa.getRating(); // string value from enum
		// String testmpaaAgain = mpaa.name(); // enum object

		// String testmpaa1 = mpaa1.getRating(); // string value from enum
		// String testmpaa1Again = mpaa1.name(); // enum object

		// System.out.println(testmpaa);
		// System.out.println(testmpaaAgain);
		// System.out.println(testmpaa1);
		// System.out.println(testmpaa1Again);

		// Movie.MPAArating test = Movie.MPAArating.N;
		// String test1 = test.name();
		// System.out.println(test.getRating());
	}
}
