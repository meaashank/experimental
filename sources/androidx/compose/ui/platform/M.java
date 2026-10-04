package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class M implements G1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f103605b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewConfiguration f103606a;

    public M(@NotNull ViewConfiguration viewConfiguration) {
        this.f103606a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.G1
    public long a() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.G1
    public float b() {
        if (Build.VERSION.SDK_INT >= 34) {
            return P.f103613a.b(this.f103606a);
        }
        return 2.0f;
    }

    @Override // androidx.compose.ui.platform.G1
    public float c() {
        return this.f103606a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.G1
    public float d() {
        if (Build.VERSION.SDK_INT >= 34) {
            return P.f103613a.a(this.f103606a);
        }
        return 16.0f;
    }

    @Override // androidx.compose.ui.platform.G1
    public long e() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.G1
    public long f() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.G1
    public /* synthetic */ long g() {
        return F1.d(this);
    }

    @Override // androidx.compose.ui.platform.G1
    public float h() {
        return this.f103606a.getScaledMaximumFlingVelocity();
    }
}
