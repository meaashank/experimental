package org.javia.arity;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes6.dex */
class DoubleStack {
    private double[] re = new double[8];
    private double[] im = new double[8];
    private int size = 0;

    public void clear() {
        this.size = 0;
    }

    public double[] getIm() {
        int i10 = 0;
        while (true) {
            int i11 = this.size;
            if (i10 >= i11) {
                return null;
            }
            double[] dArr = this.im;
            if (dArr[i10] != 0.0d) {
                double[] dArr2 = new double[i11];
                System.arraycopy(dArr, 0, dArr2, 0, i11);
                return dArr2;
            }
            i10++;
        }
    }

    public double[] getRe() {
        int i10 = this.size;
        double[] dArr = new double[i10];
        System.arraycopy(this.re, 0, dArr, 0, i10);
        return dArr;
    }

    public void pop(int i10) {
        int i11 = this.size;
        if (i10 <= i11) {
            this.size = i11 - i10;
        } else {
            StringBuilder sbA = a.a("pop ", i10, " from ");
            sbA.append(this.size);
            throw new Error(sbA.toString());
        }
    }

    public void push(double d10, double d11) {
        int i10 = this.size;
        double[] dArr = this.re;
        if (i10 >= dArr.length) {
            int length = dArr.length << 1;
            double[] dArr2 = new double[length];
            double[] dArr3 = new double[length];
            System.arraycopy(dArr, 0, dArr2, 0, dArr.length);
            System.arraycopy(this.im, 0, dArr3, 0, this.re.length);
            this.re = dArr2;
            this.im = dArr3;
        }
        double[] dArr4 = this.re;
        int i11 = this.size;
        dArr4[i11] = d10;
        this.im[i11] = d11;
        this.size = i11 + 1;
    }

    public void pop() {
        this.size--;
    }
}
