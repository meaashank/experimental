package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C2638a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f116936a;

    public interface a {
        C2638a.b a(int i10, int i11, int i12, Object obj);

        void b(C2638a.b bVar);
    }

    public w(a aVar) {
        this.f116936a = aVar;
    }

    public final int a(List<C2638a.b> list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f116551a != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    public void b(List<C2638a.b> list) {
        while (true) {
            int iA = a(list);
            if (iA == -1) {
                return;
            } else {
                d(list, iA, iA + 1);
            }
        }
    }

    public final void c(List<C2638a.b> list, int i10, C2638a.b bVar, int i11, C2638a.b bVar2) {
        int i12 = bVar.f116554d;
        int i13 = bVar2.f116552b;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = bVar.f116552b;
        if (i15 < i13) {
            i14++;
        }
        if (i13 <= i15) {
            bVar.f116552b = i15 + bVar2.f116554d;
        }
        int i16 = bVar2.f116552b;
        if (i16 <= i12) {
            bVar.f116554d = i12 + bVar2.f116554d;
        }
        bVar2.f116552b = i16 + i14;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    public final void d(List<C2638a.b> list, int i10, int i11) {
        C2638a.b bVar = list.get(i10);
        C2638a.b bVar2 = list.get(i11);
        int i12 = bVar2.f116551a;
        if (i12 == 1) {
            c(list, i10, bVar, i11, bVar2);
        } else if (i12 == 2) {
            e(list, i10, bVar, i11, bVar2);
        } else {
            if (i12 != 4) {
                return;
            }
            f(list, i10, bVar, i11, bVar2);
        }
    }

    public void e(List<C2638a.b> list, int i10, C2638a.b bVar, int i11, C2638a.b bVar2) {
        boolean z10;
        int i12 = bVar.f116552b;
        int i13 = bVar.f116554d;
        boolean z11 = false;
        if (i12 < i13) {
            if (bVar2.f116552b == i12 && bVar2.f116554d == i13 - i12) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
        } else if (bVar2.f116552b == i13 + 1 && bVar2.f116554d == i12 - i13) {
            z10 = true;
            z11 = true;
        } else {
            z10 = true;
        }
        int i14 = bVar2.f116552b;
        if (i13 < i14) {
            bVar2.f116552b = i14 - 1;
        } else {
            int i15 = bVar2.f116554d;
            if (i13 < i14 + i15) {
                bVar2.f116554d = i15 - 1;
                bVar.f116551a = 2;
                bVar.f116554d = 1;
                if (bVar2.f116554d == 0) {
                    list.remove(i11);
                    this.f116936a.b(bVar2);
                    return;
                }
                return;
            }
        }
        int i16 = bVar.f116552b;
        int i17 = bVar2.f116552b;
        C2638a.b bVarA = null;
        if (i16 <= i17) {
            bVar2.f116552b = i17 + 1;
        } else {
            int i18 = i17 + bVar2.f116554d;
            if (i16 < i18) {
                bVarA = this.f116936a.a(2, i16 + 1, i18 - i16, null);
                bVar2.f116554d = bVar.f116552b - bVar2.f116552b;
            }
        }
        if (z11) {
            list.set(i10, bVar2);
            list.remove(i11);
            this.f116936a.b(bVar);
            return;
        }
        if (z10) {
            if (bVarA != null) {
                int i19 = bVar.f116552b;
                if (i19 > bVarA.f116552b) {
                    bVar.f116552b = i19 - bVarA.f116554d;
                }
                int i20 = bVar.f116554d;
                if (i20 > bVarA.f116552b) {
                    bVar.f116554d = i20 - bVarA.f116554d;
                }
            }
            int i21 = bVar.f116552b;
            if (i21 > bVar2.f116552b) {
                bVar.f116552b = i21 - bVar2.f116554d;
            }
            int i22 = bVar.f116554d;
            if (i22 > bVar2.f116552b) {
                bVar.f116554d = i22 - bVar2.f116554d;
            }
        } else {
            if (bVarA != null) {
                int i23 = bVar.f116552b;
                if (i23 >= bVarA.f116552b) {
                    bVar.f116552b = i23 - bVarA.f116554d;
                }
                int i24 = bVar.f116554d;
                if (i24 >= bVarA.f116552b) {
                    bVar.f116554d = i24 - bVarA.f116554d;
                }
            }
            int i25 = bVar.f116552b;
            if (i25 >= bVar2.f116552b) {
                bVar.f116552b = i25 - bVar2.f116554d;
            }
            int i26 = bVar.f116554d;
            if (i26 >= bVar2.f116552b) {
                bVar.f116554d = i26 - bVar2.f116554d;
            }
        }
        list.set(i10, bVar2);
        if (bVar.f116552b != bVar.f116554d) {
            list.set(i11, bVar);
        } else {
            list.remove(i11);
        }
        if (bVarA != null) {
            list.add(i10, bVarA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(java.util.List<androidx.recyclerview.widget.C2638a.b> r8, int r9, androidx.recyclerview.widget.C2638a.b r10, int r11, androidx.recyclerview.widget.C2638a.b r12) {
        /*
            r7 = this;
            int r0 = r10.f116554d
            int r1 = r12.f116552b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r12.f116552b = r1
            goto L20
        Ld:
            int r5 = r12.f116554d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r12.f116554d = r5
            androidx.recyclerview.widget.w$a r0 = r7.f116936a
            int r1 = r10.f116552b
            java.lang.Object r5 = r12.f116553c
            androidx.recyclerview.widget.a$b r0 = r0.a(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r10.f116552b
            int r5 = r12.f116552b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r12.f116552b = r5
            goto L3f
        L2b:
            int r6 = r12.f116554d
            int r5 = r5 + r6
            if (r1 >= r5) goto L3f
            int r5 = r5 - r1
            androidx.recyclerview.widget.w$a r4 = r7.f116936a
            int r1 = r1 + r3
            java.lang.Object r3 = r12.f116553c
            androidx.recyclerview.widget.a$b r4 = r4.a(r2, r1, r5, r3)
            int r1 = r12.f116554d
            int r1 = r1 - r5
            r12.f116554d = r1
        L3f:
            r8.set(r11, r10)
            int r10 = r12.f116554d
            if (r10 <= 0) goto L4a
            r8.set(r9, r12)
            goto L52
        L4a:
            r8.remove(r9)
            androidx.recyclerview.widget.w$a r10 = r7.f116936a
            r10.b(r12)
        L52:
            if (r0 == 0) goto L57
            r8.add(r9, r0)
        L57:
            if (r4 == 0) goto L5c
            r8.add(r9, r4)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.w.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
