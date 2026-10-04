package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: androidx.core.app.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C2389l {
    @Nullable
    @e.S(expression = "bundle.getBinder(key)")
    @Deprecated
    public static IBinder a(@NonNull Bundle bundle, @Nullable String str) {
        return bundle.getBinder(str);
    }

    @e.S(expression = "bundle.putBinder(key, binder)")
    @Deprecated
    public static void b(@NonNull Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
