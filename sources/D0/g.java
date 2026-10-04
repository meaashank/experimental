package D0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.InterfaceC4337k;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y0.C5809a;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f17643a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17644b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17645c = 2;

    public static a a(@Nullable a aVar, @InterfaceC4337k int i10, @InterfaceC4337k int i11, boolean z10, @InterfaceC4337k int i12) {
        return aVar != null ? aVar : z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    public static Shader b(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return c(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static Shader c(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, C5809a.j.f240825D);
        float f10 = !n.r(xmlPullParser, "startX") ? 0.0f : typedArrayS.getFloat(C5809a.j.f240834M, 0.0f);
        float f11 = !n.r(xmlPullParser, "startY") ? 0.0f : typedArrayS.getFloat(C5809a.j.f240835N, 0.0f);
        float f12 = !n.r(xmlPullParser, "endX") ? 0.0f : typedArrayS.getFloat(C5809a.j.f240836O, 0.0f);
        float f13 = !n.r(xmlPullParser, "endY") ? 0.0f : typedArrayS.getFloat(C5809a.j.f240837P, 0.0f);
        float f14 = !n.r(xmlPullParser, "centerX") ? 0.0f : typedArrayS.getFloat(C5809a.j.f240829H, 0.0f);
        float f15 = !n.r(xmlPullParser, "centerY") ? 0.0f : typedArrayS.getFloat(C5809a.j.f240830I, 0.0f);
        int i10 = !n.r(xmlPullParser, "type") ? 0 : typedArrayS.getInt(C5809a.j.f240828G, 0);
        int color = !n.r(xmlPullParser, "startColor") ? 0 : typedArrayS.getColor(C5809a.j.f240826E, 0);
        boolean z10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = !n.r(xmlPullParser, "centerColor") ? 0 : typedArrayS.getColor(C5809a.j.f240833L, 0);
        int color3 = !n.r(xmlPullParser, "endColor") ? 0 : typedArrayS.getColor(C5809a.j.f240827F, 0);
        int i11 = !n.r(xmlPullParser, "tileMode") ? 0 : typedArrayS.getInt(C5809a.j.f240832K, 0);
        float f16 = !n.r(xmlPullParser, "gradientRadius") ? 0.0f : typedArrayS.getFloat(C5809a.j.f240831J, 0.0f);
        typedArrayS.recycle();
        a aVarA = a(d(resources, xmlPullParser, attributeSet, theme), color, color3, z10, color2);
        if (i10 != 1) {
            return i10 != 2 ? new LinearGradient(f10, f11, f12, f13, aVarA.f17646a, aVarA.f17647b, e(i11)) : new SweepGradient(f14, f15, aVarA.f17646a, aVarA.f17647b);
        }
        if (f16 > 0.0f) {
            return new RadialGradient(f14, f15, f16, aVarA.f17646a, aVarA.f17647b, e(i11));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return new D0.g.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static D0.g.a d(@androidx.annotation.NonNull android.content.res.Resources r9, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r10, @androidx.annotation.NonNull android.util.AttributeSet r11, @androidx.annotation.Nullable android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = y0.C5809a.j.f240838Q
            android.content.res.TypedArray r3 = D0.n.s(r9, r12, r11, r3)
            int r5 = y0.C5809a.j.f240839R
            boolean r6 = r3.hasValue(r5)
            int r7 = y0.C5809a.j.f240840S
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            D0.g$a r9 = new D0.g$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.g.d(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):D0.g$a");
    }

    public static Shader.TileMode e(int i10) {
        return i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f17646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f17647b;

        public a(@NonNull List<Integer> list, @NonNull List<Float> list2) {
            int size = list.size();
            this.f17646a = new int[size];
            this.f17647b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f17646a[i10] = list.get(i10).intValue();
                this.f17647b[i10] = list2.get(i10).floatValue();
            }
        }

        public a(@InterfaceC4337k int i10, @InterfaceC4337k int i11) {
            this.f17646a = new int[]{i10, i11};
            this.f17647b = new float[]{0.0f, 1.0f};
        }

        public a(@InterfaceC4337k int i10, @InterfaceC4337k int i11, @InterfaceC4337k int i12) {
            this.f17646a = new int[]{i10, i11, i12};
            this.f17647b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
