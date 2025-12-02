public class Loader {
  public void loadLibrary(Execution exec) {
    exec.execute(new PrivilegedAction() {
      public Object run() {
        System.loadLibrary("lib");
        return null;
      }
    });
  }
}

public abstract class Execution {

  public Execution(Subject sub) {
    this.sub = sub;
  }

  private Subject sub;

  public void execute(PrivilegedAction action) {
    Subject.doAs(sub, action); //VIOLATION
  }

}