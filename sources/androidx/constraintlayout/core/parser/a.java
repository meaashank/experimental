package androidx.constraintlayout.core.parser;

import U6.j;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {
    public a(char[] cArr) {
        super(cArr);
    }

    public static d D(char[] cArr) {
        return new a(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String A(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        String strB = B();
        if (i11 > 0 || strB.length() + i10 >= d.f105934f) {
            sb2.append("[\n");
            ArrayList<d> arrayList = this.f105933h;
            int size = arrayList.size();
            int i12 = 0;
            boolean z10 = true;
            while (i12 < size) {
                d dVar = arrayList.get(i12);
                i12++;
                d dVar2 = dVar;
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(",\n");
                }
                b(sb2, d.f105935g + i10);
                sb2.append(dVar2.A(d.f105935g + i10, i11 - 1));
            }
            sb2.append("\n");
            b(sb2, i10);
            sb2.append("]");
        } else {
            sb2.append(strB);
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String B() {
        StringBuilder sb2 = new StringBuilder(h() + "[");
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f105933h.size(); i10++) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(j.f68738d);
            }
            sb2.append(this.f105933h.get(i10).B());
        }
        return ((Object) sb2) + "]";
    }
}
