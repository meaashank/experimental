package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$3\n*L\n1#1,569:1\n*E\n"})
public final class LazyGridDslKt$items$3 extends Lambda implements ed.p<m, Integer, C1722c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.p<m, T, C1722c> f91240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<T> f91241e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$items$3(ed.p<? super m, ? super T, C1722c> pVar, List<? extends T> list) {
        super(2);
        this.f91240d = pVar;
        this.f91241e = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final long e(@NotNull m mVar, int i10) {
        return this.f91240d.invoke(mVar, (T) this.f91241e.get(i10)).f91427a;
    }

    @Override // ed.p
    public /* synthetic */ C1722c invoke(m mVar, Integer num) {
        return new C1722c(e(mVar, num.intValue()));
    }
}
