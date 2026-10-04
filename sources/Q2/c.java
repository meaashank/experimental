package Q2;

import T2.r;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c<T> implements P2.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f65813a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f65814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public R2.d<T> f65815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f65816d;

    public interface a {
        void a(@NonNull List<String> workSpecIds);

        void b(@NonNull List<String> workSpecIds);
    }

    public c(R2.d<T> tracker) {
        this.f65815c = tracker;
    }

    @Override // P2.a
    public void a(@Nullable T newValue) {
        this.f65814b = newValue;
        h(this.f65816d, newValue);
    }

    public abstract boolean b(@NonNull r workSpec);

    public abstract boolean c(@NonNull T currentValue);

    public boolean d(@NonNull String workSpecId) {
        T t10 = this.f65814b;
        return t10 != null && c(t10) && this.f65813a.contains(workSpecId);
    }

    public void e(@NonNull Iterable<r> workSpecs) {
        this.f65813a.clear();
        for (r rVar : workSpecs) {
            if (b(rVar)) {
                this.f65813a.add(rVar.f68219a);
            }
        }
        if (this.f65813a.isEmpty()) {
            this.f65815c.c(this);
        } else {
            this.f65815c.a(this);
        }
        h(this.f65816d, this.f65814b);
    }

    public void f() {
        if (this.f65813a.isEmpty()) {
            return;
        }
        this.f65813a.clear();
        this.f65815c.c(this);
    }

    public void g(@Nullable a callback) {
        if (this.f65816d != callback) {
            this.f65816d = callback;
            h(callback, this.f65814b);
        }
    }

    public final void h(@Nullable a callback, @Nullable T currentValue) {
        if (this.f65813a.isEmpty() || callback == null) {
            return;
        }
        if (currentValue == null || c(currentValue)) {
            callback.b(this.f65813a);
        } else {
            callback.a(this.f65813a);
        }
    }
}
