package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.compose.ui.text.InterfaceC2331i;
import androidx.compose.ui.text.font.K;
import k0.C4810a;
import k0.InterfaceC4814e;
import n0.C5237d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.T(26)
public final class TypefaceCompatApi26 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TypefaceCompatApi26 f104585a = new TypefaceCompatApi26();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static ThreadLocal<Paint> f104586b = new ThreadLocal<>();

    @InterfaceC2331i
    @Nullable
    public final Typeface a(@Nullable Typeface typeface, @NotNull K.e eVar, @NotNull Context context) {
        if (typeface == null) {
            return null;
        }
        if (eVar.f104549a.isEmpty()) {
            return typeface;
        }
        Paint paint = f104586b.get();
        if (paint == null) {
            paint = new Paint();
            f104586b.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(b(eVar, context));
        return paint.getTypeface();
    }

    @InterfaceC2331i
    public final String b(K.e eVar, Context context) {
        final InterfaceC4814e interfaceC4814eA = C4810a.a(context);
        return C5237d.q(eVar.f104549a, null, null, null, 0, null, new ed.l<K.a, CharSequence>() { // from class: androidx.compose.ui.text.font.TypefaceCompatApi26$toAndroidString$1
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@NotNull K.a aVar) {
                return "'" + aVar.b() + "' " + aVar.a(interfaceC4814eA);
            }
        }, 31, null);
    }
}
