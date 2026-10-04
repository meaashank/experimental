package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.AbstractC2131z0;
import androidx.compose.ui.graphics.K0;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,150:1\n696#2:151\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n*L\n95#1:151\n*E\n"})
public final class d implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f104959b;

    public /* synthetic */ d(long j10, C4969v c4969v) {
        this(j10);
    }

    public static d h(d dVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = dVar.f104959b;
        }
        dVar.getClass();
        return new d(j10);
    }

    @Override // androidx.compose.ui.text.style.m
    public long a() {
        return this.f104959b;
    }

    @Override // androidx.compose.ui.text.style.m
    public /* synthetic */ m b(InterfaceC4376a interfaceC4376a) {
        return TextForegroundStyle$CC.b(this, interfaceC4376a);
    }

    @Override // androidx.compose.ui.text.style.m
    public /* synthetic */ m c(m mVar) {
        return TextForegroundStyle$CC.a(this, mVar);
    }

    @Override // androidx.compose.ui.text.style.m
    @Nullable
    public AbstractC2131z0 d() {
        return null;
    }

    public final long e() {
        return this.f104959b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && K0.y(this.f104959b, ((d) obj).f104959b);
    }

    @Override // androidx.compose.ui.text.style.m
    public float f() {
        return K0.A(this.f104959b);
    }

    @NotNull
    public final d g(long j10) {
        return new d(j10);
    }

    public int hashCode() {
        return K0.K(this.f104959b);
    }

    public final long i() {
        return this.f104959b;
    }

    @NotNull
    public String toString() {
        return "ColorStyle(value=" + ((Object) K0.L(this.f104959b)) + ')';
    }

    public d(long j10) {
        this.f104959b = j10;
        if (j10 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }
}
