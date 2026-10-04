package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.om;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class Mm extends Button {
    public Mm(Context context) {
        super(context);
        ZRu();
    }

    private void ZRu() {
        setId(com.bytedance.sdk.openadsdk.utils.sAl.zkn);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, Cox.mZ(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.FA.ZRu(context, "tt_browser_download_selector"));
        setText(om.ZRu(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
