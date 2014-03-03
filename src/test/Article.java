/**
 * 
 */
package test;

import java.util.List;

/**
 * @author Raimbault Juste <br/> <a href="mailto:juste.raimbault@polytechnique.edu">juste.raimbault@polytechnique.edu</a>
 *
 */
public class Article {
	
	/**
	 * Scholar id (unique)
	 */
	public String id;
	
	/**
	 * Full title
	 */
	public String title;
	
	/**
	 * List of authors
	 */
	public List<String> authors;
	
	/**
	 * Indirect constructor.
	 * 
	 * Called when have only title : request to scholar
	 * 
	 * @param title
	 */
	public Article(String title){
		
	}
	
}
