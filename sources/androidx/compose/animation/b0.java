package androidx.compose.animation;

import androidx.compose.runtime.InterfaceC1924k0;
import java.util.Map;
import kotlin.collections.n0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f87548g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final A f87549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final V f87550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ChangeSize f87551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final M f87552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f87553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Map<d0<?>, c0> f87554f;

    public b0() {
        this(null, null, null, null, false, null, 63, null);
    }

    public static b0 h(b0 b0Var, A a10, V v10, ChangeSize changeSize, M m10, boolean z10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a10 = b0Var.f87549a;
        }
        if ((i10 & 2) != 0) {
            v10 = b0Var.f87550b;
        }
        if ((i10 & 4) != 0) {
            changeSize = b0Var.f87551c;
        }
        if ((i10 & 8) != 0) {
            m10 = b0Var.f87552d;
        }
        if ((i10 & 16) != 0) {
            z10 = b0Var.f87553e;
        }
        if ((i10 & 32) != 0) {
            map = b0Var.f87554f;
        }
        Map map2 = map;
        b0Var.getClass();
        boolean z11 = z10;
        ChangeSize changeSize2 = changeSize;
        return new b0(a10, v10, changeSize2, m10, z11, map2);
    }

    @Nullable
    public final A a() {
        return this.f87549a;
    }

    @Nullable
    public final V b() {
        return this.f87550b;
    }

    @Nullable
    public final ChangeSize c() {
        return this.f87551c;
    }

    @Nullable
    public final M d() {
        return this.f87552d;
    }

    public final boolean e() {
        return this.f87553e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.G.g(this.f87549a, b0Var.f87549a) && kotlin.jvm.internal.G.g(this.f87550b, b0Var.f87550b) && kotlin.jvm.internal.G.g(this.f87551c, b0Var.f87551c) && kotlin.jvm.internal.G.g(this.f87552d, b0Var.f87552d) && this.f87553e == b0Var.f87553e && kotlin.jvm.internal.G.g(this.f87554f, b0Var.f87554f);
    }

    @NotNull
    public final Map<d0<?>, c0> f() {
        return this.f87554f;
    }

    @NotNull
    public final b0 g(@Nullable A a10, @Nullable V v10, @Nullable ChangeSize changeSize, @Nullable M m10, boolean z10, @NotNull Map<d0<?>, ? extends c0> map) {
        return new b0(a10, v10, changeSize, m10, z10, map);
    }

    public int hashCode() {
        A a10 = this.f87549a;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        V v10 = this.f87550b;
        int iHashCode2 = (iHashCode + (v10 == null ? 0 : v10.hashCode())) * 31;
        ChangeSize changeSize = this.f87551c;
        int iHashCode3 = (iHashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        M m10 = this.f87552d;
        return this.f87554f.hashCode() + ((C1635o.a(this.f87553e) + ((iHashCode3 + (m10 != null ? m10.hashCode() : 0)) * 31)) * 31);
    }

    @Nullable
    public final ChangeSize i() {
        return this.f87551c;
    }

    @NotNull
    public final Map<d0<?>, c0> j() {
        return this.f87554f;
    }

    @Nullable
    public final A k() {
        return this.f87549a;
    }

    public final boolean l() {
        return this.f87553e;
    }

    @Nullable
    public final M m() {
        return this.f87552d;
    }

    @Nullable
    public final V n() {
        return this.f87550b;
    }

    @NotNull
    public String toString() {
        return "TransitionData(fade=" + this.f87549a + ", slide=" + this.f87550b + ", changeSize=" + this.f87551c + ", scale=" + this.f87552d + ", hold=" + this.f87553e + ", effectsMap=" + this.f87554f + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(@Nullable A a10, @Nullable V v10, @Nullable ChangeSize changeSize, @Nullable M m10, boolean z10, @NotNull Map<d0<?>, ? extends c0> map) {
        this.f87549a = a10;
        this.f87550b = v10;
        this.f87551c = changeSize;
        this.f87552d = m10;
        this.f87553e = z10;
        this.f87554f = map;
    }

    public /* synthetic */ b0(A a10, V v10, ChangeSize changeSize, M m10, boolean z10, Map map, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? null : a10, (i10 & 2) != 0 ? null : v10, (i10 & 4) != 0 ? null : changeSize, (i10 & 8) != 0 ? null : m10, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? n0.z() : map);
    }
}
