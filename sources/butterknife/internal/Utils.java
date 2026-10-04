package butterknife.internal;

import B0.C0920d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.media.e;
import android.util.TypedValue;
import android.view.View;
import e.C;
import e.InterfaceC4332f;
import e.InterfaceC4342p;
import e.InterfaceC4346u;
import e.e0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Utils {
    private static final TypedValue VALUE = new TypedValue();

    private Utils() {
        throw new AssertionError("No instances.");
    }

    @SafeVarargs
    public static <T> T[] arrayFilteringNull(T... tArr) {
        int length = tArr.length;
        int i10 = 0;
        for (T t10 : tArr) {
            if (t10 != null) {
                tArr[i10] = t10;
                i10++;
            }
        }
        return i10 == length ? tArr : (T[]) Arrays.copyOf(tArr, i10);
    }

    public static <T> T castParam(Object obj, String str, int i10, String str2, int i11, Class<T> cls) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            StringBuilder sb2 = new StringBuilder("Parameter #");
            sb2.append(i10 + 1);
            sb2.append(" of method '");
            sb2.append(str);
            sb2.append("' was of the wrong type for parameter #");
            sb2.append(i11 + 1);
            sb2.append(" of method '");
            throw new IllegalStateException(e.a(sb2, str2, "'. See cause for more info."), e10);
        }
    }

    public static <T> T castView(View view, @C int i10, String str, Class<T> cls) {
        try {
            return cls.cast(view);
        } catch (ClassCastException e10) {
            throw new IllegalStateException(e.a(androidx.constraintlayout.widget.e.a("View '", getResourceEntryName(view, i10), "' with ID ", i10, " for "), str, " was of the wrong type. See cause for more info."), e10);
        }
    }

    public static <T> T findOptionalViewAsType(View view, @C int i10, String str, Class<T> cls) {
        return (T) castView(view.findViewById(i10), i10, str, cls);
    }

    public static View findRequiredView(View view, @C int i10, String str) {
        View viewFindViewById = view.findViewById(i10);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalStateException(e.a(androidx.constraintlayout.widget.e.a("Required view '", getResourceEntryName(view, i10), "' with ID ", i10, " for "), str, " was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation."));
    }

    public static <T> T findRequiredViewAsType(View view, @C int i10, String str, Class<T> cls) {
        return (T) castView(findRequiredView(view, i10, str), i10, str, cls);
    }

    @e0
    public static float getFloat(Context context, @InterfaceC4342p int i10) {
        TypedValue typedValue = VALUE;
        context.getResources().getValue(i10, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i10) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    private static String getResourceEntryName(View view, @C int i10) {
        return view.isInEditMode() ? "<unavailable while editing>" : view.getContext().getResources().getResourceEntryName(i10);
    }

    @e0
    public static Drawable getTintedDrawable(Context context, @InterfaceC4346u int i10, @InterfaceC4332f int i11) {
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = VALUE;
        if (theme.resolveAttribute(i11, typedValue, true)) {
            Drawable drawableMutate = C0920d.getDrawable(context, i10).mutate();
            drawableMutate.setTint(C0920d.getColor(context, typedValue.resourceId));
            return drawableMutate;
        }
        throw new Resources.NotFoundException("Required tint color attribute with name " + context.getResources().getResourceEntryName(i11) + " and attribute ID " + i11 + " was not found.");
    }

    @SafeVarargs
    public static <T> List<T> listFilteringNull(T... tArr) {
        return new ImmutableList(arrayFilteringNull(tArr));
    }
}
