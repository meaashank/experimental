package U3;

import androidx.compose.runtime.internal.r;
import hc.AbstractC4521a;
import hc.I;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.collections.U;
import kotlin.jvm.internal.G;
import nc.InterfaceC5265a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
@r(parameters = 0)
public final class l implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f68524b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Set<a> f68525a = new HashSet();

    @Inject
    public l() {
    }

    public static final void e(l lVar, List list) {
        lVar.f68525a.addAll(list);
    }

    @Override // U3.g
    @NotNull
    public AbstractC4521a a(@NotNull final List<a> hosts) {
        G.p(hosts, "hosts");
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: U3.j
            @Override // nc.InterfaceC5265a
            public final void run() {
                l.e(this.f68521a, hosts);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // U3.g
    public boolean b(@NotNull String host) {
        G.p(host, "host");
        return this.f68525a.contains(new a(host));
    }

    @Override // U3.g
    public boolean d() {
        return this.f68525a.size() > 0;
    }

    @Override // U3.g
    @NotNull
    public AbstractC4521a k() {
        final Set<a> set = this.f68525a;
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: U3.k
            @Override // nc.InterfaceC5265a
            public final void run() {
                set.clear();
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // U3.g
    @NotNull
    public I<List<a>> l() {
        I<List<a>> iO0 = I.o0(U.a6(this.f68525a));
        G.o(iO0, "just(...)");
        return iO0;
    }
}
