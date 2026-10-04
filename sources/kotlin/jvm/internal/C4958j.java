package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.g0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.jvm.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4958j extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final long[] f217945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f217946b;

    public C4958j(@NotNull long[] array) {
        G.p(array, "array");
        this.f217945a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f217946b < this.f217945a.length;
    }

    @Override // kotlin.collections.g0
    public long nextLong() {
        try {
            long[] jArr = this.f217945a;
            int i10 = this.f217946b;
            this.f217946b = i10 + 1;
            return jArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f217946b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
