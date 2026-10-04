package com.bytedance.sdk.component.adexpress.uR;

import android.net.Uri;
import android.text.TextUtils;
import com.prism.gaia.download.a;
import u.e;

/* JADX INFO: loaded from: classes2.dex */
public class aT {

    public enum ZRu {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");

        private String TFq;

        ZRu(String str) {
            this.TFq = str;
        }

        public String ZRu() {
            return this.TFq;
        }
    }

    public static boolean NOt(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null) {
            return false;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        return path.endsWith(".gif");
    }

    public static ZRu ZRu(String str) {
        ZRu zRu = ZRu.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        return ZRu.CSS;
                    }
                    if (path.endsWith(".js")) {
                        return ZRu.JS;
                    }
                    if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(e.f239314f) && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico") && path.endsWith(a.f164603n)) {
                        return ZRu.HTML;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return zRu;
    }
}
