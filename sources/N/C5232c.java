package n;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: n.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class C5232c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5232c f221198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final Executor f221199d = new ExecutorC5230a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final Executor f221200e = new ExecutorC5231b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public e f221201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final e f221202b;

    public C5232c() {
        C5233d c5233d = new C5233d();
        this.f221202b = c5233d;
        this.f221201a = c5233d;
    }

    @NonNull
    public static Executor g() {
        return f221200e;
    }

    @NonNull
    public static C5232c h() {
        if (f221198c != null) {
            return f221198c;
        }
        synchronized (C5232c.class) {
            try {
                if (f221198c == null) {
                    f221198c = new C5232c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f221198c;
    }

    @NonNull
    public static Executor i() {
        return f221199d;
    }

    @Override // n.e
    public void a(@NonNull Runnable runnable) {
        this.f221201a.a(runnable);
    }

    @Override // n.e
    public boolean c() {
        return this.f221201a.c();
    }

    @Override // n.e
    public void d(@NonNull Runnable runnable) {
        this.f221201a.d(runnable);
    }

    public void j(@Nullable e eVar) {
        if (eVar == null) {
            eVar = this.f221202b;
        }
        this.f221201a = eVar;
    }
}
