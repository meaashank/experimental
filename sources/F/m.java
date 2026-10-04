package F;

import androidx.compose.ui.platform.InterfaceC2275r0;
import k0.InterfaceC4814e;
import kotlin.sequences.C4994g;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements f, InterfaceC2275r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f33918a;

    public m(float f10) {
        this.f33918a = f10;
    }

    private final float e() {
        return this.f33918a;
    }

    public static m g(m mVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = mVar.f33918a;
        }
        mVar.getClass();
        return new m(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2275r0
    public InterfaceC5000m b() {
        return C4994g.f218169a;
    }

    @Override // F.f
    public float c(long j10, @NotNull InterfaceC4814e interfaceC4814e) {
        return this.f33918a;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2275r0
    public /* synthetic */ String d() {
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.f33918a, ((m) obj).f33918a) == 0;
    }

    @NotNull
    public final m f(float f10) {
        return new m(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2275r0
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String a() {
        return this.f33918a + "px";
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f33918a);
    }

    @NotNull
    public String toString() {
        return "CornerSize(size = " + this.f33918a + ".px)";
    }
}
