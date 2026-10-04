package androidx.compose.ui.platform;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class K {
    public static final boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
