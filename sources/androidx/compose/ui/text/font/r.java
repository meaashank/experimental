package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.K;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC2307d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f104645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final L f104646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f104647i;

    public /* synthetic */ r(String str, L l10, int i10, K.e eVar, C4969v c4969v) {
        this(str, l10, i10, eVar);
    }

    @Override // androidx.compose.ui.text.font.InterfaceC2324v
    public int b() {
        return this.f104647i;
    }

    @Nullable
    public final Typeface e(@NotNull Context context) {
        return b0.a().c(this.f104645g, this.f104646h, this.f104647i, this.f104615e, context);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.G.g(this.f104645g, rVar.f104645g) && kotlin.jvm.internal.G.g(this.f104646h, rVar.f104646h) && this.f104647i == rVar.f104647i && kotlin.jvm.internal.G.g(this.f104615e, rVar.f104615e);
    }

    @Override // androidx.compose.ui.text.font.InterfaceC2324v
    @NotNull
    public L getWeight() {
        return this.f104646h;
    }

    public int hashCode() {
        return this.f104615e.f104549a.hashCode() + (((((this.f104645g.hashCode() * 31) + this.f104646h.f104572a) * 31) + this.f104647i) * 31);
    }

    @NotNull
    public String toString() {
        return "Font(familyName=\"" + ((Object) C2320q.g(this.f104645g)) + "\", weight=" + this.f104646h + ", style=" + ((Object) H.i(this.f104647i)) + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, L l10, int i10, K.e eVar) {
        super(F.f104481d, S.f104582a, eVar);
        F.f104479b.getClass();
        this.f104645g = str;
        this.f104646h = l10;
        this.f104647i = i10;
    }
}
