package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.D;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class om {
    private ViewGroup FA;
    private boolean Ht = false;
    private com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt Mm;
    private TextView NOt;
    private NOt TFq;
    private View ZRu;
    private Context mZ;
    private com.bytedance.sdk.openadsdk.core.sAl.NOt.ZRu uR;

    public interface NOt {
        void ZH();

        boolean aT();
    }

    public enum ZRu {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZ() {
        if (this.mZ == null) {
            return;
        }
        uR();
    }

    private void uR() {
        View view = this.ZRu;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void NOt() {
        this.Mm = null;
    }

    public void ZRu(Context context, ViewGroup viewGroup) {
        if (context == null || !D.a(viewGroup)) {
            return;
        }
        this.FA = viewGroup;
        this.mZ = com.bytedance.sdk.openadsdk.core.WMI.ZRu().getApplicationContext();
    }

    private void ZRu(Context context, View view, boolean z10) {
        ViewGroup.LayoutParams layoutParamsZRu;
        if (context == null || view == null || this.ZRu != null || (layoutParamsZRu = ZRu(this.FA)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.sAl.oK oKVar = new com.bytedance.sdk.openadsdk.sAl.oK(context);
        this.ZRu = oKVar;
        oKVar.setLayoutParams(layoutParamsZRu);
        this.FA.addView(this.ZRu);
        this.NOt = (TextView) this.ZRu.findViewById(com.bytedance.sdk.openadsdk.utils.sAl.yx);
        View viewFindViewById = this.ZRu.findViewById(com.bytedance.sdk.openadsdk.utils.sAl.DoD);
        if (z10) {
            viewFindViewById.setClickable(true);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.om.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    om.this.mZ();
                    if (om.this.uR != null) {
                        om.this.uR.ZRu(ZRu.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            viewFindViewById.setOnClickListener(null);
            viewFindViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams ZRu(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void ZRu(com.bytedance.sdk.openadsdk.core.sAl.NOt.ZRu zRu, NOt nOt) {
        this.TFq = nOt;
        this.uR = zRu;
    }

    public boolean ZRu(int i10, com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt nOt, boolean z10) {
        Context context = this.mZ;
        if (context == null || nOt == null) {
            return true;
        }
        ZRu(context, this.FA, z10);
        this.Mm = nOt;
        if (i10 == 1 || i10 == 2) {
            return ZRu(i10);
        }
        return true;
    }

    private boolean ZRu(int i10) {
        NOt nOt;
        if (ZRu() || this.Ht) {
            return true;
        }
        if (this.uR != null && (nOt = this.TFq) != null) {
            if (nOt.aT()) {
                this.uR.TFq(null, null);
            }
            this.uR.ZRu(ZRu.PAUSE_VIDEO, (String) null);
        }
        ZRu(this.Mm, true);
        return false;
    }

    public void ZRu(boolean z10) {
        if (z10) {
            NOt();
        }
        uR();
    }

    public boolean ZRu() {
        View view = this.ZRu;
        return view != null && view.getVisibility() == 0;
    }

    private void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt nOt, boolean z10) {
        View view;
        String str;
        View view2;
        if (nOt == null || (view = this.ZRu) == null || this.mZ == null || view.getVisibility() == 0) {
            return;
        }
        NOt nOt2 = this.TFq;
        if (nOt2 != null) {
            nOt2.ZH();
        }
        double dCeil = Math.ceil((nOt.TFq() * 1.0d) / 1048576.0d);
        if (z10) {
            str = String.format(com.bytedance.sdk.component.utils.om.ZRu(this.mZ, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(dCeil).floatValue()));
        } else {
            str = com.bytedance.sdk.component.utils.om.ZRu(this.mZ, "tt_video_without_wifi_tips") + com.bytedance.sdk.component.utils.om.ZRu(this.mZ, "tt_video_bytesize");
        }
        Cox.ZRu(this.ZRu, 0);
        Cox.ZRu(this.NOt, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!Cox.uR(this.ZRu) || (view2 = this.ZRu) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
