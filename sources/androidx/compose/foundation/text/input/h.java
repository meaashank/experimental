package androidx.compose.foundation.text.input;

import androidx.activity.C1477d;
import androidx.compose.foundation.text.C1827p;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nInputTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/MaxLengthFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,254:1\n1#2:255\n*E\n"})
public final class h implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93612b;

    public h(int i10) {
        this.f93612b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("maxLength must be at least zero, was ", i10).toString());
        }
    }

    public static h c(h hVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = hVar.f93612b;
        }
        hVar.getClass();
        return new h(i10);
    }

    public final int a() {
        return this.f93612b;
    }

    @NotNull
    public final h b(int i10) {
        return new h(i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f93612b == ((h) obj).f93612b;
    }

    public int hashCode() {
        return this.f93612b;
    }

    @Override // androidx.compose.foundation.text.input.d
    public void o0(@NotNull androidx.compose.ui.semantics.u uVar) {
        SemanticsPropertiesKt.x1(uVar, this.f93612b);
    }

    @Override // androidx.compose.foundation.text.input.d
    public void p0(@NotNull j jVar) {
        if (jVar.f94354c.c() > this.f93612b) {
            jVar.u();
        }
    }

    @Override // androidx.compose.foundation.text.input.d
    public /* synthetic */ C1827p q0() {
        return null;
    }

    @NotNull
    public String toString() {
        return C1477d.a(new StringBuilder("InputTransformation.maxLength("), this.f93612b, ')');
    }
}
