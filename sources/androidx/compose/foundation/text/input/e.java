package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.C1827p;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.p<CharSequence, CharSequence, CharSequence> f93611b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull ed.p<? super CharSequence, ? super CharSequence, ? extends CharSequence> pVar) {
        this.f93611b = pVar;
    }

    public static e c(e eVar, ed.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pVar = eVar.f93611b;
        }
        eVar.getClass();
        return new e(pVar);
    }

    @NotNull
    public final ed.p<CharSequence, CharSequence, CharSequence> a() {
        return this.f93611b;
    }

    @NotNull
    public final e b(@NotNull ed.p<? super CharSequence, ? super CharSequence, ? extends CharSequence> pVar) {
        return new e(pVar);
    }

    @NotNull
    public final ed.p<CharSequence, CharSequence, CharSequence> d() {
        return this.f93611b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && G.g(this.f93611b, ((e) obj).f93611b);
    }

    public int hashCode() {
        return this.f93611b.hashCode();
    }

    @Override // androidx.compose.foundation.text.input.d
    public /* synthetic */ void o0(androidx.compose.ui.semantics.u uVar) {
    }

    @Override // androidx.compose.foundation.text.input.d
    public void p0(@NotNull j jVar) {
        l lVarY = j.y(jVar, 0L, null, 3, null);
        CharSequence charSequenceInvoke = this.f93611b.invoke(jVar.f94352a, lVarY);
        if (charSequenceInvoke == lVarY) {
            return;
        }
        if (charSequenceInvoke == jVar.f94352a) {
            jVar.u();
        } else {
            jVar.w(charSequenceInvoke);
        }
    }

    @Override // androidx.compose.foundation.text.input.d
    public /* synthetic */ C1827p q0() {
        return null;
    }

    @NotNull
    public String toString() {
        return "InputTransformation.byValue(transformation=" + this.f93611b + ')';
    }
}
