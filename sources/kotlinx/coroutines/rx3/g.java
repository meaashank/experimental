package kotlinx.coroutines.rx3;

import java.lang.reflect.InvocationTargetException;
import kotlin.C4987s;
import kotlinx.coroutines.AbstractC5049a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zc.InterfaceC5883E;

/* JADX INFO: loaded from: classes5.dex */
public final class g<T> extends AbstractC5049a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC5883E<T> f220620d;

    public g(@NotNull kotlin.coroutines.i iVar, @NotNull InterfaceC5883E<T> interfaceC5883E) {
        super(iVar, false, true);
        this.f220620d = interfaceC5883E;
    }

    @Override // kotlinx.coroutines.AbstractC5049a
    public void P1(@NotNull Throwable th, boolean z10) throws IllegalAccessException, InvocationTargetException {
        try {
            if (this.f220620d.a(th)) {
                return;
            }
        } catch (Throwable th2) {
            C4987s.a(th, th2);
        }
        b.a(th, this.f218811c);
    }

    @Override // kotlinx.coroutines.AbstractC5049a
    public void Q1(@Nullable T t10) throws IllegalAccessException, InvocationTargetException {
        try {
            if (t10 == null) {
                this.f220620d.onComplete();
            } else {
                this.f220620d.onSuccess(t10);
            }
        } catch (Throwable th) {
            b.a(th, this.f218811c);
        }
    }
}
