package one.alpha.squad.starterhacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import com.snapchat.kit.sdk.SnapLogin

public class MainActivity extends AppCompatActivity {
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signInButton = SnapLogin.getButton(getApplicationContext(), (ViewGroup)mViewRoot);;

    }
}
