package d0;

import androidx.compose.runtime.internal.r;

/* JADX INFO: renamed from: d0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public abstract class AbstractC4285b implements InterfaceC4289f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f194543c = 0;

    @Override // d0.InterfaceC4289f
    public int a(int i10) {
        int iF = f(i10);
        if (iF == -1 || f(iF) == -1) {
            return -1;
        }
        return iF;
    }

    @Override // d0.InterfaceC4289f
    public int b(int i10) {
        int iE = e(i10);
        if (iE == -1 || e(iE) == -1) {
            return -1;
        }
        return iE;
    }

    @Override // d0.InterfaceC4289f
    public int c(int i10) {
        return f(i10);
    }

    @Override // d0.InterfaceC4289f
    public int d(int i10) {
        return e(i10);
    }

    public abstract int e(int i10);

    public abstract int f(int i10);
}
