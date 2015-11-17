package edu.easternct.csc231.nationalparks.view;

/**
 * Comment object describing the body of the comment,
 * the user who submitted it
 * and the rating they gave
 *
 * @author Anthony DeDominic
 */
public class Comment {
	
	public String name;
	public String comment;
	public int rating;

	/**
	 *
	 */
	public Comment() {
	}

	/**
	 * @param name
	 * @param comment
	 * @param rating
	 */
	public Comment(String name, String comment, int rating) {
		this.name = name;
		this.comment = comment;
		this.rating = rating;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
}
