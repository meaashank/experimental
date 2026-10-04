package androidx.constraintlayout.core.parser;

import androidx.compose.runtime.changelist.j;
import androidx.constraintlayout.motion.widget.i;
import java.util.ArrayList;
import s0.x;

/* JADX INFO: loaded from: classes.dex */
public class e extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static ArrayList<String> f105941i;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f105941i = arrayList;
        arrayList.add("ConstraintSets");
        f105941i.add("Variables");
        f105941i.add("Generate");
        f105941i.add(x.h.f238398a);
        f105941i.add(i.f106972f);
        f105941i.add("KeyAttributes");
        f105941i.add("KeyPositions");
        f105941i.add("KeyCycles");
    }

    public e(char[] cArr) {
        super(cArr);
    }

    public static d D(char[] cArr) {
        return new e(cArr);
    }

    public static d b0(String str, d dVar) {
        e eVar = new e(str.toCharArray());
        eVar.f105937b = 0L;
        eVar.x(str.length() - 1);
        eVar.e0(dVar);
        return eVar;
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String A(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(h());
        b(sb2, i10);
        String strC = c();
        if (this.f105933h.size() <= 0) {
            return j.a(strC, ": <> ");
        }
        sb2.append(strC);
        sb2.append(": ");
        if (f105941i.contains(strC)) {
            i11 = 3;
        }
        if (i11 > 0) {
            sb2.append(this.f105933h.get(0).A(i10, i11 - 1));
        } else {
            String strB = this.f105933h.get(0).B();
            if (strB.length() + i10 < d.f105934f) {
                sb2.append(strB);
            } else {
                sb2.append(this.f105933h.get(0).A(i10, i11 - 1));
            }
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String B() {
        if (this.f105933h.size() <= 0) {
            return h() + c() + ": <> ";
        }
        return h() + c() + ": " + this.f105933h.get(0).B();
    }

    public String c0() {
        return c();
    }

    public d d0() {
        if (this.f105933h.size() > 0) {
            return this.f105933h.get(0);
        }
        return null;
    }

    public void e0(d dVar) {
        if (this.f105933h.size() > 0) {
            this.f105933h.set(0, dVar);
        } else {
            this.f105933h.add(dVar);
        }
    }
}
