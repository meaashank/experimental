package com.prism.gaia.naked.core;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractInitOnce<T> {
    private T data = null;
    private boolean initialized = false;

    public T get() {
        if (!this.initialized) {
            this.data = onInit();
            this.initialized = true;
        }
        return this.data;
    }

    public abstract T onInit();
}
