package q4;

import android.app.Application;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.compose.runtime.internal.r;
import bc.InterfaceC2859i;
import ed.l;
import hc.z;
import javax.inject.Inject;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import nc.o;
import org.jetbrains.annotations.NotNull;
import x4.C5787b;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
@InterfaceC2859i
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f226805c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f226806d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f226807e = "android.net.conn.CONNECTIVITY_CHANGE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ConnectivityManager f226808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Application f226809b;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @Inject
    public c(@NotNull ConnectivityManager connectivityManager, @NotNull Application application) {
        G.p(connectivityManager, "connectivityManager");
        G.p(application, "application");
        this.f226808a = connectivityManager;
        this.f226809b = application;
    }

    public static final Boolean d(c cVar, Intent it) {
        G.p(it, "it");
        NetworkInfo activeNetworkInfo = cVar.f226808a.getActiveNetworkInfo();
        boolean z10 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public static final Boolean e(l lVar, Object p02) {
        G.p(p02, "p0");
        return (Boolean) lVar.invoke(p02);
    }

    @NotNull
    public final z<Boolean> c() {
        C5787b c5787b = new C5787b(f226807e, this.f226809b);
        final l lVar = new l() { // from class: q4.a
            @Override // ed.l
            public final Object invoke(Object obj) {
                return c.d(this.f226803a, (Intent) obj);
            }
        };
        z zVarU3 = c5787b.u3(new o() { // from class: q4.b
            @Override // nc.o
            public final Object apply(Object obj) {
                return c.e(lVar, obj);
            }
        });
        G.o(zVarU3, "map(...)");
        return zVarU3;
    }
}
