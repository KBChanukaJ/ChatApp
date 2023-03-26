package pojos;
// Generated Mar 26, 2023 7:31:30 PM by Hibernate Tools 4.3.1



/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private Integer id;
     private String username;
     private String nickname;
     private String email;
     private byte[] profileImage;
     private String userType;
     private String password;

    public Users() {
    }

	
    public Users(String username, String nickname, String email, String userType, String password) {
        this.username = username;
        this.nickname = nickname;
        this.email = email;
        this.userType = userType;
        this.password = password;
    }
    public Users(String username, String nickname, String email, byte[] profileImage, String userType, String password) {
       this.username = username;
       this.nickname = nickname;
       this.email = email;
       this.profileImage = profileImage;
       this.userType = userType;
       this.password = password;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public byte[] getProfileImage() {
        return this.profileImage;
    }
    
    public void setProfileImage(byte[] profileImage) {
        this.profileImage = profileImage;
    }
    public String getUserType() {
        return this.userType;
    }
    
    public void setUserType(String userType) {
        this.userType = userType;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


