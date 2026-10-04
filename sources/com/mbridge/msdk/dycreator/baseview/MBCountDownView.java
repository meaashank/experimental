package com.mbridge.msdk.dycreator.baseview;

import C4.q;
import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;

/* JADX INFO: loaded from: classes5.dex */
public class MBCountDownView extends MBTextView {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.util.timer.b f155352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MBCountDownView f155353g;

    public MBCountDownView(Context context) {
        super(context);
        this.f155353g = this;
    }

    public void initView(final String str, final String str2, int i10) {
        this.f155352f = new com.mbridge.msdk.util.timer.b().b(i10 * 1000).a(1000L).a(new com.mbridge.msdk.util.timer.a() { // from class: com.mbridge.msdk.dycreator.baseview.MBCountDownView.1
            @Override // com.mbridge.msdk.util.timer.a
            public void onFinish() {
                MBCountDownView.this.f155352f.a();
                SplashResData splashResData = new SplashResData();
                splashResData.seteAction(EAction.CLOSE);
                EventBus.getDefault().post(splashResData);
            }

            @Override // com.mbridge.msdk.util.timer.a
            public void onTick(long j10) {
                if (str2.startsWith("zh")) {
                    MBCountDownView.this.f155353g.setText((j10 / 1000) + "s" + str);
                    return;
                }
                MBCountDownView.this.f155353g.setText(MBCountDownView.this.f155353g + q.f17581a + (j10 / 1000) + "s");
            }
        });
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.mbridge.msdk.util.timer.b bVar = this.f155352f;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.mbridge.msdk.util.timer.b bVar = this.f155352f;
        if (bVar != null) {
            bVar.a();
        }
    }

    public MBCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f155353g = this;
    }

    public MBCountDownView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f155353g = this;
    }
}
