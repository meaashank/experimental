package com.prism.gaia.naked.core;

/* JADX INFO: loaded from: classes6.dex */
public class InitOnce<T> extends AbstractInitOnce<T> {
    private static final String TAG = "InitOnce";
    private final Init<T> init;

    public interface Init<T> {
        T onInit() throws Exception;
    }

    public InitOnce(Init<T> init) {
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
