package u4;

import C4.q;
import android.app.Application;
import android.util.Log;
import android.webkit.WebSettings;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nUserPreferencesExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserPreferencesExtensions.kt\ncom/cookiegames/smartcookie/preference/UserPreferencesExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"})
public final class f {
    @NotNull
    public static final String a(@NotNull e eVar, @NotNull Application application) {
        G.p(eVar, "<this>");
        G.p(application, "application");
        Log.d("TEST", "getUserAgent, userAgentChoce: " + eVar.e1());
        int iE1 = eVar.e1();
        if (iE1 == 1) {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(application);
            G.o(defaultUserAgent, "getDefaultUserAgent(...)");
            return defaultUserAgent;
        }
        if (iE1 == 2) {
            return R3.a.f67723a;
        }
        if (iE1 == 3) {
            return R3.a.f67724b;
        }
        if (iE1 != 4) {
            throw new UnsupportedOperationException(android.support.v4.media.c.a("Unknown userAgentChoice: ", iE1));
        }
        String strF1 = eVar.f1();
        if (strF1.length() <= 0) {
            strF1 = null;
        }
        return strF1 == null ? q.f17581a : strF1;
    }
}
