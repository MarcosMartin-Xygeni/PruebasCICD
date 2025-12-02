public abstract class ChangeProperties {

  public ChangeProperties() {
    manager = System.getSecurityManager(); //VIOLATION
  }

  public void execute() {
    if (manager != null) { //VIOLATION
      manager.checkPropertiesAccess(); //VIOLATION
      changeProperties();
    }
    else {
      throw new UnsupportedOperationException();
    }
  }

  protected abstract void changeProperties();

  private SecurityManager manager = null; //VIOLATION
}