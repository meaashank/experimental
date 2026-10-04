package kotlinx.coroutines.rx3;

import java.lang.reflect.InvocationTargetException;
import kotlin.C4987s;
import kotlin.L0;
import kotlinx.coroutines.AbstractC5049a;
import org.jetbrains.annotations.NotNull;
import zc.InterfaceC5887d;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends AbstractC5049a<L0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC5887d f220614d;

    public c(@NotNull kotlin.coroutines.i iVar, @NotNull InterfaceC5887d interfaceC5887d) {
        super(iVar, false, true);
        this.f220614d = interfaceC5887d;
    }

    @Override // kotlinx.coroutines.AbstractC5049a
    public void P1(@NotNull Throwable th, boolean z10) throws IllegalAccessException, InvocationTargetException {
        try {
            if (this.f220614d.a(th)) {
                return;
            }
        } catch (Throwable th2) {
            C4987s.a(th, th2);
        }
        b.a(th, this.f218811c);
    }

    @Override // kotlinx.coroutines.AbstractC5049a
    /* JADX INFO: renamed from: S1, reason: merged with bridge method [inline-methods] */
    public void Q1(@NotNull L0 l02) throws IllegalAccessException, InvocationTargetException {
        try {
            this.f220614d.onComplete();
        } catch (Throwable th) {
            b.a(th, this.f218811c);
        }
    }
}
