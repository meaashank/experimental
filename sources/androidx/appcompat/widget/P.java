package androidx.appcompat.widget;

import B0.C0920d;
import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.MBridgeConstans;
import g.C4426a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class P extends d1.c implements View.OnClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final boolean f86104C = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f86105D = "SuggestionsAdapter";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f86106E = 50;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f86107F = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f86108G = 1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f86109H = 2;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f86110I = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f86111A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f86112B;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SearchView f86113o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SearchableInfo f86114p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Context f86115q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f86116r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f86117s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f86118t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f86119u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f86120v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f86121w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f86122x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f86123y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f86124z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f86125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f86126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f86127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f86128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f86129e;

        public a(View view) {
            this.f86125a = (TextView) view.findViewById(R.id.text1);
            this.f86126b = (TextView) view.findViewById(R.id.text2);
            this.f86127c = (ImageView) view.findViewById(R.id.icon1);
            this.f86128d = (ImageView) view.findViewById(R.id.icon2);
            this.f86129e = (ImageView) view.findViewById(C4426a.g.f201326z);
        }
    }

    public P(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.v(), (Cursor) null, true);
        this.f86118t = false;
        this.f86119u = 1;
        this.f86121w = -1;
        this.f86122x = -1;
        this.f86123y = -1;
        this.f86124z = -1;
        this.f86111A = -1;
        this.f86112B = -1;
        this.f86113o = searchView;
        this.f86114p = searchableInfo;
        this.f86117s = searchView.u();
        this.f86115q = context;
        this.f86116r = weakHashMap;
    }

    public static String C(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e(f86105D, "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    public static String t(Cursor cursor, String str) {
        return C(cursor, cursor.getColumnIndex(str));
    }

    public int A() {
        return this.f86119u;
    }

    public Cursor B(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f86115q.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void D(int i10) {
        this.f86119u = i10;
    }

    public final void E(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void F(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public final void G(String str, Drawable drawable) {
        if (drawable != null) {
            this.f86116r.put(str, drawable.getConstantState());
        }
    }

    public final void H(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // d1.AbstractC4294a, d1.b.a
    public void a(Cursor cursor) {
        if (this.f86118t) {
            Log.w(f86105D, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f86121w = cursor.getColumnIndex("suggest_text_1");
                this.f86122x = cursor.getColumnIndex("suggest_text_2");
                this.f86123y = cursor.getColumnIndex("suggest_text_2_url");
                this.f86124z = cursor.getColumnIndex("suggest_icon_1");
                this.f86111A = cursor.getColumnIndex("suggest_icon_2");
                this.f86112B = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e(f86105D, "error changing cursor and caching columns", e10);
        }
    }

    @Override // d1.AbstractC4294a, d1.b.a
    public Cursor c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f86113o.getVisibility() == 0 && this.f86113o.getWindowVisibility() == 0) {
            try {
                Cursor cursorB = B(this.f86114p, string, 50);
                if (cursorB != null) {
                    cursorB.getCount();
                    return cursorB;
                }
            } catch (RuntimeException e10) {
                Log.w(f86105D, "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // d1.AbstractC4294a, d1.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strC;
        String strC2;
        if (cursor == null) {
            return null;
        }
        String strC3 = C(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strC3 != null) {
            return strC3;
        }
        if (this.f86114p.shouldRewriteQueryFromData() && (strC2 = C(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strC2;
        }
        if (!this.f86114p.shouldRewriteQueryFromText() || (strC = C(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strC;
    }

    @Override // d1.AbstractC4294a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f86112B;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f86125a != null) {
            F(aVar.f86125a, C(cursor, this.f86121w));
        }
        if (aVar.f86126b != null) {
            String strC = C(cursor, this.f86123y);
            CharSequence charSequenceQ = strC != null ? q(strC) : C(cursor, this.f86122x);
            if (TextUtils.isEmpty(charSequenceQ)) {
                TextView textView = aVar.f86125a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f86125a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f86125a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f86125a.setMaxLines(1);
                }
            }
            F(aVar.f86126b, charSequenceQ);
        }
        ImageView imageView = aVar.f86127c;
        if (imageView != null) {
            E(imageView, y(cursor), 4);
        }
        ImageView imageView2 = aVar.f86128d;
        if (imageView2 != null) {
            E(imageView2, z(cursor), 8);
        }
        int i12 = this.f86119u;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f86129e.setVisibility(8);
            return;
        }
        aVar.f86129e.setVisibility(0);
        aVar.f86129e.setTag(aVar.f86125a.getText());
        aVar.f86129e.setOnClickListener(this);
    }

    @Override // d1.AbstractC4294a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w(f86105D, "Search suggestions cursor threw exception.", e10);
            View viewH = h(this.f86115q, b(), viewGroup);
            if (viewH != null) {
                ((a) viewH.getTag()).f86125a.setText(e10.toString());
            }
            return viewH;
        }
    }

    @Override // d1.AbstractC4294a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w(f86105D, "Search suggestions cursor threw exception.", e10);
            View viewI = i(this.f86115q, b(), viewGroup);
            ((a) viewI.getTag()).f86125a.setText(e10.toString());
            return viewI;
        }
    }

    @Override // d1.c, d1.AbstractC4294a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewI = super.i(context, cursor, viewGroup);
        viewI.setTag(new a(viewI));
        ((ImageView) viewI.findViewById(C4426a.g.f201326z)).setImageResource(this.f86117s);
        return viewI;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        H(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        H(b());
    }

    public final Drawable o(String str) {
        Drawable.ConstantState constantState = this.f86116r.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f86113o.K((CharSequence) tag);
        }
    }

    public void p() {
        a(null);
        this.f86118t = true;
    }

    public final CharSequence q(CharSequence charSequence) {
        if (this.f86120v == null) {
            TypedValue typedValue = new TypedValue();
            this.f86115q.getTheme().resolveAttribute(C4426a.b.f200967x3, typedValue, true);
            this.f86120v = this.f86115q.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f86120v, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable r(ComponentName componentName) {
        PackageManager packageManager = this.f86115q.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            StringBuilder sbA = android.support.v4.media.a.a("Invalid icon resource ", iconResource, " for ");
            sbA.append(componentName.flattenToShortString());
            Log.w(f86105D, sbA.toString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w(f86105D, e10.toString());
            return null;
        }
    }

    public final Drawable s(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f86116r.containsKey(strFlattenToShortString)) {
            Drawable drawableR = r(componentName);
            this.f86116r.put(strFlattenToShortString, drawableR != null ? drawableR.getConstantState() : null);
            return drawableR;
        }
        Drawable.ConstantState constantState = this.f86116r.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f86115q.getResources());
    }

    public final Drawable u() {
        Drawable drawableS = s(this.f86114p.getSearchActivity());
        return drawableS != null ? drawableS : this.f86115q.getPackageManager().getDefaultActivityIcon();
    }

    public final Drawable v(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return w(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f86115q.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    return drawableCreateFromStream;
                } catch (IOException e10) {
                    return drawableCreateFromStream;
                }
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e102) {
                    Log.e(f86105D, "Error closing icon stream for " + uri, e102);
                }
            }
        } catch (FileNotFoundException e11) {
            Log.w(f86105D, "Icon not found: " + uri + U6.j.f68738d + e11.getMessage());
            return null;
        }
        Log.w(f86105D, "Icon not found: " + uri + U6.j.f68738d + e11.getMessage());
        return null;
    }

    public Drawable w(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(O.a("No authority: ", uri));
        }
        try {
            Resources resourcesForApplication = this.f86115q.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(O.a("No path: ", uri));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(O.a("Single path segment is not a resource ID: ", uri));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(O.a("More than two path segments: ", uri));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(O.a("No resource found for: ", uri));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(O.a("No package found for authority: ", uri));
        }
    }

    public final Drawable x(String str) {
        if (str == null || str.isEmpty() || MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(str)) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f86115q.getPackageName() + RemoteSettings.FORWARD_SLASH_STRING + i10;
            Drawable drawableO = o(str2);
            if (drawableO != null) {
                return drawableO;
            }
            Drawable drawable = C0920d.getDrawable(this.f86115q, i10);
            G(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w(f86105D, "Icon resource not found: ".concat(str));
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableO2 = o(str);
            if (drawableO2 != null) {
                return drawableO2;
            }
            Drawable drawableV = v(Uri.parse(str));
            G(str, drawableV);
            return drawableV;
        }
    }

    public final Drawable y(Cursor cursor) {
        int i10 = this.f86124z;
        if (i10 == -1) {
            return null;
        }
        Drawable drawableX = x(cursor.getString(i10));
        return drawableX != null ? drawableX : u();
    }

    public final Drawable z(Cursor cursor) {
        int i10 = this.f86111A;
        if (i10 == -1) {
            return null;
        }
        return x(cursor.getString(i10));
    }
}
