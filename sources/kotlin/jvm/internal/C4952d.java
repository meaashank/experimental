package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.jvm.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4952d extends kotlin.collections.V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final double[] f217937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f217938b;

    public C4952d(@NotNull double[] array) {
        G.p(array, "array");
        this.f217937a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f217938b < this.f217937a.length;
    }

    @Override // kotlin.collections.V
    public double nextDouble() {
        try {
            double[] dArr = this.f217937a;
            int i10 = this.f217938b;
            this.f217938b = i10 + 1;
            return dArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f217938b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
