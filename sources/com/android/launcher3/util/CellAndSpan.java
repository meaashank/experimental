package com.android.launcher3.util;

import U6.j;

/* JADX INFO: loaded from: classes2.dex */
public class CellAndSpan {
    public int cellX;
    public int cellY;
    public int spanX;
    public int spanY;

    public CellAndSpan() {
        this.cellX = -1;
        this.cellY = -1;
        this.spanX = 1;
        this.spanY = 1;
    }

    public void copyFrom(CellAndSpan cellAndSpan) {
        this.cellX = cellAndSpan.cellX;
        this.cellY = cellAndSpan.cellY;
        this.spanX = cellAndSpan.spanX;
        this.spanY = cellAndSpan.spanY;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.cellX);
        sb2.append(j.f68738d);
        sb2.append(this.cellY);
        sb2.append(": ");
        sb2.append(this.spanX);
        sb2.append(j.f68738d);
        return android.support.v4.media.d.a(sb2, this.spanY, ")");
    }

    public CellAndSpan(int i10, int i11, int i12, int i13) {
        this.cellX = i10;
        this.cellY = i11;
        this.spanX = i12;
        this.spanY = i13;
    }
}
