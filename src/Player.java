import java.util.ArrayList;

public class Player implements User{
    private String username;
    private double accountMoney;
    private String nadimak;
    private ArrayList<BettingTicketLuckySix> tickets = new ArrayList<BettingTicketLuckySix>();

    public Player(String username, double accountMoney) {
        this.username = username;
        this.accountMoney = accountMoney;
        nadimak = username.substring(0,3);
    }

    public String getNadimak() {
        return nadimak;
    }

    public void setNadimak(String nadimak) {
        this.nadimak = nadimak;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    public double getAccountMoney() {
        return accountMoney;
    }
    public void setAccountMoney(double accountMoney) {
        this.accountMoney = accountMoney;
    }
    public ArrayList<BettingTicketLuckySix> getTickets() {
        return tickets;
    }
    public void setTickets(ArrayList<BettingTicketLuckySix> tickets) {
        this.tickets = tickets;
    }
    public void addTicket(BettingTicketLuckySix ticket) {
        this.tickets.add(ticket);
        this.accountMoney -= ticket.getTicketPrice();
        System.out.println("Stanje racuna je: " + this.accountMoney);
    }

    @Override
    public String toString() {
        return "Player{" +
                "username='" + username + '\'' +
                ", accountMoney=" + accountMoney +
                ", nadimak='" + nadimak + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}
