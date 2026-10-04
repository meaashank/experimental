package androidx.compose.foundation.contextmenu;

import androidx.collection.C1550p;
import androidx.compose.runtime.L0;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nContextMenuState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,77:1\n81#2:78\n107#2,2:79\n*S KotlinDebug\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState\n*L\n34#1:78\n34#1:79,2\n*E\n"})
@r(parameters = 1)
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f89062b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final L0 f89063a;

    @r(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f89064a = 0;

        /* JADX INFO: renamed from: androidx.compose.foundation.contextmenu.h$a$a, reason: collision with other inner class name */
        @r(parameters = 1)
        public static final class C0187a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final C0187a f89065b = new C0187a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f89066c = 0;

            @NotNull
            public String toString() {
                return "Closed";
            }
        }

        @V({"SMAP\nContextMenuState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState$Status$Open\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
        @r(parameters = 1)
        public static final class b extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f89067c = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f89068b;

            public /* synthetic */ b(long j10, C4969v c4969v) {
                this(j10);
            }

            public final long a() {
                return this.f89068b;
            }

            public boolean equals(@Nullable Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof b) {
                    return P.g.l(this.f89068b, ((b) obj).f89068b);
                }
                return false;
            }

            public int hashCode() {
                return C1550p.a(this.f89068b);
            }

            @NotNull
            public String toString() {
                return "Open(offset=" + ((Object) P.g.y(this.f89068b)) + ')';
            }

            public b(long j10) {
                this.f89068b = j10;
                if (!P.h.d(j10)) {
                    throw new IllegalStateException(i.f89069a);
                }
            }
        }

        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final a a() {
        return (a) this.f89063a.getValue();
    }

    public final void b(@NotNull a aVar) {
        this.f89063a.setValue(aVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return G.g(((h) obj).a(), a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    @NotNull
    public String toString() {
        return "ContextMenuState(status=" + a() + ')';
    }

    public h(@NotNull a aVar) {
        this.f89063a = M1.g(aVar, null, 2, null);
    }

    public /* synthetic */ h(a aVar, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? a.C0187a.f89065b : aVar);
    }
}
