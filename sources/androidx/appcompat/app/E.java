package androidx.appcompat.app;

import android.os.LocaleList;
import androidx.core.os.C2417p;
import e.T;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@T(24)
public final class E {
    public static C2417p a(C2417p c2417p, C2417p c2417p2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i10 = 0; i10 < c2417p2.f111302a.size() + c2417p.f111302a.size(); i10++) {
            Locale locale = i10 < c2417p.f111302a.size() ? c2417p.f111302a.get(i10) : c2417p2.f111302a.get(i10 - c2417p.f111302a.size());
            if (locale != null) {
                linkedHashSet.add(locale);
            }
        }
        return C2417p.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static C2417p b(LocaleList localeList, LocaleList localeList2) {
        return (localeList == null || localeList.isEmpty()) ? C2417p.g() : a(C2417p.o(localeList), C2417p.o(localeList2));
    }

    public static C2417p c(C2417p c2417p, C2417p c2417p2) {
        return (c2417p == null || c2417p.f111302a.isEmpty()) ? C2417p.g() : a(c2417p, c2417p2);
    }
}
