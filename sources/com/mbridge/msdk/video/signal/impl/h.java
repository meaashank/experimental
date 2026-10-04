package com.mbridge.msdk.video.signal.impl;

import androidx.collection.C1545m0;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes5.dex */
public class h implements com.mbridge.msdk.video.signal.j {
    @Override // com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        q0.a("DefaultJSVideoModule", "alertWebViewShowed:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i10, int i11) {
        q0.a("DefaultJSVideoModule", "closeOperte:close=" + i10 + "closeViewVisible=" + i11);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void dismissAllAlert() {
        q0.a("DefaultJSVideoModule", "dismissAllAlert");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewHeight() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewLeft() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewRadius() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewTop() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewWidth() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public String getCurrentProgress() {
        q0.a("DefaultJSVideoModule", "getCurrentProgress");
        return Ib.b.f53002g;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void hideAlertView(int i10) {
        q0.a("DefaultJSVideoModule", "hideAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public boolean isH5Canvas() {
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void notifyCloseBtn(int i10) {
        q0.a("DefaultJSVideoModule", "notifyCloseBtn:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i10) {
        q0.a("DefaultJSVideoModule", "progressBarOperate:progressViewVisible=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressOperate(int i10, int i11) {
        q0.a("DefaultJSVideoModule", "progressOperate:progress=" + i10 + "progressViewVisible=" + i11);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setCover(boolean z10) {
        q0.a("DefaultJSVideoModule", "setCover:" + z10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z10) {
        q0.a("DefaultJSVideoModule", "setMiniEndCardState");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i10) {
        q0.a("DefaultJSVideoModule", "setScaleFitXY:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setVisible(int i10) {
        q0.a("DefaultJSVideoModule", "setVisible:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showAlertView() {
        q0.a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showIVRewardAlertView(String str) {
        q0.a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showVideoLocation(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        StringBuilder sbA = C1545m0.a("showVideoLocation:marginTop=", i10, ",marginLeft=", i11, ",width=");
        androidx.viewpager.widget.a.a(sbA, i12, ",height=", i13, ",radius=");
        androidx.viewpager.widget.a.a(sbA, i14, ",borderTop=", i15, ",borderTop=");
        androidx.viewpager.widget.a.a(sbA, i15, ",borderLeft=", i16, ",borderWidth=");
        sbA.append(i17);
        sbA.append(",borderHeight=");
        sbA.append(i18);
        q0.a("DefaultJSVideoModule", sbA.toString());
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11) {
        q0.a("DefaultJSVideoModule", "soundOperate:mute=" + i10 + ",soundViewVisible=" + i11);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void videoOperate(int i10) {
        q0.a("DefaultJSVideoModule", "videoOperate:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11, String str) {
        StringBuilder sbA = C1545m0.a("soundOperate:mute=", i10, ",soundViewVisible=", i11, ",pt=");
        sbA.append(str);
        q0.a("DefaultJSVideoModule", sbA.toString());
    }
}
