package F;

import androidx.compose.ui.platform.InterfaceC2275r0;
import k0.InterfaceC4814e;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import kotlin.sequences.C4994g;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nCornerSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerSize.kt\nandroidx/compose/foundation/shape/DpCornerSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
public final class j implements f, InterfaceC2275r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f33914a;

    public /* synthetic */ j(float f10, C4969v c4969v) {
        this(f10);
    }

    private final float e() {
        return this.f33914a;
    }

    public static j g(j jVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = jVar.f33914a;
        }
        jVar.getClass();
        return new j(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2275r0
    public Object a() {
        return new k0.i(this.f33914a);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2275r0
    public InterfaceC5000m b() {
        return C4994g.f218169a;
    }

    @Override // F.f
    public float c(long j10, @NotNull InterfaceC4814e interfaceC4814e) {
        return interfaceC4814e.l2(this.f33914a);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2275r0
    public /* synthetic */ String d() {
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && k0.i.l(this.f33914a, ((j) obj).f33914a);
    }

    @NotNull
    public final j f(float f10) {
        return new j(f10);
    }

    public float h() {
        return this.f33914a;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f33914a);
    }

    @NotNull
    public String toString() {
        return "CornerSize(size = " + this.f33914a + ".dp)";
    }

    public j(float f10) {
        this.f33914a = f10;
    }
}
