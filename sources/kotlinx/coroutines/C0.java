package kotlinx.coroutines;

import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC4850b0
public class C0 extends JobSupport implements InterfaceC5123z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f218704c;

    public C0(@Nullable A0 a02) {
        super(true);
        S0(a02);
        this.f218704c = L1();
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean D0() {
        return true;
    }

    public final boolean L1() {
        InterfaceC5111t interfaceC5111tG0 = G0();
        C5113u c5113u = interfaceC5111tG0 instanceof C5113u ? (C5113u) interfaceC5111tG0 : null;
        if (c5113u == null) {
            return false;
        }
        JobSupport jobSupportG = c5113u.G();
        while (!jobSupportG.z0()) {
            InterfaceC5111t interfaceC5111tG02 = jobSupportG.G0();
            C5113u c5113u2 = interfaceC5111tG02 instanceof C5113u ? (C5113u) interfaceC5111tG02 : null;
            if (c5113u2 == null) {
                return false;
            }
            jobSupportG = c5113u2.G();
        }
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC5123z
    public boolean b(@NotNull Throwable th) {
        return d1(new B(th, false, 2, null));
    }

    @Override // kotlinx.coroutines.InterfaceC5123z
    public boolean k() {
        return d1(kotlin.L0.f217464a);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean z0() {
        return this.f218704c;
    }
}
