package O;

import androidx.compose.ui.autofill.AutofillType;
import java.util.List;
import kotlin.L0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
@androidx.compose.ui.i
public final class z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f65123e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f65124f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f65125g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<AutofillType> f65126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public P.j f65127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ed.l<String, L0> f65128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f65129d;

    @V({"SMAP\nAutofill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,105:1\n36#2:106\n*S KotlinDebug\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n*L\n82#1:106\n*E\n"})
    public static final class a {
        public a() {
        }

        public final int b() {
            int i10;
            synchronized (this) {
                i10 = z.f65125g + 1;
                z.f65125g = i10;
            }
            return i10;
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(@NotNull List<? extends AutofillType> list, @Nullable P.j jVar, @Nullable ed.l<? super String, L0> lVar) {
        this.f65126a = list;
        this.f65127b = jVar;
        this.f65128c = lVar;
        this.f65129d = f65123e.b();
    }

    @NotNull
    public final List<AutofillType> c() {
        return this.f65126a;
    }

    @Nullable
    public final P.j d() {
        return this.f65127b;
    }

    public final int e() {
        return this.f65129d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return G.g(this.f65126a, zVar.f65126a) && G.g(this.f65127b, zVar.f65127b) && this.f65128c == zVar.f65128c;
    }

    @Nullable
    public final ed.l<String, L0> f() {
        return this.f65128c;
    }

    public final void g(@Nullable P.j jVar) {
        this.f65127b = jVar;
    }

    public int hashCode() {
        int iHashCode = this.f65126a.hashCode() * 31;
        P.j jVar = this.f65127b;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        ed.l<String, L0> lVar = this.f65128c;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public z(List list, P.j jVar, ed.l lVar, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? EmptyList.f217510a : list, (i10 & 2) != 0 ? null : jVar, lVar);
    }
}
