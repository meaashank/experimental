package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$3\n*L\n1#1,469:1\n*E\n"})
public final class LazyStaggeredGridDslKt$items$3 extends Lambda implements ed.l<Integer, Object> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.l<T, Object> f91949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<T> f91950e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$items$3(ed.l<? super T, ? extends Object> lVar, List<? extends T> list) {
        super(1);
        this.f91949d = lVar;
        this.f91950e = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Nullable
    public final Object e(int i10) {
        return this.f91949d.invoke((T) this.f91950e.get(i10));
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return e(num.intValue());
    }
}
