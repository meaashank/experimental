package Y5;

import a6.C1450a;
import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Z5.a f79254a;

    public static Z5.a a(Context context) {
        if (f79254a == null) {
            synchronized (a.class) {
                try {
                    if (f79254a == null) {
                        f79254a = new C1450a();
                    }
                } finally {
                }
            }
        }
        return f79254a;
    }
}
