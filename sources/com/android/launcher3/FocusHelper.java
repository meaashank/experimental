package com.android.launcher3;

import android.view.View;
import android.view.ViewGroup;
import com.android.launcher3.folder.Folder;

/* JADX INFO: loaded from: classes2.dex */
public class FocusHelper {
    private static final boolean DEBUG = false;
    private static final String TAG = "FocusHelper";

    public static class PagedFolderKeyEventListener implements View.OnKeyListener {
        private final Folder mFolder;

        public PagedFolderKeyEventListener(Folder folder) {
            this.mFolder = folder;
        }

        public void handleNoopKey(int i10, View view) {
            if (i10 == 20) {
                this.mFolder.mFolderName.requestFocus();
                FocusHelper.playSoundEffect(i10, view);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
        @Override // android.view.View.OnKeyListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onKey(android.view.View r11, int r12, android.view.KeyEvent r13) {
            /*
                Method dump skipped, instruction units count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.FocusHelper.PagedFolderKeyEventListener.onKey(android.view.View, int, android.view.KeyEvent):boolean");
        }
    }

    public static ShortcutAndWidgetContainer getCellLayoutChildrenForIndex(ViewGroup viewGroup, int i10) {
        return ((CellLayout) viewGroup.getChildAt(i10)).getShortcutsAndWidgets();
    }

    private static View getFirstFocusableIconInReadingOrder(CellLayout cellLayout, boolean z10) {
        int countX = cellLayout.getCountX();
        for (int i10 = 0; i10 < cellLayout.getCountY(); i10++) {
            int i11 = z10 ? -1 : 1;
            for (int i12 = z10 ? countX - 1 : 0; i12 >= 0 && i12 < countX; i12 += i11) {
                View childAt = cellLayout.getChildAt(i12, i10);
                if (childAt != null && childAt.isFocusable()) {
                    return childAt;
                }
            }
        }
        return null;
    }

    private static View getFirstFocusableIconInReverseReadingOrder(CellLayout cellLayout, boolean z10) {
        int countX = cellLayout.getCountX();
        for (int countY = cellLayout.getCountY() - 1; countY >= 0; countY--) {
            int i10 = z10 ? 1 : -1;
            for (int i11 = z10 ? 0 : countX - 1; i11 >= 0 && i11 < countX; i11 += i10) {
                View childAt = cellLayout.getChildAt(i11, countY);
                if (childAt != null && childAt.isFocusable()) {
                    return childAt;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean handleHotseatButtonKeyEvent(android.view.View r17, int r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.FocusHelper.handleHotseatButtonKeyEvent(android.view.View, int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01be A[PHI: r1
      0x01be: PHI (r1v9 int) = (r1v7 int), (r1v0 int), (r1v0 int), (r1v0 int) binds: [B:54:0x016b, B:29:0x00dc, B:24:0x00c2, B:26:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean handleIconKeyEvent(android.view.View r17, int r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.FocusHelper.handleIconKeyEvent(android.view.View, int, android.view.KeyEvent):boolean");
    }

    private static View handleNextPageFirstItem(Workspace workspace, CellLayout cellLayout, int i10, boolean z10) {
        int i11 = i10 + 1;
        if (i11 >= workspace.getPageCount()) {
            return null;
        }
        View firstFocusableIconInReadingOrder = getFirstFocusableIconInReadingOrder((CellLayout) workspace.getChildAt(i11), z10);
        if (firstFocusableIconInReadingOrder != null) {
            return firstFocusableIconInReadingOrder;
        }
        View firstFocusableIconInReadingOrder2 = getFirstFocusableIconInReadingOrder(cellLayout, z10);
        workspace.snapToPage(i11);
        return firstFocusableIconInReadingOrder2;
    }

    private static View handlePreviousPageLastItem(Workspace workspace, CellLayout cellLayout, int i10, boolean z10) {
        int i11 = i10 - 1;
        if (i11 < 0) {
            return null;
        }
        View firstFocusableIconInReverseReadingOrder = getFirstFocusableIconInReverseReadingOrder((CellLayout) workspace.getChildAt(i11), z10);
        if (firstFocusableIconInReverseReadingOrder != null) {
            return firstFocusableIconInReverseReadingOrder;
        }
        View firstFocusableIconInReverseReadingOrder2 = getFirstFocusableIconInReverseReadingOrder(cellLayout, z10);
        workspace.snapToPage(i11);
        return firstFocusableIconInReverseReadingOrder2;
    }

    public static void playSoundEffect(int i10, View view) {
        if (i10 != 92) {
            if (i10 != 93) {
                if (i10 != 122) {
                    if (i10 != 123) {
                        switch (i10) {
                            case 21:
                                view.playSoundEffect(1);
                                break;
                            case 22:
                                view.playSoundEffect(3);
                                break;
                        }
                        return;
                    }
                }
            }
            view.playSoundEffect(4);
            return;
        }
        view.playSoundEffect(2);
    }
}
