package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function {
    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((Map) obj).keySet().iterator();
    }
}
