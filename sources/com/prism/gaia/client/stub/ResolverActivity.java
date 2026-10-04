package com.prism.gaia.client.stub;

import U6.b;
import U6.o;
import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PatternMatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.compat.android.app.ActivityCompat2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executors;
import v8.C5703m;

/* JADX INFO: loaded from: classes6.dex */
public class ResolverActivity extends Activity implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f164381s = "asdf-".concat("ResolverActivity");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f164382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f164383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f164385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f164386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f164387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PackageManager f164388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f164389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f164390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GridView f164391j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f164392k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f164393l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f164394m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f164395n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f164396o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f164397p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public x8.b f164398q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f164399r;

    public class a implements DialogInterface.OnCancelListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            ResolverActivity.this.finish();
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ResolveInfo f164401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f164402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Drawable f164403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f164404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Intent f164405e;

        public b(ResolveInfo resolveInfo, CharSequence charSequence, CharSequence charSequence2, Intent intent) {
            this.f164401a = resolveInfo;
            this.f164402b = charSequence;
            this.f164404d = charSequence2;
            this.f164405e = intent;
        }
    }

    public class c implements AdapterView.OnItemLongClickListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            ResolverActivity.this.m(ResolverActivity.this.f164387f.g(i10));
            return true;
        }
    }

    public class d extends AsyncTask<b, Void, b> {
        public d() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b doInBackground(b... bVarArr) {
            b bVar = bVarArr[0];
            if (bVar.f164403c == null) {
                bVar.f164403c = ResolverActivity.this.i(bVar.f164401a);
            }
            return bVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(b bVar) {
            ResolverActivity.this.f164387f.notifyDataSetChanged();
        }
    }

    public final class e extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent[] f164409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ResolveInfo> f164410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Intent f164411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f164412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final LayoutInflater f164413e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<ResolveInfo> f164415g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ResolveInfo f164416h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f164417i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<b> f164414f = new ArrayList();

        public e(Context context, Intent intent, Intent[] intentArr, List<ResolveInfo> list, int i10) {
            this.f164411c = new Intent(intent);
            this.f164409a = intentArr;
            this.f164410b = list;
            this.f164412d = i10;
            this.f164413e = (LayoutInflater) context.getSystemService("layout_inflater");
            f();
        }

        public final void a(View view, b bVar) {
            f fVar = (f) view.getTag();
            fVar.f164419a.setText(bVar.f164402b);
            if (ResolverActivity.this.f164390i) {
                fVar.f164420b.setVisibility(0);
                fVar.f164420b.setText(bVar.f164404d);
            } else {
                fVar.f164420b.setVisibility(8);
            }
            if (bVar.f164403c == null) {
                ResolverActivity.this.new d().executeOnExecutor(Executors.newCachedThreadPool(), bVar);
            }
            fVar.f164421c.setImageDrawable(bVar.f164403c);
        }

        public int b() {
            return this.f164417i;
        }

        public void c() {
            getCount();
            f();
            notifyDataSetChanged();
            if (this.f164414f.size() == 0) {
                ResolverActivity.this.finish();
            }
        }

        public Intent d(int i10) {
            b bVar = this.f164414f.get(i10);
            Intent intent = bVar.f164405e;
            if (intent == null) {
                intent = this.f164411c;
            }
            Intent intent2 = new Intent(intent);
            intent2.addFlags(50331648);
            ActivityInfo activityInfo = bVar.f164401a.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            return intent2;
        }

        public final void e(List<ResolveInfo> list, int i10, int i11, ResolveInfo resolveInfo, CharSequence charSequence) {
            e.class.toString();
            Objects.toString(resolveInfo);
            Objects.toString(charSequence);
            boolean z10 = true;
            if ((i11 - i10) + 1 == 1) {
                ResolveInfo resolveInfo2 = this.f164416h;
                if (resolveInfo2 != null && resolveInfo2.activityInfo.packageName.equals(resolveInfo.activityInfo.packageName) && this.f164416h.activityInfo.name.equals(resolveInfo.activityInfo.name)) {
                    this.f164417i = this.f164414f.size();
                }
                this.f164414f.add(ResolverActivity.this.new b(resolveInfo, charSequence, null, null));
                return;
            }
            ResolverActivity.this.f164390i = true;
            CharSequence charSequenceLoadLabel = resolveInfo.activityInfo.applicationInfo.loadLabel(ResolverActivity.this.f164388g);
            boolean z11 = charSequenceLoadLabel == null;
            if (!z11) {
                HashSet hashSet = new HashSet();
                hashSet.add(charSequenceLoadLabel);
                int i12 = i10 + 1;
                while (true) {
                    if (i12 > i11) {
                        z10 = z11;
                        break;
                    }
                    CharSequence charSequenceLoadLabel2 = list.get(i12).activityInfo.applicationInfo.loadLabel(ResolverActivity.this.f164388g);
                    if (charSequenceLoadLabel2 == null || hashSet.contains(charSequenceLoadLabel2)) {
                        break;
                    }
                    hashSet.add(charSequenceLoadLabel2);
                    i12++;
                }
                hashSet.clear();
                z11 = z10;
            }
            while (i10 <= i11) {
                ResolveInfo resolveInfo3 = list.get(i10);
                ResolveInfo resolveInfo4 = this.f164416h;
                if (resolveInfo4 != null && resolveInfo4.activityInfo.packageName.equals(resolveInfo3.activityInfo.packageName) && this.f164416h.activityInfo.name.equals(resolveInfo3.activityInfo.name)) {
                    this.f164417i = this.f164414f.size();
                }
                if (z11) {
                    this.f164414f.add(ResolverActivity.this.new b(resolveInfo3, charSequence, resolveInfo3.activityInfo.packageName, null));
                } else {
                    List<b> list2 = this.f164414f;
                    ResolverActivity resolverActivity = ResolverActivity.this;
                    list2.add(resolverActivity.new b(resolveInfo3, charSequence, resolveInfo3.activityInfo.applicationInfo.loadLabel(resolverActivity.f164388g), null));
                }
                i10++;
            }
        }

        public final void f() {
            List<ResolveInfo> list;
            this.f164414f.clear();
            List<ResolveInfo> list2 = this.f164410b;
            if (list2 != null) {
                this.f164415g = null;
                list = list2;
            } else {
                Intent intent = this.f164411c;
                List<ResolveInfo> listE0 = c7.m.e0(intent, intent.resolveType(GaiaContext.j().n()), (ResolverActivity.this.f164389h ? 64 : 0) | 65536, this.f164412d);
                this.f164415g = listE0;
                ArrayList arrayList = new ArrayList();
                if (listE0 != null) {
                    for (ResolveInfo resolveInfo : listE0) {
                        String str = ResolverActivity.f164381s;
                        Objects.toString(resolveInfo.activityInfo);
                        if (resolveInfo.activityInfo.enabled) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                list = arrayList;
            }
            String unused = ResolverActivity.f164381s;
            list.size();
            int size = list.size();
            if (size > 0) {
                ResolveInfo resolveInfo2 = list.get(0);
                for (int i10 = 1; i10 < size; i10++) {
                    ResolveInfo resolveInfo3 = list.get(i10);
                    String str2 = ResolverActivity.f164381s;
                    String str3 = resolveInfo2.activityInfo.name;
                    int i11 = resolveInfo2.priority;
                    boolean z10 = resolveInfo2.isDefault;
                    String str4 = resolveInfo3.activityInfo.name;
                    int i12 = resolveInfo3.priority;
                    boolean z11 = resolveInfo3.isDefault;
                    if (i11 != i12 || z10 != z11) {
                        while (i10 < size) {
                            if (this.f164415g == list) {
                                this.f164415g = new ArrayList(this.f164415g);
                            }
                            list.remove(i10);
                            size--;
                        }
                    }
                }
                if (size > 1) {
                    Collections.sort(list, new ResolveInfo.DisplayNameComparator(ResolverActivity.this.f164388g));
                }
                if (this.f164409a != null) {
                    int i13 = 0;
                    while (true) {
                        Intent[] intentArr = this.f164409a;
                        if (i13 >= intentArr.length) {
                            break;
                        }
                        Intent intent2 = intentArr[i13];
                        if (intent2 != null) {
                            ActivityInfo activityInfoResolveActivityInfo = intent2.resolveActivityInfo(ResolverActivity.this.getPackageManager(), 0);
                            if (activityInfoResolveActivityInfo == null) {
                                String str5 = ResolverActivity.f164381s;
                                intent2.toString();
                            } else {
                                String str6 = ResolverActivity.f164381s;
                                ResolveInfo resolveInfo4 = new ResolveInfo();
                                resolveInfo4.activityInfo = activityInfoResolveActivityInfo;
                                if (intent2 instanceof LabeledIntent) {
                                    LabeledIntent labeledIntent = (LabeledIntent) intent2;
                                    resolveInfo4.resolvePackageName = labeledIntent.getSourcePackage();
                                    resolveInfo4.labelRes = labeledIntent.getLabelResource();
                                    resolveInfo4.nonLocalizedLabel = labeledIntent.getNonLocalizedLabel();
                                    resolveInfo4.icon = labeledIntent.getIconResource();
                                }
                                List<b> list3 = this.f164414f;
                                ResolverActivity resolverActivity = ResolverActivity.this;
                                list3.add(resolverActivity.new b(resolveInfo4, resolveInfo4.loadLabel(resolverActivity.getPackageManager()), null, intent2));
                            }
                        }
                        i13++;
                    }
                }
                ResolveInfo resolveInfo5 = list.get(0);
                CharSequence charSequenceLoadLabel = resolveInfo5.loadLabel(ResolverActivity.this.f164388g);
                ResolverActivity.this.f164390i = false;
                int i14 = 0;
                ResolveInfo resolveInfo6 = resolveInfo5;
                CharSequence charSequence = charSequenceLoadLabel;
                for (int i15 = 1; i15 < size; i15++) {
                    if (charSequence == null) {
                        charSequence = resolveInfo6.activityInfo.packageName;
                    }
                    ResolveInfo resolveInfo7 = list.get(i15);
                    CharSequence charSequenceLoadLabel2 = resolveInfo7.loadLabel(ResolverActivity.this.f164388g);
                    if (charSequenceLoadLabel2 == null) {
                        charSequenceLoadLabel2 = resolveInfo7.activityInfo.packageName;
                    }
                    if (!charSequenceLoadLabel2.equals(charSequence)) {
                        e(list, i14, i15 - 1, resolveInfo6, charSequence);
                        i14 = i15;
                        resolveInfo6 = resolveInfo7;
                        charSequence = charSequenceLoadLabel2;
                    }
                }
                e(list, i14, size - 1, resolveInfo6, charSequence);
            }
        }

        public ResolveInfo g(int i10) {
            return this.f164414f.get(i10).f164401a;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f164414f.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return this.f164414f.get(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.f164413e.inflate(o.k.f71999t1, viewGroup, false);
                f fVar = new f(view);
                view.setTag(fVar);
                ViewGroup.LayoutParams layoutParams = fVar.f164421c.getLayoutParams();
                int i11 = ResolverActivity.this.f164395n;
                layoutParams.height = i11;
                layoutParams.width = i11;
            }
            a(view, this.f164414f.get(i10));
            return view;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f164419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f164420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f164421c;

        public f(View view) {
            this.f164419a = (TextView) view.findViewById(o.h.f71533W6);
            this.f164420b = (TextView) view.findViewById(o.h.f71542X6);
            this.f164421c = (ImageView) view.findViewById(o.h.f71448N2);
        }
    }

    @TargetApi(15)
    public Drawable h(Resources resources, int i10) {
        try {
            return resources.getDrawableForDensity(i10, this.f164394m);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public Drawable i(ResolveInfo resolveInfo) {
        Drawable drawableH;
        try {
            String str = resolveInfo.resolvePackageName;
            if (str != null && resolveInfo.icon != 0 && this.f164388g.getResourcesForApplication(str) != null && (drawableH = h(this.f164388g.getResourcesForApplication(resolveInfo.resolvePackageName), resolveInfo.icon)) != null) {
                return drawableH;
            }
            int iconResource = resolveInfo.getIconResource();
            if (iconResource != 0 && this.f164388g.getResourcesForApplication(resolveInfo.activityInfo.packageName) != null) {
                Drawable drawableH2 = h(this.f164388g.getResourcesForApplication(resolveInfo.activityInfo.packageName), iconResource);
                if (drawableH2 != null) {
                    return drawableH2;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.getStackTraceString(e10);
        }
        return resolveInfo.loadIcon(this.f164388g);
    }

    public final Intent j() {
        Intent intent = new Intent(getIntent());
        intent.setComponent(null);
        intent.setFlags(intent.getFlags() & (-8388609));
        return intent;
    }

    public void k(Bundle bundle, Intent intent, CharSequence charSequence, Intent[] intentArr, List<ResolveInfo> list, boolean z10, int i10) {
        super.onCreate(bundle);
        this.f164388g = getPackageManager();
        this.f164386e = i10;
        this.f164389h = z10;
        this.f164396o = 8;
        this.f164399r = true;
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        this.f164394m = activityManager.getLauncherLargeIconDensity();
        this.f164395n = activityManager.getLauncherLargeIconSize();
        e eVar = new e(this, intent, intentArr, list, this.f164386e);
        this.f164387f = eVar;
        int size = eVar.f164414f.size();
        if (this.f164386e < 0) {
            finish();
            return;
        }
        if (size == 1) {
            n(0, false);
            this.f164399r = false;
            finish();
            return;
        }
        x8.b bVar = new x8.b();
        this.f164398q = bVar;
        bVar.d(this, this.f164387f, new c(), this);
        if (size > 1) {
            GridView gridViewC = this.f164398q.c();
            this.f164391j = gridViewC;
            if (z10) {
                gridViewC.setChoiceMode(1);
            }
        } else {
            TextView textView = new TextView(this);
            AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, 400);
            textView.setGravity(17);
            textView.setLayoutParams(layoutParams);
            textView.setPadding(20, 0, 20, 0);
            textView.setText(o.n.f72069I2);
            textView.setTextColor(getResources().getColor(R.color.darker_gray));
            textView.setTextSize(12.0f);
            this.f164398q.a().setContentView(textView);
        }
        this.f164398q.a().setTitle(charSequence);
        this.f164398q.a().setOnCancelListener(new a());
        this.f164398q.a().show();
    }

    public void l(ResolveInfo resolveInfo, Intent intent, boolean z10) {
        String strResolveType;
        if (this.f164389h && this.f164387f.f164415g != null) {
            IntentFilter intentFilter = new IntentFilter();
            if (intent.getAction() != null) {
                intentFilter.addAction(intent.getAction());
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                Iterator<String> it = categories.iterator();
                while (it.hasNext()) {
                    intentFilter.addCategory(it.next());
                }
            }
            intentFilter.addCategory("android.intent.category.DEFAULT");
            int i10 = resolveInfo.match & 268369920;
            Uri data = intent.getData();
            if (i10 == 6291456 && (strResolveType = intent.resolveType(this)) != null) {
                try {
                    intentFilter.addDataType(strResolveType);
                } catch (IntentFilter.MalformedMimeTypeException e10) {
                    Log.getStackTraceString(e10);
                    intentFilter = null;
                }
            }
            if (data != null && data.getScheme() != null && (i10 != 6291456 || (!b.h.f68653a.equals(data.getScheme()) && !"content".equals(data.getScheme())))) {
                intentFilter.addDataScheme(data.getScheme());
                Iterator<PatternMatcher> itSchemeSpecificPartsIterator = resolveInfo.filter.schemeSpecificPartsIterator();
                if (itSchemeSpecificPartsIterator != null) {
                    String schemeSpecificPart = data.getSchemeSpecificPart();
                    while (true) {
                        if (schemeSpecificPart == null || !itSchemeSpecificPartsIterator.hasNext()) {
                            break;
                        }
                        PatternMatcher next = itSchemeSpecificPartsIterator.next();
                        if (next.match(schemeSpecificPart)) {
                            intentFilter.addDataSchemeSpecificPart(next.getPath(), next.getType());
                            break;
                        }
                    }
                }
                Iterator<IntentFilter.AuthorityEntry> itAuthoritiesIterator = resolveInfo.filter.authoritiesIterator();
                if (itAuthoritiesIterator != null) {
                    while (true) {
                        if (!itAuthoritiesIterator.hasNext()) {
                            break;
                        }
                        IntentFilter.AuthorityEntry next2 = itAuthoritiesIterator.next();
                        if (next2.match(data) >= 0) {
                            int port = next2.getPort();
                            intentFilter.addDataAuthority(next2.getHost(), port >= 0 ? Integer.toString(port) : null);
                        }
                    }
                }
                Iterator<PatternMatcher> itPathsIterator = resolveInfo.filter.pathsIterator();
                if (itPathsIterator != null) {
                    String path = data.getPath();
                    while (true) {
                        if (path == null || !itPathsIterator.hasNext()) {
                            break;
                        }
                        PatternMatcher next3 = itPathsIterator.next();
                        if (next3.match(path)) {
                            intentFilter.addDataPath(next3.getPath(), next3.getType());
                            break;
                        }
                    }
                }
            }
            if (intentFilter != null) {
                int size = this.f164387f.f164415g.size();
                ComponentName[] componentNameArr = new ComponentName[size];
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    ResolveInfo resolveInfo2 = this.f164387f.f164415g.get(i12);
                    ActivityInfo activityInfo = resolveInfo2.activityInfo;
                    componentNameArr[i12] = new ComponentName(activityInfo.packageName, activityInfo.name);
                    int i13 = resolveInfo2.match;
                    if (i13 > i11) {
                        i11 = i13;
                    }
                }
                if (z10) {
                    getPackageManager().addPreferredActivity(intentFilter, i11, componentNameArr, intent.getComponent());
                } else {
                    try {
                        new com.prism.gaia.helper.utils.y(X6.s.u6().f78659s.getPackageManager()).f("setLastChosenActivity", intent, intent.resolveTypeIfNeeded(getContentResolver()), 65536, intentFilter, Integer.valueOf(i11), intent.getComponent());
                    } catch (Exception e11) {
                        Log.getStackTraceString(e11);
                    }
                }
            }
        }
        if (intent != null) {
            if (this.f164384c < 0) {
                C5703m.o().F0(intent, ActivityCompat2.Util.getToken(this), null, -1, null, this.f164386e);
                return;
            }
            ActivityCompat2.Util.getToken(this);
            C5703m c5703mO = C5703m.o();
            IBinder iBinder = this.f164382a;
            c5703mO.n(intent, iBinder, this.f164383b, this.f164384c, iBinder, null, this.f164386e);
        }
    }

    public void m(ResolveInfo resolveInfo) {
        startActivity(new Intent().setAction("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", resolveInfo.activityInfo.packageName, null)).addFlags(524288));
    }

    public void n(int i10, boolean z10) {
        if (isFinishing()) {
            return;
        }
        l(this.f164387f.g(i10), this.f164387f.d(i10), z10);
        finish();
    }

    @Override // android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onCreate(Bundle bundle) {
        Intent intentJ = j();
        Set<String> categories = intentJ.getCategories();
        k(bundle, intentJ, getResources().getText((!"android.intent.action.MAIN".equals(intentJ.getAction()) || categories == null || categories.size() != 1 || categories.contains("android.intent.category.HOME")) ? o.n.f72114Q : o.n.f72114Q), null, null, false, D9.c.c());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        x8.b bVar = this.f164398q;
        if (bVar != null && bVar.a().isShowing()) {
            this.f164398q.a().dismiss();
        }
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        int checkedItemPosition = this.f164391j.getCheckedItemPosition();
        boolean z10 = checkedItemPosition != -1;
        if (!this.f164389h || (z10 && this.f164397p == checkedItemPosition)) {
            n(i10, false);
            return;
        }
        this.f164392k.setEnabled(z10);
        this.f164393l.setEnabled(z10);
        if (z10) {
            this.f164391j.smoothScrollToPosition(checkedItemPosition);
        }
        this.f164397p = checkedItemPosition;
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        if (!this.f164399r) {
            this.f164399r = true;
        }
        this.f164387f.c();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (this.f164389h) {
            int checkedItemPosition = this.f164391j.getCheckedItemPosition();
            boolean z10 = checkedItemPosition != -1;
            this.f164397p = checkedItemPosition;
            this.f164392k.setEnabled(z10);
            this.f164393l.setEnabled(z10);
            if (z10) {
                this.f164391j.setSelection(checkedItemPosition);
            }
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.f164399r) {
            this.f164399r = false;
        }
        if ((getIntent().getFlags() & 268435456) == 0 || isChangingConfigurations()) {
            return;
        }
        finish();
    }
}
