package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.view.E;
import com.bytedance.sdk.component.utils.om;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class TTAdDislikeToast extends com.bytedance.sdk.openadsdk.core.TFq.mZ {
    private static String sDislikeSendTip;
    private static String sDislikeTip;
    private static String sSkipText;
    private final Handler mHandler;
    private TextView mTextView;

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }

    public static String getDislikeSendTip() {
        if (sDislikeSendTip == null) {
            Context contextZRu = com.bytedance.sdk.openadsdk.core.WMI.ZRu();
            sDislikeSendTip = om.ZRu(contextZRu, "tt_feedback_thank_text") + "\n" + om.ZRu(contextZRu, "tt_feedback_experience_text");
        }
        return sDislikeSendTip;
    }

    public static String getDislikeTip() {
        if (sDislikeTip == null) {
            sDislikeTip = om.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu(), "tt_feedback_submit_text");
        }
        return sDislikeTip;
    }

    public static String getSkipText() {
        if (sSkipText == null) {
            sSkipText = om.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu(), "tt_reward_screen_skip_tx");
        }
        return sSkipText;
    }

    private void initToast(Context context) {
        TextView textView = new TextView(context);
        this.mTextView = textView;
        textView.setClickable(false);
        this.mTextView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = Cox.mZ(getContext(), 75.0f);
        int iMZ = Cox.mZ(com.bytedance.sdk.openadsdk.core.WMI.ZRu(), 16.0f);
        int iMZ2 = Cox.mZ(com.bytedance.sdk.openadsdk.core.WMI.ZRu(), 12.0f);
        this.mTextView.setPadding(iMZ, iMZ2, iMZ, iMZ2);
        this.mTextView.setLayoutParams(layoutParams);
        this.mTextView.setTextColor(-1);
        this.mTextView.setTextSize(16.0f);
        this.mTextView.setGravity(E.f111493b);
        Drawable drawableMZ = om.mZ(getContext(), "tt_dislike_toast");
        int iMZ3 = Cox.mZ(getContext(), 16.0f);
        drawableMZ.setBounds(0, 0, iMZ3, iMZ3);
        this.mTextView.setCompoundDrawablePadding(iMZ3 / 2);
        this.mTextView.setCompoundDrawables(drawableMZ, null, null, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(209, 37, 37, 37));
        gradientDrawable.setCornerRadius(Cox.mZ(com.bytedance.sdk.openadsdk.core.WMI.ZRu(), 12.0f));
        this.mTextView.setBackground(gradientDrawable);
        addView(this.mTextView);
    }

    public static void onResourceUpdated() {
        Context contextZRu = com.bytedance.sdk.openadsdk.core.WMI.ZRu();
        sSkipText = om.ZRu(contextZRu, "tt_reward_screen_skip_tx");
        sDislikeTip = om.ZRu(contextZRu, "tt_feedback_submit_text");
        sDislikeSendTip = om.ZRu(contextZRu, "tt_feedback_thank_text") + "\n" + om.ZRu(contextZRu, "tt_feedback_experience_text");
    }

    public void hide() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void onDestroy() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void show(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.mTextView != null) {
                    TTAdDislikeToast.this.mTextView.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.mHandler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, 2000L);
    }

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mHandler = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        initToast(context);
    }
}
