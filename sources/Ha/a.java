package Ha;

import android.annotation.TargetApi;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f50676a = 16;

    public static int a(int i10) {
        return (i10 & 65280) >> 8;
    }

    public static void b(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @TargetApi(16)
    public static void c(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
