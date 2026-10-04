package R2;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.f0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static h f67718e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f67719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f67720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f67721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f67722d;

    public h(@NonNull Context context, @NonNull V2.a taskExecutor) {
        Context applicationContext = context.getApplicationContext();
        this.f67719a = new a(applicationContext, taskExecutor);
        this.f67720b = new b(applicationContext, taskExecutor);
        this.f67721c = new f(applicationContext, taskExecutor);
        this.f67722d = new g(applicationContext, taskExecutor);
    }

    @NonNull
    public static synchronized h c(Context context, V2.a taskExecutor) {
        try {
            if (f67718e == null) {
                f67718e = new h(context, taskExecutor);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f67718e;
    }

    @f0
    public static synchronized void f(@NonNull h trackers) {
        f67718e = trackers;
    }

    @NonNull
    public a a() {
        return this.f67719a;
    }

    @NonNull
    public b b() {
        return this.f67720b;
    }

    @NonNull
    public f d() {
        return this.f67721c;
    }

    @NonNull
    public g e() {
        return this.f67722d;
    }
}
