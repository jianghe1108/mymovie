package Back;

import com.webtest.core.WebDriverEngine;

public class AddMovie {
	public WebDriverEngine webtest;
    public String filmname;
    public String petname;
    public String director;
    public String editor;
    public String nation;
    public String language;
    public String showtime;
    public String minutes;
    public String picname;
	public String getFilmname() {
		return filmname;
	}
	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}
	public String getPetname() {
		return petname;
	}
	public void setPetname(String petname) {
		this.petname = petname;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getShowtime() {
		return showtime;
	}
	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}
	public String getMinutes() {
		return minutes;
	}
	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}
	public String getPicname() {
		return picname;
	}
	public void setPicname(String picname) {
		this.picname = picname;
	}
	public AddMovie(WebDriverEngine webtest) {
		this.webtest = webtest;
		
    }
	public void inputValues(String filmname,String petname,String director,String editor,String nation,
     String language,String showtime,String minutes,String picname) throws InterruptedException {
		Thread.sleep(3000);
	    webtest.click("xpath=.//*[@id='sidebar']/div[2]/div[5]/h2");
		webtest.click("xpath=.//*[@id='sidebar']/div[2]/div[6]/ul/li[1]/ul/li[2]/div/a/span");
		webtest.type("name=filmname", filmname);
		webtest.type("name=petname", petname);
		webtest.type("name=director", director);
		webtest.type("name=editor", editor);
		webtest.type("name=nation", nation);
		webtest.type("name=language", language);
		webtest.type("name=showtime", showtime);
		webtest.type("name=minutes", minutes);
		webtest.type("name=picname", picname);
		Thread.sleep(3000);
	    webtest.click("xpath=.//button[@type='submit']");
	} 
}
