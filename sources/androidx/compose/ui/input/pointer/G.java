package androidx.compose.ui.input.pointer;

import androidx.compose.ui.layout.InterfaceC2188x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class G {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102188c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public InterfaceC2188x f102189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f102190b;

    public static /* synthetic */ void d() {
    }

    public boolean a() {
        return false;
    }

    @Nullable
    public final InterfaceC2188x b() {
        return this.f102189a;
    }

    public boolean c() {
        return this instanceof PointerInteropFilter$pointerInputFilter$1;
    }

    public final long e() {
        InterfaceC2188x interfaceC2188x = this.f102189a;
        if (interfaceC2188x != null) {
            return interfaceC2188x.b();
        }
        k0.x.f214338b.getClass();
        return k0.x.f214339c;
    }

    public final boolean f() {
        return this.f102190b;
    }

    public abstract void g();

    public abstract void h(@NotNull C2150q c2150q, @NotNull PointerEventPass pointerEventPass, long j10);

    public final void i(boolean z10) {
        this.f102190b = z10;
    }

    public final void j(@Nullable InterfaceC2188x interfaceC2188x) {
        this.f102189a = interfaceC2188x;
    }
}
