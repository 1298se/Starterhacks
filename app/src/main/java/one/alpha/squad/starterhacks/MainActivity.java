package one.alpha.squad.starterhacks;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.snapchat.kit.sdk.SnapLogin;
import com.snapchat.kit.sdk.bitmoji.ui.BitmojiIconFragment;
import com.snapchat.kit.sdk.core.controller.LoginStateController;

public class MainActivity extends AppCompatActivity {
    private Button signInButton;
    private ViewGroup mViewRoot;


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
                SnapLogin.getLoginStateController(getApplicationContext()).addOnLoginStateChangedListener(snapLoginListener);

            }
        });
    }
    private LoginStateController.OnLoginStateChangedListener snapLoginListener = new LoginStateController.OnLoginStateChangedListener() {

        @Override
        public void onLoginSucceeded() {
            Toast.makeText(MainActivity.this, "Logging Onto SnapChat...", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(), homepage.class));
        }

        @Override
        public void onLoginFailed() {
            Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onLogout() {
            Toast.makeText(MainActivity.this, "Logging Out of SnapChat", Toast.LENGTH_SHORT).show();

        }
    };
}
