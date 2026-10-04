package p6;

import android.os.IInterface;
import android.util.Log;
import com.prism.commons.utils.C3839c;

/* JADX INFO: renamed from: p6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5395b<T extends IInterface> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f226346e = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<T> f226348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<T> f226349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile T f226350d;

    public C5395b(String str, Class<T> cls, c<T> cVar) {
        this.f226347a = str;
        this.f226348b = cls;
        this.f226349c = cVar;
    }

    public final void a() {
        T t10 = (T) this.f226349c.a(this.f226347a);
        if (!this.f226349c.b()) {
            t10 = t10;
        }
        Log.d(f226346e, "chkUpdService(" + this.f226347a + ") update serviceInterface(" + this.f226350d + ") to: " + t10);
        this.f226350d = t10;
    }

    public synchronized T b() {
        try {
            if (this.f226350d == null) {
                a();
            } else if (!this.f226349c.b() && !C3839c.c(this.f226350d)) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f226350d;
    }

    public synchronized void c() {
        this.f226350d = null;
    }
}
