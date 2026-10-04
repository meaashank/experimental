package androidx.compose.ui.text.platform;

import androidx.compose.runtime.X1;
import e.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t f104941a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static u f104942b = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104943c = 8;

    @Override // androidx.compose.ui.text.platform.u
    @NotNull
    public X1<Boolean> a() {
        return f104942b.a();
    }

    @f0
    public final void b(@Nullable u uVar) {
        if (uVar == null) {
            uVar = new r();
        }
        f104942b = uVar;
    }
}
