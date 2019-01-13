package one.alpha.squad.starterhacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.snapchat.kit.sdk.SnapLogin;

public class MainActivity extends AppCompatActivity {
    private ViewGroup mViewRoot;
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewRoot = findViewById(R.id.content);

        signInButton = (Button) findViewById(R.id.button);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SnapLogin.getAuthTokenManager(MainActivity.this).startTokenGrant();
            }
        });



    }
}
