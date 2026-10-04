package I2;

import I2.AbstractC1164a;
import I2.I0;
import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;

/* JADX INFO: renamed from: I2.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1193o0 extends H2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ProxyControllerBoundaryInterface f51024a;

    @NonNull
    @e.f0
    public static String[][] e(@NonNull List<ProxyConfig.a> list) {
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, list.size(), 2);
        for (int i10 = 0; i10 < list.size(); i10++) {
            strArr[i10][0] = list.get(i10).f120005a;
            strArr[i10][1] = list.get(i10).f120006b;
        }
        return strArr;
    }

    @Override // H2.f
    public void a(@NonNull Executor executor, @NonNull Runnable runnable) {
        if (!H0.f50939Q.d()) {
            throw H0.a();
        }
        d().clearProxyOverride(runnable, executor);
    }

    @Override // H2.f
    public void c(@NonNull ProxyConfig proxyConfig, @NonNull Executor executor, @NonNull Runnable runnable) {
        AbstractC1164a.d dVar = H0.f50939Q;
        AbstractC1164a.d dVar2 = H0.f50945W;
        String[][] strArrE = e(Collections.unmodifiableList(proxyConfig.f120002a));
        String[] strArr = (String[]) Collections.unmodifiableList(proxyConfig.f120003b).toArray(new String[0]);
        if (dVar.d() && !proxyConfig.f120004c) {
            d().setProxyOverride(strArrE, strArr, runnable, executor);
        } else {
            if (!dVar.d() || !dVar2.d()) {
                throw H0.a();
            }
            d().setProxyOverride(strArrE, strArr, runnable, executor, proxyConfig.f120004c);
        }
    }

    public final ProxyControllerBoundaryInterface d() {
        if (this.f51024a == null) {
            this.f51024a = I0.b.f50988a.getProxyController();
        }
        return this.f51024a;
    }
}
