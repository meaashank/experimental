package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes5.dex */
public class g implements com.mbridge.msdk.video.signal.i {
    @Override // com.mbridge.msdk.video.signal.i
    public void a(String str) {
        com.mbridge.msdk.advanced.manager.f.a("setOrientation,landscape=", str, "js");
    }

    @Override // com.mbridge.msdk.video.signal.i
    public String b() {
        q0.a("js", "getEndScreenInfo");
        return Ib.b.f53002g;
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void handlerPlayableException(String str) {
        com.mbridge.msdk.advanced.manager.f.a("handlerPlayableException，msg=", str, "js");
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        q0.a("js", "notifyCloseBtn,state=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        q0.a("js", "toggleCloseBtn,state=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void triggerCloseBtn(String str) {
        com.mbridge.msdk.advanced.manager.f.a("triggerCloseBtn,state=", str, "js");
    }
}
