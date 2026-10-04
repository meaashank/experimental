package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4950b extends kotlin.collections.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f217924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f217925b;

    public C4950b(@NotNull byte[] array) {
        G.p(array, "array");
        this.f217924a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f217925b < this.f217924a.length;
    }

    @Override // kotlin.collections.E
    public byte nextByte() {
        try {
            byte[] bArr = this.f217924a;
            int i10 = this.f217925b;
            this.f217925b = i10 + 1;
            return bArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f217925b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
