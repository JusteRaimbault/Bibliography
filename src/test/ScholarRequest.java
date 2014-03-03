/**
 * 
 */
package test;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import utils.Log;

/**
 * @author Raimbault Juste <br/> <a href="mailto:juste.raimbault@polytechnique.edu">juste.raimbault@polytechnique.edu</a>
 *
 */
public class ScholarRequest {
	
	/**
	 * Scholar Request for Constructor.
	 * 
	 * Separated from Article class -> pertinent ?
	 * 
	 * @param articleTitle
	 * @return
	 */
	public static String getArticleId(String articleTitle){
		try{
			//get title
			String path ="http://scholar.google.fr/scholar?q="+articleTitle.replaceAll(" ", "+");
			URLConnection con = new URL(path).openConnection();
	        con.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.117 Safari/537.36");
	        con.setRequestProperty("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");      
	        con.setReadTimeout(20000);
			org.jsoup.nodes.Document dom = Jsoup.parse(con.getInputStream(),"UTF-8",path);
			//get first result, should match pretty good title given
			Element r = dom.getElementsByClass("gs_r").first().getElementsByAttributeValueContaining("href", "scholar?cluster=").first();
			return r.attr("href").split("cluster")[1].split("&")[0].split("=")[1];
		}catch(Exception e){System.out.println("Error in getting id : "+e.toString());return "0";}
	}
	
	
	/**
	 * Get all quoting papers.
	 * 
	 * @param articleId
	 * @return List of quoting articles
	 */
	public static List<Article> getQuoting(int articleId){
		
		return null;
	}

}
