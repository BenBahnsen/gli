package orm;

import exceptions.NoConnectionException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
  private static final Database db = new Database();
  final private List<Ticket> tickets = new ArrayList<>();
  final private List<Table> tables = new ArrayList<>();
  final private List<Tag> tags = new ArrayList<>();
  private String user;
  private String url = "jdbc:sqlite:mydatabase.db";

  private Database() {
  }

  private void initialize(Connection connection) throws SQLException {
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

  public static boolean connect() {
   try (Connection connection = DriverManager.getConnection(this.url)) {
            if (connection != null) {
                System.out.println("Connected to the database");

                // Initialize the database schema if needed
                initialize(connection);
            }
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
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
