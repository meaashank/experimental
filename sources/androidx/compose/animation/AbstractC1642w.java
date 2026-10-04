package androidx.compose.animation;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import java.util.Map;
import kotlin.collections.n0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public abstract class AbstractC1642w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f88293a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f88294b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final AbstractC1642w f88295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final AbstractC1642w f88296d;

    /* JADX INFO: renamed from: androidx.compose.animation.w$a */
    public static final class a {
        public a() {
        }

        @NotNull
        public final AbstractC1642w a() {
            return AbstractC1642w.f88296d;
        }

        @NotNull
        public final AbstractC1642w b() {
            return AbstractC1642w.f88295c;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        C4969v c4969v = null;
        A a10 = null;
        V v10 = null;
        ChangeSize changeSize = null;
        M m10 = null;
        Map map = null;
        f88295c = new C1643x(new b0(a10, v10, changeSize, m10, false, map, 63, c4969v));
        f88296d = new C1643x(new b0(a10, v10, changeSize, m10, true, map, 47, c4969v));
    }

    public AbstractC1642w() {
    }

    @NotNull
    public abstract b0 c();

    @T1
    @NotNull
    public final AbstractC1642w d(@NotNull AbstractC1642w abstractC1642w) {
        A a10 = abstractC1642w.c().f87549a;
        if (a10 == null) {
            a10 = c().f87549a;
        }
        V v10 = abstractC1642w.c().f87550b;
        if (v10 == null) {
            v10 = c().f87550b;
        }
        ChangeSize changeSize = abstractC1642w.c().f87551c;
        if (changeSize == null) {
            changeSize = c().f87551c;
        }
        M m10 = abstractC1642w.c().f87552d;
        if (m10 == null) {
            m10 = c().f87552d;
        }
        return new C1643x(new b0(a10, v10, changeSize, m10, abstractC1642w.c().f87553e || c().f87553e, n0.n0(c().f87554f, abstractC1642w.c().f87554f)));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof AbstractC1642w) && kotlin.jvm.internal.G.g(((AbstractC1642w) obj).c(), c());
    }

    public int hashCode() {
        return c().hashCode();
    }

    @NotNull
    public String toString() {
        if (equals(f88295c)) {
            return "ExitTransition.None";
        }
        if (equals(f88296d)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        b0 b0VarC = c();
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        A a10 = b0VarC.f87549a;
        sb2.append(a10 != null ? a10.toString() : null);
        sb2.append(",\nSlide - ");
        V v10 = b0VarC.f87550b;
        sb2.append(v10 != null ? v10.toString() : null);
        sb2.append(",\nShrink - ");
        ChangeSize changeSize = b0VarC.f87551c;
        sb2.append(changeSize != null ? changeSize.toString() : null);
        sb2.append(",\nScale - ");
        M m10 = b0VarC.f87552d;
        sb2.append(m10 != null ? m10.toString() : null);
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(b0VarC.f87553e);
        return sb2.toString();
    }

    public AbstractC1642w(C4969v c4969v) {
    }
}
