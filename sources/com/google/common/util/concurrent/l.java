package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Striped;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Supplier {
    @Override // com.google.common.base.Supplier
    public final Object get() {
        return new Striped.WeakSafeReadWriteLock();
    }
}
