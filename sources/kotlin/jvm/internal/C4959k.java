package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.A0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.jvm.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4959k extends A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final short[] f217947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f217948b;

    public C4959k(@NotNull short[] array) {
        G.p(array, "array");
        this.f217947a = array;
    }

    @Override // kotlin.collections.A0
    public short d() {
        try {
            short[] sArr = this.f217947a;
            int i10 = this.f217948b;
            this.f217948b = i10 + 1;
            return sArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f217948b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f217948b < this.f217947a.length;
    }
}
