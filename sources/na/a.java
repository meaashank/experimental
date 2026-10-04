package Na;

import V5.c;
import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c.a f64925a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f64926b = "intent";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f64927c = "event_ask_perm_manage_external_storage";

    public static void a(c.a aVar) {
        f64925a = aVar;
    }

    public static void b(Context context, String str) {
        c.a aVar = f64925a;
        if (aVar == null) {
            return;
        }
        aVar.a(context, f64927c).c("intent", str).b();
    }
}
