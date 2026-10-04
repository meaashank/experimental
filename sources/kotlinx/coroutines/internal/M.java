package kotlinx.coroutines.internal;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.AbstractC5049a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class M<T> extends AbstractC5049a<T> implements Vc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    @NotNull
    public final kotlin.coroutines.e<T> f220299d;

    /* JADX WARN: Multi-variable type inference failed */
    public M(@NotNull kotlin.coroutines.i iVar, @NotNull kotlin.coroutines.e<? super T> eVar) {
        super(iVar, true, true);
        this.f220299d = eVar;
    }

    @Override // kotlinx.coroutines.AbstractC5049a
    public void L1(@Nullable Object obj) {
        kotlin.coroutines.e<T> eVar = this.f220299d;
        eVar.resumeWith(kotlinx.coroutines.E.a(obj, eVar));
    }

    @Override // kotlinx.coroutines.JobSupport
    public void S(@Nullable Object obj) {
        C5080n.e(IntrinsicsKt__IntrinsicsJvmKt.e(this.f220299d), kotlinx.coroutines.E.a(obj, this.f220299d), null, 2, null);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean W0() {
        return true;
    }

    @Override // Vc.c
    @Nullable
    public final Vc.c getCallerFrame() {
        kotlin.coroutines.e<T> eVar = this.f220299d;
        if (eVar instanceof Vc.c) {
            return (Vc.c) eVar;
        }
        return null;
    }

    @Override // Vc.c
    @Nullable
    public final StackTraceElement getStackTraceElement() {
        return null;
    }
}
