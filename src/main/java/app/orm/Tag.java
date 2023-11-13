package orm;

import java.util.UUID;

public class Tag {
  private final UUID id;
  private final String name;

  public Tag(String id, String name) {
    this.id = UUID.fromString(id);
    this.name = name;
  }
}
