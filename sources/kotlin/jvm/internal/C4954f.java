package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC4864f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.jvm.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4954f extends AbstractC4864f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final int[] f217941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f217942b;

    public C4954f(@NotNull int[] array) {
        G.p(array, "array");
        this.f217941a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f217942b < this.f217941a.length;
    }

    @Override // kotlin.collections.AbstractC4864f0
    public int nextInt() {
        try {
            int[] iArr = this.f217941a;
            int i10 = this.f217942b;
            this.f217942b = i10 + 1;
            return iArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f217942b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
