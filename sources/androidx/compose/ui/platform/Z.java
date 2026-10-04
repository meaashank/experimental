package androidx.compose.ui.platform;

import android.content.ClipData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f103770b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ClipData f103771a;

    public Z(@NotNull ClipData clipData) {
        this.f103771a = clipData;
    }

    @NotNull
    public final ClipData a() {
        return this.f103771a;
    }

    @NotNull
    public final C2225a0 b() {
        return new C2225a0(this.f103771a.getDescription());
    }
}
