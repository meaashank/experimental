package androidx.compose.material;

import androidx.compose.ui.input.pointer.C2137d;
import androidx.compose.ui.input.pointer.C2150q;
import androidx.compose.ui.input.pointer.InterfaceC2138e;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.platform.G1;
import java.util.List;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nDragGestureDetectorCopy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material/DragGestureDetectorCopyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,115:1\n53#1,10:116\n63#1,4:135\n67#1,29:146\n116#2,2:126\n33#2,6:128\n118#2:134\n33#2,6:139\n118#2:145\n116#2,2:175\n33#2,6:177\n118#2:183\n116#2,2:184\n33#2,6:186\n118#2:192\n116#2,2:193\n33#2,6:195\n118#2:201\n159#3:202\n149#3:203\n78#4:204\n*S KotlinDebug\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material/DragGestureDetectorCopyKt\n*L\n40#1:116,10\n40#1:135,4\n40#1:146,29\n40#1:126,2\n40#1:128,6\n40#1:134\n40#1:139,6\n40#1:145\n62#1:175,2\n62#1:177,6\n62#1:183\n66#1:184,2\n66#1:186,6\n66#1:192\n103#1:193,2\n103#1:195,6\n103#1:201\n105#1:202\n106#1:203\n107#1:204\n*E\n"})
public final class DragGestureDetectorCopyKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f96019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f96020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f96021c;

    static {
        float f10 = (float) 0.125d;
        f96019a = f10;
        float f11 = 18;
        f96020b = f11;
        f96021c = f10 / f11;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x011b -> B:47:0x0121). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0155 -> B:55:0x0157). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0173 -> B:48:0x0125). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.InterfaceC2138e r19, long r20, int r22, @org.jetbrains.annotations.NotNull ed.p<? super androidx.compose.ui.input.pointer.A, ? super java.lang.Float, kotlin.L0> r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super androidx.compose.ui.input.pointer.A> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DragGestureDetectorCopyKt.a(androidx.compose.ui.input.pointer.e, long, int, ed.p, kotlin.coroutines.e):java.lang.Object");
    }

    public static final Object b(InterfaceC2138e interfaceC2138e, long j10, int i10, ed.p<? super androidx.compose.ui.input.pointer.A, ? super Float, kotlin.L0> pVar, ed.l<? super P.g, Float> lVar, kotlin.coroutines.e<? super androidx.compose.ui.input.pointer.A> eVar) {
        float f10;
        androidx.compose.ui.input.pointer.A a10;
        float f11;
        androidx.compose.ui.input.pointer.A a11;
        if (!c(interfaceC2138e.U1(), j10)) {
            float fD = d(interfaceC2138e.c(), i10);
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.f217903a = j10;
            float f12 = 0.0f;
            while (true) {
                C2150q c2150q = (C2150q) C2137d.t(interfaceC2138e, null, eVar, 1, null);
                List<androidx.compose.ui.input.pointer.A> list = c2150q.f102318a;
                int size = list.size();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        f10 = f12;
                        a10 = null;
                        break;
                    }
                    a10 = list.get(i12);
                    f10 = f12;
                    if (androidx.compose.ui.input.pointer.z.d(a10.f102146a, longRef.f217903a)) {
                        break;
                    }
                    i12++;
                    f12 = f10;
                }
                kotlin.jvm.internal.G.m(a10);
                androidx.compose.ui.input.pointer.A a12 = a10;
                if (a12.D()) {
                    break;
                }
                if (androidx.compose.ui.input.pointer.r.e(a12)) {
                    List<androidx.compose.ui.input.pointer.A> list2 = c2150q.f102318a;
                    int size2 = list2.size();
                    while (true) {
                        if (i11 >= size2) {
                            a11 = null;
                            break;
                        }
                        a11 = list2.get(i11);
                        if (a11.f102149d) {
                            break;
                        }
                        i11++;
                    }
                    androidx.compose.ui.input.pointer.A a13 = a11;
                    if (a13 == null) {
                        break;
                    }
                    longRef.f217903a = a13.f102146a;
                    f11 = f10;
                } else {
                    float fFloatValue = (lVar.invoke(new P.g(a12.f102148c)).floatValue() - lVar.invoke(new P.g(a12.f102152g)).floatValue()) + f10;
                    if (Math.abs(fFloatValue) < fD) {
                        interfaceC2138e.T1(PointerEventPass.Final, eVar);
                        if (a12.D()) {
                            break;
                        }
                        f11 = fFloatValue;
                    } else {
                        pVar.invoke(a12, Float.valueOf(fFloatValue - (Math.signum(fFloatValue) * fD)));
                        if (a12.D()) {
                            return a12;
                        }
                        f11 = 0.0f;
                    }
                }
                f12 = f11;
            }
        }
        return null;
    }

    public static final boolean c(C2150q c2150q, long j10) {
        androidx.compose.ui.input.pointer.A a10;
        List<androidx.compose.ui.input.pointer.A> list = c2150q.f102318a;
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                a10 = null;
                break;
            }
            a10 = list.get(i10);
            if (androidx.compose.ui.input.pointer.z.d(a10.f102146a, j10)) {
                break;
            }
            i10++;
        }
        androidx.compose.ui.input.pointer.A a11 = a10;
        if (a11 != null && a11.f102149d) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float d(@NotNull G1 g12, int i10) {
        androidx.compose.ui.input.pointer.O.f102192b.getClass();
        return i10 == androidx.compose.ui.input.pointer.O.f102195e ? g12.c() * f96021c : g12.c();
    }
}
