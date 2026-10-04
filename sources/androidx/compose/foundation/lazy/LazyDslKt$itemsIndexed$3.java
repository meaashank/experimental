package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3\n*L\n1#1,433:1\n*E\n"})
public final class LazyDslKt$itemsIndexed$3 extends Lambda implements ed.l<Integer, Object> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.p<Integer, T, Object> f91030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<T> f91031e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyDslKt$itemsIndexed$3(ed.p<? super Integer, ? super T, ? extends Object> pVar, List<? extends T> list) {
        super(1);
        this.f91030d = pVar;
        this.f91031e = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Nullable
    public final Object e(int i10) {
        return this.f91030d.invoke(Integer.valueOf(i10), (T) this.f91031e.get(i10));
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return e(num.intValue());
    }
}
