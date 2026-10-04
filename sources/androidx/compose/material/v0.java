package androidx.compose.material;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@kotlin.jvm.internal.V({"SMAP\nShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shapes.kt\nandroidx/compose/material/Shapes\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,101:1\n149#2:102\n149#2:103\n149#2:104\n*S KotlinDebug\n*F\n+ 1 Shapes.kt\nandroidx/compose/material/Shapes\n*L\n50#1:102\n54#1:103\n58#1:104\n*E\n"})
public final class v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f98938d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final F.e f98939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final F.e f98940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final F.e f98941c;

    public v0() {
        this(null, null, null, 7, null);
    }

    public static v0 b(v0 v0Var, F.e eVar, F.e eVar2, F.e eVar3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = v0Var.f98939a;
        }
        if ((i10 & 2) != 0) {
            eVar2 = v0Var.f98940b;
        }
        if ((i10 & 4) != 0) {
            eVar3 = v0Var.f98941c;
        }
        v0Var.getClass();
        return new v0(eVar, eVar2, eVar3);
    }

    @NotNull
    public final v0 a(@NotNull F.e eVar, @NotNull F.e eVar2, @NotNull F.e eVar3) {
        return new v0(eVar, eVar2, eVar3);
    }

    @NotNull
    public final F.e c() {
        return this.f98941c;
    }

    @NotNull
    public final F.e d() {
        return this.f98940b;
    }

    @NotNull
    public final F.e e() {
        return this.f98939a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return kotlin.jvm.internal.G.g(this.f98939a, v0Var.f98939a) && kotlin.jvm.internal.G.g(this.f98940b, v0Var.f98940b) && kotlin.jvm.internal.G.g(this.f98941c, v0Var.f98941c);
    }

    public int hashCode() {
        return this.f98941c.hashCode() + ((this.f98940b.hashCode() + (this.f98939a.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Shapes(small=" + this.f98939a + ", medium=" + this.f98940b + ", large=" + this.f98941c + ')';
    }

    public v0(@NotNull F.e eVar, @NotNull F.e eVar2, @NotNull F.e eVar3) {
        this.f98939a = eVar;
        this.f98940b = eVar2;
        this.f98941c = eVar3;
    }

    public v0(F.e eVar, F.e eVar2, F.e eVar3, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? F.o.h(4) : eVar, (i10 & 2) != 0 ? F.o.h(4) : eVar2, (i10 & 4) != 0 ? F.o.h(0) : eVar3);
    }
}
