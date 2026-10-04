package kotlinx.coroutines.flow.internal;

import ed.q;
import kotlin.L0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements q<kotlinx.coroutines.flow.f<? super Object>, Object, kotlin.coroutines.e<? super L0>, Object>, Vc.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SafeCollectorKt$emitFun$1 f220200a = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, kotlinx.coroutines.flow.f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Nullable
    public final Object e(@NotNull kotlinx.coroutines.flow.f<Object> fVar, @Nullable Object obj, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        return fVar.emit(obj, eVar);
    }

    @Override // ed.q
    public Object invoke(kotlinx.coroutines.flow.f<? super Object> fVar, Object obj, kotlin.coroutines.e<? super L0> eVar) {
        return fVar.emit(obj, eVar);
    }
}
