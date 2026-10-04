package androidx.window.layout;

import android.app.Activity;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.window.layout.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@T(24)
public final class C2715b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2715b f120139a = new C2715b();

    public final boolean a(@NotNull Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        return activity.isInMultiWindowMode();
    }
}
