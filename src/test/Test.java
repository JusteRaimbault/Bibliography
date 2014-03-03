/**
 * 
 */
package test;

import utils.Log;

/**
 * @author Raimbault Juste <br/> <a href="mailto:juste.raimbault@polytechnique.edu">juste.raimbault@polytechnique.edu</a>
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Log.initLog();Log.output("Test for Bib mapping.");Log.output("Args : "+args);
		ScholarRequest.getArticleId("Quantifying Information Flow During Emergencies");
		
	}

}
