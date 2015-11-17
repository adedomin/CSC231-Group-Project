package edu.easternct.csc231.nationalparks.view;

import java.util.List;

/**
 * Report View Object
 *
 * @author Anthony DeDominic
 */
public class Report {

	public String title;
	public String imageLoc;
	public List<Comment> comments;
	public int overallRating;

	/**
	 *
	 */
	public Report() {
	}

	/**
	 * @param title
	 * @param imageLoc
	 * @param comments
	 * @param overallRating
	 */
	public Report(String title, String imageLoc, List<Comment> comments, int overallRating) {
		this.title = title;
		this.imageLoc = imageLoc;
		this.comments = comments;
		this.overallRating = overallRating;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the imageLoc
	 */
	public String getImageLoc() {
		return imageLoc;
	}

	/**
	 * @param imageLoc the imageLoc to set
	 */
	public void setImageLoc(String imageLoc) {
		this.imageLoc = imageLoc;
	}

	/**
	 * @return the comments
	 */
	public List<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	/**
	 * @return the overallRating
	 */
	public int getOverallRating() {
		return overallRating;
	}

	/**
	 * @param overallRating the overallRating to set
	 */
	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}
}
