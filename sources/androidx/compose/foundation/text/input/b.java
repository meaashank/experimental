package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.C1827p;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nInputTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/FilterChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,254:1\n1#2:255\n*E\n"})
public final class b implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d f93607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f93608c;

    public b(@NotNull d dVar, @NotNull d dVar2) {
        this.f93607b = dVar;
        this.f93608c = dVar2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return G.g(this.f93607b, bVar.f93607b) && G.g(this.f93608c, bVar.f93608c) && G.g(q0(), bVar.q0());
    }

    public int hashCode() {
        int iHashCode = (this.f93608c.hashCode() + (this.f93607b.hashCode() * 31)) * 32;
        C1827p c1827pQ0 = q0();
        return iHashCode + (c1827pQ0 != null ? c1827pQ0.hashCode() : 0);
    }

    @Override // androidx.compose.foundation.text.input.d
    public void o0(@NotNull androidx.compose.ui.semantics.u uVar) {
        this.f93607b.o0(uVar);
        this.f93608c.o0(uVar);
    }

    @Override // androidx.compose.foundation.text.input.d
    public void p0(@NotNull j jVar) {
        this.f93607b.p0(jVar);
        this.f93608c.p0(jVar);
    }

    @Override // androidx.compose.foundation.text.input.d
    @Nullable
    public C1827p q0() {
        C1827p c1827pQ0 = this.f93608c.q0();
        return c1827pQ0 != null ? c1827pQ0.k(this.f93607b.q0()) : this.f93607b.q0();
    }

    @NotNull
    public String toString() {
        return this.f93607b + ".then(" + this.f93608c + ')';
    }
}
