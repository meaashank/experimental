package org.jacoco.core.runtime;

import com.android.launcher3.IconCache;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class WildcardMatcher {
    private final Pattern pattern;

    public WildcardMatcher(String str) {
        String[] strArrSplit = str.split("\\:");
        StringBuilder sb2 = new StringBuilder(str.length() * 2);
        int length = strArrSplit.length;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            String str2 = strArrSplit[i10];
            if (z10) {
                sb2.append('|');
            }
            sb2.append('(');
            sb2.append(toRegex(str2));
            sb2.append(')');
            i10++;
            z10 = true;
        }
        this.pattern = Pattern.compile(sb2.toString());
    }

    private static CharSequence toRegex(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() * 2);
        for (char c10 : str.toCharArray()) {
            if (c10 == '*') {
                sb2.append(".*");
            } else if (c10 != '?') {
                sb2.append(Pattern.quote(String.valueOf(c10)));
            } else {
                sb2.append(IconCache.EMPTY_CLASS_NAME);
            }
        }
        return sb2;
    }

    public boolean matches(String str) {
        return this.pattern.matcher(str).matches();
    }
}
