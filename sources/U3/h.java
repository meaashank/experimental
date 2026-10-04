package U3;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.r;
import javax.inject.Inject;
import kd.InterfaceC4846f;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.O;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f68518e = "identity";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f68519a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f68516c = {O.k(new MutablePropertyReference1Impl(h.class, "identity", "getIdentity()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f68515b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f68517d = 8;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @Inject
    public h(@NotNull SharedPreferences preferences) {
        G.p(preferences, "preferences");
        this.f68519a = v4.h.b(preferences, "identity", null, 2, null);
    }

    @Nullable
    public final String a() {
        return (String) this.f68519a.getValue(this, f68516c[0]);
    }

    public final void b(@Nullable String str) {
        this.f68519a.setValue(this, f68516c[0], str);
    }
}
