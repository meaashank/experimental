package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import w.y;

/* JADX INFO: loaded from: classes2.dex */
public class ConstraintAttribute {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f107580i = "TransitionLayout";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f107581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f107582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AttributeType f107583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f107584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f107585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f107586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f107587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f107588h;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f107589a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f107589a = iArr;
            try {
                iArr[AttributeType.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f107589a[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f107589a[AttributeType.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f107589a[AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f107589a[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f107589a[AttributeType.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f107589a[AttributeType.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f107589a[AttributeType.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public ConstraintAttribute(String name, AttributeType attributeType) {
        this.f107581a = false;
        this.f107582b = name;
        this.f107583c = attributeType;
    }

    public static int b(int c10) {
        int i10 = (c10 & (~(c10 >> 31))) - 255;
        return (i10 & (i10 >> 31)) + 255;
    }

    public static HashMap<String, ConstraintAttribute> d(HashMap<String, ConstraintAttribute> base, View view) {
        HashMap<String, ConstraintAttribute> map = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : base.keySet()) {
            ConstraintAttribute constraintAttribute = base.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }
        return map;
    }

    public static void q(Context context, XmlPullParser parser, HashMap<String, ConstraintAttribute> custom) {
        AttributeType attributeType;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.f110434qd);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        AttributeType attributeType2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == g.m.f110449rd) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == g.m.f109824Bd) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == g.m.f110464sd) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == g.m.f110494ud) {
                    attributeType = AttributeType.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == g.m.f110479td) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == g.m.f110554yd) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == g.m.f110509vd) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == g.m.f110524wd) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == g.m.f110539xd) {
                    attributeType = AttributeType.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == g.m.f109809Ad) {
                    attributeType = AttributeType.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == g.m.f110569zd) {
                    attributeType = AttributeType.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                attributeType2 = attributeType;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            custom.put(string, new ConstraintAttribute(string, attributeType2, objValueOf2, z10));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void r(View view, HashMap<String, ConstraintAttribute> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            ConstraintAttribute constraintAttribute = map.get(str);
            String strA = !constraintAttribute.f107581a ? y.a("set", str) : str;
            try {
                int i10 = a.f107589a[constraintAttribute.f107583c.ordinal()];
                Class<?> cls2 = Float.TYPE;
                Class<?> cls3 = Integer.TYPE;
                switch (i10) {
                    case 1:
                        cls.getMethod(strA, cls3).invoke(view, Integer.valueOf(constraintAttribute.f107584d));
                        break;
                    case 2:
                        cls.getMethod(strA, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f107587g));
                        break;
                    case 3:
                        cls.getMethod(strA, CharSequence.class).invoke(view, constraintAttribute.f107586f);
                        break;
                    case 4:
                        cls.getMethod(strA, cls3).invoke(view, Integer.valueOf(constraintAttribute.f107588h));
                        break;
                    case 5:
                        Method method = cls.getMethod(strA, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f107588h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(strA, cls3).invoke(view, Integer.valueOf(constraintAttribute.f107584d));
                        break;
                    case 7:
                        cls.getMethod(strA, cls2).invoke(view, Float.valueOf(constraintAttribute.f107585e));
                        break;
                    case 8:
                        cls.getMethod(strA, cls2).invoke(view, Float.valueOf(constraintAttribute.f107585e));
                        break;
                }
            } catch (IllegalAccessException e10) {
                StringBuilder sbA = androidx.activity.result.i.a(" Custom Attribute \"", str, "\" not found on ");
                sbA.append(cls.getName());
                Log.e("TransitionLayout", sbA.toString());
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", e11.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + strA);
            } catch (InvocationTargetException e12) {
                StringBuilder sbA2 = androidx.activity.result.i.a(" Custom Attribute \"", str, "\" not found on ");
                sbA2.append(cls.getName());
                Log.e("TransitionLayout", sbA2.toString());
                e12.printStackTrace();
            }
        }
    }

    public void a(View view) {
        Class<?> cls = view.getClass();
        String str = this.f107582b;
        String strA = !this.f107581a ? y.a("set", str) : str;
        try {
            int i10 = a.f107589a[this.f107583c.ordinal()];
            Class<?> cls2 = Integer.TYPE;
            Class<?> cls3 = Float.TYPE;
            switch (i10) {
                case 1:
                case 6:
                    cls.getMethod(strA, cls2).invoke(view, Integer.valueOf(this.f107584d));
                    break;
                case 2:
                    cls.getMethod(strA, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f107587g));
                    break;
                case 3:
                    cls.getMethod(strA, CharSequence.class).invoke(view, this.f107586f);
                    break;
                case 4:
                    cls.getMethod(strA, cls2).invoke(view, Integer.valueOf(this.f107588h));
                    break;
                case 5:
                    Method method = cls.getMethod(strA, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f107588h);
                    method.invoke(view, colorDrawable);
                    break;
                case 7:
                    cls.getMethod(strA, cls3).invoke(view, Float.valueOf(this.f107585e));
                    break;
                case 8:
                    cls.getMethod(strA, cls3).invoke(view, Float.valueOf(this.f107585e));
                    break;
            }
        } catch (IllegalAccessException e10) {
            StringBuilder sbA = androidx.activity.result.i.a(" Custom Attribute \"", str, "\" not found on ");
            sbA.append(cls.getName());
            Log.e("TransitionLayout", sbA.toString());
            e10.printStackTrace();
        } catch (NoSuchMethodException e11) {
            Log.e("TransitionLayout", e11.getMessage());
            Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
            Log.e("TransitionLayout", cls.getName() + " must have a method " + strA);
        } catch (InvocationTargetException e12) {
            StringBuilder sbA2 = androidx.activity.result.i.a(" Custom Attribute \"", str, "\" not found on ");
            sbA2.append(cls.getName());
            Log.e("TransitionLayout", sbA2.toString());
            e12.printStackTrace();
        }
    }

    public boolean c(ConstraintAttribute constraintAttribute) {
        AttributeType attributeType;
        if (constraintAttribute != null && (attributeType = this.f107583c) == constraintAttribute.f107583c) {
            switch (a.f107589a[attributeType.ordinal()]) {
                case 1:
                case 6:
                    if (this.f107584d == constraintAttribute.f107584d) {
                        return true;
                    }
                    break;
                case 2:
                    return this.f107587g == constraintAttribute.f107587g;
                case 3:
                    return this.f107584d == constraintAttribute.f107584d;
                case 4:
                case 5:
                    return this.f107588h == constraintAttribute.f107588h;
                case 7:
                    return this.f107585e == constraintAttribute.f107585e;
                case 8:
                    return this.f107585e == constraintAttribute.f107585e;
                default:
                    return false;
            }
        }
        return false;
    }

    public int e() {
        return this.f107588h;
    }

    public float f() {
        return this.f107585e;
    }

    public int g() {
        return this.f107584d;
    }

    public String h() {
        return this.f107582b;
    }

    public String i() {
        return this.f107586f;
    }

    public AttributeType j() {
        return this.f107583c;
    }

    public float k() {
        switch (a.f107589a[this.f107583c.ordinal()]) {
            case 2:
                return this.f107587g ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f107584d;
            case 7:
                return this.f107585e;
            case 8:
                return this.f107585e;
            default:
                return Float.NaN;
        }
    }

    public void l(float[] ret) {
        switch (a.f107589a[this.f107583c.ordinal()]) {
            case 2:
                ret[0] = this.f107587g ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i10 = (this.f107588h >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                ret[0] = fPow;
                ret[1] = fPow2;
                ret[2] = fPow3;
                ret[3] = i10 / 255.0f;
                return;
            case 6:
                ret[0] = this.f107584d;
                return;
            case 7:
                ret[0] = this.f107585e;
                return;
            case 8:
                ret[0] = this.f107585e;
                return;
            default:
                return;
        }
    }

    public boolean m() {
        return this.f107587g;
    }

    public boolean n() {
        int i10 = a.f107589a[this.f107583c.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? false : true;
    }

    public boolean o() {
        return this.f107581a;
    }

    public int p() {
        int i10 = a.f107589a[this.f107583c.ordinal()];
        return (i10 == 4 || i10 == 5) ? 4 : 1;
    }

    public void s(int value) {
        this.f107588h = value;
    }

    public void t(float value) {
        this.f107585e = value;
    }

    public void u(int value) {
        this.f107584d = value;
    }

    public void v(String value) {
        this.f107586f = value;
    }

    public void w(Object value) {
        switch (a.f107589a[this.f107583c.ordinal()]) {
            case 1:
            case 6:
                this.f107584d = ((Integer) value).intValue();
                break;
            case 2:
                this.f107587g = ((Boolean) value).booleanValue();
                break;
            case 3:
                this.f107586f = (String) value;
                break;
            case 4:
            case 5:
                this.f107588h = ((Integer) value).intValue();
                break;
            case 7:
                this.f107585e = ((Float) value).floatValue();
                break;
            case 8:
                this.f107585e = ((Float) value).floatValue();
                break;
        }
    }

    public void x(float[] value) {
        switch (a.f107589a[this.f107583c.ordinal()]) {
            case 1:
            case 6:
                this.f107584d = (int) value[0];
                return;
            case 2:
                this.f107587g = ((double) value[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int iHSVToColor = Color.HSVToColor(value);
                this.f107588h = iHSVToColor;
                this.f107588h = (b((int) (value[3] * 255.0f)) << 24) | (iHSVToColor & 16777215);
                return;
            case 7:
                this.f107585e = value[0];
                return;
            case 8:
                this.f107585e = value[0];
                return;
            default:
                return;
        }
    }

    public ConstraintAttribute(String name, AttributeType attributeType, Object value, boolean method) {
        this.f107582b = name;
        this.f107583c = attributeType;
        this.f107581a = method;
        w(value);
    }

    public ConstraintAttribute(ConstraintAttribute source, Object value) {
        this.f107581a = false;
        this.f107582b = source.f107582b;
        this.f107583c = source.f107583c;
        w(value);
    }
}
