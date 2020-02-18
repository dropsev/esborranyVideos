
import java.util.Date;
import java.util.List;

public class User {
	
    	private int id;
    	private String name;
    	private String surname;
    	private String password;
    	private Date registerDate;
    	private List<Video> videos;  //cria uma lista onde dentro só há videos//


    	//right click / source / generate constructor using Fields

    	public User(int id, String name, String surname, String password, Date registerDate, List<Video> videos) {
				super();
				this.id = id;
				this.name = name;
				this.surname = surname;
				this.password = password;
				this.registerDate = registerDate;
				this.videos = videos;
				
				
			//right click / source / generate Getters and Setters
				
			}



			public int getId() {
				return id;
			}



			public void setId(int id) {
				this.id = id;
			}



			public String getName() {
				return name;
			}



			public void setName(String name) {
				this.name = name;
			}



			public String getSurname() {
				return surname;
			}



			public void setSurname(String surname) {
				this.surname = surname;
			}



			public String getPassword() {
				return password;
			}



			public void setPassword(String password) {
				this.password = password;
			}



			public Date getRegisterDate() {
				return registerDate;
			}



			public void setRegisterDate(Date registerDate) {
				this.registerDate = registerDate;
			}



			public List<Video> getVideos() {
				return videos;
			}



			public void setVideos(List<Video> videos) {
				this.videos = videos;
			}


        
    }

