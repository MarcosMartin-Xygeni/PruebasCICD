public class Initializer {
  public Initializer() {
  super();
  }

  public void initialize() throws AccessControlException {
    AccessController.doPrivileged(new PrivilegedAction() {
      public Object run() {
        System.loadLibrary("library");//$NON-NLS-1$
        return null;
      }
    });
  }
}