package androidx.compose.ui.semantics;

import androidx.compose.animation.C1636p;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104136d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<Float> f104137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<Float> f104138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f104139c;

    public j(@NotNull InterfaceC4376a<Float> interfaceC4376a, @NotNull InterfaceC4376a<Float> interfaceC4376a2, boolean z10) {
        this.f104137a = interfaceC4376a;
        this.f104138b = interfaceC4376a2;
        this.f104139c = z10;
    }

    @NotNull
    public final InterfaceC4376a<Float> a() {
        return this.f104138b;
    }

    public final boolean b() {
        return this.f104139c;
    }

    @NotNull
    public final InterfaceC4376a<Float> c() {
        return this.f104137a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScrollAxisRange(value=");
        sb2.append(this.f104137a.invoke().floatValue());
        sb2.append(", maxValue=");
        sb2.append(this.f104138b.invoke().floatValue());
        sb2.append(", reverseScrolling=");
        return C1636p.a(sb2, this.f104139c, ')');
    }

    public /* synthetic */ j(InterfaceC4376a interfaceC4376a, InterfaceC4376a interfaceC4376a2, boolean z10, int i10, C4969v c4969v) {
        this(interfaceC4376a, interfaceC4376a2, (i10 & 4) != 0 ? false : z10);
    }
}
