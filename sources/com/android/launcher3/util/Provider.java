package com.android.launcher3.util;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Provider<T> {
    public static <T> Provider<T> of(final T t10) {
        return new Provider<T>() { // from class: com.android.launcher3.util.Provider.1
            @Override // com.android.launcher3.util.Provider
            public T get() {
                return (T) t10;
            }
        };
    }

    public abstract T get();
}
