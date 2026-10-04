package D0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.InterfaceC4329c;
import e.InterfaceC4337k;
import e.b0;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17666a = "http://schemas.android.com/apk/res/android";

    public static int a(@NonNull Context context, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? i10 : i11;
    }

    public static boolean b(@NonNull TypedArray typedArray, @b0 int i10, @b0 int i11, boolean z10) {
        return typedArray.getBoolean(i10, typedArray.getBoolean(i11, z10));
    }

    @Nullable
    public static Drawable c(@NonNull TypedArray typedArray, @b0 int i10, @b0 int i11) {
        Drawable drawable = typedArray.getDrawable(i10);
        return drawable == null ? typedArray.getDrawable(i11) : drawable;
    }

    public static int d(@NonNull TypedArray typedArray, @b0 int i10, @b0 int i11, int i12) {
        return typedArray.getInt(i10, typedArray.getInt(i11, i12));
    }

    public static boolean e(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @b0 int i10, boolean z10) {
        return !r(xmlPullParser, str) ? z10 : typedArray.getBoolean(i10, z10);
    }

    @InterfaceC4337k
    public static int f(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @b0 int i10, @InterfaceC4337k int i11) {
        return !r(xmlPullParser, str) ? i11 : typedArray.getColor(i10, i11);
    }

    @Nullable
    public static ColorStateList g(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, @b0 int i10) {
        if (!r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i10, typedValue);
        int i11 = typedValue.type;
        if (i11 != 2) {
            return (i11 < 28 || i11 > 31) ? c.d(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme) : ColorStateList.valueOf(typedValue.data);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i10 + ": " + typedValue);
    }

    @NonNull
    public static ColorStateList h(@NonNull TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static d i(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, @b0 int i10, @InterfaceC4337k int i11) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return d.b(typedValue.data);
            }
            d dVarG = d.g(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            if (dVarG != null) {
                return dVarG;
            }
        }
        return d.b(i11);
    }

    public static float j(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @b0 int i10, float f10) {
        return !r(xmlPullParser, str) ? f10 : typedArray.getFloat(i10, f10);
    }

    public static int k(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @b0 int i10, int i11) {
        return !r(xmlPullParser, str) ? i11 : typedArray.getInt(i10, i11);
    }

    @InterfaceC4329c
    public static int l(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @b0 int i10, @InterfaceC4329c int i11) {
        return !r(xmlPullParser, str) ? i11 : typedArray.getResourceId(i10, i11);
    }

    @Nullable
    public static String m(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @b0 int i10) {
        if (r(xmlPullParser, str)) {
            return typedArray.getString(i10);
        }
        return null;
    }

    @InterfaceC4329c
    public static int n(@NonNull TypedArray typedArray, @b0 int i10, @b0 int i11, @InterfaceC4329c int i12) {
        return typedArray.getResourceId(i10, typedArray.getResourceId(i11, i12));
    }

    @Nullable
    public static String o(@NonNull TypedArray typedArray, @b0 int i10, @b0 int i11) {
        String string = typedArray.getString(i10);
        return string == null ? typedArray.getString(i11) : string;
    }

    @Nullable
    public static CharSequence p(@NonNull TypedArray typedArray, @b0 int i10, @b0 int i11) {
        CharSequence text = typedArray.getText(i10);
        return text == null ? typedArray.getText(i11) : text;
    }

    @Nullable
    public static CharSequence[] q(@NonNull TypedArray typedArray, @b0 int i10, @b0 int i11) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        return textArray == null ? typedArray.getTextArray(i11) : textArray;
    }

    public static boolean r(@NonNull XmlPullParser xmlPullParser, @NonNull String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    @NonNull
    public static TypedArray s(@NonNull Resources resources, @Nullable Resources.Theme theme, @NonNull AttributeSet attributeSet, @NonNull int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @Nullable
    public static TypedValue t(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, int i10) {
        if (r(xmlPullParser, str)) {
            return typedArray.peekValue(i10);
        }
        return null;
    }
}
