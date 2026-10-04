package com.prism.gaia.naked.core;

import com.prism.gaia.naked.core.InitOnce;

/* JADX INFO: loaded from: classes6.dex */
public class InitOnceTry<T> extends AbstractInitOnce<T> {
    private static final String TAG = "InitOnceTry";
    private final InitOnce.Init<T> init;

    public InitOnceTry(InitOnce.Init<T> init) {
        this.init = init;
    }

    @Override // com.prism.gaia.naked.core.AbstractInitOnce
    public T onInit() {
        try {
            return this.init.onInit();
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }
}
