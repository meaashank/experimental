package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.V1;
import androidx.compose.ui.graphics.AbstractC2131z0;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.util.ArrayList;
import java.util.List;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 2 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,784:1\n72#2,4:785\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n*L\n723#1:785,4\n*E\n"})
public final class c {
    public static final boolean c(ArrayList arrayList, Object obj) {
        return arrayList.add(obj);
    }

    @NotNull
    public static final ImageVector.Builder d(@NotNull ImageVector.Builder builder, @NotNull String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, @NotNull List<? extends e> list, @NotNull ed.l<? super ImageVector.Builder, L0> lVar) {
        builder.addGroup(str, f10, f11, f12, f13, f14, f15, f16, list);
        lVar.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageVector.Builder e(ImageVector.Builder builder, String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        builder.addGroup(str2, f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) != 0 ? 1.0f : f14, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) != 0 ? 0.0f : f16, (i10 & 256) != 0 ? o.h() : list);
        lVar.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    @NotNull
    public static final ImageVector.Builder f(@NotNull ImageVector.Builder builder, @NotNull String str, @Nullable AbstractC2131z0 abstractC2131z0, float f10, @Nullable AbstractC2131z0 abstractC2131z02, float f11, float f12, int i10, int i11, float f13, int i12, @NotNull ed.l<? super d, L0> lVar) {
        d dVar = new d();
        lVar.invoke(dVar);
        return builder.m6addPathoIyEayM(dVar.f101604a, (14336 & 2) != 0 ? o.c() : i12, (14336 & 4) != 0 ? "" : str, (14336 & 8) != 0 ? null : abstractC2131z0, (14336 & 16) != 0 ? 1.0f : f10, (14336 & 32) == 0 ? abstractC2131z02 : null, (14336 & 64) != 0 ? 1.0f : f11, (14336 & 128) != 0 ? 0.0f : f12, (14336 & 256) != 0 ? o.d() : i10, (14336 & 512) != 0 ? o.e() : i11, (14336 & 1024) != 0 ? 4.0f : f13, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f);
    }

    public static ImageVector.Builder g(ImageVector.Builder builder, String str, AbstractC2131z0 abstractC2131z0, float f10, AbstractC2131z0 abstractC2131z02, float f11, float f12, int i10, int i11, float f13, int i12, ed.l lVar, int i13, Object obj) {
        String str2 = (i13 & 1) != 0 ? "" : str;
        AbstractC2131z0 abstractC2131z03 = (i13 & 2) != 0 ? null : abstractC2131z0;
        float f14 = (i13 & 4) != 0 ? 1.0f : f10;
        AbstractC2131z0 abstractC2131z04 = (i13 & 8) != 0 ? null : abstractC2131z02;
        float f15 = (i13 & 16) != 0 ? 1.0f : f11;
        float f16 = (i13 & 32) != 0 ? 0.0f : f12;
        int iD = (i13 & 64) != 0 ? o.d() : i10;
        int iE = (i13 & 128) != 0 ? o.e() : i11;
        float f17 = (i13 & 256) != 0 ? 4.0f : f13;
        int iC = (i13 & 512) != 0 ? o.c() : i12;
        d dVar = new d();
        lVar.invoke(dVar);
        return builder.m6addPathoIyEayM(dVar.f101604a, (14336 & 2) != 0 ? o.c() : iC, (14336 & 4) != 0 ? "" : str2, (14336 & 8) != 0 ? null : abstractC2131z03, (14336 & 16) != 0 ? 1.0f : f14, (14336 & 32) == 0 ? abstractC2131z04 : null, (14336 & 64) != 0 ? 1.0f : f15, (14336 & 128) != 0 ? 0.0f : f16, (14336 & 256) != 0 ? o.d() : iD, (14336 & 512) != 0 ? o.e() : iE, (14336 & 1024) != 0 ? 4.0f : f17, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f);
    }

    public static final <T> T h(ArrayList<T> arrayList) {
        return (T) V1.a(arrayList, 1);
    }

    public static final <T> T i(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    public static final <T> boolean j(ArrayList<T> arrayList, T t10) {
        return arrayList.add(t10);
    }
}
