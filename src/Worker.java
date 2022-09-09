
public class Worker implements User{

    private String username;
    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    public Worker(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "username='" + username + '\'' +
                '}';
    }
}
