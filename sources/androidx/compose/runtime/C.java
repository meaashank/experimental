package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
public final class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99001b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PersistentCompositionLocalMap f99002a;

    public C(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap) {
        this.f99002a = persistentCompositionLocalMap;
    }

    @NotNull
    public final PersistentCompositionLocalMap a() {
        return this.f99002a;
    }
}
