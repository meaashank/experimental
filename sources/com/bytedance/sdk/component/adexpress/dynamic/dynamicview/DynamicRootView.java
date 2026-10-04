package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.uR, com.bytedance.sdk.component.adexpress.theme.ZRu {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private TFq dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.Ht.ZRu mDynamicClickListener;
    boolean mIsMute;
    private ThemeStatusBroadcastReceiver mReceiver;
    private com.bytedance.sdk.component.adexpress.NOt.ZH mRenderListener;
    private com.bytedance.sdk.component.adexpress.NOt.sAl mRenderRequest;
    private ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.NOt muteListener;
    protected final com.bytedance.sdk.component.adexpress.NOt.edo renderResult;
    private int scoreCountWithIcon;
    private List<com.bytedance.sdk.component.adexpress.dynamic.mZ> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.TFq videoListener;
    public View videoView;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.NOt.sAl sal, com.bytedance.sdk.component.adexpress.dynamic.Ht.ZRu zRu) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.NOt.edo edoVar = new com.bytedance.sdk.component.adexpress.NOt.edo();
        this.renderResult = edoVar;
        edoVar.ZRu(2);
        this.mDynamicClickListener = zRu;
        zRu.ZRu(this);
        this.mReceiver = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.ZRu(this);
        this.mIsMute = z10;
        this.mRenderRequest = sal;
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        com.bytedance.sdk.component.adexpress.dynamic.uR.Ht htTFq;
        com.bytedance.sdk.component.adexpress.dynamic.uR.TFq tFqAT = fa2.aT();
        if (tFqAT == null || (htTFq = tFqAT.TFq()) == null) {
            return;
        }
        this.renderResult.NOt(htTFq.Guy());
    }

    private boolean checkSizeValid() {
        TFq tFq = this.dynamicBaseWidget;
        return tFq.TFq > 0.0f && tFq.Ht > 0.0f;
    }

    private void setClipChildren(ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !fa2.ru()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    public void callBackRenderFail(int i10, String str) {
        this.renderResult.ZRu(false);
        this.renderResult.NOt(i10);
        this.renderResult.ZRu(str);
        this.mRenderListener.ZRu(this.renderResult);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.Ht.ZRu getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public com.bytedance.sdk.component.adexpress.NOt.ZH getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.NOt.sAl getRenderRequest() {
        return this.mRenderRequest;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.mZ> getTimeOutListener() {
        return this.timeOutListener;
    }

    public int getTimedown() {
        return this.timedown;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.ZRu
    public void onThemeChanged(int i10) {
        TFq tFq = this.dynamicBaseWidget;
        if (tFq == null) {
            return;
        }
        tFq.ZRu(i10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.uR
    public void onvideoComplate() {
        try {
            this.videoListener.ZRu();
        } catch (Exception unused) {
        }
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2, int i10) {
        this.dynamicBaseWidget = renderDynamicView(fa2, this, i10);
        this.renderResult.ZRu(true);
        this.renderResult.ZRu(this.dynamicBaseWidget.TFq);
        this.renderResult.NOt(this.dynamicBaseWidget.Ht);
        this.renderResult.ZRu(this.videoView);
        this.mRenderListener.ZRu(this.renderResult);
    }

    public TFq renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2, ViewGroup viewGroup, int i10) {
        if (fa2 == null) {
            return null;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> listZH = fa2.ZH();
        TFq tFqZRu = com.bytedance.sdk.component.adexpress.dynamic.ZRu.NOt.ZRu(this.mContext, this, fa2);
        if (tFqZRu instanceof th) {
            callBackRenderFail(i10 == 3 ? 128 : 118, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(fa2);
        tFqZRu.mZ();
        if (viewGroup != null) {
            viewGroup.addView(tFqZRu);
            setClipChildren(viewGroup, fa2);
        }
        if (listZH == null || listZH.size() <= 0) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> it = listZH.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), tFqZRu, i10);
        }
        return tFqZRu;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    public void setDislikeView(View view) {
        this.mDynamicClickListener.NOt(view);
    }

    public void setLogoUnionHeight(int i10) {
        this.logoUnionHeight = i10;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.NOt nOt) {
        this.muteListener = nOt;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.NOt.ZH zh) {
        this.mRenderListener = zh;
        this.mDynamicClickListener.ZRu(zh);
    }

    public void setScoreCountWithIcon(int i10) {
        this.scoreCountWithIcon = i10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.uR
    public void setSoundMute(boolean z10) {
        com.bytedance.sdk.component.adexpress.dynamic.NOt nOt = this.muteListener;
        if (nOt != null) {
            nOt.setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.uR
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        for (int i12 = 0; i12 < this.timeOutListener.size(); i12++) {
            if (this.timeOutListener.get(i12) != null) {
                this.timeOutListener.get(i12).ZRu(charSequence, i10 == 1, i11, z10);
            }
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.mZ mZVar) {
        this.timeOutListener.add(mZVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.uR
    public void setTimeUpdate(int i10) {
        this.videoListener.setTimeUpdate(i10);
    }

    public void setTimedown(int i10) {
        this.timedown = i10;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.TFq tFq) {
        this.videoListener = tFq;
    }

    public void updateRenderInfoForVideo(double d10, double d11, double d12, double d13, float f10) {
        this.renderResult.mZ(d10);
        this.renderResult.uR(d11);
        this.renderResult.TFq(d12);
        this.renderResult.Ht(d13);
        this.renderResult.ZRu(f10);
        this.renderResult.NOt(f10);
        this.renderResult.mZ(f10);
        this.renderResult.uR(f10);
    }

    public void beginShowFromInvisible(TFq tFq, int i10) {
        if (tFq == null) {
            return;
        }
        if (tFq.getBeginInvisibleAndShow()) {
            tFq.setVisibility(i10);
            View view = tFq.oK;
            if (view != null) {
                view.setVisibility(i10);
            }
        }
        int childCount = tFq.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            if (tFq.getChildAt(i11) instanceof TFq) {
                beginShowFromInvisible((TFq) tFq.getChildAt(i11), i10);
            }
        }
    }
}
