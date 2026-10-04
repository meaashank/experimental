package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.i0;

/* JADX INFO: loaded from: classes5.dex */
public class MBridgeTopFullView extends BaseView {
    public static final String INTERFACE_RESULT = MBridgeTopFullView.class.getName().concat("WithResault");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected ImageView f157815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected TextView f157816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected TextView f157817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected StarLevelLayoutView f157818m;

    public MBridgeTopFullView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_fullscreen_top", "layout"), this.f157811i);
        if (viewInflate != null) {
            this.f157815j = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_icon", "id"));
            this.f157816k = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_title", "id"));
            this.f157817l = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_description", "id"));
            this.f157818m = (StarLevelLayoutView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_feeds_star", "id"));
            this.f157817l.setTextColor(-7829368);
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            updateLayoutParams();
        }
    }

    public TextView getMBridgeFullViewDisplayDscription() {
        return this.f157817l;
    }

    public ImageView getMBridgeFullViewDisplayIcon() {
        return this.f157815j;
    }

    public TextView getMBridgeFullViewDisplayTitle() {
        return this.f157816k;
    }

    public StarLevelLayoutView getStarLevelLayoutView() {
        return this.f157818m;
    }

    public void updateLayoutParams() {
        this.f157803a.setLayoutParams(E3.a.a(-1, -1, 10));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.f157804b.setLayoutParams(layoutParams);
    }
}
