package com.android.launcher3.util;

import android.util.Log;
import android.view.View;
import com.android.launcher3.CellLayout;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.ShortcutAndWidgetContainer;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class FocusLogic {
    public static final int ALL_APPS_COLUMN = -11;
    public static final int CURRENT_PAGE_FIRST_ITEM = -6;
    public static final int CURRENT_PAGE_LAST_ITEM = -7;
    private static final boolean DEBUG = false;
    public static final int EMPTY = -1;
    public static final int NEXT_PAGE_FIRST_ITEM = -8;
    public static final int NEXT_PAGE_LEFT_COLUMN = -9;
    public static final int NEXT_PAGE_RIGHT_COLUMN = -10;
    public static final int NOOP = -1;
    public static final int PIVOT = 100;
    public static final int PREVIOUS_PAGE_FIRST_ITEM = -3;
    public static final int PREVIOUS_PAGE_LAST_ITEM = -4;
    public static final int PREVIOUS_PAGE_LEFT_COLUMN = -5;
    public static final int PREVIOUS_PAGE_RIGHT_COLUMN = -2;
    private static final String TAG = "FocusLogic";

    private static int[][] createFullMatrix(int i10, int i11) {
        int[] iArr = {i10, i11};
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr);
        for (int i12 = 0; i12 < i10; i12++) {
            Arrays.fill(iArr2[i12], -1);
        }
        return iArr2;
    }

    public static int[][] createSparseMatrix(CellLayout cellLayout) {
        ShortcutAndWidgetContainer shortcutsAndWidgets = cellLayout.getShortcutsAndWidgets();
        int countX = cellLayout.getCountX();
        int countY = cellLayout.getCountY();
        boolean zInvertLayoutHorizontally = shortcutsAndWidgets.invertLayoutHorizontally();
        int[][] iArrCreateFullMatrix = createFullMatrix(countX, countY);
        for (int i10 = 0; i10 < shortcutsAndWidgets.getChildCount(); i10++) {
            View childAt = shortcutsAndWidgets.getChildAt(i10);
            if (childAt.isFocusable()) {
                int i11 = ((CellLayout.LayoutParams) childAt.getLayoutParams()).cellX;
                int i12 = ((CellLayout.LayoutParams) childAt.getLayoutParams()).cellY;
                if (zInvertLayoutHorizontally) {
                    i11 = (countX - i11) - 1;
                }
                if (i11 < countX && i12 < countY) {
                    iArrCreateFullMatrix[i11][i12] = i10;
                }
            }
        }
        return iArrCreateFullMatrix;
    }

    public static int[][] createSparseMatrixWithHotseat(CellLayout cellLayout, CellLayout cellLayout2, DeviceProfile deviceProfile) {
        int countX;
        int countY;
        ShortcutAndWidgetContainer shortcutsAndWidgets = cellLayout.getShortcutsAndWidgets();
        ShortcutAndWidgetContainer shortcutsAndWidgets2 = cellLayout2.getShortcutsAndWidgets();
        boolean zIsVerticalBarLayout = deviceProfile.isVerticalBarLayout();
        boolean z10 = zIsVerticalBarLayout ? cellLayout2.getCountY() > cellLayout.getCountY() : cellLayout2.getCountX() > cellLayout.getCountX();
        if (zIsVerticalBarLayout) {
            countX = cellLayout.getCountX() + cellLayout2.getCountX();
            countY = cellLayout2.getCountY();
        } else {
            countX = cellLayout2.getCountX();
            countY = cellLayout2.getCountY() + cellLayout.getCountY();
        }
        int[][] iArrCreateFullMatrix = createFullMatrix(countX, countY);
        if (z10) {
            int allAppsButtonRank = deviceProfile.inv.getAllAppsButtonRank();
            if (zIsVerticalBarLayout) {
                for (int i10 = 0; i10 < countX; i10++) {
                    iArrCreateFullMatrix[i10][allAppsButtonRank] = -11;
                }
            } else {
                for (int i11 = 0; i11 < countY; i11++) {
                    iArrCreateFullMatrix[allAppsButtonRank][i11] = -11;
                }
            }
        }
        for (int i12 = 0; i12 < shortcutsAndWidgets.getChildCount(); i12++) {
            View childAt = shortcutsAndWidgets.getChildAt(i12);
            if (childAt.isFocusable()) {
                int i13 = ((CellLayout.LayoutParams) childAt.getLayoutParams()).cellX;
                int i14 = ((CellLayout.LayoutParams) childAt.getLayoutParams()).cellY;
                if (z10) {
                    int allAppsButtonRank2 = deviceProfile.inv.getAllAppsButtonRank();
                    if (!zIsVerticalBarLayout && i13 >= allAppsButtonRank2) {
                        i13++;
                    }
                    if (zIsVerticalBarLayout && i14 >= allAppsButtonRank2) {
                        i14++;
                    }
                }
                iArrCreateFullMatrix[i13][i14] = i12;
            }
        }
        for (int childCount = shortcutsAndWidgets2.getChildCount() - 1; childCount >= 0; childCount--) {
            if (zIsVerticalBarLayout) {
                iArrCreateFullMatrix[cellLayout.getCountX()][((CellLayout.LayoutParams) shortcutsAndWidgets2.getChildAt(childCount).getLayoutParams()).cellY] = shortcutsAndWidgets.getChildCount() + childCount;
            } else {
                iArrCreateFullMatrix[((CellLayout.LayoutParams) shortcutsAndWidgets2.getChildAt(childCount).getLayoutParams()).cellX][cellLayout.getCountY()] = shortcutsAndWidgets.getChildCount() + childCount;
            }
        }
        return iArrCreateFullMatrix;
    }

    public static int[][] createSparseMatrixWithPivotColumn(CellLayout cellLayout, int i10, int i11) {
        ShortcutAndWidgetContainer shortcutsAndWidgets = cellLayout.getShortcutsAndWidgets();
        int[][] iArrCreateFullMatrix = createFullMatrix(cellLayout.getCountX() + 1, cellLayout.getCountY());
        for (int i12 = 0; i12 < shortcutsAndWidgets.getChildCount(); i12++) {
            View childAt = shortcutsAndWidgets.getChildAt(i12);
            if (childAt.isFocusable()) {
                int i13 = ((CellLayout.LayoutParams) childAt.getLayoutParams()).cellX;
                int i14 = ((CellLayout.LayoutParams) childAt.getLayoutParams()).cellY;
                if (i10 < 0) {
                    iArrCreateFullMatrix[i13 - i10][i14] = i12;
                } else {
                    iArrCreateFullMatrix[i13][i14] = i12;
                }
            }
        }
        if (i10 < 0) {
            iArrCreateFullMatrix[0][i11] = 100;
            return iArrCreateFullMatrix;
        }
        iArrCreateFullMatrix[i10][i11] = 100;
        return iArrCreateFullMatrix;
    }

    public static View getAdjacentChildInNextFolderPage(ShortcutAndWidgetContainer shortcutAndWidgetContainer, View view, int i10) {
        int i11 = ((CellLayout.LayoutParams) view.getLayoutParams()).cellY;
        for (int countX = (i10 == -9) ^ shortcutAndWidgetContainer.invertLayoutHorizontally() ? 0 : ((CellLayout) shortcutAndWidgetContainer.getParent()).getCountX() - 1; countX >= 0; countX--) {
            for (int i12 = i11; i12 >= 0; i12--) {
                View childAt = shortcutAndWidgetContainer.getChildAt(countX, i12);
                if (childAt != null) {
                    return childAt;
                }
            }
        }
        return null;
    }

    private static String getStringIndex(int i10) {
        switch (i10) {
            case ALL_APPS_COLUMN /* -11 */:
                return "ALL_APPS_COLUMN";
            case -10:
            case -5:
            default:
                return Integer.toString(i10);
            case -9:
                return "NEXT_PAGE_LEFT_COLUMN";
            case -8:
                return "NEXT_PAGE_FIRST";
            case -7:
                return "CURRENT_PAGE_LAST";
            case -6:
                return "CURRENT_PAGE_FIRST";
            case -4:
                return "PREVIOUS_PAGE_LAST";
            case -3:
                return "PREVIOUS_PAGE_FIRST";
            case -2:
                return "PREVIOUS_PAGE_RIGHT_COLUMN";
            case -1:
                return "NOOP";
        }
    }

    private static int handleDpadHorizontal(int i10, int i11, int i12, int[][] iArr, int i13, boolean z10) {
        if (iArr == null) {
            throw new IllegalStateException("Dpad navigation requires a matrix.");
        }
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < i11; i16++) {
            for (int i17 = 0; i17 < i12; i17++) {
                if (iArr[i16][i17] == i10) {
                    i14 = i16;
                    i15 = i17;
                }
            }
        }
        int i18 = i14 + i13;
        int iInspectMatrix = -1;
        while (i18 >= 0 && i18 < i11) {
            iInspectMatrix = inspectMatrix(i18, i15, i11, i12, iArr);
            if (iInspectMatrix != -1 && iInspectMatrix != -11) {
                return iInspectMatrix;
            }
            i18 += i13;
        }
        boolean z11 = false;
        boolean z12 = false;
        for (int i19 = 1; i19 < i12; i19++) {
            int i20 = i19 * i13;
            int i21 = i15 + i20;
            int i22 = i15 - i20;
            int i23 = i20 + i14;
            if (inspectMatrix(i23, i21, i11, i12, iArr) == -11) {
                z11 = true;
            }
            if (inspectMatrix(i23, i22, i11, i12, iArr) == -11) {
                z12 = true;
            }
            while (i23 >= 0 && i23 < i11) {
                int iInspectMatrix2 = inspectMatrix(i23, ((!z11 || i23 >= i11 + (-1)) ? 0 : i13) + i21, i11, i12, iArr);
                if (iInspectMatrix2 != -1) {
                    return iInspectMatrix2;
                }
                iInspectMatrix = inspectMatrix(i23, ((!z12 || i23 >= i11 + (-1)) ? 0 : -i13) + i22, i11, i12, iArr);
                if (iInspectMatrix != -1) {
                    return iInspectMatrix;
                }
                i23 += i13;
            }
        }
        return i10 == 100 ? z10 ? i13 < 0 ? -8 : -4 : i13 < 0 ? -4 : -8 : iInspectMatrix;
    }

    private static int handleDpadVertical(int i10, int i11, int i12, int[][] iArr, int i13) {
        if (iArr == null) {
            throw new IllegalStateException("Dpad navigation requires a matrix.");
        }
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < i11; i16++) {
            for (int i17 = 0; i17 < i12; i17++) {
                if (iArr[i16][i17] == i10) {
                    i15 = i16;
                    i14 = i17;
                }
            }
        }
        int i18 = i14 + i13;
        int iInspectMatrix = -1;
        while (i18 >= 0 && i18 < i12 && i18 >= 0) {
            iInspectMatrix = inspectMatrix(i15, i18, i11, i12, iArr);
            if (iInspectMatrix != -1 && iInspectMatrix != -11) {
                return iInspectMatrix;
            }
            i18 += i13;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i19 = 1; i19 < i11; i19++) {
            int i20 = i19 * i13;
            int i21 = i15 + i20;
            int i22 = i15 - i20;
            int i23 = i20 + i14;
            if (inspectMatrix(i21, i23, i11, i12, iArr) == -11) {
                z10 = true;
            }
            if (inspectMatrix(i22, i23, i11, i12, iArr) == -11) {
                z11 = true;
            }
            while (i23 >= 0 && i23 < i12) {
                int iInspectMatrix2 = inspectMatrix(((!z10 || i23 >= i12 + (-1)) ? 0 : i13) + i21, i23, i11, i12, iArr);
                if (iInspectMatrix2 != -1) {
                    return iInspectMatrix2;
                }
                iInspectMatrix = inspectMatrix(((!z11 || i23 >= i12 + (-1)) ? 0 : -i13) + i22, i23, i11, i12, iArr);
                if (iInspectMatrix != -1) {
                    return iInspectMatrix;
                }
                i23 += i13;
            }
        }
        return iInspectMatrix;
    }

    public static int handleKeyEvent(int i10, int[][] iArr, int i11, int i12, int i13, boolean z10) {
        int length = iArr == null ? -1 : iArr.length;
        int length2 = iArr == null ? -1 : iArr[0].length;
        if (i10 == 92) {
            return handlePageUp(i12);
        }
        if (i10 == 93) {
            return handlePageDown(i12, i13);
        }
        if (i10 == 122) {
            return -6;
        }
        if (i10 == 123) {
            return -7;
        }
        switch (i10) {
            case 19:
                return handleDpadVertical(i11, length, length2, iArr, -1);
            case 20:
                return handleDpadVertical(i11, length, length2, iArr, 1);
            case 21:
                int iHandleDpadHorizontal = handleDpadHorizontal(i11, length, length2, iArr, -1, z10);
                if (!z10 && iHandleDpadHorizontal == -1 && i12 > 0) {
                    return -2;
                }
                if (z10 && iHandleDpadHorizontal == -1 && i12 < i13 - 1) {
                    return -10;
                }
                return iHandleDpadHorizontal;
            case 22:
                int iHandleDpadHorizontal2 = handleDpadHorizontal(i11, length, length2, iArr, 1, z10);
                if (!z10 && iHandleDpadHorizontal2 == -1 && i12 < i13 - 1) {
                    return -9;
                }
                if (z10 && iHandleDpadHorizontal2 == -1 && i12 > 0) {
                    return -5;
                }
                return iHandleDpadHorizontal2;
            default:
                return -1;
        }
    }

    private static int handleMoveEnd() {
        return -7;
    }

    private static int handleMoveHome() {
        return -6;
    }

    private static int handlePageDown(int i10, int i11) {
        return i10 < i11 + (-1) ? -8 : -7;
    }

    private static int handlePageUp(int i10) {
        return i10 > 0 ? -3 : -6;
    }

    private static int inspectMatrix(int i10, int i11, int i12, int i13, int[][] iArr) {
        int i14;
        if (!isValid(i10, i11, i12, i13) || (i14 = iArr[i10][i11]) == -1) {
            return -1;
        }
        return i14;
    }

    private static boolean isValid(int i10, int i11, int i12, int i13) {
        return i10 >= 0 && i10 < i12 && i11 >= 0 && i11 < i13;
    }

    private static void printMatrix(int[][] iArr) {
        Log.v(TAG, "\tprintMap:");
        int length = iArr[0].length;
        for (int i10 = 0; i10 < length; i10++) {
            String string = "\t\t";
            for (int[] iArr2 : iArr) {
                StringBuilder sbA = androidx.compose.runtime.changelist.a.a(string);
                sbA.append(String.format("%3d", Integer.valueOf(iArr2[i10])));
                string = sbA.toString();
            }
            Log.v(TAG, string);
        }
    }

    public static boolean shouldConsume(int i10) {
        return i10 == 21 || i10 == 22 || i10 == 19 || i10 == 20 || i10 == 122 || i10 == 123 || i10 == 92 || i10 == 93;
    }
}
