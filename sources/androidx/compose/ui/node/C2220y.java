package androidx.compose.ui.node;

import androidx.compose.ui.graphics.InterfaceC2008b2;
import androidx.compose.ui.graphics.k3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.node.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2220y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f103104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f103105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f103106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f103107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f103108g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f103110i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f103102a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f103103b = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f103109h = 8.0f;

    public C2220y() {
        k3.f101140b.getClass();
        this.f103110i = k3.f101141c;
    }

    public final void a(@NotNull InterfaceC2008b2 interfaceC2008b2) {
        this.f103102a = interfaceC2008b2.x();
        this.f103103b = interfaceC2008b2.B();
        this.f103104c = interfaceC2008b2.r();
        this.f103105d = interfaceC2008b2.q();
        this.f103106e = interfaceC2008b2.z();
        this.f103107f = interfaceC2008b2.t();
        this.f103108g = interfaceC2008b2.u();
        this.f103109h = interfaceC2008b2.l();
        this.f103110i = interfaceC2008b2.G1();
    }

    public final void b(@NotNull C2220y c2220y) {
        this.f103102a = c2220y.f103102a;
        this.f103103b = c2220y.f103103b;
        this.f103104c = c2220y.f103104c;
        this.f103105d = c2220y.f103105d;
        this.f103106e = c2220y.f103106e;
        this.f103107f = c2220y.f103107f;
        this.f103108g = c2220y.f103108g;
        this.f103109h = c2220y.f103109h;
        this.f103110i = c2220y.f103110i;
    }

    public final boolean c(@NotNull C2220y c2220y) {
        return this.f103102a == c2220y.f103102a && this.f103103b == c2220y.f103103b && this.f103104c == c2220y.f103104c && this.f103105d == c2220y.f103105d && this.f103106e == c2220y.f103106e && this.f103107f == c2220y.f103107f && this.f103108g == c2220y.f103108g && this.f103109h == c2220y.f103109h && k3.i(this.f103110i, c2220y.f103110i);
    }
}
