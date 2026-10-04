package D0;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import e.InterfaceC4329c;
import e.InterfaceC4337k;
import e.InterfaceC4343q;
import e.T;
import e.b0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nTypedArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
public final class m {
    public static final void a(TypedArray typedArray, @b0 int i10) {
        if (!typedArray.hasValue(i10)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean b(@NotNull TypedArray typedArray, @b0 int i10) {
        a(typedArray, i10);
        return typedArray.getBoolean(i10, false);
    }

    @InterfaceC4337k
    public static final int c(@NotNull TypedArray typedArray, @b0 int i10) {
        a(typedArray, i10);
        return typedArray.getColor(i10, 0);
    }

    @NotNull
    public static final ColorStateList d(@NotNull TypedArray typedArray, @b0 int i10) {
        a(typedArray, i10);
        ColorStateList colorStateList = typedArray.getColorStateList(i10);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.");
    }

    public static final float e(@NotNull TypedArray typedArray, @b0 int i10) {
        a(typedArray, i10);
        return typedArray.getDimension(i10, 0.0f);
    }

    @InterfaceC4343q
    public static final int f(@NotNull TypedArray typedArray, @b0 int i10) {
        a(typedArray, i10);
        return typedArray.getDimensionPixelOffset(i10, 0);
    }

    @InterfaceC4343q
    public static final int g(@NotNull TypedArray typedArray, @b0 int i10) {
        a(typedArray, i10);
        return typedArray.getDimensionPixelSize(i10, 0);
    }

    @NotNull
    public static final Drawable h(@NotNull TypedArray typedArray, @b0 int i10) {
        a(typedArray, i10);
        Drawable drawable = typedArray.getDrawable(i10);
        G.m(drawable);
        return drawable;
    }

    public static final float i(@NotNull TypedArray typedArray, @b0 int i10) {
        a(typedArray, i10);
        return typedArray.getFloat(i10, 0.0f);
    }

    @T(26)
    @NotNull
    public static final Typeface j(@NotNull TypedArray typedArray, @b0 int i10) {
        a(typedArray, i10);
        return l.a(typedArray, i10);
    }

    public static final int k(@NotNull TypedArray typedArray, @b0 int i10) {
        a(typedArray, i10);
        return typedArray.getInt(i10, 0);
    }

    public static final int l(@NotNull TypedArray typedArray, @b0 int i10) {
        a(typedArray, i10);
        return typedArray.getInteger(i10, 0);
    }

    @InterfaceC4329c
    public static final int m(@NotNull TypedArray typedArray, @b0 int i10) {
        a(typedArray, i10);
        return typedArray.getResourceId(i10, 0);
    }

    @NotNull
    public static final String n(@NotNull TypedArray typedArray, @b0 int i10) {
        a(typedArray, i10);
        String string = typedArray.getString(i10);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.");
    }

    @NotNull
    public static final CharSequence[] o(@NotNull TypedArray typedArray, @b0 int i10) {
        a(typedArray, i10);
        return typedArray.getTextArray(i10);
    }

    @NotNull
    public static final CharSequence p(@NotNull TypedArray typedArray, @b0 int i10) {
        a(typedArray, i10);
        CharSequence text = typedArray.getText(i10);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.");
    }

    public static final <R> R q(@NotNull TypedArray typedArray, @NotNull ed.l<? super TypedArray, ? extends R> lVar) {
        R rInvoke = lVar.invoke(typedArray);
        typedArray.recycle();
        return rInvoke;
    }
}
