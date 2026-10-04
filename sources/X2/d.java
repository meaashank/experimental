package x2;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f240479a = "StartupLogger";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f240480b = false;

    public static void a(@NonNull String str, @Nullable Throwable th) {
        Log.e(f240479a, str, th);
    }

    public static void b(@NonNull String str) {
        Log.i(f240479a, str);
    }

    public static void c(@NonNull String str) {
        Log.w(f240479a, str);
    }
}
