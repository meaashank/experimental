package com.prism.gaia.naked.core;

import com.prism.gaia.naked.utils.NakedUtils;

/* JADX INFO: loaded from: classes6.dex */
public class InitOnceClassTry extends AbstractInitOnce<Class<?>> {
    private static final String TAG = "InitOnceClassTry";
    private String className;
    private Class<?> clazz;

    public InitOnceClassTry(Class<?> cls) {
        this.clazz = cls;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.prism.gaia.naked.core.AbstractInitOnce
    public Class<?> onInit() {
        Class<?> cls = this.clazz;
        if (cls != null) {
            return cls;
        }
        String str = this.className;
        if (str != null) {
            return onInit(str);
        }
        return null;
    }

    public InitOnceClassTry(String str) {
        this.className = str;
    }

    private Class<?> onInit(String str) {
        try {
            return NakedUtils.classForName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
