public abstract class SecurityPropertySetter {
  public SecurityPropertySetter(String val) {
    this.val = val;
  }

  private String val;

  public void activeProperty() {
    Security.setProperty("policy.provider", val); //VIOLATION
  }

}

public abstract class Execution {

  public abstract void execute();

  public static final void executeWithProperty(
      SecurityPropertySetter property, Execution exec) {
    property.activeProperty();
    exec.execute();
  }
}