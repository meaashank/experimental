package com.prism.hider.vault.calculator;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class y extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f168585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f168586b;

    public y(CharSequence charSequence, A a10, boolean z10) {
        super(charSequence);
        this.f168585a = a10;
        this.f168586b = z10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        int i14;
        if (i10 != length() || i11 != length()) {
            this.f168586b = true;
            return super.replace(i10, i11, charSequence, i12, i13);
        }
        String strB = this.f168585a.b(charSequence.subSequence(i12, i13).toString());
        if (strB.length() == 1) {
            String strB2 = this.f168585a.b(toString());
            switch (strB.charAt(0)) {
                case '*':
                case '+':
                case '/':
                    if (i10 != 0) {
                        while (i10 > 0 && "+-*/".indexOf(strB2.charAt(i10 - 1)) != -1) {
                            i10--;
                        }
                        if (i10 > 0 && "+-".indexOf(strB2.charAt(i10 - 1)) != -1) {
                            i10--;
                        }
                        this.f168586b = true;
                    }
                    strB = "";
                    break;
                case '-':
                    if (i10 > 0) {
                        i10--;
                    }
                    this.f168586b = true;
                    break;
                case '.':
                    int iLastIndexOf = strB2.lastIndexOf(46);
                    if (iLastIndexOf != -1 && TextUtils.isDigitsOnly(strB2.substring(iLastIndexOf + 1, i10))) {
                        strB = "";
                    }
                    break;
            }
        }
        if (this.f168586b || strB.length() <= 0) {
            i14 = i10;
        } else {
            this.f168586b = true;
            i14 = 0;
        }
        String strA = this.f168585a.a(strB);
        return super.replace(i14, i11, (CharSequence) strA, 0, strA.length());
    }
}
