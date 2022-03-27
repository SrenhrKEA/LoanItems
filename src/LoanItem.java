public abstract class LoanItem {
  private final String title;
  private final String type;


  public String getTitle() {
    return title;
  }

  public String getType() {
    return type;
  }

  public LoanItem(String title, String type) {
    this.title = title;
    this.type = type;
  }
}


