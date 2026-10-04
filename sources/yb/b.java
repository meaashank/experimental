package yb;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f241137a;

    @Nullable
    public static Context a() {
        return f241137a;
    }

    public static void b(@NonNull Context context) {
        f241137a = context.getApplicationContext();
    }
}
