package com.prism.fads.admob;

import H6.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;

/* JADX INFO: loaded from: classes5.dex */
public class NativeFakeIntersitialAd extends AdvanceNativeAd {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f162210f = "765-NativeFakeIntersitialAd";

    public final void f(NativeAdView nativeAdView) {
        try {
            MediaView mediaView = (MediaView) nativeAdView.findViewById(b.h.f48310M4);
            mediaView.setVisibility(0);
            nativeAdView.setMediaView(mediaView);
            TextView textView = (TextView) nativeAdView.findViewById(b.h.f48346Q4);
            textView.setText(this.f162186a.getHeadline());
            ImageView imageView = (ImageView) nativeAdView.findViewById(b.h.f48301L4);
            NativeAd.Image icon = this.f162186a.getIcon();
            if (icon != null && imageView != null) {
                imageView.setImageDrawable(icon.getDrawable());
            }
            TextView textView2 = (TextView) nativeAdView.findViewById(b.h.f48283J4);
            textView2.setText(this.f162186a.getCallToAction());
            TextView textView3 = (TextView) nativeAdView.findViewById(b.h.f48265H4);
            textView3.setText(this.f162186a.getBody());
            nativeAdView.setHeadlineView(textView);
            nativeAdView.setIconView(imageView);
            nativeAdView.setCallToActionView(textView2);
            nativeAdView.setBodyView(textView3);
            nativeAdView.setMediaView(mediaView);
            nativeAdView.setNativeAd(this.f162186a);
        } catch (Exception unused) {
        }
    }

    @Override // com.prism.fads.admob.AdvanceNativeAd, com.prism.fusionadsdkbase.e
    public void show(ViewGroup viewGroup) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        this.f162187b = layoutInflaterFrom;
        NativeAdView nativeAdView = (NativeAdView) layoutInflaterFrom.inflate(b.k.f48880v1, (ViewGroup) null);
        f(nativeAdView);
        viewGroup.addView(nativeAdView);
    }
}
