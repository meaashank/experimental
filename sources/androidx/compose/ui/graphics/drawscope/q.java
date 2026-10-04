package androidx.compose.ui.graphics.drawscope;

import androidx.compose.animation.B;
import androidx.compose.ui.graphics.InterfaceC2121w2;
import androidx.compose.ui.graphics.f3;
import androidx.compose.ui.graphics.g3;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class q extends k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f101085f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f101086g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f101087h = 4.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f101088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f101089j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f101090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f101091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f101092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f101093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final InterfaceC2121w2 f101094e;

    public static final class a {
        public a() {
        }

        public final int a() {
            return q.f101088i;
        }

        public final int b() {
            return q.f101089j;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        f3.f101112b.getClass();
        f101088i = f3.f101113c;
        g3.f101118b.getClass();
        f101089j = g3.f101119c;
    }

    public /* synthetic */ q(float f10, float f11, int i10, int i11, InterfaceC2121w2 interfaceC2121w2, C4969v c4969v) {
        this(f10, f11, i10, i11, interfaceC2121w2);
    }

    public final int c() {
        return this.f101092c;
    }

    public final int d() {
        return this.f101093d;
    }

    public final float e() {
        return this.f101091b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f101090a == qVar.f101090a && this.f101091b == qVar.f101091b && this.f101092c == qVar.f101092c && this.f101093d == qVar.f101093d && G.g(this.f101094e, qVar.f101094e);
    }

    @Nullable
    public final InterfaceC2121w2 f() {
        return this.f101094e;
    }

    public final float g() {
        return this.f101090a;
    }

    public int hashCode() {
        int iA = (((B.a(this.f101091b, Float.floatToIntBits(this.f101090a) * 31, 31) + this.f101092c) * 31) + this.f101093d) * 31;
        InterfaceC2121w2 interfaceC2121w2 = this.f101094e;
        return iA + (interfaceC2121w2 != null ? interfaceC2121w2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Stroke(width=" + this.f101090a + ", miter=" + this.f101091b + ", cap=" + ((Object) f3.i(this.f101092c)) + ", join=" + ((Object) g3.i(this.f101093d)) + ", pathEffect=" + this.f101094e + ')';
    }

    public q(float f10, float f11, int i10, int i11, InterfaceC2121w2 interfaceC2121w2) {
        this.f101090a = f10;
        this.f101091b = f11;
        this.f101092c = i10;
        this.f101093d = i11;
        this.f101094e = interfaceC2121w2;
    }

    public /* synthetic */ q(float f10, float f11, int i10, int i11, InterfaceC2121w2 interfaceC2121w2, int i12, C4969v c4969v) {
        this((i12 & 1) != 0 ? 0.0f : f10, (i12 & 2) != 0 ? 4.0f : f11, (i12 & 4) != 0 ? f101088i : i10, (i12 & 8) != 0 ? f101089j : i11, (i12 & 16) != 0 ? null : interfaceC2121w2);
    }
}
