import android.content.Context;

public class MainActivity extends Activity {

    private void doSomething(Context context) {
        if (!context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {     // VIOLATION
            return;
        }

        if (!context.checkCallingOrSelfUriPermission(uri, 1) == 0) {     // VIOLATION
            return;
        }
    }
}