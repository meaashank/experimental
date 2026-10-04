package R2;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class d<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f67703f = androidx.work.i.f("ConstraintTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V2.a f67704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f67705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f67706c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<P2.a<T>> f67707d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f67708e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f67709a;

        public a(final List val$listenersList) {
            this.f67709a = val$listenersList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f67709a.iterator();
            while (it.hasNext()) {
                ((P2.a) it.next()).a(d.this.f67708e);
            }
        }
    }

    public d(@NonNull Context context, @NonNull V2.a taskExecutor) {
        this.f67705b = context.getApplicationContext();
        this.f67704a = taskExecutor;
    }

    public void a(P2.a<T> listener) {
        synchronized (this.f67706c) {
            try {
                if (this.f67707d.add(listener)) {
                    if (this.f67707d.size() == 1) {
                        this.f67708e = b();
                        androidx.work.i.c().a(f67703f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f67708e), new Throwable[0]);
                        e();
                    }
                    listener.a(this.f67708e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract T b();

    public void c(P2.a<T> listener) {
        synchronized (this.f67706c) {
            try {
                if (this.f67707d.remove(listener) && this.f67707d.isEmpty()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(T newState) {
        synchronized (this.f67706c) {
            try {
                T t10 = this.f67708e;
                if (t10 != newState && (t10 == null || !t10.equals(newState))) {
                    this.f67708e = newState;
                    this.f67704a.c().execute(new a(new ArrayList(this.f67707d)));
                }
            } finally {
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
