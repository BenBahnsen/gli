package orm;

import java.text.MessageFormat;

public class Ticket {
  private String id;
  private String title;
  private String description;
  private boolean isDone;
  private Table table;
  private Tag tags;

  public Ticket(String title, String description, String tableId, boolean isDone) {
    this.title = title;
    this.description = description;
    this.isDone = isDone;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean isDone) {
    this.isDone = isDone;
  }

  @Override
  public String toString() {
    return MessageFormat.format("Title: {0},\nDescription: {1},\nisDone: {2}\n",
        this.title, this.description, this.isDone);
  }
}
