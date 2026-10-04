package com.prism.gaia.naked.core;

import androidx.constraintlayout.motion.widget.r;
import com.prism.commons.utils.l0;
import com.prism.gaia.naked.utils.NakedUtils;

/* JADX INFO: loaded from: classes6.dex */
public class ClassAccessorUtils {
    private static final String TAG = l0.b("ClassAccessorUtils");

    public static Class<?> classForName(String str) {
        try {
            return NakedUtils.classForName(str);
        } catch (ClassNotFoundException unused) {
            r.a("can not find class: ", str, TAG);
            return null;
        }
    }
}
