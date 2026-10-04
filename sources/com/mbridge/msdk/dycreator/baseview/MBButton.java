package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.utils.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class MBButton extends Button implements InterBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f155349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f155350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f155351c;

    public MBButton(Context context) {
        super(context);
        this.f155351c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f155349a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f155349a.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f155349a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f155349a.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f155349a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f155349a.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f155349a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f155349a.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f155349a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f155349a.get("mbridgeStrategy");
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f155350b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f155350b.get("mbridgeAttached").booleanValue()) {
            a.a("mbridgeAttached").b(this.f155351c);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f155350b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f155350b.get("mbridgeDetached").booleanValue()) {
            a.a("mbridgeDetached").b(this.f155351c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f155350b = c.a(str);
        if (campaignEx != null) {
            this.f155351c = campaignEx.getCampaignUnitId();
        }
    }

    public MBButton(Context context, AttributeSet attributeSet) {
        super(context);
        this.f155351c = "";
        this.f155349a = c.a(context, attributeSet);
        com.mbridge.msdk.dycreator.utils.a.a(this, attributeSet);
        c.a(this.f155349a, this);
    }

    public MBButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f155351c = "";
    }
}
