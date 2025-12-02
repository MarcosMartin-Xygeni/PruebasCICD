      public abstract class UserHomeAction {
        public void execute() {
          try {
            AccessController.checkPermission(new java.util.PropertyPermission("user.home", "read"));
            executeActionGranted();
          } catch (Exception e) {
            executeDefaultAction();
          }
        }

        protected abstract void executeDefaultAction();
        protected abstract void executeActionGranted();
      }