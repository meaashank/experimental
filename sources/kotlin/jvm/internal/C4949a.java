package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4949a extends kotlin.collections.D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final boolean[] f217921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f217922b;

    public C4949a(@NotNull boolean[] array) {
        G.p(array, "array");
        this.f217921a = array;
    }

    @Override // kotlin.collections.D
    public boolean d() {
        try {
            boolean[] zArr = this.f217921a;
            int i10 = this.f217922b;
            this.f217922b = i10 + 1;
            return zArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f217922b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f217922b < this.f217921a.length;
    }
}
