package androidx.constraintlayout.core.parser;

import android.support.v4.media.i;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<d> f105933h;

    public c(char[] cArr) {
        super(cArr);
        this.f105933h = new ArrayList<>();
    }

    public static d D(char[] cArr) {
        return new c(cArr);
    }

    public void C(d dVar) {
        this.f105933h.add(dVar);
        if (CLParser.f105919d) {
            System.out.println("added element " + dVar + " to " + this);
        }
    }

    public d E(int i10) throws CLParsingException {
        if (i10 < 0 || i10 >= this.f105933h.size()) {
            throw new CLParsingException(android.support.v4.media.c.a("no element at index ", i10), this);
        }
        return this.f105933h.get(i10);
    }

    public d F(String str) throws CLParsingException {
        ArrayList<d> arrayList = this.f105933h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            d dVar = arrayList.get(i10);
            i10++;
            e eVar = (e) dVar;
            if (eVar.c().equals(str)) {
                return eVar.d0();
            }
        }
        throw new CLParsingException(i.a("no element for key <", str, ">"), this);
    }

    public a G(int i10) throws CLParsingException {
        d dVarE = E(i10);
        if (dVarE instanceof a) {
            return (a) dVarE;
        }
        throw new CLParsingException(android.support.v4.media.c.a("no array at index ", i10), this);
    }

    public a H(String str) throws CLParsingException {
        d dVarF = F(str);
        if (dVarF instanceof a) {
            return (a) dVarF;
        }
        StringBuilder sbA = androidx.activity.result.i.a("no array found for key <", str, ">, found [");
        sbA.append(dVarF.q());
        sbA.append("] : ");
        sbA.append(dVarF);
        throw new CLParsingException(sbA.toString(), this);
    }

    public a I(String str) {
        d dVarR = R(str);
        if (dVarR instanceof a) {
            return (a) dVarR;
        }
        return null;
    }

    public boolean J(String str) throws CLParsingException {
        d dVarF = F(str);
        if (dVarF instanceof CLToken) {
            return ((CLToken) dVarF).D();
        }
        StringBuilder sbA = androidx.activity.result.i.a("no boolean found for key <", str, ">, found [");
        sbA.append(dVarF.q());
        sbA.append("] : ");
        sbA.append(dVarF);
        throw new CLParsingException(sbA.toString(), this);
    }

    public float K(String str) throws CLParsingException {
        d dVarF = F(str);
        if (dVarF != null) {
            return dVarF.j();
        }
        StringBuilder sbA = androidx.activity.result.i.a("no float found for key <", str, ">, found [");
        sbA.append(dVarF.q());
        sbA.append("] : ");
        sbA.append(dVarF);
        throw new CLParsingException(sbA.toString(), this);
    }

    public float L(String str) {
        d dVarR = R(str);
        if (dVarR instanceof f) {
            return dVarR.j();
        }
        return Float.NaN;
    }

    public int M(String str) throws CLParsingException {
        d dVarF = F(str);
        if (dVarF != null) {
            return dVarF.k();
        }
        StringBuilder sbA = androidx.activity.result.i.a("no int found for key <", str, ">, found [");
        sbA.append(dVarF.q());
        sbA.append("] : ");
        sbA.append(dVarF);
        throw new CLParsingException(sbA.toString(), this);
    }

    public g N(int i10) throws CLParsingException {
        d dVarE = E(i10);
        if (dVarE instanceof g) {
            return (g) dVarE;
        }
        throw new CLParsingException(android.support.v4.media.c.a("no object at index ", i10), this);
    }

    public g O(String str) throws CLParsingException {
        d dVarF = F(str);
        if (dVarF instanceof g) {
            return (g) dVarF;
        }
        StringBuilder sbA = androidx.activity.result.i.a("no object found for key <", str, ">, found [");
        sbA.append(dVarF.q());
        sbA.append("] : ");
        sbA.append(dVarF);
        throw new CLParsingException(sbA.toString(), this);
    }

    public g P(String str) {
        d dVarR = R(str);
        if (dVarR instanceof g) {
            return (g) dVarR;
        }
        return null;
    }

    public d Q(int i10) {
        if (i10 < 0 || i10 >= this.f105933h.size()) {
            return null;
        }
        return this.f105933h.get(i10);
    }

    public d R(String str) {
        ArrayList<d> arrayList = this.f105933h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            d dVar = arrayList.get(i10);
            i10++;
            e eVar = (e) dVar;
            if (eVar.c().equals(str)) {
                return eVar.d0();
            }
        }
        return null;
    }

    public String S(int i10) throws CLParsingException {
        d dVarE = E(i10);
        if (dVarE instanceof h) {
            return dVarE.c();
        }
        throw new CLParsingException(android.support.v4.media.c.a("no string at index ", i10), this);
    }

    public String T(String str) throws CLParsingException {
        d dVarF = F(str);
        if (dVarF instanceof h) {
            return dVarF.c();
        }
        StringBuilder sbA = b.a("no string found for key <", str, ">, found [", dVarF != null ? dVarF.q() : null, "] : ");
        sbA.append(dVarF);
        throw new CLParsingException(sbA.toString(), this);
    }

    public String U(int i10) {
        d dVarQ = Q(i10);
        if (dVarQ instanceof h) {
            return dVarQ.c();
        }
        return null;
    }

    public String V(String str) {
        d dVarR = R(str);
        if (dVarR instanceof h) {
            return dVarR.c();
        }
        return null;
    }

    public boolean W(String str) {
        ArrayList<d> arrayList = this.f105933h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            d dVar = arrayList.get(i10);
            i10++;
            d dVar2 = dVar;
            if ((dVar2 instanceof e) && ((e) dVar2).c().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> X() {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<d> arrayList2 = this.f105933h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            d dVar = arrayList2.get(i10);
            i10++;
            d dVar2 = dVar;
            if (dVar2 instanceof e) {
                arrayList.add(((e) dVar2).c());
            }
        }
        return arrayList;
    }

    public void Y(String str, d dVar) {
        ArrayList<d> arrayList = this.f105933h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            d dVar2 = arrayList.get(i10);
            i10++;
            e eVar = (e) dVar2;
            if (eVar.c().equals(str)) {
                eVar.e0(dVar);
                return;
            }
        }
        this.f105933h.add((e) e.b0(str, dVar));
    }

    public void Z(String str, float f10) {
        Y(str, new f(f10));
    }

    public void a0(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList<d> arrayList2 = this.f105933h;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            d dVar = arrayList2.get(i11);
            i11++;
            d dVar2 = dVar;
            if (((e) dVar2).c().equals(str)) {
                arrayList.add(dVar2);
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            this.f105933h.remove((d) obj);
        }
    }

    public float getFloat(int i10) throws CLParsingException {
        d dVarE = E(i10);
        if (dVarE != null) {
            return dVarE.j();
        }
        throw new CLParsingException(android.support.v4.media.c.a("no float at index ", i10), this);
    }

    public int getInt(int i10) throws CLParsingException {
        d dVarE = E(i10);
        if (dVarE != null) {
            return dVarE.k();
        }
        throw new CLParsingException(android.support.v4.media.c.a("no int at index ", i10), this);
    }

    public boolean r(int i10) throws CLParsingException {
        d dVarE = E(i10);
        if (dVarE instanceof CLToken) {
            return ((CLToken) dVarE).D();
        }
        throw new CLParsingException(android.support.v4.media.c.a("no boolean at index ", i10), this);
    }

    public int size() {
        return this.f105933h.size();
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<d> arrayList = this.f105933h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            d dVar = arrayList.get(i10);
            i10++;
            d dVar2 = dVar;
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(dVar2);
        }
        return super.toString() + " = <" + ((Object) sb2) + " >";
    }
}
