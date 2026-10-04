package kotlinx.coroutines.internal;

import kotlin.C4885d0;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class ExceptionsConstructorKt$safeCtor$1 extends Lambda implements ed.l<Throwable, Throwable> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.l<Throwable, Throwable> f220285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExceptionsConstructorKt$safeCtor$1(ed.l<? super Throwable, ? extends Throwable> lVar) {
        super(1);
        this.f220285d = lVar;
    }

    @Override // ed.l
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Throwable invoke(@NotNull Throwable th) {
        Object objA;
        try {
            Throwable thInvoke = this.f220285d.invoke(th);
            boolean zG = kotlin.jvm.internal.G.g(th.getMessage(), thInvoke.getMessage());
            objA = thInvoke;
            if (!zG) {
                boolean zG2 = kotlin.jvm.internal.G.g(thInvoke.getMessage(), th.toString());
                objA = thInvoke;
                if (!zG2) {
                    objA = null;
                }
            }
        } catch (Throwable th2) {
            objA = C4885d0.a(th2);
        }
        return (Throwable) (objA instanceof Result.Failure ? null : objA);
    }
}
