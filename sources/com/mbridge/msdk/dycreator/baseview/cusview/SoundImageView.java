package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.mbridge.msdk.foundation.tools.i0;

/* JADX INFO: loaded from: classes5.dex */
public class SoundImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f155548a;

    public SoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f155548a = true;
    }

    public boolean getStatus() {
        return this.f155548a;
    }

    public void setSoundStatus(boolean z10) {
        this.f155548a = z10;
        if (z10) {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_open", AppIntroBaseFragmentKt.ARG_DRAWABLE));
        } else {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_close", AppIntroBaseFragmentKt.ARG_DRAWABLE));
        }
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f155548a = true;
    }

    public SoundImageView(Context context) {
        super(context);
        this.f155548a = true;
    }
}
