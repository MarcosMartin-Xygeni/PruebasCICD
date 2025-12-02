public class ExampleClass {
  private Subject sub;
  private AccessControlContext ctx;

  public ExampleClass(Subject sub) {
    this.sub = sub;
  }

  public void execute(PrivilegedAction action) {
    Subject.doAsPrivileged(sub, action, ctx); // VIOLATION
  }

  public class Loader {

    public void loadLibrary(ExampleClass exec) {
      exec.execute(new PrivilegedAction() {
        public Object run() {
          System.loadLibrary("lib");
          return null;
        }
      });
    }
  }
}