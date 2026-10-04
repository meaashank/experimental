package androidx.room;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.room.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2669j0 implements v2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Object> f117277a = new ArrayList();

    @Override // v2.e
    public void E1(int i10, long j10) {
        e(i10, Long.valueOf(j10));
    }

    @Override // v2.e
    public void J1(int i10, @NotNull byte[] value) {
        kotlin.jvm.internal.G.p(value, "value");
        e(i10, value);
    }

    @Override // v2.e
    public void T3() {
        this.f117277a.clear();
    }

    @Override // v2.e
    public void X1(int i10) {
        e(i10, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @NotNull
    public final List<Object> d() {
        return this.f117277a;
    }

    public final void e(int i10, Object obj) {
        int size;
        int i11 = i10 - 1;
        if (i11 >= this.f117277a.size() && (size = this.f117277a.size()) <= i11) {
            while (true) {
                this.f117277a.add(null);
                if (size == i11) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.f117277a.set(i11, obj);
    }

    @Override // v2.e
    public void t1(int i10, @NotNull String value) {
        kotlin.jvm.internal.G.p(value, "value");
        e(i10, value);
    }

    @Override // v2.e
    public void t2(int i10, double d10) {
        e(i10, Double.valueOf(d10));
    }
}
