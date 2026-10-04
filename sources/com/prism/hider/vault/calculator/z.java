package com.prism.hider.vault.calculator;

import B0.C0922f;
import org.javia.arity.Symbols;
import org.javia.arity.SyntaxException;
import org.javia.arity.Util;
import rb.C5548b;

/* JADX INFO: loaded from: classes6.dex */
public class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f168587c = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f168588d = Math.max(5, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Symbols f168589a = new Symbols();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f168590b;

    public interface a {
        void f0(String str, String str2, int i10);
    }

    public z(A a10) {
        this.f168590b = a10;
    }

    public void a(CharSequence charSequence, a aVar) {
        b(charSequence.toString(), aVar);
    }

    public void b(String str, a aVar) {
        String strB = this.f168590b.b(str);
        while (strB.length() > 0 && "+-/*".indexOf(strB.charAt(strB.length() - 1)) != -1) {
            strB = C0922f.a(strB, 1, 0);
        }
        try {
            if (strB.length() == 0 || Double.valueOf(strB) != null) {
                aVar.f0(strB, null, -1);
                return;
            }
        } catch (NumberFormatException unused) {
        }
        try {
            double dEval = this.f168589a.eval(strB);
            if (Double.isNaN(dEval)) {
                aVar.f0(strB, null, C5548b.m.f235986y0);
            } else {
                aVar.f0(strB, this.f168590b.a(Util.doubleToString(dEval, 12, f168588d)), -1);
            }
        } catch (SyntaxException unused2) {
            aVar.f0(strB, null, C5548b.m.f235991z0);
        }
    }
}
