package com.prism.hider.negativescreen;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.f;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f167847i = "MinusOneSearch";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f167848j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f167849k = 12;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f167850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SearchManager f167851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f167852c = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f167853d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f167854e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f167855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CancellationSignal f167856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f167857h;

    public interface a {
        void a(String str, List<b> list);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f167858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f167859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Drawable f167860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Intent f167861d;

        public b(String str, String str2, Drawable drawable, Intent intent) {
            this.f167858a = str;
            this.f167859b = str2;
            this.f167860c = drawable;
            this.f167861d = intent;
        }
    }

    public c(Context context) {
        this.f167850a = context.getApplicationContext();
        this.f167851b = (SearchManager) context.getSystemService("search");
    }

    public static /* synthetic */ int c(String str, SearchableInfo searchableInfo) {
        return !str.equals(searchableInfo.getSearchActivity().getPackageName()) ? 1 : 0;
    }

    public static String g(Cursor cursor, String str) {
        return q(cursor, cursor.getColumnIndex(str));
    }

    public static String q(Cursor cursor, int i10) {
        return (i10 < 0 || cursor.isNull(i10)) ? "" : cursor.getString(i10);
    }

    public final String e(ComponentName componentName) {
        try {
            return this.f167850a.getPackageManager().getActivityInfo(componentName, 0).loadLabel(this.f167850a.getPackageManager()).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public void f() {
        synchronized (this.f167854e) {
            try {
                this.f167855f++;
                CancellationSignal cancellationSignal = this.f167856g;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                this.f167856g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h() {
        synchronized (this.f167854e) {
            try {
                if (this.f167857h) {
                    return;
                }
                this.f167857h = true;
                this.f167855f++;
                CancellationSignal cancellationSignal = this.f167856g;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                this.f167856g = null;
                this.f167853d.removeCallbacksAndMessages(null);
                this.f167852c.shutdownNow();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Intent i(String str) {
        ComponentName globalSearchActivity;
        SearchManager searchManager = this.f167851b;
        if (searchManager == null || (globalSearchActivity = searchManager.getGlobalSearchActivity()) == null) {
            return null;
        }
        return new Intent("android.search.action.GLOBAL_SEARCH").setComponent(globalSearchActivity).putExtra("user_query", str).putExtra("query", str);
    }

    public final /* synthetic */ void j(int i10, CancellationSignal cancellationSignal, a aVar, String str, List list) {
        synchronized (this.f167854e) {
            if (!this.f167857h && this.f167855f == i10 && !cancellationSignal.isCanceled()) {
                this.f167856g = null;
                aVar.a(str, list);
            }
        }
    }

    public final /* synthetic */ void k(final String str, final CancellationSignal cancellationSignal, final int i10, final a aVar) throws Throwable {
        final List<b> listL = l(str, cancellationSignal);
        this.f167853d.post(new Runnable() { // from class: ga.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f202300a.j(i10, cancellationSignal, aVar, str, listL);
            }
        });
    }

    public final List<b> l(String str, CancellationSignal cancellationSignal) throws Throwable {
        SearchManager searchManager = this.f167851b;
        if (searchManager == null) {
            return Collections.EMPTY_LIST;
        }
        ComponentName globalSearchActivity = searchManager.getGlobalSearchActivity();
        try {
            List<SearchableInfo> searchablesInGlobalSearch = this.f167851b.getSearchablesInGlobalSearch();
            if (searchablesInGlobalSearch == null || searchablesInGlobalSearch.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList(searchablesInGlobalSearch);
            if (globalSearchActivity != null) {
                final String packageName = globalSearchActivity.getPackageName();
                Collections.sort(arrayList, Comparator.comparingInt(new ToIntFunction() { // from class: ga.y
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj) {
                        return com.prism.hider.negativescreen.c.c(packageName, (SearchableInfo) obj);
                    }
                }));
            }
            LinkedHashMap<String, b> linkedHashMap = new LinkedHashMap<>();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                SearchableInfo searchableInfo = (SearchableInfo) obj;
                if (cancellationSignal.isCanceled() || linkedHashMap.size() >= 8 || i10 >= 12) {
                    break;
                }
                String suggestAuthority = searchableInfo.getSuggestAuthority();
                if (!TextUtils.isEmpty(suggestAuthority)) {
                    StringBuilder sbA = f.a(suggestAuthority, "\n");
                    sbA.append(searchableInfo.getSuggestPath());
                    sbA.append("\n");
                    sbA.append(searchableInfo.getSuggestSelection());
                    if (hashSet.add(sbA.toString())) {
                        i10++;
                        n(searchableInfo, str, cancellationSignal, linkedHashMap);
                    }
                }
            }
            return Collections.unmodifiableList(new ArrayList(linkedHashMap.values()));
        } catch (RuntimeException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    public final Drawable m(String str, ComponentName componentName) {
        try {
            if (!TextUtils.isEmpty(str) && !MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(str)) {
                if (!str.startsWith("android.resource://")) {
                    return this.f167850a.getPackageManager().getResourcesForApplication(componentName.getPackageName()).getDrawable(Integer.parseInt(str), this.f167850a.getTheme());
                }
                Uri uri = Uri.parse(str);
                Resources resourcesForApplication = this.f167850a.getPackageManager().getResourcesForApplication(uri.getAuthority());
                List<String> pathSegments = uri.getPathSegments();
                int i10 = pathSegments.size() == 1 ? Integer.parseInt(pathSegments.get(0)) : resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), uri.getAuthority());
                if (i10 != 0) {
                    return resourcesForApplication.getDrawable(i10, this.f167850a.getTheme());
                }
            }
            return this.f167850a.getPackageManager().getActivityIcon(componentName);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void n(SearchableInfo searchableInfo, String str, CancellationSignal cancellationSignal, LinkedHashMap<String, b> linkedHashMap) throws Throwable {
        String[] strArr;
        SearchableInfo searchableInfo2;
        Uri.Builder builderAuthority = new Uri.Builder().scheme("content").authority(searchableInfo.getSuggestAuthority());
        if (!TextUtils.isEmpty(searchableInfo.getSuggestPath())) {
            builderAuthority.appendEncodedPath(searchableInfo.getSuggestPath());
        }
        builderAuthority.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection == null) {
            builderAuthority.appendPath(str);
            strArr = null;
        } else {
            strArr = new String[]{str};
        }
        String[] strArr2 = strArr;
        int i10 = 8;
        builderAuthority.appendQueryParameter("limit", String.valueOf(8));
        try {
            Cursor cursorQuery = this.f167850a.getContentResolver().query(builderAuthority.build(), null, suggestSelection, strArr2, null, cancellationSignal);
            try {
                if (cursorQuery == null) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        return;
                    }
                    return;
                }
                try {
                    int columnIndex = cursorQuery.getColumnIndex("suggest_text_1");
                    int columnIndex2 = cursorQuery.getColumnIndex("suggest_text_2");
                    int columnIndex3 = cursorQuery.getColumnIndex("suggest_text_2_url");
                    int columnIndex4 = cursorQuery.getColumnIndex("suggest_icon_1");
                    String strE = e(searchableInfo.getSearchActivity());
                    while (!cancellationSignal.isCanceled() && linkedHashMap.size() < i10 && cursorQuery.moveToNext()) {
                        String strQ = q(cursorQuery, columnIndex);
                        if (!TextUtils.isEmpty(strQ)) {
                            String lowerCase = strQ.trim().toLowerCase(Locale.ROOT);
                            if (!linkedHashMap.containsKey(lowerCase)) {
                                String strQ2 = q(cursorQuery, columnIndex2);
                                if (TextUtils.isEmpty(strQ2)) {
                                    strQ2 = q(cursorQuery, columnIndex3);
                                }
                                if (TextUtils.isEmpty(strQ2)) {
                                    strQ2 = strE;
                                }
                                searchableInfo2 = searchableInfo;
                                try {
                                    linkedHashMap.put(lowerCase, new b(strQ, strQ2, m(q(cursorQuery, columnIndex4), searchableInfo.getSearchActivity()), p(cursorQuery, searchableInfo2, str)));
                                    i10 = 8;
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    try {
                                        cursorQuery.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            }
                        }
                    }
                    cursorQuery.close();
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    searchableInfo2 = searchableInfo;
                }
            } catch (RuntimeException unused) {
            }
        } catch (RuntimeException unused2) {
            searchableInfo2 = searchableInfo;
        }
        Log.d("MinusOneSearch", "Suggestion provider unavailable: " + searchableInfo2.getSuggestAuthority());
    }

    public void o(String str, final a aVar) {
        final String strTrim = str == null ? "" : str.trim();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        synchronized (this.f167854e) {
            try {
                if (this.f167857h) {
                    return;
                }
                final int i10 = this.f167855f + 1;
                this.f167855f = i10;
                CancellationSignal cancellationSignal2 = this.f167856g;
                if (cancellationSignal2 != null) {
                    cancellationSignal2.cancel();
                }
                this.f167856g = cancellationSignal;
                if (strTrim.isEmpty()) {
                    this.f167853d.post(new Runnable() { // from class: ga.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            aVar.a(strTrim, Collections.EMPTY_LIST);
                        }
                    });
                } else {
                    this.f167852c.execute(new Runnable() { // from class: ga.A
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            this.f202295a.k(strTrim, cancellationSignal, i10, aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Intent p(Cursor cursor, SearchableInfo searchableInfo, String str) {
        String strG = g(cursor, "suggest_intent_action");
        if (TextUtils.isEmpty(strG)) {
            strG = searchableInfo.getSuggestIntentAction();
        }
        if (TextUtils.isEmpty(strG)) {
            strG = "android.intent.action.SEARCH";
        }
        String strQ = q(cursor, cursor.getColumnIndex("suggest_intent_data"));
        if (TextUtils.isEmpty(strQ)) {
            strQ = searchableInfo.getSuggestIntentData();
        }
        String strQ2 = q(cursor, cursor.getColumnIndex("suggest_intent_data_id"));
        if (!TextUtils.isEmpty(strQ) && !TextUtils.isEmpty(strQ2)) {
            StringBuilder sbA = f.a(strQ, RemoteSettings.FORWARD_SLASH_STRING);
            sbA.append(Uri.encode(strQ2));
            strQ = sbA.toString();
        }
        String strQ3 = q(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (TextUtils.isEmpty(strQ3)) {
            strQ3 = str;
        }
        Intent intentPutExtra = new Intent(strG).setComponent(searchableInfo.getSearchActivity()).addFlags(67108864).putExtra("user_query", str).putExtra("query", strQ3);
        if (!TextUtils.isEmpty(strQ)) {
            intentPutExtra.setData(Uri.parse(strQ));
        }
        String strQ4 = q(cursor, cursor.getColumnIndex("suggest_intent_extra_data"));
        if (!TextUtils.isEmpty(strQ4)) {
            intentPutExtra.putExtra("intent_extra_data_key", strQ4);
        }
        return intentPutExtra;
    }
}
