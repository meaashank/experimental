package androidx.compose.foundation.text.handwriting;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f93602a;

    static {
        f93602a = Build.VERSION.SDK_INT >= 34;
    }

    public static final boolean a() {
        return f93602a;
    }
}
