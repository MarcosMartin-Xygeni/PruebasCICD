      
      public class Action {
        public Action(Permission perm) {
          this .rootPermission = perm;
        }
        private Permission rootPermission;
        public void execute(CustomPermission permission) {
          if (rootPermission.implies(permission)) {
            //...
          }
        }
      }

      public final class CustomPermission extends BasicPermission {
        public CustomPermission(String name,List properties) {
          super(name);
          this .properties = properties;
        }
        public boolean implies(Permission permission) {
          CustomPermission perm = (CustomPermission) permission;
          return perm.properties.containsAll(properties);
        }
        private List properties;
      }