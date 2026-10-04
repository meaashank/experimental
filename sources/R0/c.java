package r0;

import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.d;
import androidx.constraintlayout.core.parser.e;
import androidx.constraintlayout.core.parser.g;
import s0.v;

/* JADX INFO: loaded from: classes.dex */
public class c {

    public interface a {
        int get(int i10);
    }

    public interface b {
        int get(String str);
    }

    public static void a(String[] strArr) {
        c("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    public static v b(String str, b bVar, a aVar) {
        v vVar = new v();
        try {
            g gVarD = CLParser.d(str);
            int size = gVarD.f105933h.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) gVarD.E(i10);
                String strC = eVar.c();
                d dVarD0 = eVar.d0();
                int i11 = bVar.get(strC);
                if (i11 == -1) {
                    System.err.println("unknown type " + strC);
                } else {
                    int i12 = aVar.get(i11);
                    if (i12 == 1) {
                        vVar.d(i11, gVarD.r(i10));
                    } else if (i12 == 2) {
                        vVar.b(i11, dVarD0.k());
                        System.out.println("parse " + strC + " INT_MASK > " + dVarD0.k());
                    } else if (i12 == 4) {
                        vVar.a(i11, dVarD0.j());
                        System.out.println("parse " + strC + " FLOAT_MASK > " + dVarD0.j());
                    } else if (i12 == 8) {
                        vVar.c(i11, dVarD0.c());
                        System.out.println("parse " + strC + " STRING_MASK > " + dVarD0.c());
                    }
                }
            }
            return vVar;
        } catch (CLParsingException e10) {
            e10.printStackTrace();
            return vVar;
        }
    }

    public static v c(String str) {
        return b(str, new C5513a(), new C5514b());
    }
}
