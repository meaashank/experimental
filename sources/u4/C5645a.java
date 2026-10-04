package u4;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.semantics.s;
import javax.inject.Inject;
import javax.inject.Singleton;
import kd.InterfaceC4846f;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.P;
import kotlin.reflect.l;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: u4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Singleton
@r(parameters = 0)
public final class C5645a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f239371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f239372e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239375c;

    static {
        l lVarK = O.k(new MutablePropertyReference1Impl(C5645a.class, "useLeakCanary", "getUseLeakCanary()Z", 0));
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(C5645a.class, "checkedForTor", "getCheckedForTor()Z", 0);
        P p10 = O.f217893a;
        f239371d = new n[]{lVarK, p10.i(mutablePropertyReference1Impl), s.a(C5645a.class, "checkedForI2P", "getCheckedForI2P()Z", 0, p10)};
        f239372e = 8;
    }

    @Inject
    public C5645a(@NotNull SharedPreferences preferences) {
        G.p(preferences, "preferences");
        this.f239373a = v4.b.a(preferences, b.f239376a, false);
        this.f239374b = v4.b.a(preferences, b.f239377b, false);
        this.f239375c = v4.b.a(preferences, b.f239378c, false);
    }

    public final boolean a() {
        return ((Boolean) this.f239375c.getValue(this, f239371d[2])).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.f239374b.getValue(this, f239371d[1])).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.f239373a.getValue(this, f239371d[0])).booleanValue();
    }

    public final void d(boolean z10) {
        this.f239375c.setValue(this, f239371d[2], Boolean.valueOf(z10));
    }

    public final void e(boolean z10) {
        this.f239374b.setValue(this, f239371d[1], Boolean.valueOf(z10));
    }

    public final void f(boolean z10) {
        this.f239373a.setValue(this, f239371d[0], Boolean.valueOf(z10));
    }
}
