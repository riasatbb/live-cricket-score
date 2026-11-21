package com.riasatbb.livecricketscore.control;

import android.graphics.Color;
import android.os.Bundle;
import androidx.core.view.WindowCompat;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // StatusBar overlay OFF: opt the window out of edge-to-edge (Android 15
        // enforces edge-to-edge for targetSdk 35) so the WebView is laid out
        // below the status bar and no web content can slide under it.
        WindowCompat.setDecorFitsSystemWindows(getWindow(), true);
        // Opaque black status bar to match the app's dark UI.
        getWindow().setStatusBarColor(Color.BLACK);
    }
}
