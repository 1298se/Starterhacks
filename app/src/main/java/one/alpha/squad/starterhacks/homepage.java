package one.alpha.squad.starterhacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.snapchat.kit.sdk.bitmoji.ui.BitmojiIconFragment;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.icon_container /* The id of the icon container */, new BitmojiIconFragment())
                .commit();
    }
}
