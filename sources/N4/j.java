package N4;

import android.content.Context;
import com.prism.bugreport.commons.Bug;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f59101a = "sync_failed";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f59102b = "import_failed";

    public static Z5.a a() {
        return d.l().d();
    }

    public static void b(Context context, Throwable th) {
        a().a(context, new Bug.Builder().withType(f59102b).withException(th).build());
    }

    public static void c(Context context, Throwable th) {
        a().a(context, new Bug.Builder().withType(f59101a).withException(th).build());
    }
}
