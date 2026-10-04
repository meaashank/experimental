package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$4$1\n*L\n1#1,469:1\n*E\n"})
public final class LazyStaggeredGridDslKt$items$4$1 extends Lambda implements ed.l<Integer, B> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.l<T, B> f91951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<T> f91952e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$items$4$1(ed.l<? super T, B> lVar, List<? extends T> list) {
        super(1);
        this.f91951d = lVar;
        this.f91952e = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NotNull
    public final B e(int i10) {
        return this.f91951d.invoke((T) this.f91952e.get(i10));
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ B invoke(Integer num) {
        return e(num.intValue());
    }
}
