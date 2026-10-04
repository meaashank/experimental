package com.bytedance.sdk.component.adexpress.Ht;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class MR extends LinearLayout {
    private com.bytedance.adsdk.NOt.Ht Ht;
    private com.bytedance.sdk.component.adexpress.dynamic.uR.aT Mm;
    private com.bytedance.sdk.component.utils.OCA NOt;
    private LinearLayout TFq;
    private TextView ZRu;
    private TextView mZ;
    private ZRu uR;

    public interface ZRu {
    }

    public MR(@NonNull Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.uR.aT aTVar) {
        super(context);
        this.Mm = aTVar;
        ZRu(context, view);
    }

    public TextView getTopTextView() {
        return this.ZRu;
    }

    public LinearLayout getWriggleLayout() {
        return this.TFq;
    }

    public View getWriggleProgressIv() {
        return this.Ht;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.NOt == null) {
                this.NOt = new com.bytedance.sdk.component.utils.OCA(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.Ht.MR.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.uR.aT aTVar = this.Mm;
            if (aTVar != null) {
                aTVar.mZ();
                this.Mm.TFq();
                this.Mm.Ht();
                this.Mm.FA();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.NOt.Ht ht = this.Ht;
            if (ht != null) {
                ht.TFq();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    public void setOnShakeViewListener(ZRu zRu) {
        this.uR = zRu;
    }

    public void setShakeText(String str) {
        this.mZ.setText(str);
    }

    private void ZRu(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.TFq = (LinearLayout) findViewById(2097610722);
        this.ZRu = (TextView) findViewById(2097610719);
        this.mZ = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.NOt.Ht ht = (com.bytedance.adsdk.NOt.Ht) findViewById(2097610706);
        this.Ht = ht;
        ht.setAnimation("lottie_json/twist_multi_angle.json");
        this.Ht.setImageAssetsFolder("images/");
        this.Ht.ZRu(true);
    }

    public void ZRu() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Ht.MR.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MR.this.Ht.ZRu();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }
}
