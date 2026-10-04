package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.w8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3779w8 extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3765v8 f153505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f153506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f153507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3779w8(Context context) {
        super(context);
        kotlin.jvm.internal.G.p(context, "context");
        this.f153504a = "w8";
        Context context2 = getContext();
        kotlin.jvm.internal.G.o(context2, "getContext(...)");
        setVideoView(new C3765v8(context2));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(getVideoView(), layoutParams);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setVisibility(8);
        setPosterImage(imageView);
        addView(getPosterImage(), layoutParams);
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setVisibility(8);
        setProgressBar(progressBar);
        addView(getProgressBar(), E3.a.a(-2, -2, 13));
        Context context3 = getContext();
        kotlin.jvm.internal.G.o(context3, "getContext(...)");
        C3668o8 c3668o8 = new C3668o8(context3, null, 0);
        ViewGroup.LayoutParams layoutParamsA = E3.a.a(-1, -1, 13);
        getVideoView().setMediaController(c3668o8);
        addView(c3668o8, layoutParamsA);
    }

    @NotNull
    public final ImageView getPosterImage() {
        ImageView imageView = this.f153506c;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.G.S("posterImage");
        throw null;
    }

    @NotNull
    public final ProgressBar getProgressBar() {
        ProgressBar progressBar = this.f153507d;
        if (progressBar != null) {
            return progressBar;
        }
        kotlin.jvm.internal.G.S("progressBar");
        throw null;
    }

    @NotNull
    public final C3765v8 getVideoView() {
        C3765v8 c3765v8 = this.f153505b;
        if (c3765v8 != null) {
            return c3765v8;
        }
        kotlin.jvm.internal.G.S("videoView");
        throw null;
    }

    public final void setPosterImage(@NotNull ImageView imageView) {
        kotlin.jvm.internal.G.p(imageView, "<set-?>");
        this.f153506c = imageView;
    }

    public final void setProgressBar(@NotNull ProgressBar progressBar) {
        kotlin.jvm.internal.G.p(progressBar, "<set-?>");
        this.f153507d = progressBar;
    }

    public final void setVideoView(@NotNull C3765v8 c3765v8) {
        kotlin.jvm.internal.G.p(c3765v8, "<set-?>");
        this.f153505b = c3765v8;
    }

    public final void setPosterImage(@Nullable Bitmap bitmap) {
        getPosterImage().setImageBitmap(bitmap);
    }
}
