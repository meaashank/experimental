package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class N<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f217890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f217891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final T[] f217892c;

    public N(int i10) {
        this.f217890a = i10;
        this.f217892c = (T[]) new Object[i10];
    }

    public static /* synthetic */ void d() {
    }

    public final void a(@NotNull T spreadArgument) {
        G.p(spreadArgument, "spreadArgument");
        T[] tArr = this.f217892c;
        int i10 = this.f217891b;
        this.f217891b = i10 + 1;
        tArr[i10] = spreadArgument;
    }

    public final int b() {
        return this.f217891b;
    }

    public abstract int c(@NotNull T t10);

    public final void e(int i10) {
        this.f217891b = i10;
    }

    public final int f() {
        int i10 = this.f217890a - 1;
        int iC = 0;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                T t10 = this.f217892c[i11];
                iC += t10 != null ? c(t10) : 1;
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        return iC;
    }

    @NotNull
    public final T g(@NotNull T values, @NotNull T result) {
        int i10;
        G.p(values, "values");
        G.p(result, "result");
        int i11 = this.f217890a - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int i13 = 0;
            int i14 = 0;
            i10 = 0;
            while (true) {
                T t10 = this.f217892c[i13];
                if (t10 != null) {
                    if (i14 < i13) {
                        int i15 = i13 - i14;
                        System.arraycopy(values, i14, result, i10, i15);
                        i10 += i15;
                    }
                    int iC = c(t10);
                    System.arraycopy(t10, 0, result, i10, iC);
                    i10 += iC;
                    i14 = i13 + 1;
                }
                if (i13 == i11) {
                    break;
                }
                i13++;
            }
            i12 = i14;
        } else {
            i10 = 0;
        }
        int i16 = this.f217890a;
        if (i12 < i16) {
            System.arraycopy(values, i12, result, i10, i16 - i12);
        }
        return result;
    }
}
