package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f106353a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f106354b = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[PHI: r15 r16
      0x0033: PHI (r15v26 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[PHI: r15 r16
      0x0035: PHI (r15v3 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x048f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x038b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016a  */
    /* JADX WARN: Type inference failed for: r0v27, types: [androidx.constraintlayout.core.d] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.constraintlayout.core.d] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.constraintlayout.core.SolverVariable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(androidx.constraintlayout.core.widgets.d r37, androidx.constraintlayout.core.d r38, int r39, int r40, androidx.constraintlayout.core.widgets.c r41) {
        /*
            Method dump skipped, instruction units count: 1277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.b.a(androidx.constraintlayout.core.widgets.d, androidx.constraintlayout.core.d, int, int, androidx.constraintlayout.core.widgets.c):void");
    }

    public static void b(d dVar, androidx.constraintlayout.core.d dVar2, ArrayList<ConstraintWidget> arrayList, int i10) {
        int i11;
        c[] cVarArr;
        int i12;
        if (i10 == 0) {
            i11 = dVar.f106393M1;
            cVarArr = dVar.f106396P1;
            i12 = 0;
        } else {
            i11 = dVar.f106394N1;
            cVarArr = dVar.f106395O1;
            i12 = 2;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            c cVar = cVarArr[i13];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f106355a)) {
                a(dVar, dVar2, i10, i12, cVar);
            }
        }
    }
}
