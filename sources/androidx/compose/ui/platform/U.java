package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(29)
@androidx.compose.runtime.internal.r(parameters = 1)
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final U f103654a = new U();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f103655b = 0;

    @InterfaceC4345t
    public final int a(@NotNull AccessibilityManager accessibilityManager, int i10, int i11) {
        return accessibilityManager.getRecommendedTimeoutMillis(i10, i11);
    }
}
