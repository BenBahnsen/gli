package orm;

import exceptions.NoConnectionException;
import java.util.ArrayList;
import java.util.List;

public class Database {
  private static final Database db = new Database();
  final private List<Ticket> tickets = new ArrayList<>();
  final private List<Table> tables = new ArrayList<>();
  final private List<Tag> tags = new ArrayList<>();
  private String adress;
  private String user;

  private Database() {
  }

  public void initialize(String adress, String user) {
    this.adress = adress;
    this.user = user;
    try {
      this.synchronize();
    } catch (NoConnectionException e) {
      System.err.println("Could not connect to database!");
    }
  }

  public static Database getInstance() {
    return db;
  }

  private boolean connect() {
    // this.tickets.add(null);
    return true;
  }

  private void pullTickets() throws NoConnectionException {
    this.tickets.clear();
  }

  private void pullTables() throws NoConnectionException {
    this.tables.clear();
  }

  private void pullTags() throws NoConnectionException {
    this.tags.clear();
  }

  public void synchronize() throws NoConnectionException {
    this.pullTags();
    this.pullTickets();
    this.pullTables();
  }

  public void reloadDatabase() {
  }

  public void createDatabase() {
  }
}
