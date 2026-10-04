package androidx.compose.ui.platform;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2278s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f103926d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f103927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Object f103928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C1 f103929c = new C1();

    @Nullable
    public final String a() {
        return this.f103927a;
    }

    @NotNull
    public final C1 b() {
        return this.f103929c;
    }

    @Nullable
    public final Object c() {
        return this.f103928b;
    }

    public final void d(@Nullable String str) {
        this.f103927a = str;
    }

    public final void e(@Nullable Object obj) {
        this.f103928b = obj;
    }
}
