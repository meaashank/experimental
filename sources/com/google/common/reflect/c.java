package com.google.common.reflect;

import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Predicate {
    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((Class) obj).isInterface();
    }
}
