package androidx.room;

import java.util.Locale;

/* JADX INFO: renamed from: androidx.room.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2650a {
    public static String a(Locale locale, String str, String str2, Locale locale2, String str3) {
        kotlin.jvm.internal.G.o(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        kotlin.jvm.internal.G.o(lowerCase, str3);
        return lowerCase;
    }
}
