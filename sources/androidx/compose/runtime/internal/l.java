package androidx.compose.runtime.internal;

import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.C5011c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99938b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99939a;

    public l() {
        this(0, 1, null);
    }

    public final int a() {
        return this.f99939a;
    }

    public final void b(int i10) {
        this.f99939a = i10;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f99939a);
        sb2.append(")@");
        int iHashCode = hashCode();
        C5011c.a(16);
        String string = Integer.toString(iHashCode, 16);
        G.o(string, "toString(this, checkRadix(radix))");
        sb2.append(string);
        return sb2.toString();
    }

    public l(int i10) {
        this.f99939a = i10;
    }

    public /* synthetic */ l(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
