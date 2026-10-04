package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.inmobi.media.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3793x8 {
    public static ViewGroup.LayoutParams a(C3639m7 asset, ViewGroup parent) {
        kotlin.jvm.internal.G.p(asset, "asset");
        kotlin.jvm.internal.G.p(parent, "parent");
        C3653n7 c3653n7 = asset.f153147d;
        Point point = c3653n7.f153190a;
        Point point2 = c3653n7.f153192c;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(a(point.x), a(point.y));
        if (parent instanceof C3736t7) {
            C3722s7 c3722s7 = new C3722s7(a(point.x), a(point.y));
            int iA = a(point2.x);
            int iA2 = a(point2.y);
            c3722s7.f153346a = iA;
            c3722s7.f153347b = iA2;
            return c3722s7;
        }
        if (parent instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a(point.x), a(point.y));
            layoutParams2.setMargins(a(point2.x), a(point2.y), 0, 0);
            return layoutParams2;
        }
        if (parent instanceof AbsListView) {
            return new AbsListView.LayoutParams(a(point.x), a(point.y));
        }
        if (!(parent instanceof FrameLayout)) {
            HashMap map = N8.f152320c;
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(a(point.x), a(point.y));
        layoutParams3.setMargins(a(point2.x), a(point2.y), 0, 0);
        return layoutParams3;
    }

    public static int a(int i10) {
        int i11;
        return ((((Context) N8.f152322e.get()) instanceof InMobiAdActivity) || (i11 = N8.f152323f) == 0) ? i10 : (int) (((((double) i11) * 1.0d) / ((double) N8.f152324g)) * ((double) i10));
    }

    public static void a(Context context, ImageView imageView) {
        Bitmap bitmapCreateBitmap;
        if (imageView.getDrawable() == null) {
            float f10 = AbstractC3760v3.d().f153497c;
            C3467a3 c3467a3 = new C3467a3(context, (byte) 0, null);
            if (Build.VERSION.SDK_INT < 28) {
                c3467a3.layout(0, 0, (int) (a(40) * f10), (int) (a(40) * f10));
                c3467a3.setDrawingCacheEnabled(true);
                c3467a3.buildDrawingCache();
                bitmapCreateBitmap = c3467a3.getDrawingCache();
                kotlin.jvm.internal.G.o(bitmapCreateBitmap, "getDrawingCache(...)");
            } else {
                c3467a3.layout(0, 0, (int) (a(40) * f10), (int) (a(40) * f10));
                bitmapCreateBitmap = Bitmap.createBitmap((int) (a(40) * f10), (int) (a(40) * f10), Bitmap.Config.ARGB_8888);
                kotlin.jvm.internal.G.o(bitmapCreateBitmap, "createBitmap(...)");
                c3467a3.draw(new Canvas(bitmapCreateBitmap));
            }
            imageView.setImageBitmap(bitmapCreateBitmap);
        }
    }

    public static final void a(TextView textView, List list) {
        HashMap map = N8.f152320c;
        int paintFlags = textView.getPaintFlags();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            int iHashCode = str.hashCode();
            if (iHashCode != -1178781136) {
                if (iHashCode != -1026963764) {
                    if (iHashCode != -891985998) {
                        if (iHashCode == 3029637 && str.equals("bold")) {
                            i10 |= 1;
                        }
                    } else if (str.equals("strike")) {
                        paintFlags |= 16;
                    }
                } else if (str.equals("underline")) {
                    paintFlags |= 8;
                }
            } else if (str.equals("italic")) {
                i10 |= 2;
            }
        }
        textView.setTypeface(Typeface.DEFAULT, i10);
        textView.setPaintFlags(paintFlags);
    }

    public static void a(View view, C3653n7 assetStyle) {
        kotlin.jvm.internal.G.p(view, "view");
        kotlin.jvm.internal.G.p(assetStyle, "assetStyle");
        int color = Color.parseColor("#00000000");
        try {
            color = Color.parseColor(assetStyle.a());
        } catch (IllegalArgumentException e10) {
            HashMap map = N8.f152320c;
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(new R1(e10));
        }
        view.setBackgroundColor(color);
        if ("line".equals(assetStyle.f153194e)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(color);
            if ("curved".equals(assetStyle.f153195f)) {
                gradientDrawable.setCornerRadius(assetStyle.f153197h);
            }
            int color2 = Color.parseColor("#ff000000");
            try {
                String str = assetStyle.f153198i;
                Locale US = Locale.US;
                kotlin.jvm.internal.G.o(US, "US");
                String lowerCase = str.toLowerCase(US);
                kotlin.jvm.internal.G.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                color2 = Color.parseColor(lowerCase);
            } catch (IllegalArgumentException e11) {
                HashMap map2 = N8.f152320c;
                C3511d5 c3511d52 = C3511d5.f152815a;
                C3511d5.f152817c.a(new R1(e11));
            }
            gradientDrawable.setStroke(1, color2);
            view.setBackground(gradientDrawable);
        }
    }

    public static final void a(View view) {
        HashMap map = N8.f152320c;
        view.setBackground(null);
    }
}
