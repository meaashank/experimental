package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.compose.ui.text.InterfaceC2331i;
import androidx.compose.ui.text.font.K;
import e.InterfaceC4345t;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import k0.C4810a;
import k0.C4815f;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.T(api = 26)
@kotlin.jvm.internal.V({"SMAP\nAndroidPreloadedFont.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPreloadedFont.android.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,234:1\n151#2,3:235\n33#2,4:238\n154#2,2:242\n38#2:244\n156#2:245\n37#3,2:246\n*S KotlinDebug\n*F\n+ 1 AndroidPreloadedFont.android.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n*L\n229#1:235,3\n229#1:238,4\n229#1:242,2\n229#1:244\n229#1:245\n231#1:246,2\n*E\n"})
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n0 f104632a = new n0();

    @InterfaceC4345t
    @InterfaceC2331i
    @Nullable
    public final Typeface a(@NotNull AssetManager assetManager, @NotNull String str, @Nullable Context context, @NotNull K.e eVar) {
        if (context == null) {
            return null;
        }
        return k0.a(assetManager, str).setFontVariationSettings(d(eVar, context)).build();
    }

    @InterfaceC4345t
    @InterfaceC2331i
    @Nullable
    public final Typeface b(@NotNull File file, @Nullable Context context, @NotNull K.e eVar) {
        if (context == null) {
            return null;
        }
        return j0.a(file).setFontVariationSettings(d(eVar, context)).build();
    }

    @InterfaceC4345t
    @InterfaceC2331i
    @Nullable
    public final Typeface c(@NotNull ParcelFileDescriptor parcelFileDescriptor, @Nullable Context context, @NotNull K.e eVar) {
        if (context == null) {
            return null;
        }
        m0.a();
        return l0.a(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(d(eVar, context)).build();
    }

    @e.T(26)
    @InterfaceC2331i
    public final FontVariationAxis[] d(K.e eVar, Context context) {
        InterfaceC4814e c4815f;
        if (context != null) {
            c4815f = C4810a.a(context);
        } else {
            if (eVar.f104550b) {
                throw new IllegalStateException("Required density, but not provided");
            }
            c4815f = new C4815f(1.0f, 1.0f);
        }
        List<K.a> list = eVar.f104549a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            K.a aVar = list.get(i10);
            arrayList.add(new FontVariationAxis(aVar.b(), aVar.a(c4815f)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }
}
