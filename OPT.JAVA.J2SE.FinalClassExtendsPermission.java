      import java.security.Permission;
            
      public class CustomPermission extends Permission { // VIOLATION
        public CustomPermission(String name, List properties) {
          super(name);
          this.properties = properties;
        }

        public boolean implies(Permission permission) {
          CustomPermission perm = (CustomPermission) permission;
          return perm.properties.containsAll(properties);
        }

        private List properties;
      }