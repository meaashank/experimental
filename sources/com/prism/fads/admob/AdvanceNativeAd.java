package com.prism.fads.admob;

import H6.b;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.prism.fusionadsdkbase.AdRequest;
import com.prism.fusionadsdkbase.e;

/* JADX INFO: loaded from: classes5.dex */
public class AdvanceNativeAd implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f162185e = "765-AdvanceNativeAd";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NativeAd f162186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f162187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f162188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NativeAdView f162189d;

    public class a extends AdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdRequest f162190a;

        public a(AdRequest adRequest) {
            this.f162190a = adRequest;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
            this.f162190a.f162362b.a();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            this.f162190a.f162362b.b();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            new StringBuilder("onAdFailedToLoad:").append(loadAdError.toString());
            this.f162190a.f162362b.c(loadAdError.getCode());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
            this.f162190a.f162362b.d();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            this.f162190a.f162362b.g();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdSwipeGestureClicked() {
            super.onAdSwipeGestureClicked();
        }
    }

    public class b implements NativeAd.OnNativeAdLoadedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f162192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdRequest f162193b;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ NativeAd f162195a;

            public a(NativeAd nativeAd) {
                this.f162195a = nativeAd;
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                if (AdvanceNativeAd.this.f162188c || ((Activity) bVar.f162192a).isDestroyed() || ((Activity) b.this.f162192a).isFinishing()) {
                    this.f162195a.destroy();
                    b.this.f162193b.f162362b.c(com.prism.fusionadsdkbase.a.f162367d);
                    return;
                }
                NativeAd nativeAd = AdvanceNativeAd.this.f162186a;
                if (nativeAd != null) {
                    nativeAd.destroy();
                }
                b bVar2 = b.this;
                AdvanceNativeAd advanceNativeAd = AdvanceNativeAd.this;
                advanceNativeAd.f162186a = this.f162195a;
                bVar2.f162193b.f162362b.f(advanceNativeAd);
            }
        }

        public b(Context context, AdRequest adRequest) {
            this.f162192a = context;
            this.f162193b = adRequest;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(@NonNull NativeAd nativeAd) {
            ((Activity) this.f162192a).runOnUiThread(new a(nativeAd));
        }
    }

    public static int d(Context context, int i10) {
        return Math.round(i10 * context.getResources().getDisplayMetrics().density);
    }

    private void f(NativeAdView nativeAdView) {
        try {
            MediaView mediaView = (MediaView) nativeAdView.findViewById(b.h.f48633v1);
            mediaView.setVisibility(0);
            nativeAdView.setMediaView(mediaView);
            TextView textView = (TextView) nativeAdView.findViewById(b.h.f48615t1);
            textView.setText(this.f162186a.getHeadline());
            ImageView imageView = (ImageView) nativeAdView.findViewById(b.h.f48624u1);
            NativeAd.Image icon = this.f162186a.getIcon();
            if (icon != null && imageView != null) {
                imageView.setImageDrawable(icon.getDrawable());
            }
            TextView textView2 = (TextView) nativeAdView.findViewById(b.h.f48606s1);
            textView2.setText(this.f162186a.getCallToAction());
            TextView textView3 = (TextView) nativeAdView.findViewById(b.h.f48597r1);
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

    public void c(Context context, AdRequest adRequest) {
        AdLoader.Builder builder = new AdLoader.Builder(context, adRequest.f162361a);
        builder.forNativeAd(new b(context, adRequest)).withAdListener(new a(adRequest));
        builder.build().loadAd(new AdRequest.Builder().build());
    }

    @Override // com.prism.fusionadsdkbase.e
    public void destroy() {
        this.f162188c = true;
        NativeAdView nativeAdView = this.f162189d;
        if (nativeAdView != null) {
            nativeAdView.destroy();
            this.f162189d = null;
        }
        NativeAd nativeAd = this.f162186a;
        if (nativeAd != null) {
            nativeAd.destroy();
            this.f162186a = null;
        }
        this.f162187b = null;
    }

    public final int e(Context context) {
        float aspectRatio = this.f162186a.getMediaContent() == null ? 0.0f : this.f162186a.getMediaContent().getAspectRatio();
        if (aspectRatio <= 0.0f) {
            aspectRatio = 1.7777778f;
        }
        return Math.max(d(context, 120), Math.min(d(context, 220), Math.round(Math.max(d(context, 240), context.getResources().getDisplayMetrics().widthPixels - d(context, 56)) / aspectRatio)));
    }

    @Override // com.prism.fusionadsdkbase.e
    public void load(Context context, com.prism.fusionadsdkbase.AdRequest adRequest) {
        if (com.prism.fads.admob.a.f(context).d()) {
            c(context, adRequest);
        } else {
            adRequest.f162362b.c(18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.prism.fusionadsdkbase.e
    public void show(ViewGroup viewGroup, String str) {
        if (this.f162188c || this.f162186a == null) {
            throw new IllegalStateException("Native ad unavailable");
        }
        if (!"card_medium".equals(str) && !"card_compact".equals(str)) {
            show(viewGroup);
            return;
        }
        Context context = viewGroup.getContext();
        boolean zEquals = "card_compact".equals(str);
        int iD = d(context, zEquals ? 10 : 12);
        Object[] objArr = (context.getResources().getConfiguration().uiMode & 48) == 32;
        this.f162189d = new NativeAdView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(!zEquals ? 1 : 0);
        linearLayout.setGravity(zEquals ? 16 : 0);
        linearLayout.setPadding(iD, iD, iD, iD);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(objArr != false ? -14801616 : -1);
        gradientDrawable.setCornerRadius(iD);
        gradientDrawable.setStroke(d(context, 1), objArr != false ? -12892844 : -2300947);
        linearLayout.setBackground(new RippleDrawable(ColorStateList.valueOf(573009649), gradientDrawable, null));
        linearLayout.setClipToOutline(true);
        this.f162189d.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(objArr != false ? -15657184 : -1117449);
        gradientDrawable2.setCornerRadius(d(context, 9));
        frameLayout.setBackground(gradientDrawable2);
        frameLayout.setClipToOutline(true);
        linearLayout.addView(frameLayout, zEquals ? new LinearLayout.LayoutParams(d(context, 120), d(context, 120)) : new LinearLayout.LayoutParams(-1, e(context)));
        MediaView mediaView = new MediaView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        mediaView.setImageScaleType(scaleType);
        frameLayout.addView(mediaView, new FrameLayout.LayoutParams(-1, -1));
        TextView textView = new TextView(context);
        textView.setText(b.m.f48895B);
        textView.setTextSize(10.0f);
        textView.setTextColor(-1);
        textView.setIncludeFontPadding(false);
        textView.setMinWidth(d(context, 20));
        textView.setMinHeight(d(context, 20));
        textView.setGravity(17);
        textView.setPadding(d(context, 5), d(context, 2), d(context, 5), d(context, 2));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(-5018880);
        gradientDrawable3.setCornerRadius(d(context, 4));
        textView.setBackground(gradientDrawable3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388659);
        layoutParams.setMargins(d(context, 6), d(context, 6), d(context, 6), d(context, 6));
        frameLayout.addView(textView, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = zEquals ? new LinearLayout.LayoutParams(0, -2, 1.0f) : new LinearLayout.LayoutParams(-1, -2);
        int iD2 = d(context, 10);
        if (zEquals) {
            layoutParams2.leftMargin = iD2;
        } else {
            layoutParams2.topMargin = iD2;
        }
        linearLayout.addView(linearLayout2, layoutParams2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setGravity(16);
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(scaleType);
        NativeAd.Image icon = this.f162186a.getIcon();
        if (icon != null) {
            imageView.setImageDrawable(icon.getDrawable());
        } else {
            imageView.setVisibility(8);
        }
        linearLayout3.addView(imageView, new LinearLayout.LayoutParams(d(context, 40), d(context, 40)));
        TextView textView2 = new TextView(context);
        textView2.setText(this.f162186a.getHeadline());
        textView2.setTextSize(16.0f);
        textView2.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setTextColor(objArr != false ? -854534 : -15258803);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        if (icon != null) {
            layoutParams3.leftMargin = d(context, 8);
        }
        linearLayout3.addView(textView2, layoutParams3);
        TextView textView3 = new TextView(context);
        textView3.setText(this.f162186a.getBody());
        textView3.setTextSize(13.0f);
        textView3.setMaxLines(2);
        textView3.setEllipsize(truncateAt);
        textView3.setTextColor(objArr != false ? -4602666 : -10589052);
        textView3.setVisibility(TextUtils.isEmpty(this.f162186a.getBody()) ? 8 : 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = d(context, 4);
        linearLayout2.addView(textView3, layoutParams4);
        Button button = new Button(context);
        button.setText(this.f162186a.getCallToAction());
        button.setAllCaps(false);
        button.setTextSize(zEquals ? 12.0f : 14.0f);
        button.setTextColor(-1);
        button.setSingleLine(true);
        button.setEllipsize(truncateAt);
        button.setPadding(d(context, 8), 0, d(context, 8), 0);
        button.setMinWidth(0);
        button.setMinHeight(0);
        button.setElevation(0.0f);
        button.setStateListAnimator(null);
        button.setBackgroundTintList(null);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setColor(-14196015);
        gradientDrawable4.setCornerRadius(d(context, 10));
        button.setBackground(new RippleDrawable(ColorStateList.valueOf(872415231), gradientDrawable4, null));
        button.setVisibility(TextUtils.isEmpty(this.f162186a.getCallToAction()) ? 8 : 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, d(context, 48));
        layoutParams5.topMargin = d(context, zEquals ? 8 : 10);
        linearLayout2.addView(button, layoutParams5);
        this.f162189d.setHeadlineView(textView2);
        this.f162189d.setBodyView(textView3);
        this.f162189d.setIconView(imageView);
        this.f162189d.setCallToActionView(button);
        this.f162189d.setMediaView(mediaView);
        this.f162189d.setNativeAd(this.f162186a);
        viewGroup.addView(this.f162189d, new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // com.prism.fusionadsdkbase.e
    public void show(ViewGroup viewGroup) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        this.f162187b = layoutInflaterFrom;
        NativeAdView nativeAdView = (NativeAdView) layoutInflaterFrom.inflate(b.k.f48767C, (ViewGroup) null);
        f(nativeAdView);
        viewGroup.addView(nativeAdView);
    }

    @Override // com.prism.fusionadsdkbase.e
    public void show(Activity activity, T6.b bVar) {
    }
}
