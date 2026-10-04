package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.jvm.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4953e extends kotlin.collections.X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final float[] f217939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f217940b;

    public C4953e(@NotNull float[] array) {
        G.p(array, "array");
        this.f217939a = array;
    }

    @Override // kotlin.collections.X
    public float d() {
        try {
            float[] fArr = this.f217939a;
            int i10 = this.f217940b;
            this.f217940b = i10 + 1;
            return fArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f217940b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f217940b < this.f217939a.length;
    }
}
