package com.prism.gaia.client.stub;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.github.appintro.AppIntroBaseFragmentKt;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s0.x;

/* JADX INFO: loaded from: classes6.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Resources f164298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f164299b;

    public C(Resources resources, String str) {
        this.f164298a = resources;
        this.f164299b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.animation.Animation a(android.content.Context r5, org.xmlpull.v1.XmlPullParser r6, android.view.animation.AnimationSet r7, android.util.AttributeSet r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            int r0 = r6.getDepth()
            r1 = 0
        L5:
            int r2 = r6.next()
            r3 = 3
            if (r2 != r3) goto L12
            int r3 = r6.getDepth()
            if (r3 <= r0) goto L83
        L12:
            r3 = 1
            if (r2 == r3) goto L83
            r3 = 2
            if (r2 == r3) goto L19
            goto L5
        L19:
            java.lang.String r1 = r6.getName()
            java.lang.String r2 = "set"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L2e
            android.view.animation.AnimationSet r1 = new android.view.animation.AnimationSet
            r1.<init>(r5, r8)
            r4.a(r5, r6, r1, r8)
            goto L65
        L2e:
            java.lang.String r2 = "alpha"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L3c
            android.view.animation.AlphaAnimation r1 = new android.view.animation.AlphaAnimation
            r1.<init>(r5, r8)
            goto L65
        L3c:
            java.lang.String r2 = "scale"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L4a
            android.view.animation.ScaleAnimation r1 = new android.view.animation.ScaleAnimation
            r1.<init>(r5, r8)
            goto L65
        L4a:
            java.lang.String r2 = "rotate"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L58
            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
            r1.<init>(r5, r8)
            goto L65
        L58:
            java.lang.String r2 = "translate"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6b
            android.view.animation.TranslateAnimation r1 = new android.view.animation.TranslateAnimation
            r1.<init>(r5, r8)
        L65:
            if (r7 == 0) goto L5
            r7.addAnimation(r1)
            goto L5
        L6b:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unknown animation name: "
            r7.<init>(r8)
            java.lang.String r6 = r6.getName()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.client.stub.C.a(android.content.Context, org.xmlpull.v1.XmlPullParser, android.view.animation.AnimationSet, android.util.AttributeSet):android.view.animation.Animation");
    }

    public int b(String str) {
        return this.f164298a.getIdentifier(str, AppIntroBaseFragmentKt.ARG_DRAWABLE, this.f164299b);
    }

    public Animation c(Context context, String str) {
        XmlPullParser xmlPullParserE = e(str);
        try {
            return a(context, xmlPullParserE, null, Xml.asAttributeSet(xmlPullParserE));
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public int d(String str) {
        return this.f164298a.getIdentifier(str, "anim", this.f164299b);
    }

    public XmlPullParser e(String str) {
        return this.f164298a.getAnimation(d(str));
    }

    public int f(String str) {
        return this.f164298a.getColor(g(str));
    }

    public int g(String str) {
        return this.f164298a.getIdentifier(str, "color", this.f164299b);
    }

    public float h(String str) {
        return this.f164298a.getDimension(i(str));
    }

    public int i(String str) {
        return this.f164298a.getIdentifier(str, "dimen", this.f164299b);
    }

    public Drawable j(String str) {
        return this.f164298a.getDrawable(b(str));
    }

    public int k(String str) {
        return this.f164298a.getIdentifier(str, "layout", this.f164299b);
    }

    public View l(Context context, String str) {
        return ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f164298a.getLayout(k(str)), (ViewGroup) null);
    }

    public String m(String str) {
        return this.f164298a.getString(n(str));
    }

    public int n(String str) {
        return this.f164298a.getIdentifier(str, x.b.f238264e, this.f164299b);
    }

    public int o(String str) {
        return this.f164298a.getIdentifier(str, "style", this.f164299b);
    }

    public View p(View view, String str) {
        return view.findViewById(q(str));
    }

    public int q(String str) {
        return this.f164298a.getIdentifier(str, "id", this.f164299b);
    }
}
