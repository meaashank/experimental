package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.i0;

/* JADX INFO: loaded from: classes5.dex */
public class BaseView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected RelativeLayout f157803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected RelativeLayout f157804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected RelativeLayout f157805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ImageView f157806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected TextView f157807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected ProgressBar f157808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected FrameLayout f157809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected LinearLayout f157810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected RelativeLayout f157811i;
    public a style;

    public enum a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    public BaseView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_fullbasescreen", "layout"), this);
        this.f157811i = (RelativeLayout) viewInflate;
        if (viewInflate != null) {
            this.f157803a = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.f157804b = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_player_parent", "id"));
            this.f157805c = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_close", "id"));
            this.f157806d = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_iv_close", "id"));
            this.f157807e = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_install", "id"));
            this.f157808f = (ProgressBar) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f157809g = (FrameLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_content", "id"));
            this.f157810h = (LinearLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_player", "id"));
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f157805c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f157806d;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f157808f;
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.f157803a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.f157804b;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f157807e;
    }

    public a getStytle() {
        return this.style;
    }

    public FrameLayout getmAnimationContent() {
        return this.f157809g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f157810h;
    }

    public void setStytle(a aVar) {
        this.style = aVar;
    }
}
