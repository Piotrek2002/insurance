package model;

public class User {

    private long id;
    private String nick;
    private String login;
    private String password;
    private String insertTime;

    public User(long id, String nick, String login, String password, String insertTime) {
        this.id = id;
        this.nick = nick;
        this.login = login;
        this.password = password;
        this.insertTime = insertTime;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nick='" + nick + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", insertTime='" + insertTime + '\'' +
                '}';
    }
}
