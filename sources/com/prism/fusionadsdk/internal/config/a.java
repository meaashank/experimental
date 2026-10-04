package com.prism.fusionadsdk.internal.config;

import com.google.gson.Gson;
import com.prism.commons.utils.C3857v;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements C3857v.b {
    @Override // com.prism.commons.utils.C3857v.b
    public final Object a() {
        return new Gson().toJson(AdConfigManager.configs);
    }
}
