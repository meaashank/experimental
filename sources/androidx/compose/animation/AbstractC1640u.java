package androidx.compose.animation;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.collections.n0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public abstract class AbstractC1640u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f88290b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f88289a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final AbstractC1640u f88291c = new C1641v(new b0(null, null, null, null, false, null, 63, null));

    /* JADX INFO: renamed from: androidx.compose.animation.u$a */
    public static final class a {
        public a() {
        }

        @NotNull
        public final AbstractC1640u a() {
            return AbstractC1640u.f88291c;
        }

        public a(C4969v c4969v) {
        }
    }

    public AbstractC1640u() {
    }

    @NotNull
    public abstract b0 b();

    @T1
    @NotNull
    public final AbstractC1640u c(@NotNull AbstractC1640u abstractC1640u) {
        A a10 = abstractC1640u.b().f87549a;
        if (a10 == null) {
            a10 = b().f87549a;
        }
        V v10 = abstractC1640u.b().f87550b;
        if (v10 == null) {
            v10 = b().f87550b;
        }
        ChangeSize changeSize = abstractC1640u.b().f87551c;
        if (changeSize == null) {
            changeSize = b().f87551c;
        }
        M m10 = abstractC1640u.b().f87552d;
        if (m10 == null) {
            m10 = b().f87552d;
        }
        return new C1641v(new b0(a10, v10, changeSize, m10, false, n0.n0(b().f87554f, abstractC1640u.b().f87554f), 16, null));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof AbstractC1640u) && kotlin.jvm.internal.G.g(((AbstractC1640u) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    @NotNull
    public String toString() {
        if (equals(f88291c)) {
            return "EnterTransition.None";
        }
        b0 b0VarB = b();
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        A a10 = b0VarB.f87549a;
        sb2.append(a10 != null ? a10.toString() : null);
        sb2.append(",\nSlide - ");
        V v10 = b0VarB.f87550b;
        sb2.append(v10 != null ? v10.toString() : null);
        sb2.append(",\nShrink - ");
        ChangeSize changeSize = b0VarB.f87551c;
        sb2.append(changeSize != null ? changeSize.toString() : null);
        sb2.append(",\nScale - ");
        M m10 = b0VarB.f87552d;
        sb2.append(m10 != null ? m10.toString() : null);
        return sb2.toString();
    }

    public AbstractC1640u(C4969v c4969v) {
    }
}
