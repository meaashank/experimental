package com.mbridge.msdk.dycreator.binding.response;

import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewdata.base.a;

/* JADX INFO: loaded from: classes5.dex */
public class SplashResData extends BaseRespData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f155677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EAction f155678b;

    public a getBaseViewData() {
        return this.f155677a;
    }

    public EAction geteAction() {
        return this.f155678b;
    }

    public void setBaseViewData(a aVar) {
        this.f155677a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f155678b = eAction;
    }
}
