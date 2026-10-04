package androidx.compose.ui.platform;

import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class AbstractC2281t0 implements InterfaceC2275r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f103931c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.l<C2278s0, kotlin.L0> f103932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C2278s0 f103933b;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2281t0(@NotNull ed.l<? super C2278s0, kotlin.L0> lVar) {
        this.f103932a = lVar;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2275r0
    @Nullable
    public Object a() {
        return c().f103928b;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2275r0
    @NotNull
    public InterfaceC5000m<B1> b() {
        return c().f103929c;
    }

    public final C2278s0 c() {
        C2278s0 c2278s0 = this.f103933b;
        if (c2278s0 == null) {
            c2278s0 = new C2278s0();
            this.f103932a.invoke(c2278s0);
        }
        this.f103933b = c2278s0;
        return c2278s0;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2275r0
    @Nullable
    public String d() {
        return c().f103927a;
    }
}
