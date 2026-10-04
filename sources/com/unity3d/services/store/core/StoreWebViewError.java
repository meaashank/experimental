package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.m;
import com.unity3d.services.core.webview.WebViewEventCategory;

/* JADX INFO: loaded from: classes7.dex */
public class StoreWebViewError extends m {
    public StoreWebViewError(Enum<?> r12, String str, Object... objArr) {
        super(r12, str, objArr);
    }

    @Override // com.unity3d.scar.adapter.common.m, com.unity3d.scar.adapter.common.i
    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
