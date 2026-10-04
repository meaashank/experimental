package com.android.launcher3.allapps.search;

import android.os.Handler;
import com.android.launcher3.AppInfo;
import com.android.launcher3.allapps.search.AllAppsSearchBarController;
import com.android.launcher3.util.ComponentKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultAppSearchAlgorithm implements SearchAlgorithm {
    private final List<AppInfo> mApps;
    protected final Handler mResultHandler = new Handler();

    public static class StringMatcher {
        private static final char MAX_UNICODE = 65535;
        private final Collator mCollator;

        public StringMatcher() {
            Collator collator = Collator.getInstance();
            this.mCollator = collator;
            collator.setStrength(0);
            collator.setDecomposition(1);
        }

        public static StringMatcher getInstance() {
            return new StringMatcher();
        }

        public boolean matches(String str, String str2) {
            int iCompare = this.mCollator.compare(str, str2);
            if (iCompare != -1) {
                return iCompare == 0;
            }
            Collator collator = this.mCollator;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append((char) 65535);
            return collator.compare(sb2.toString(), str2) > -1;
        }
    }

    public DefaultAppSearchAlgorithm(List<AppInfo> list) {
        this.mApps = list;
    }

    private ArrayList<ComponentKey> getTitleMatchResult(String str) {
        String lowerCase = str.toLowerCase();
        ArrayList<ComponentKey> arrayList = new ArrayList<>();
        StringMatcher stringMatcher = new StringMatcher();
        for (AppInfo appInfo : this.mApps) {
            if (matches(appInfo, lowerCase, stringMatcher)) {
                arrayList.add(appInfo.toComponentKey());
            }
        }
        return arrayList;
    }

    private static boolean isBreak(int i10, int i11, int i12) {
        if (i11 != 0) {
            switch (i11) {
                case 12:
                case 13:
                case 14:
                    break;
                default:
                    if (i10 != 1) {
                        if (i10 == 2) {
                            return i11 > 5 || i11 <= 0;
                        }
                        if (i10 != 3) {
                            if (i10 != 20) {
                                switch (i10) {
                                    case 9:
                                    case 10:
                                    case 11:
                                        return (i11 == 9 || i11 == 10 || i11 == 11) ? false : true;
                                    default:
                                        switch (i10) {
                                            case 24:
                                            case 25:
                                            case 26:
                                                break;
                                            default:
                                                return false;
                                        }
                                        break;
                                }
                            }
                            return true;
                        }
                    } else if (i12 == 1) {
                        return true;
                    }
                    return i11 != 1;
            }
        }
        return true;
    }

    public static boolean matches(AppInfo appInfo, String str, StringMatcher stringMatcher) {
        int length = str.length();
        String string = appInfo.title.toString();
        int length2 = string.length();
        if (length2 >= length && length > 0) {
            int type = Character.getType(string.codePointAt(0));
            int i10 = length2 - length;
            int i11 = 0;
            int i12 = 0;
            while (i11 <= i10) {
                int type2 = i11 < length2 + (-1) ? Character.getType(string.codePointAt(i11 + 1)) : 0;
                if (isBreak(type, i12, type2) && stringMatcher.matches(str, string.substring(i11, i11 + length))) {
                    return true;
                }
                i11++;
                i12 = type;
                type = type2;
            }
        }
        return false;
    }

    @Override // com.android.launcher3.allapps.search.SearchAlgorithm
    public void cancel(boolean z10) {
        if (z10) {
            this.mResultHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.android.launcher3.allapps.search.SearchAlgorithm
    public void doSearch(final String str, final AllAppsSearchBarController.Callbacks callbacks) {
        final ArrayList<ComponentKey> titleMatchResult = getTitleMatchResult(str);
        this.mResultHandler.post(new Runnable() { // from class: com.android.launcher3.allapps.search.DefaultAppSearchAlgorithm.1
            @Override // java.lang.Runnable
            public void run() {
                callbacks.onSearchResult(str, titleMatchResult);
            }
        });
    }
}
