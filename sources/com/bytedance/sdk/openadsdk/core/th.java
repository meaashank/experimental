package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class th {
    private static boolean NOt(View view) {
        return view != null && view.isShown();
    }

    private static boolean ZRu(View view, int i10) {
        float fZRu = ZRu(view);
        return fZRu > 0.0f && fZRu >= ((float) i10) / 100.0f;
    }

    private static int mZ(View view, int i10) {
        if (i10 == 3) {
            return (int) (((double) Cox.mZ(view.getContext().getApplicationContext())) * 0.7d);
        }
        return 20;
    }

    private static int uR(View view, int i10) {
        if (i10 == 3) {
            return Cox.uR(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static boolean NOt(View view, int i10) {
        return view.getWidth() >= mZ(view, i10) && view.getHeight() >= uR(view, i10);
    }

    public static float ZRu(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    Rect rect = new Rect();
                    if (!view.getGlobalVisibleRect(rect)) {
                        return -1.0f;
                    }
                    long jHeight = ((long) rect.height()) * ((long) rect.width());
                    long height = ((long) view.getHeight()) * ((long) view.getWidth());
                    if (height <= 0) {
                        return -1.0f;
                    }
                    return jHeight / height;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static int NOt(View view, int i10, int i11) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!NOt(view)) {
            return 1;
        }
        if (NOt(view, i11)) {
            return !ZRu(view, i10) ? 3 : 0;
        }
        return 6;
    }

    public static boolean ZRu(View view, int i10, int i11) {
        if (i11 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof com.bytedance.sdk.openadsdk.core.FA.om) || (view instanceof com.bytedance.sdk.openadsdk.core.mZ.mZ)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable unused) {
                }
            }
        }
        return NOt(view, i10, i11) == 0;
    }
}
