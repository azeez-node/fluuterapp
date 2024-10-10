package com.apna.bazar

import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.android.FlutterFragmentActivity
import com.singular.flutter_sdk.SingularBridge;
import android.content.Intent;

class MainActivity: FlutterFragmentActivity() {

override fun onNewIntent(intent: Intent) {
  super.onNewIntent(intent)
  SingularBridge.onNewIntent(intent);
}

}
