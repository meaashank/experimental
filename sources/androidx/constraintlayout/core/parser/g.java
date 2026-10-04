package androidx.constraintlayout.core.parser;

import U6.j;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class g extends c implements Iterable<e> {

    public class a implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f105943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f105944b = 0;

        public a(g gVar) {
            this.f105943a = gVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f105944b < this.f105943a.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            e eVar = (e) this.f105943a.f105933h.get(this.f105944b);
            this.f105944b++;
            return eVar;
        }
    }

    public g(char[] cArr) {
        super(cArr);
    }

    public static g b0(char[] cArr) {
        return new g(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String A(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(h());
        sb2.append("{\n");
        ArrayList<d> arrayList = this.f105933h;
        int size = arrayList.size();
        boolean z10 = true;
        int i12 = 0;
        while (i12 < size) {
            d dVar = arrayList.get(i12);
            i12++;
            d dVar2 = dVar;
            if (z10) {
                z10 = false;
            } else {
                sb2.append(",\n");
            }
            sb2.append(dVar2.A(d.f105935g + i10, i11 - 1));
        }
        sb2.append("\n");
        b(sb2, i10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String B() {
        StringBuilder sb2 = new StringBuilder(h() + "{ ");
        ArrayList<d> arrayList = this.f105933h;
        int size = arrayList.size();
        boolean z10 = true;
        int i10 = 0;
        while (i10 < size) {
            d dVar = arrayList.get(i10);
            i10++;
            d dVar2 = dVar;
            if (z10) {
                z10 = false;
            } else {
                sb2.append(j.f68738d);
            }
            sb2.append(dVar2.B());
        }
        sb2.append(" }");
        return sb2.toString();
    }

    public String c0() {
        return A(0, 0);
    }

    @Override // java.lang.Iterable
    public Iterator<e> iterator() {
        return new a(this);
    }
}
