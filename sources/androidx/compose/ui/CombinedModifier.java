package androidx.compose.ui;

import androidx.compose.runtime.R0;
import androidx.compose.ui.p;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class CombinedModifier implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f100357c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p f100358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final p f100359b;

    public CombinedModifier(@NotNull p pVar, @NotNull p pVar2) {
        this.f100358a = pVar;
        this.f100359b = pVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.p
    public <R> R M(R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
        return (R) this.f100358a.M(this.f100359b.M(r10, pVar), pVar);
    }

    @Override // androidx.compose.ui.p
    public boolean O(@NotNull ed.l<? super p.c, Boolean> lVar) {
        return this.f100358a.O(lVar) || this.f100359b.O(lVar);
    }

    @Override // androidx.compose.ui.p
    public /* synthetic */ p P0(p pVar) {
        return o.a(this, pVar);
    }

    @Override // androidx.compose.ui.p
    public boolean S(@NotNull ed.l<? super p.c, Boolean> lVar) {
        return this.f100358a.S(lVar) && this.f100359b.S(lVar);
    }

    @NotNull
    public final p a() {
        return this.f100359b;
    }

    @NotNull
    public final p b() {
        return this.f100358a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof CombinedModifier)) {
            return false;
        }
        CombinedModifier combinedModifier = (CombinedModifier) obj;
        return G.g(this.f100358a, combinedModifier.f100358a) && G.g(this.f100359b, combinedModifier.f100359b);
    }

    public int hashCode() {
        return (this.f100359b.hashCode() * 31) + this.f100358a.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.p
    public <R> R l0(R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
        return (R) this.f100359b.l0(this.f100358a.l0(r10, pVar), pVar);
    }

    @NotNull
    public String toString() {
        return R0.a(new StringBuilder("["), (String) l0("", new ed.p<String, p.c, String>() { // from class: androidx.compose.ui.CombinedModifier.toString.1
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final String invoke(@NotNull String str, @NotNull p.c cVar) {
                if (str.length() == 0) {
                    return cVar.toString();
                }
                return str + U6.j.f68738d + cVar;
            }
        }), ']');
    }
}
