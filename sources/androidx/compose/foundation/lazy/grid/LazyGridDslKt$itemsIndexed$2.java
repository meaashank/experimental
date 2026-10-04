package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$2\n*L\n1#1,569:1\n*E\n"})
public final class LazyGridDslKt$itemsIndexed$2 extends Lambda implements ed.l<Integer, Object> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.p<Integer, T, Object> f91256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<T> f91257e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$2(ed.p<? super Integer, ? super T, ? extends Object> pVar, List<? extends T> list) {
        super(1);
        this.f91256d = pVar;
        this.f91257e = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NotNull
    public final Object e(int i10) {
        return this.f91256d.invoke(Integer.valueOf(i10), (T) this.f91257e.get(i10));
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return e(num.intValue());
    }
}
