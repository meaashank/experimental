package kotlinx.coroutines;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class I0 extends V0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.e<kotlin.L0> f218732d;

    public I0(@NotNull kotlin.coroutines.i iVar, @NotNull ed.p<? super L, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends Object> pVar) {
        super(iVar, true, false);
        this.f218732d = IntrinsicsKt__IntrinsicsJvmKt.c(pVar, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void q1() {
        wd.a.e(this.f218732d, this);
    }
}
