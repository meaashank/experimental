package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$3\n*L\n1#1,569:1\n*E\n"})
public final class LazyGridDslKt$itemsIndexed$3 extends Lambda implements ed.p<m, Integer, C1722c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.q<m, Integer, T, C1722c> f91258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<T> f91259e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$3(ed.q<? super m, ? super Integer, ? super T, C1722c> qVar, List<? extends T> list) {
        super(2);
        this.f91258d = qVar;
        this.f91259e = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final long e(@NotNull m mVar, int i10) {
        return this.f91258d.invoke(mVar, Integer.valueOf(i10), (T) this.f91259e.get(i10)).f91427a;
    }

    @Override // ed.p
    public /* synthetic */ C1722c invoke(m mVar, Integer num) {
        return new C1722c(e(mVar, num.intValue()));
    }
}
