package k0;

import androidx.compose.runtime.T1;
import kotlin.jvm.internal.V;
import n0.C5238e;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nIntRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,335:1\n26#2:336\n26#2:337\n26#2:338\n26#2:339\n*S KotlinDebug\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n*L\n330#1:336\n331#1:337\n332#1:338\n333#1:339\n*E\n"})
public final class w {
    @T1
    @NotNull
    public static final v a(long j10, long j11) {
        return new v((int) (j10 >> 32), (int) (j10 & ZipKt.f225990j), (int) (j11 >> 32), (int) (j11 & ZipKt.f225990j));
    }

    @T1
    @NotNull
    public static final v b(long j10, long j11) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & ZipKt.f225990j);
        return new v(i10, i11, ((int) (j11 >> 32)) + i10, ((int) (j11 & ZipKt.f225990j)) + i11);
    }

    @T1
    @NotNull
    public static final v c(long j10, int i10) {
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & ZipKt.f225990j);
        return new v(i11 - i10, i12 - i10, i11 + i10, i12 + i10);
    }

    @T1
    @NotNull
    public static final v d(@NotNull v vVar, @NotNull v vVar2, float f10) {
        return new v(C5238e.k(vVar.f214334a, vVar2.f214334a, f10), C5238e.k(vVar.f214335b, vVar2.f214335b, f10), C5238e.k(vVar.f214336c, vVar2.f214336c, f10), C5238e.k(vVar.f214337d, vVar2.f214337d, f10));
    }

    @T1
    @NotNull
    public static final v e(@NotNull P.j jVar) {
        return new v(Math.round(jVar.f65511a), Math.round(jVar.f65512b), Math.round(jVar.f65513c), Math.round(jVar.f65514d));
    }

    @T1
    @NotNull
    public static final P.j f(@NotNull v vVar) {
        return new P.j(vVar.f214334a, vVar.f214335b, vVar.f214336c, vVar.f214337d);
    }
}
