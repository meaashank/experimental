package com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {
    private static volatile mZ ZRu;

    private mZ() {
    }

    public static mZ ZRu() {
        if (ZRu == null) {
            synchronized (mZ.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new mZ();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    public uR ZRu(View view, com.bytedance.sdk.component.adexpress.dynamic.uR.ZRu zRu) {
        if (zRu == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(zRu.Vor())) {
            return new ZH(view, zRu);
        }
        if ("translate".equals(zRu.Vor())) {
            return new oK(view, zRu);
        }
        if ("ripple".equals(zRu.Vor())) {
            return new FA(view, zRu);
        }
        if ("marquee".equals(zRu.Vor())) {
            return new Mm(view, zRu);
        }
        if ("waggle".equals(zRu.Vor())) {
            return new yBV(view, zRu);
        }
        if ("shine".equals(zRu.Vor())) {
            return new lp(view, zRu);
        }
        if ("swing".equals(zRu.Vor())) {
            return new edo(view, zRu);
        }
        if ("fade".equals(zRu.Vor())) {
            return new ZRu(view, zRu);
        }
        if ("rubIn".equals(zRu.Vor())) {
            return new aT(view, zRu);
        }
        if ("rotate".equals(zRu.Vor())) {
            return new Vor(view, zRu);
        }
        if ("cutIn".equals(zRu.Vor())) {
            return new Ht(view, zRu);
        }
        if ("stretch".equals(zRu.Vor())) {
            return new sAl(view, zRu);
        }
        if ("bounce".equals(zRu.Vor())) {
            return new TFq(view, zRu);
        }
        return null;
    }
}
