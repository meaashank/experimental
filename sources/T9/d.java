package T9;

import android.content.Context;
import com.prism.commons.utils.C3861z;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f68358b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3861z<com.tonyodev.fetch2.b, Context> f68359a = new C3861z<>(new c());

    public static d c() {
        if (f68358b == null) {
            synchronized (d.class) {
                try {
                    if (f68358b == null) {
                        f68358b = new d();
                    }
                } finally {
                }
            }
        }
        return f68358b;
    }

    public com.tonyodev.fetch2.b b(Context context) {
        return this.f68359a.a(context);
    }
}
