package androidx.compose.runtime;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class W1<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99397b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<T> f99398a = new ArrayList<>();

    public final void a() {
        this.f99398a.clear();
    }

    public final int b() {
        return this.f99398a.size();
    }

    public final boolean c() {
        return this.f99398a.isEmpty();
    }

    public final boolean d() {
        return !this.f99398a.isEmpty();
    }

    public final T e() {
        return (T) V1.a(this.f99398a, 1);
    }

    public final T f(int i10) {
        return this.f99398a.get(i10);
    }

    public final T g() {
        return this.f99398a.remove(r0.size() - 1);
    }

    public final boolean h(T t10) {
        return this.f99398a.add(t10);
    }

    @NotNull
    public final T[] i() {
        int size = this.f99398a.size();
        T[] tArr = (T[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            tArr[i10] = this.f99398a.get(i10);
        }
        return tArr;
    }
}
