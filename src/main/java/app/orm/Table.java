package orm;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class Table {
  private UUID id;
  private String name;

  public Table(String uuid, String name) {
    this.id = UUID.fromString(uuid);
    this.name = name;
  }

  public List<Ticket> getTickets() {
    return new ArrayList<Ticket>();
  }
}
