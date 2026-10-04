package s0;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class r extends C5563e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final boolean f238153q = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l f238154p;

    public r(String str) {
        this.f238020a = str;
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i10 = 0;
        while (iIndexOf2 != -1) {
            dArr[i10] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i10++;
        }
        dArr[i10] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        this.f238154p = e(Arrays.copyOf(dArr, i10 + 1));
    }

    public static l d(String str) {
        String[] strArrSplit = str.split("\\s+");
        int length = strArrSplit.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = Double.parseDouble(strArrSplit[i10]);
        }
        return e(dArr);
    }

    public static l e(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d10 = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            double d11 = dArr[i10];
            int i11 = i10 + length2;
            dArr2[i11][0] = d11;
            double d12 = ((double) i10) * d10;
            dArr3[i11] = d12;
            if (i10 > 0) {
                int i12 = (length2 * 2) + i10;
                dArr2[i12][0] = d11 + 1.0d;
                dArr3[i12] = d12 + 1.0d;
                int i13 = i10 - 1;
                dArr2[i13][0] = (d11 - 1.0d) - d10;
                dArr3[i13] = (d12 - 1.0d) - d10;
            }
        }
        l lVar = new l(dArr3, dArr2);
        System.out.println(" 0 " + lVar.c(0.0d, 0));
        System.out.println(" 1 " + lVar.c(1.0d, 0));
        return lVar;
    }

    @Override // s0.C5563e
    public double a(double d10) {
        return this.f238154p.c(d10, 0);
    }

    @Override // s0.C5563e
    public double b(double d10) {
        return this.f238154p.f(d10, 0);
    }
}
