package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.C1827p;
import androidx.compose.foundation.text.input.internal.C1794m;
import androidx.compose.ui.text.J;
import androidx.compose.ui.text.Z;
import androidx.compose.ui.text.a0;
import androidx.compose.ui.text.input.C2353w;
import androidx.compose.ui.text.input.O;
import h0.C4480h;
import h0.C4481i;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nInputTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/AllCapsTransformation\n+ 2 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBufferKt\n*L\n1#1,254:1\n465#2,7:255\n*S KotlinDebug\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/AllCapsTransformation\n*L\n217#1:255,7\n*E\n"})
public final class a implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C4480h f93605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C1827p f93606c;

    public a(@NotNull C4480h c4480h) {
        this.f93605b = c4480h;
        C2353w.f104840b.getClass();
        this.f93606c = new C1827p(C2353w.f104843e, (Boolean) null, 0, 0, (O) null, (Boolean) null, (C4481i) null, 126, (C4969v) null);
    }

    public static a c(a aVar, C4480h c4480h, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4480h = aVar.f93605b;
        }
        aVar.getClass();
        return new a(c4480h);
    }

    public final C4480h a() {
        return this.f93605b;
    }

    @NotNull
    public final a b(@NotNull C4480h c4480h) {
        return new a(c4480h);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && G.g(this.f93605b, ((a) obj).f93605b);
    }

    public int hashCode() {
        return this.f93605b.hashCode();
    }

    @Override // androidx.compose.foundation.text.input.d
    public /* synthetic */ void o0(androidx.compose.ui.semantics.u uVar) {
    }

    @Override // androidx.compose.foundation.text.input.d
    public void p0(@NotNull j jVar) {
        j jVar2;
        C1794m c1794mD = jVar.d();
        int i10 = 0;
        while (i10 < c1794mD.f94108a.f99566c) {
            long jC = c1794mD.c(i10);
            c1794mD.b(i10);
            if (Z.h(jC)) {
                jVar2 = jVar;
            } else {
                int iL = Z.l(jC);
                int iK = Z.k(jC);
                String strG = J.g(a0.e(jVar.f94354c, jC), this.f93605b);
                jVar2 = jVar;
                jVar2.q(iL, iK, strG, 0, strG.length());
            }
            i10++;
            jVar = jVar2;
        }
    }

    @Override // androidx.compose.foundation.text.input.d
    @NotNull
    public C1827p q0() {
        return this.f93606c;
    }

    @NotNull
    public String toString() {
        return "InputTransformation.allCaps(locale=" + this.f93605b + ')';
    }
}
