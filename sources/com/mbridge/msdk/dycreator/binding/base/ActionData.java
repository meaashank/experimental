package com.mbridge.msdk.dycreator.binding.base;

import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewdata.base.a;

/* JADX INFO: loaded from: classes5.dex */
public class ActionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f155674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EAction f155675b;

    public a getBaseViewData() {
        return this.f155674a;
    }

    public EAction geteAction() {
        return this.f155675b;
    }

    public void setBaseViewData(a aVar) {
        this.f155674a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f155675b = eAction;
    }
}
