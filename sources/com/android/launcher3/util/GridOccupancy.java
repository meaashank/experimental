package com.android.launcher3.util;

import android.graphics.Rect;
import com.android.launcher3.ItemInfo;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public class GridOccupancy {
    public final boolean[][] cells;
    private final int mCountX;
    private final int mCountY;

    public GridOccupancy(int i10, int i11) {
        this.mCountX = i10;
        this.mCountY = i11;
        this.cells = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i10, i11);
    }

    public void clear() {
        markCells(0, 0, this.mCountX, this.mCountY, false);
    }

    public void copyTo(GridOccupancy gridOccupancy) {
        for (int i10 = 0; i10 < this.mCountX; i10++) {
            for (int i11 = 0; i11 < this.mCountY; i11++) {
                gridOccupancy.cells[i10][i11] = this.cells[i10][i11];
            }
        }
    }

    public boolean findVacantCell(int[] iArr, int i10, int i11) {
        int i12 = 0;
        while (true) {
            int i13 = i12 + i11;
            if (i13 > this.mCountY) {
                return false;
            }
            int i14 = 0;
            while (true) {
                int i15 = i14 + i10;
                if (i15 <= this.mCountX) {
                    boolean z10 = !this.cells[i14][i12];
                    for (int i16 = i14; i16 < i15; i16++) {
                        for (int i17 = i12; i17 < i13; i17++) {
                            z10 = z10 && !this.cells[i16][i17];
                            if (!z10) {
                                break;
                            }
                        }
                    }
                    if (z10) {
                        iArr[0] = i14;
                        iArr[1] = i12;
                        return true;
                    }
                    i14++;
                }
            }
            i12++;
        }
    }

    public boolean isRegionVacant(int i10, int i11, int i12, int i13) {
        int i14 = (i12 + i10) - 1;
        int i15 = (i13 + i11) - 1;
        if (i10 < 0 || i11 < 0 || i14 >= this.mCountX || i15 >= this.mCountY) {
            return false;
        }
        while (i10 <= i14) {
            for (int i16 = i11; i16 <= i15; i16++) {
                if (this.cells[i10][i16]) {
                    return false;
                }
            }
            i10++;
        }
        return true;
    }

    public void markCells(int i10, int i11, int i12, int i13, boolean z10) {
        if (i10 < 0 || i11 < 0) {
            return;
        }
        for (int i14 = i10; i14 < i10 + i12 && i14 < this.mCountX; i14++) {
            for (int i15 = i11; i15 < i11 + i13 && i15 < this.mCountY; i15++) {
                this.cells[i14][i15] = z10;
            }
        }
    }

    public void markCells(Rect rect, boolean z10) {
        markCells(rect.left, rect.top, rect.width(), rect.height(), z10);
    }

    public void markCells(CellAndSpan cellAndSpan, boolean z10) {
        markCells(cellAndSpan.cellX, cellAndSpan.cellY, cellAndSpan.spanX, cellAndSpan.spanY, z10);
    }

    public void markCells(ItemInfo itemInfo, boolean z10) {
        markCells(itemInfo.cellX, itemInfo.cellY, itemInfo.spanX, itemInfo.spanY, z10);
    }
}
