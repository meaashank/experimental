package androidx.vectordrawable.graphics.drawable;

import D0.n;
import G0.I;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.G;
import e.InterfaceC4328b;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s0.x;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f119694a = "AnimatorInflater";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f119695b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f119696c = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f119697d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f119698e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f119699f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f119700g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f119701h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f119702i = false;

    public static class a implements TypeEvaluator<I.b[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public I.b[] f119703a;

        public a() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public I.b[] evaluate(float f10, I.b[] bVarArr, I.b[] bVarArr2) {
            if (!I.b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!I.b(this.f119703a, bVarArr)) {
                this.f119703a = I.f(bVarArr);
            }
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                this.f119703a[i10].j(bVarArr[i10], bVarArr2[i10], f10);
            }
            return this.f119703a;
        }

        public a(I.b[] bVarArr) {
            this.f119703a = bVarArr;
        }
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f10) throws XmlPullParserException, IOException {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        if (r18 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        if (r10 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        r13 = new android.animation.Animator[r10.size()];
        r14 = r10.size();
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
    
        if (r15 >= r14) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e2, code lost:
    
        r0 = r10.get(r15);
        r15 = r15 + 1;
        r13[r11] = (android.animation.Animator) r0;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f0, code lost:
    
        if (r19 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
    
        r18.playTogether(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f5, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
    
        r18.playSequentially(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f9, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator b(android.content.Context r13, android.content.res.Resources r14, android.content.res.Resources.Theme r15, org.xmlpull.v1.XmlPullParser r16, android.util.AttributeSet r17, android.animation.AnimatorSet r18, int r19, float r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.e.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe c(Keyframe keyframe, float f10) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f10) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f10) : Keyframe.ofObject(f10);
    }

    public static void d(Keyframe[] keyframeArr, float f10, int i10, int i11) {
        float f11 = f10 / ((i11 - i10) + 2);
        while (i10 <= i11) {
            keyframeArr[i10].setFraction(keyframeArr[i10 - 1].getFraction() + f11);
            i10++;
        }
    }

    public static void e(Object[] objArr, String str) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        Log.d(f119694a, str);
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Keyframe keyframe = (Keyframe) objArr[i10];
            StringBuilder sbA = android.support.v4.media.a.a("Keyframe ", i10, ": fraction ");
            Object value = "null";
            sbA.append(keyframe.getFraction() < 0.0f ? "null" : Float.valueOf(keyframe.getFraction()));
            sbA.append(", , value : ");
            if (keyframe.hasValue()) {
                value = keyframe.getValue();
            }
            sbA.append(value);
            Log.d(f119694a, sbA.toString());
        }
    }

    public static PropertyValuesHolder f(TypedArray typedArray, int i10, int i11, int i12, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        boolean z10 = typedValuePeekValue != null;
        int i13 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i12);
        boolean z11 = typedValuePeekValue2 != null;
        int i14 = z11 ? typedValuePeekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && i(i13)) || (z11 && i(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            I.b[] bVarArrD = I.d(string);
            I.b[] bVarArrD2 = I.d(string2);
            if (bVarArrD != null || bVarArrD2 != null) {
                if (bVarArrD != null) {
                    a aVar = new a();
                    if (bVarArrD2 == null) {
                        return PropertyValuesHolder.ofObject(str, aVar, bVarArrD);
                    }
                    if (I.b(bVarArrD, bVarArrD2)) {
                        return PropertyValuesHolder.ofObject(str, aVar, bVarArrD, bVarArrD2);
                    }
                    throw new InflateException(G.a(" Can't morph from ", string, " to ", string2));
                }
                if (bVarArrD2 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), bVarArrD2);
                }
            }
            return null;
        }
        f fVar = i10 == 3 ? f.f119704a : null;
        if (z12) {
            if (z10) {
                float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                if (z11) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z10) {
            int dimension2 = i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : i(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
            if (z11) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : i(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z11) {
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : i(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
        }
        if (propertyValuesHolderOfInt != null && fVar != null) {
            propertyValuesHolderOfInt.setEvaluator(fVar);
        }
        return propertyValuesHolderOfInt;
    }

    public static int g(TypedArray typedArray, int i10, int i11) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        boolean z10 = typedValuePeekValue != null;
        int i12 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i11);
        boolean z11 = typedValuePeekValue2 != null;
        int i13 = z11 ? typedValuePeekValue2.type : 0;
        if (z10 && i(i12)) {
            return 3;
        }
        return (z11 && i(i13)) ? 3 : 0;
    }

    public static int h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f119637h0);
        int i10 = 0;
        TypedValue typedValueT = n.t(typedArrayS, xmlPullParser, "value", 0);
        if (typedValueT != null && i(typedValueT.type)) {
            i10 = 3;
        }
        typedArrayS.recycle();
        return i10;
    }

    public static boolean i(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static Animator j(Context context, @InterfaceC4328b int i10) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i10) : l(context, context.getResources(), context.getTheme(), i10, 1.0f);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, @InterfaceC4328b int i10) throws Resources.NotFoundException {
        return l(context, resources, theme, i10, 1.0f);
    }

    public static Animator l(Context context, Resources resources, Resources.Theme theme, @InterfaceC4328b int i10, float f10) throws Resources.NotFoundException {
        XmlResourceParser animation = null;
        try {
            try {
                animation = resources.getAnimation(i10);
                Animator animatorA = a(context, resources, theme, animation, f10);
                animation.close();
                return animatorA;
            } catch (IOException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException.initCause(e10);
                throw notFoundException;
            } catch (XmlPullParserException e11) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException2.initCause(e11);
                throw notFoundException2;
            }
        } catch (Throwable th) {
            if (animation != null) {
                animation.close();
            }
            throw th;
        }
    }

    public static ValueAnimator m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f10, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f119613R);
        TypedArray typedArrayS2 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f119647m0);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        r(valueAnimator, typedArrayS, typedArrayS2, f10, xmlPullParser);
        int resourceId = n.r(xmlPullParser, "interpolator") ? typedArrayS.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            valueAnimator.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        typedArrayS.recycle();
        if (typedArrayS2 != null) {
            typedArrayS2.recycle();
        }
        return valueAnimator;
    }

    public static Keyframe n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i10, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Keyframe keyframeOfFloat;
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f119637h0);
        float fJ = n.j(typedArrayS, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue typedValueT = n.t(typedArrayS, xmlPullParser, "value", 0);
        boolean z10 = typedValueT != null;
        if (i10 == 4) {
            i10 = (z10 && i(typedValueT.type)) ? 3 : 0;
        }
        if (!z10) {
            keyframeOfFloat = i10 == 0 ? Keyframe.ofFloat(fJ) : Keyframe.ofInt(fJ);
        } else if (i10 == 0) {
            keyframeOfFloat = Keyframe.ofFloat(fJ, n.r(xmlPullParser, "value") ? typedArrayS.getFloat(0, 0.0f) : 0.0f);
        } else if (i10 == 1 || i10 == 3) {
            keyframeOfFloat = Keyframe.ofInt(fJ, !n.r(xmlPullParser, "value") ? 0 : typedArrayS.getInt(0, 0));
        } else {
            keyframeOfFloat = null;
        }
        int resourceId = n.r(xmlPullParser, "interpolator") ? typedArrayS.getResourceId(1, 0) : 0;
        if (resourceId > 0) {
            keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        typedArrayS.recycle();
        return keyframeOfFloat;
    }

    public static ObjectAnimator o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f10, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m(context, resources, theme, attributeSet, objectAnimator, f10, xmlPullParser);
        return objectAnimator;
    }

    public static PropertyValuesHolder p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i10) throws XmlPullParserException, IOException {
        int size;
        Context context2;
        Resources.Theme theme2;
        XmlPullParser xmlPullParser2;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i10 == 4) {
                    i10 = h(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                int i11 = i10;
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
                Keyframe keyframeN = n(context2, resources, theme2, Xml.asAttributeSet(xmlPullParser), i11, xmlPullParser2);
                if (keyframeN != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(keyframeN);
                }
                xmlPullParser2.next();
                i10 = i11;
            } else {
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
            }
            context = context2;
            theme = theme2;
            xmlPullParser = xmlPullParser2;
        }
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            return null;
        }
        Keyframe keyframe = (Keyframe) arrayList.get(0);
        Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
        float fraction = keyframe2.getFraction();
        if (fraction < 1.0f) {
            if (fraction < 0.0f) {
                keyframe2.setFraction(1.0f);
            } else {
                arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                size++;
            }
        }
        float fraction2 = keyframe.getFraction();
        if (fraction2 != 0.0f) {
            if (fraction2 < 0.0f) {
                keyframe.setFraction(0.0f);
            } else {
                arrayList.add(0, c(keyframe, 0.0f));
                size++;
            }
        }
        Keyframe[] keyframeArr = new Keyframe[size];
        arrayList.toArray(keyframeArr);
        for (int i12 = 0; i12 < size; i12++) {
            Keyframe keyframe3 = keyframeArr[i12];
            if (keyframe3.getFraction() < 0.0f) {
                if (i12 == 0) {
                    keyframe3.setFraction(0.0f);
                } else {
                    int i13 = size - 1;
                    if (i12 == i13) {
                        keyframe3.setFraction(1.0f);
                    } else {
                        int i14 = i12;
                        for (int i15 = i12 + 1; i15 < i13 && keyframeArr[i15].getFraction() < 0.0f; i15++) {
                            i14 = i15;
                        }
                        d(keyframeArr, keyframeArr[i14 + 1].getFraction() - keyframeArr[i12 - 1].getFraction(), i12, i14);
                    }
                }
            }
        }
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
        if (i10 == 3) {
            propertyValuesHolderOfKeyframe.setEvaluator(f.f119704a);
        }
        return propertyValuesHolderOfKeyframe;
    }

    public static PropertyValuesHolder[] q(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i10;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser2.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser2.next();
            } else {
                if (xmlPullParser2.getName().equals("propertyValuesHolder")) {
                    TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f119627c0);
                    String strM = n.m(typedArrayS, xmlPullParser2, "propertyName", 3);
                    int i11 = n.r(xmlPullParser2, "valueType") ? typedArrayS.getInt(2, 4) : 4;
                    PropertyValuesHolder propertyValuesHolderP = p(context, resources, theme, xmlPullParser2, strM, i11);
                    if (propertyValuesHolderP == null) {
                        propertyValuesHolderP = f(typedArrayS, i11, 0, 1, strM);
                    }
                    if (propertyValuesHolderP != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(propertyValuesHolderP);
                    }
                    typedArrayS.recycle();
                }
                xmlPullParser.next();
                xmlPullParser2 = xmlPullParser;
            }
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[size];
        for (i10 = 0; i10 < size; i10++) {
            propertyValuesHolderArr[i10] = (PropertyValuesHolder) arrayList.get(i10);
        }
        return propertyValuesHolderArr;
    }

    public static void r(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f10, XmlPullParser xmlPullParser) {
        long jK = n.k(typedArray, xmlPullParser, x.h.f238399b, 1, 300);
        long j10 = !n.r(xmlPullParser, "startOffset") ? 0 : typedArray.getInt(2, 0);
        int iG = !n.r(xmlPullParser, "valueType") ? 4 : typedArray.getInt(7, 4);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (iG == 4) {
                iG = g(typedArray, 5, 6);
            }
            PropertyValuesHolder propertyValuesHolderF = f(typedArray, iG, 5, 6, "");
            if (propertyValuesHolderF != null) {
                valueAnimator.setValues(propertyValuesHolderF);
            }
        }
        valueAnimator.setDuration(jK);
        valueAnimator.setStartDelay(j10);
        valueAnimator.setRepeatCount(n.r(xmlPullParser, "repeatCount") ? typedArray.getInt(3, 0) : 0);
        valueAnimator.setRepeatMode(n.r(xmlPullParser, "repeatMode") ? typedArray.getInt(4, 1) : 1);
        if (typedArray2 != null) {
            s(valueAnimator, typedArray2, iG, f10, xmlPullParser);
        }
    }

    public static void s(ValueAnimator valueAnimator, TypedArray typedArray, int i10, float f10, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String strM = n.m(typedArray, xmlPullParser, "pathData", 1);
        if (strM == null) {
            objectAnimator.setPropertyName(n.m(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String strM2 = n.m(typedArray, xmlPullParser, "propertyXName", 2);
        String strM3 = n.m(typedArray, xmlPullParser, "propertyYName", 3);
        if (i10 != 2) {
        }
        if (strM2 != null || strM3 != null) {
            t(I.e(strM), objectAnimator, f10 * 0.5f, strM2, strM3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    public static void t(Path path, ObjectAnimator objectAnimator, float f10, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f11 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float length = 0.0f;
        do {
            length += pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int iMin = Math.min(100, ((int) (length / f10)) + 1);
        float[] fArr = new float[iMin];
        float[] fArr2 = new float[iMin];
        float[] fArr3 = new float[2];
        float f12 = length / (iMin - 1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iMin) {
                break;
            }
            pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i11)).floatValue(), fArr3, null);
            fArr[i10] = fArr3[0];
            fArr2[i10] = fArr3[1];
            f11 += f12;
            int i12 = i11 + 1;
            if (i12 < arrayList.size() && f11 > ((Float) arrayList.get(i12)).floatValue()) {
                pathMeasure2.nextContour();
                i11 = i12;
            }
            i10++;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat2);
        } else if (propertyValuesHolderOfFloat2 == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat);
        } else {
            objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        }
    }
}
