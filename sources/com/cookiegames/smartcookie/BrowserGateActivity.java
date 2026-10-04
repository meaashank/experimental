package com.cookiegames.smartcookie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
public final class BrowserGateActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f140688a = 8;

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            i.f141335i.getClass();
            if (i.f141338l.t()) {
                Intent intent = new Intent(getIntent());
                intent.setClass(this, MainActivity.class);
                intent.addFlags(268435456);
                startActivity(intent);
            } else {
                Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(335544320);
                    startActivity(launchIntentForPackage);
                }
            }
        } catch (Exception unused) {
        }
        finish();
    }
}
