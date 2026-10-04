package com.bytedance.sdk.openadsdk.core.lp.mZ;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.utils.Cox;
import java.util.HashSet;
import java.util.Set;
import q8.C5443b;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    public static final Set<String> ZRu = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu.1
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };
    public static Set<String> NOt = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu.2
        {
            add("application/x-javascript");
        }
    };

    public enum NOt {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu$ZRu, reason: collision with other inner class name */
    public enum EnumC0453ZRu {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    @NonNull
    public static Point ZRu(Context context, int i10, int i11, NOt nOt) {
        if (context == null) {
            context = WMI.ZRu();
        }
        Point point = new Point(i10, i11);
        Display defaultDisplay = ((WindowManager) context.getSystemService(C5443b.f226850e)).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iMZ = Cox.mZ(context, i10);
        int iMZ2 = Cox.mZ(context, i11);
        if (iMZ > width || iMZ2 > height) {
            Point point2 = new Point();
            if (NOt.HTML_RESOURCE == nOt) {
                point2.x = Math.min(width, iMZ);
                point2.y = Math.min(height, iMZ2);
            } else {
                float f10 = iMZ;
                float f11 = f10 / width;
                float f12 = iMZ2;
                float f13 = f12 / height;
                if (f11 >= f13) {
                    point2.x = width;
                    point2.y = (int) (f12 / f11);
                } else {
                    point2.x = (int) (f10 / f13);
                    point2.y = height;
                }
            }
            int i12 = point2.x;
            if (i12 >= 0 && point2.y >= 0) {
                point2.x = Cox.uR(context, i12);
                point2.y = Cox.uR(context, point2.y);
                return point2;
            }
        }
        return point;
    }
}
