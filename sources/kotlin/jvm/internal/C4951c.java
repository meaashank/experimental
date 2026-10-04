package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4951c extends kotlin.collections.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final char[] f217935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f217936b;

    public C4951c(@NotNull char[] array) {
        G.p(array, "array");
        this.f217935a = array;
    }

    @Override // kotlin.collections.F
    public char d() {
        try {
            char[] cArr = this.f217935a;
            int i10 = this.f217936b;
            this.f217936b = i10 + 1;
            return cArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f217936b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f217936b < this.f217935a.length;
    }
}
