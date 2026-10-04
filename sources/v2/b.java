package V2;

import U2.n;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class b implements V2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f74589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f74590b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f74591c = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable command) {
            b.this.a(command);
        }
    }

    public b(@NonNull Executor backgroundExecutor) {
        this.f74589a = new n(backgroundExecutor);
    }

    @Override // V2.a
    public void a(Runnable runnable) {
        this.f74590b.post(runnable);
    }

    @Override // V2.a
    @NonNull
    public n b() {
        return this.f74589a;
    }

    @Override // V2.a
    public Executor c() {
        return this.f74591c;
    }

    @Override // V2.a
    public void d(Runnable runnable) {
        this.f74589a.execute(runnable);
    }
}
