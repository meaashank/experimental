package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.om;
import com.bytedance.sdk.openadsdk.core.TFq.TFq;
import com.bytedance.sdk.openadsdk.core.TFq.uR;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.core.model.xY;
import com.bytedance.sdk.openadsdk.core.settings.yBV;
import com.bytedance.sdk.openadsdk.core.widget.Mm;
import com.bytedance.sdk.openadsdk.utils.Cox;
import com.bytedance.sdk.openadsdk.utils.FA;

/* JADX INFO: loaded from: classes3.dex */
public class TopLayoutDislike2 extends TFq implements ZRu<TopLayoutDislike2> {
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private uR mCloseBtn;
    private View mImgDislike;
    private ImageView mImgSound;
    private boolean mIsSoundMute;
    private CharSequence mProgressStr;
    private ImageView mSkipIV;
    private TextView mTextViewCountDown;
    private NOt mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public TopLayoutDislike2(@NonNull Context context) {
        this(context, null);
    }

    private ImageView getCommonRingBGImageView() {
        uR uRVar = new uR(getContext());
        int iMZ = Cox.mZ(getContext(), 5.0f);
        uRVar.setPadding(iMZ, iMZ, iMZ, iMZ);
        uRVar.setScaleType(ImageView.ScaleType.CENTER);
        uRVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.uR.ZRu());
        return uRVar;
    }

    private void initListener() {
        View view = this.mImgDislike;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.mZ(view2);
                    }
                }
            });
        }
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TopLayoutDislike2.this.mIsSoundMute = !r0.mIsSoundMute;
                    TopLayoutDislike2.this.mImgSound.setImageDrawable(TopLayoutDislike2.this.mSkipIV != null ? TopLayoutDislike2.this.mIsSoundMute ? om.mZ(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute") : om.mZ(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute") : TopLayoutDislike2.this.mIsSoundMute ? FA.ZRu(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : FA.ZRu(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper"));
                    if (TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.NOt(view2);
                    }
                }
            });
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.ZRu(view2);
                    }
                }
            });
        } else {
            TextView textView = this.mTextViewCountDown;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TopLayoutDislike2.this.mTopListener != null) {
                            TopLayoutDislike2.this.mTopListener.ZRu(view2);
                        }
                    }
                });
            }
        }
        uR uRVar = this.mCloseBtn;
        if (uRVar != null) {
            uRVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.uR(view2);
                    }
                }
            });
        }
    }

    private void initView() {
        int iMZ = Cox.mZ(getContext(), 16.0f);
        int iMZ2 = Cox.mZ(getContext(), 20.0f);
        int iMZ3 = Cox.mZ(getContext(), 28.0f);
        this.mImgSound = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iMZ3, iMZ3);
        layoutParams.leftMargin = iMZ;
        layoutParams.topMargin = iMZ2;
        this.mImgSound.setLayoutParams(layoutParams);
        ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.mImgDislike = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iMZ3, iMZ3);
        layoutParams2.topMargin = iMZ2;
        layoutParams2.leftMargin = iMZ;
        this.mImgDislike.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(getContext());
        this.mTextViewCountDown = fa2;
        fa2.setBackground(com.bytedance.sdk.openadsdk.core.widget.uR.NOt());
        this.mTextViewCountDown.setId(520093714);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, Cox.mZ(getContext(), 28.0f));
        layoutParams4.topMargin = Cox.mZ(getContext(), 20.0f);
        int iMZ4 = Cox.mZ(getContext(), 16.0f);
        layoutParams2.rightMargin = iMZ4;
        layoutParams4.rightMargin = iMZ4;
        int iMZ5 = Cox.mZ(getContext(), 12.0f);
        Cox.mZ(getContext(), 5.0f);
        this.mTextViewCountDown.setPadding(iMZ5, 0, iMZ5, 0);
        this.mTextViewCountDown.setLayoutParams(layoutParams4);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        this.mSkipIV = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(iMZ3, iMZ3);
        layoutParams5.topMargin = iMZ2;
        layoutParams5.rightMargin = iMZ;
        this.mSkipIV.setLayoutParams(layoutParams5);
        this.mSkipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        uR uRVarNOt = Mm.NOt(getContext());
        this.mCloseBtn = uRVarNOt;
        uRVarNOt.setId(520093708);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 8388661;
        layoutParams6.topMargin = Cox.mZ(getContext(), 20.0f);
        layoutParams6.rightMargin = Cox.mZ(getContext(), 24.0f);
        this.mCloseBtn.setLayoutParams(layoutParams6);
        this.mCloseBtn.setContentDescription(om.ZRu(getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        addView(this.mImgSound);
        addView(this.mImgDislike);
        addView(view);
        addView(this.mTextViewCountDown);
        addView(this.mSkipIV);
        addView(this.mCloseBtn);
    }

    private void updateTime(boolean z10) {
        if (this.hasShowClose) {
            return;
        }
        if (this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
        } else if (z10) {
            this.mTextViewCountDown.setVisibility(0);
            this.mSkipIV.setVisibility(8);
        } else {
            this.mTextViewCountDown.setVisibility(8);
            this.mSkipIV.setVisibility(0);
        }
    }

    public void clickDislike() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void clickSkip() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void clickSound() {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public View getCloseButton() {
        return this.mCloseBtn;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setListener(NOt nOt) {
        this.mTopListener = nOt;
    }

    public void setShouldShowSkipTime(boolean z10) {
        this.shouldShowSkipTime = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setShowDislike(boolean z10) {
        View view = this.mImgDislike;
        if (view == null || this.isVast) {
            return;
        }
        view.setVisibility(z10 ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setShowSkip(boolean z10) {
        TextView textView = this.mTextViewCountDown;
        if (textView == null) {
            return;
        }
        if (!z10) {
            textView.setText("");
        }
        if (this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z10;
        this.mSkipIV.setVisibility((z10 && this.hasCutDown) ? 0 : 8);
        this.mTextViewCountDown.setVisibility(z10 & (TextUtils.isEmpty(this.mTextViewCountDown.getText()) ^ true) ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setShowSound(boolean z10) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setSkipEnable(boolean z10) {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setEnabled(z10);
            this.mSkipIV.setClickable(z10);
            return;
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.setEnabled(z10);
            this.mTextViewCountDown.setClickable(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setSoundMute(boolean z10) {
        this.mIsSoundMute = z10;
        this.mImgSound.setImageDrawable(this.mSkipIV != null ? z10 ? om.mZ(getContext(), "tt_reward_full_mute") : om.mZ(getContext(), "tt_reward_full_unmute") : z10 ? FA.ZRu(getContext(), "tt_mute_wrapper") : FA.ZRu(getContext(), "tt_unmute_wrapper"));
        if (this.mImgSound.getDrawable() != null) {
            this.mImgSound.getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    @SuppressLint({"SetTextI18n"})
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.mProgressStr = charSequence;
        }
        if (this.mSkipIV == null) {
            return;
        }
        this.hasCutDown = true;
        if (this.shouldShowSkipTime) {
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
            updateTime(false);
            return;
        }
        String str = (String) this.mProgressStr;
        try {
            int i10 = this.skipTime;
            int i11 = i10 == 0 ? Integer.parseInt(str) : i10 - (this.videoDuration - Integer.parseInt(str));
            if (i11 <= 0) {
                this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
                updateTime(false);
                return;
            }
            if (this.skipTime == 0) {
                updateTime(false);
                return;
            }
            this.mTextViewCountDown.setText(i11 + "s");
            updateTime(true);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void showCloseButton() {
        setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void showSkipButton() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
    }

    public TopLayoutDislike2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2 load(@NonNull qF qFVar) {
        initView();
        this.mImgDislike.setVisibility(0);
        ((ImageView) this.mImgDislike).setImageResource(om.uR(WMI.ZRu(), "tt_reward_full_feedback"));
        if (!yBV.CH().edo(String.valueOf(qFVar.GE())) || qFVar.yBV() == 5 || qFVar.yBV() == 6) {
            this.mSkipIV.setImageResource(om.uR(WMI.ZRu(), "tt_close_btn"));
        } else {
            this.mSkipIV.setImageResource(om.uR(WMI.ZRu(), "tt_skip_btn"));
        }
        if (this.mSkipIV.getDrawable() != null) {
            this.mSkipIV.getDrawable().setAutoMirrored(true);
        }
        this.mSkipIV.setVisibility(8);
        this.videoDuration = qFVar.Qg() == null ? 0 : qFVar.Qg().xY() * ((int) qFVar.Qg().Ht());
        if (com.bytedance.sdk.openadsdk.core.model.yBV.mZ(qFVar) && qFVar.Vor() != null) {
            this.videoDuration = (int) qFVar.Vor().NOt();
        } else if (com.bytedance.sdk.openadsdk.core.model.yBV.uR(qFVar) && qFVar.Vor() != null) {
            this.videoDuration = (int) qFVar.Vor().uR();
        }
        if (this.videoDuration <= 0) {
            this.videoDuration = 10;
        }
        if (qFVar.klw() != 8 || qFVar.WD() == null) {
            this.skipTime = WMI.uR().aT(qFVar.WD().getCodeId());
        } else {
            this.skipTime = WMI.uR().om(qFVar.WD().getCodeId());
        }
        if (xY.mZ(qFVar)) {
            this.skipTime = WMI.uR().ZRu(String.valueOf(qFVar.GE()), qFVar.qg());
            this.videoDuration = qFVar.fOq();
        }
        int i10 = this.skipTime;
        this.shouldShowSkipTime = i10 == -1 || i10 >= this.videoDuration;
        if (qFVar.wcb()) {
            this.mImgDislike.setVisibility(8);
            this.isVast = true;
        }
        this.mTextViewCountDown.setVisibility(4);
        this.mTextViewCountDown.setText("");
        this.mTextViewCountDown.setEnabled(false);
        this.mTextViewCountDown.setClickable(false);
        initListener();
        return this;
    }

    public TopLayoutDislike2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mProgressStr = "";
        setOrientation(0);
    }
}
