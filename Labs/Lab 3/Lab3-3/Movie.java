
public class Movie {

	private String movieName;
	private int terrible;
	private int bad;
	private int ok;
	private int good;
	private int great;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public enum MPAArating {
		G("G"), PG("PG"), PG13("PG13"), R("R"), N("NOTRATED");

		private final String rating;

		private MPAArating(String rating) {
			this.rating = rating;
		}

		public String getRating() {
			return rating;
		}
	}

	public int getTerrible() {
		return terrible;
	}

	public void setTerrible(int terrible) {
		this.terrible = terrible;
	}

	public int getBad() {
		return bad;
	}

	public void setBad(int bad) {
		this.bad = bad;
	}

	public int getOk() {
		return ok;
	}

	public void setOk(int ok) {
		this.ok = ok;
	}

	public int getGood() {
		return good;
	}

	public void setGood(int good) {
		this.good = good;
	}

	public int getGreat() {
		return great;
	}

	public void setGreat(int great) {
		this.great = great;
	}

	// default
	public Movie() {
		movieName = "";
		terrible = 0;
		bad = 0;
		ok = 0;
		good = 0;
		great = 0;

	}

	public Movie(String name) {
		movieName = name;
	}

	public void addRating(int rated) {
		if (rated > 0 || rated < 6) {
			switch (rated) {
			case 1:
				terrible++;
				break;
			case 2:
				bad++;
				break;
			case 3:
				ok++;
				break;
			case 4:
				good++;
				break;
			case 5:
				great++;
				break;
			}
		}
	}

	public double getAverage() {
		double averageRating = (terrible + 2 * bad + 3 * ok + 4 * good + 5 * great) / 5.0;
		return averageRating;
	}
}
