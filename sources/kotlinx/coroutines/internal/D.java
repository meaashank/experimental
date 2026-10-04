package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.InterfaceC5120x0;
import kotlinx.coroutines.J0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatchersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f220272a = "kotlinx.coroutines.fast.service.loader";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f220273b = false;

    public static final E a(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        e();
        throw null;
    }

    public static /* synthetic */ E b(Throwable th, String str, int i10, Object obj) throws Throwable {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        a(th, str);
        throw null;
    }

    public static /* synthetic */ void c() {
    }

    @InterfaceC5120x0
    public static final boolean d(@NotNull J0 j02) {
        return j02.Z2() instanceof E;
    }

    @NotNull
    public static final Void e() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @InterfaceC5120x0
    @NotNull
    public static final J0 f(@NotNull B b10, @NotNull List<? extends B> list) throws Throwable {
        try {
            return b10.c(list);
        } catch (Throwable th) {
            a(th, b10.b());
            throw null;
        }
    }
}
