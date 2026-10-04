package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import com.bytedance.sdk.component.utils.lp;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class TTBaseActivity extends Activity {
    protected boolean Mm = false;

    public void NOt(boolean z10) {
        this.Mm = z10;
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        if (Build.VERSION.SDK_INT < 33) {
            super.onPause();
            return;
        }
        try {
            super.onPause();
        } catch (IllegalArgumentException e10) {
            lp.ZRu("TTBaseActivity", "super.onPause(); run fail", e10);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e11) {
                lp.ZRu("TTBaseActivity", "onPause() set mCalled fail", e11);
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28 || i10 < 24) {
            super.onResume();
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e10) {
            lp.ZRu("TTBaseActivity", "super.onResume() run fail", e10);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e11) {
                lp.ZRu("TTBaseActivity", "onResume set mCalled fail", e11);
            }
        }
    }
}
