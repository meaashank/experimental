package kotlinx.coroutines.rx3;

import java.lang.reflect.InvocationTargetException;
import kotlin.C4987s;
import kotlinx.coroutines.AbstractC5049a;
import org.jetbrains.annotations.NotNull;
import zc.Z;

/* JADX INFO: loaded from: classes5.dex */
public final class m<T> extends AbstractC5049a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Z<T> f220631d;

    public m(@NotNull kotlin.coroutines.i iVar, @NotNull Z<T> z10) {
        super(iVar, false, true);
        this.f220631d = z10;
    }

    @Override // kotlinx.coroutines.AbstractC5049a
    public void P1(@NotNull Throwable th, boolean z10) throws IllegalAccessException, InvocationTargetException {
        try {
            if (this.f220631d.a(th)) {
                return;
            }
        } catch (Throwable th2) {
            C4987s.a(th, th2);
        }
        b.a(th, this.f218811c);
    }

    @Override // kotlinx.coroutines.AbstractC5049a
    public void Q1(@NotNull T t10) throws IllegalAccessException, InvocationTargetException {
        try {
            this.f220631d.onSuccess(t10);
        } catch (Throwable th) {
            b.a(th, this.f218811c);
        }
    }
}
