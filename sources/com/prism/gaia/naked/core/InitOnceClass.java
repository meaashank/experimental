package com.prism.gaia.naked.core;

import com.prism.gaia.naked.utils.NakedUtils;

/* JADX INFO: loaded from: classes6.dex */
public class InitOnceClass extends AbstractInitOnce<Class<?>> {
    private static final String TAG = "InitOnceClass";
    private String className;
    private Class<?> clazz;

    public InitOnceClass(Class<?> cls) {
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

    public InitOnceClass(String str) {
        this.className = str;
    }

    private Class<?> onInit(String str) {
        try {
            return NakedUtils.classForName(str);
        } catch (ClassNotFoundException e10) {
            e10.getMessage();
            return null;
        }
    }
}
