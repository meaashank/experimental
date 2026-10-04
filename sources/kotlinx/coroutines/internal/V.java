package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f220319a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f220319a;
    }

    @Nullable
    public static final String b(@NotNull String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
