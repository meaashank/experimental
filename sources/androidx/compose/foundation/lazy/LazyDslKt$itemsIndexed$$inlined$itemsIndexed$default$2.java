package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$7\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$5\n*L\n1#1,433:1\n254#2:434\n*E\n"})
public final class LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2 extends Lambda implements ed.l<Integer, Object> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object[] f91026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(Object[] objArr) {
        super(1);
        this.f91026d = objArr;
    }

    @Nullable
    public final Object e(int i10) {
        Object obj = this.f91026d[i10];
        return null;
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        e(num.intValue());
        return null;
    }
}
