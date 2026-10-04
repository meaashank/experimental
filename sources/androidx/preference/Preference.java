package androidx.preference;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.C2507z0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.preference.t;
import androidx.preference.w;
import e.InterfaceC4335i;
import h.C4472a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import s7.C5579a;

/* JADX INFO: loaded from: classes2.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f115455R = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final String f115456S = "Preference";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f115457A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f115458B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f115459C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f115460D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f115461E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f115462F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f115463G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f115464H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f115465I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public b f115466J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public List<Preference> f115467K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public PreferenceGroup f115468L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f115469M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f115470N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public e f115471O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public f f115472P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final View.OnClickListener f115473Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f115474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public t f115475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public j f115476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f115477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f115478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f115479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f115480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f115481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f115482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f115483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f115484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f115485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f115486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f115487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Intent f115488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f115489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Bundle f115490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f115491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f115492s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f115493t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f115494u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f115495v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f115496w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f115497x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f115498y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f115499z;

    public static class BaseSavedState extends AbsSavedState {

        @NonNull
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new a();

        public class a implements Parcelable.Creator<BaseSavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public BaseSavedState[] newArray(int i10) {
                return new BaseSavedState[i10];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.r0(view);
        }
    }

    public interface b {
        void b(@NonNull Preference preference);

        void d(@NonNull Preference preference);

        void f(@NonNull Preference preference);
    }

    public interface c {
        boolean a(@NonNull Preference preference, Object obj);
    }

    public interface d {
        boolean a(@NonNull Preference preference);
    }

    public static class e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Preference f115501a;

        public e(@NonNull Preference preference) {
            this.f115501a = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence charSequenceI = this.f115501a.I();
            if (!this.f115501a.N() || TextUtils.isEmpty(charSequenceI)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceI);
            contextMenu.add(0, 0, 0, w.i.f115834a).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f115501a.i().getSystemService(C5579a.f238596f);
            CharSequence charSequenceI = this.f115501a.I();
            clipboardManager.setPrimaryClip(ClipData.newPlainText(Preference.f115456S, charSequenceI));
            Toast.makeText(this.f115501a.i(), this.f115501a.i().getString(w.i.f115837d, charSequenceI), 0).show();
            return true;
        }
    }

    public interface f<T extends Preference> {
        @Nullable
        CharSequence a(@NonNull T t10);
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        this.f115481h = Integer.MAX_VALUE;
        this.f115482i = 0;
        this.f115491r = true;
        this.f115492s = true;
        this.f115494u = true;
        this.f115497x = true;
        this.f115498y = true;
        this.f115499z = true;
        this.f115457A = true;
        this.f115458B = true;
        this.f115460D = true;
        this.f115463G = true;
        int i12 = w.h.f115818c;
        this.f115464H = i12;
        this.f115473Q = new a();
        this.f115474a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.k.f115903K, i10, i11);
        this.f115485l = D0.n.n(typedArrayObtainStyledAttributes, w.k.f115960i0, w.k.f115905L, 0);
        int i13 = w.k.f115969l0;
        int i14 = w.k.f115917R;
        String string = typedArrayObtainStyledAttributes.getString(i13);
        this.f115487n = string == null ? typedArrayObtainStyledAttributes.getString(i14) : string;
        int i15 = w.k.f115993t0;
        int i16 = w.k.f115913P;
        CharSequence text = typedArrayObtainStyledAttributes.getText(i15);
        this.f115483j = text == null ? typedArrayObtainStyledAttributes.getText(i16) : text;
        int i17 = w.k.f115990s0;
        int i18 = w.k.f115919S;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(i17);
        this.f115484k = text2 == null ? typedArrayObtainStyledAttributes.getText(i18) : text2;
        this.f115481h = typedArrayObtainStyledAttributes.getInt(w.k.f115975n0, typedArrayObtainStyledAttributes.getInt(w.k.f115921T, Integer.MAX_VALUE));
        int i19 = w.k.f115957h0;
        int i20 = w.k.f115931Y;
        String string2 = typedArrayObtainStyledAttributes.getString(i19);
        this.f115489p = string2 == null ? typedArrayObtainStyledAttributes.getString(i20) : string2;
        this.f115464H = typedArrayObtainStyledAttributes.getResourceId(w.k.f115972m0, typedArrayObtainStyledAttributes.getResourceId(w.k.f115911O, i12));
        this.f115465I = typedArrayObtainStyledAttributes.getResourceId(w.k.f115996u0, typedArrayObtainStyledAttributes.getResourceId(w.k.f115923U, 0));
        this.f115491r = typedArrayObtainStyledAttributes.getBoolean(w.k.f115954g0, typedArrayObtainStyledAttributes.getBoolean(w.k.f115909N, true));
        this.f115492s = typedArrayObtainStyledAttributes.getBoolean(w.k.f115981p0, typedArrayObtainStyledAttributes.getBoolean(w.k.f115915Q, true));
        this.f115494u = typedArrayObtainStyledAttributes.getBoolean(w.k.f115978o0, typedArrayObtainStyledAttributes.getBoolean(w.k.f115907M, true));
        int i21 = w.k.f115948e0;
        int i22 = w.k.f115925V;
        String string3 = typedArrayObtainStyledAttributes.getString(i21);
        this.f115495v = string3 == null ? typedArrayObtainStyledAttributes.getString(i22) : string3;
        int i23 = w.k.f115939b0;
        this.f115457A = typedArrayObtainStyledAttributes.getBoolean(i23, typedArrayObtainStyledAttributes.getBoolean(i23, this.f115492s));
        int i24 = w.k.f115942c0;
        this.f115458B = typedArrayObtainStyledAttributes.getBoolean(i24, typedArrayObtainStyledAttributes.getBoolean(i24, this.f115492s));
        int i25 = w.k.f115945d0;
        if (typedArrayObtainStyledAttributes.hasValue(i25)) {
            this.f115496w = h0(typedArrayObtainStyledAttributes, i25);
        } else {
            int i26 = w.k.f115927W;
            if (typedArrayObtainStyledAttributes.hasValue(i26)) {
                this.f115496w = h0(typedArrayObtainStyledAttributes, i26);
            }
        }
        this.f115463G = typedArrayObtainStyledAttributes.getBoolean(w.k.f115984q0, typedArrayObtainStyledAttributes.getBoolean(w.k.f115929X, true));
        int i27 = w.k.f115987r0;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i27);
        this.f115459C = zHasValue;
        if (zHasValue) {
            this.f115460D = typedArrayObtainStyledAttributes.getBoolean(i27, typedArrayObtainStyledAttributes.getBoolean(w.k.f115933Z, true));
        }
        this.f115461E = typedArrayObtainStyledAttributes.getBoolean(w.k.f115963j0, typedArrayObtainStyledAttributes.getBoolean(w.k.f115936a0, false));
        int i28 = w.k.f115966k0;
        this.f115499z = typedArrayObtainStyledAttributes.getBoolean(i28, typedArrayObtainStyledAttributes.getBoolean(i28, true));
        int i29 = w.k.f115951f0;
        this.f115462F = typedArrayObtainStyledAttributes.getBoolean(i29, typedArrayObtainStyledAttributes.getBoolean(i29, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public int A(int i10) {
        if (!i1()) {
            return i10;
        }
        j jVarE = E();
        return jVarE != null ? jVarE.c(this.f115487n, i10) : this.f115475b.o().getInt(this.f115487n, i10);
    }

    public void A0() {
        if (TextUtils.isEmpty(this.f115487n)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.f115493t = true;
    }

    public long B(long j10) {
        if (!i1()) {
            return j10;
        }
        j jVarE = E();
        return jVarE != null ? jVarE.d(this.f115487n, j10) : this.f115475b.o().getLong(this.f115487n, j10);
    }

    public void B0(@NonNull Bundle bundle) {
        e(bundle);
    }

    public String C(String str) {
        if (!i1()) {
            return str;
        }
        j jVarE = E();
        return jVarE != null ? jVarE.e(this.f115487n, str) : this.f115475b.o().getString(this.f115487n, str);
    }

    public void C0(@NonNull Bundle bundle) {
        f(bundle);
    }

    public Set<String> D(Set<String> set) {
        if (!i1()) {
            return set;
        }
        j jVarE = E();
        return jVarE != null ? jVarE.f(this.f115487n, set) : this.f115475b.o().getStringSet(this.f115487n, set);
    }

    public void D0(boolean z10) {
        if (this.f115462F != z10) {
            this.f115462F = z10;
            X();
        }
    }

    @Nullable
    public j E() {
        j jVar = this.f115476c;
        if (jVar != null) {
            return jVar;
        }
        t tVar = this.f115475b;
        if (tVar != null) {
            return tVar.m();
        }
        return null;
    }

    public void E0(Object obj) {
        this.f115496w = obj;
    }

    public t F() {
        return this.f115475b;
    }

    public void F0(@Nullable String str) {
        k1();
        this.f115495v = str;
        y0();
    }

    @Nullable
    public SharedPreferences G() {
        if (this.f115475b == null || E() != null) {
            return null;
        }
        return this.f115475b.o();
    }

    public void G0(boolean z10) {
        if (this.f115491r != z10) {
            this.f115491r = z10;
            Y(h1());
            X();
        }
    }

    public boolean H() {
        return this.f115463G;
    }

    public final void H0(@NonNull View view, boolean z10) {
        view.setEnabled(z10);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                H0(viewGroup.getChildAt(childCount), z10);
            }
        }
    }

    @Nullable
    public CharSequence I() {
        f fVar = this.f115472P;
        return fVar != null ? fVar.a(this) : this.f115484k;
    }

    public void I0(@Nullable String str) {
        this.f115489p = str;
    }

    @Nullable
    public final f J() {
        return this.f115472P;
    }

    public void J0(int i10) {
        K0(C4472a.b(this.f115474a, i10));
        this.f115485l = i10;
    }

    @Nullable
    public CharSequence K() {
        return this.f115483j;
    }

    public void K0(@Nullable Drawable drawable) {
        if (this.f115486m != drawable) {
            this.f115486m = drawable;
            this.f115485l = 0;
            X();
        }
    }

    public final int L() {
        return this.f115465I;
    }

    public void L0(boolean z10) {
        if (this.f115461E != z10) {
            this.f115461E = z10;
            X();
        }
    }

    public boolean M() {
        return !TextUtils.isEmpty(this.f115487n);
    }

    public void M0(@Nullable Intent intent) {
        this.f115488o = intent;
    }

    public boolean N() {
        return this.f115462F;
    }

    public void N0(String str) {
        this.f115487n = str;
        if (!this.f115493t || M()) {
            return;
        }
        A0();
    }

    public boolean O() {
        return this.f115491r && this.f115497x && this.f115498y;
    }

    public void O0(int i10) {
        this.f115464H = i10;
    }

    public final void P0(@Nullable b bVar) {
        this.f115466J = bVar;
    }

    public boolean Q() {
        return this.f115461E;
    }

    public void Q0(@Nullable c cVar) {
        this.f115479f = cVar;
    }

    public boolean R() {
        return this.f115494u;
    }

    public void R0(@Nullable d dVar) {
        this.f115480g = dVar;
    }

    public boolean S() {
        return this.f115492s;
    }

    public void S0(int i10) {
        if (i10 != this.f115481h) {
            this.f115481h = i10;
            Z();
        }
    }

    public final boolean T() {
        if (!this.f115499z || F() == null) {
            return false;
        }
        if (this == F().n()) {
            return true;
        }
        PreferenceGroup preferenceGroupX = x();
        if (preferenceGroupX == null) {
            return false;
        }
        return preferenceGroupX.T();
    }

    public void U0(boolean z10) {
        this.f115494u = z10;
    }

    public boolean V() {
        return this.f115460D;
    }

    public void V0(@Nullable j jVar) {
        this.f115476c = jVar;
    }

    public final boolean W() {
        return this.f115499z;
    }

    public void W0(boolean z10) {
        if (this.f115492s != z10) {
            this.f115492s = z10;
            X();
        }
    }

    public void X() {
        b bVar = this.f115466J;
        if (bVar != null) {
            bVar.d(this);
        }
    }

    public void X0(boolean z10) {
        if (this.f115463G != z10) {
            this.f115463G = z10;
            X();
        }
    }

    public void Y(boolean z10) {
        List<Preference> list = this.f115467K;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).f0(this, z10);
        }
    }

    public void Y0(boolean z10) {
        this.f115459C = true;
        this.f115460D = z10;
    }

    public void Z() {
        b bVar = this.f115466J;
        if (bVar != null) {
            bVar.f(this);
        }
    }

    public void Z0(int i10) {
        a1(this.f115474a.getString(i10));
    }

    public void a(@Nullable PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.f115468L != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.f115468L = preferenceGroup;
    }

    public void a0() {
        y0();
    }

    public void a1(@Nullable CharSequence charSequence) {
        if (this.f115472P != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f115484k, charSequence)) {
            return;
        }
        this.f115484k = charSequence;
        X();
    }

    public boolean b(Object obj) {
        c cVar = this.f115479f;
        if (cVar == null) {
            return true;
        }
        cVar.a(this, obj);
        return true;
    }

    public void b0(@NonNull t tVar) {
        this.f115475b = tVar;
        if (!this.f115478e) {
            this.f115477d = tVar.h();
        }
        g();
    }

    public final void b1(@Nullable f fVar) {
        this.f115472P = fVar;
        X();
    }

    public final void c() {
        this.f115469M = false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void c0(@NonNull t tVar, long j10) {
        this.f115477d = j10;
        this.f115478e = true;
        try {
            b0(tVar);
        } finally {
            this.f115478e = false;
        }
    }

    public void c1(int i10) {
        d1(this.f115474a.getString(i10));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull Preference preference) {
        int i10 = this.f115481h;
        int i11 = preference.f115481h;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f115483j;
        CharSequence charSequence2 = preference.f115483j;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f115483j.toString());
    }

    public void d0(@NonNull v vVar) {
        Integer numValueOf;
        View view = vVar.itemView;
        view.setOnClickListener(this.f115473Q);
        view.setId(this.f115482i);
        TextView textView = (TextView) vVar.d(R.id.summary);
        if (textView != null) {
            CharSequence charSequenceI = I();
            if (TextUtils.isEmpty(charSequenceI)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceI);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) vVar.d(R.id.title);
        if (textView2 != null) {
            CharSequence charSequenceK = K();
            if (TextUtils.isEmpty(charSequenceK)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequenceK);
                textView2.setVisibility(0);
                if (this.f115459C) {
                    textView2.setSingleLine(this.f115460D);
                }
                if (!S() && O() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) vVar.d(R.id.icon);
        if (imageView != null) {
            int i10 = this.f115485l;
            if (i10 != 0 || this.f115486m != null) {
                if (this.f115486m == null) {
                    this.f115486m = C4472a.b(this.f115474a, i10);
                }
                Drawable drawable = this.f115486m;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f115486m != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.f115461E ? 4 : 8);
            }
        }
        View viewD = vVar.d(w.f.f115805a);
        if (viewD == null) {
            viewD = vVar.d(16908350);
        }
        if (viewD != null) {
            if (this.f115486m != null) {
                viewD.setVisibility(0);
            } else {
                viewD.setVisibility(this.f115461E ? 4 : 8);
            }
        }
        if (this.f115463G) {
            H0(view, O());
        } else {
            H0(view, true);
        }
        boolean zS = S();
        view.setFocusable(zS);
        view.setClickable(zS);
        vVar.h(this.f115457A);
        vVar.i(this.f115458B);
        boolean zN = N();
        if (zN && this.f115471O == null) {
            this.f115471O = new e(this);
        }
        view.setOnCreateContextMenuListener(zN ? this.f115471O : null);
        view.setLongClickable(zN);
        if (!zN || zS) {
            return;
        }
        C2507z0.O1(view, null);
    }

    public void d1(@Nullable CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f115483j)) {
            return;
        }
        this.f115483j = charSequence;
        X();
    }

    public void e(@NonNull Bundle bundle) {
        Parcelable parcelable;
        if (!M() || (parcelable = bundle.getParcelable(this.f115487n)) == null) {
            return;
        }
        this.f115470N = false;
        l0(parcelable);
        if (!this.f115470N) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void e0() {
    }

    public void e1(int i10) {
        this.f115482i = i10;
    }

    public void f(@NonNull Bundle bundle) {
        if (M()) {
            this.f115470N = false;
            Parcelable parcelableM0 = m0();
            if (!this.f115470N) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableM0 != null) {
                bundle.putParcelable(this.f115487n, parcelableM0);
            }
        }
    }

    public void f0(@NonNull Preference preference, boolean z10) {
        if (this.f115497x == z10) {
            this.f115497x = !z10;
            Y(h1());
            X();
        }
    }

    public final void f1(boolean z10) {
        if (this.f115499z != z10) {
            this.f115499z = z10;
            b bVar = this.f115466J;
            if (bVar != null) {
                bVar.b(this);
            }
        }
    }

    public final void g() {
        if (E() != null) {
            o0(true, this.f115496w);
            return;
        }
        if (i1() && G().contains(this.f115487n)) {
            o0(true, null);
            return;
        }
        Object obj = this.f115496w;
        if (obj != null) {
            o0(false, obj);
        }
    }

    public void g0() {
        k1();
        this.f115469M = true;
    }

    public void g1(int i10) {
        this.f115465I = i10;
    }

    @Nullable
    public <T extends Preference> T h(@NonNull String str) {
        t tVar = this.f115475b;
        if (tVar == null) {
            return null;
        }
        return (T) tVar.b(str);
    }

    @Nullable
    public Object h0(@NonNull TypedArray typedArray, int i10) {
        return null;
    }

    public boolean h1() {
        return !O();
    }

    @NonNull
    public Context i() {
        return this.f115474a;
    }

    @InterfaceC4335i
    @Deprecated
    public void i0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public boolean i1() {
        return this.f115475b != null && R() && M();
    }

    @Nullable
    public String j() {
        return this.f115495v;
    }

    public void j0(@NonNull Preference preference, boolean z10) {
        if (this.f115498y == z10) {
            this.f115498y = !z10;
            Y(h1());
            X();
        }
    }

    public final void j1(@NonNull SharedPreferences.Editor editor) {
        if (this.f115475b.H()) {
            editor.apply();
        }
    }

    @NonNull
    public Bundle k() {
        if (this.f115490q == null) {
            this.f115490q = new Bundle();
        }
        return this.f115490q;
    }

    public void k0() {
        k1();
    }

    public final void k1() {
        Preference preferenceH;
        String str = this.f115495v;
        if (str == null || (preferenceH = h(str)) == null) {
            return;
        }
        preferenceH.l1(this);
    }

    @NonNull
    public StringBuilder l() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequenceK = K();
        if (!TextUtils.isEmpty(charSequenceK)) {
            sb2.append(charSequenceK);
            sb2.append(' ');
        }
        CharSequence charSequenceI = I();
        if (!TextUtils.isEmpty(charSequenceI)) {
            sb2.append(charSequenceI);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2;
    }

    public void l0(@Nullable Parcelable parcelable) {
        this.f115470N = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public final void l1(Preference preference) {
        List<Preference> list = this.f115467K;
        if (list != null) {
            list.remove(preference);
        }
    }

    @Nullable
    public String m() {
        return this.f115489p;
    }

    @Nullable
    public Parcelable m0() {
        this.f115470N = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public final boolean m1() {
        return this.f115469M;
    }

    @Nullable
    public Drawable n() {
        int i10;
        if (this.f115486m == null && (i10 = this.f115485l) != 0) {
            this.f115486m = C4472a.b(this.f115474a, i10);
        }
        return this.f115486m;
    }

    public void n0(@Nullable Object obj) {
    }

    @Deprecated
    public void o0(boolean z10, Object obj) {
        n0(obj);
    }

    public long p() {
        return this.f115477d;
    }

    @Nullable
    public Bundle p0() {
        return this.f115490q;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void q0() {
        t.c cVarK;
        if (O() && S()) {
            e0();
            d dVar = this.f115480g;
            if (dVar != null) {
                dVar.a(this);
                return;
            }
            t tVarF = F();
            if ((tVarF == null || (cVarK = tVarF.k()) == null || !cVarK.f(this)) && this.f115488o != null) {
                i().startActivity(this.f115488o);
            }
        }
    }

    @Nullable
    public Intent r() {
        return this.f115488o;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void r0(@NonNull View view) {
        q0();
    }

    public String s() {
        return this.f115487n;
    }

    public boolean s0(boolean z10) {
        if (!i1()) {
            return false;
        }
        if (z10 == y(!z10)) {
            return true;
        }
        j jVarE = E();
        if (jVarE != null) {
            jVarE.g(this.f115487n, z10);
            return true;
        }
        SharedPreferences.Editor editorG = this.f115475b.g();
        editorG.putBoolean(this.f115487n, z10);
        j1(editorG);
        return true;
    }

    public final int t() {
        return this.f115464H;
    }

    public boolean t0(float f10) {
        if (!i1()) {
            return false;
        }
        if (f10 == z(Float.NaN)) {
            return true;
        }
        j jVarE = E();
        if (jVarE != null) {
            jVarE.h(this.f115487n, f10);
            return true;
        }
        SharedPreferences.Editor editorG = this.f115475b.g();
        editorG.putFloat(this.f115487n, f10);
        j1(editorG);
        return true;
    }

    @NonNull
    public String toString() {
        return l().toString();
    }

    @Nullable
    public c u() {
        return this.f115479f;
    }

    public boolean u0(int i10) {
        if (!i1()) {
            return false;
        }
        if (i10 == A(~i10)) {
            return true;
        }
        j jVarE = E();
        if (jVarE != null) {
            jVarE.i(this.f115487n, i10);
            return true;
        }
        SharedPreferences.Editor editorG = this.f115475b.g();
        editorG.putInt(this.f115487n, i10);
        j1(editorG);
        return true;
    }

    @Nullable
    public d v() {
        return this.f115480g;
    }

    public boolean v0(long j10) {
        if (!i1()) {
            return false;
        }
        if (j10 == B(~j10)) {
            return true;
        }
        j jVarE = E();
        if (jVarE != null) {
            jVarE.j(this.f115487n, j10);
            return true;
        }
        SharedPreferences.Editor editorG = this.f115475b.g();
        editorG.putLong(this.f115487n, j10);
        j1(editorG);
        return true;
    }

    public int w() {
        return this.f115481h;
    }

    public boolean w0(String str) {
        if (!i1()) {
            return false;
        }
        if (TextUtils.equals(str, C(null))) {
            return true;
        }
        j jVarE = E();
        if (jVarE != null) {
            jVarE.k(this.f115487n, str);
            return true;
        }
        SharedPreferences.Editor editorG = this.f115475b.g();
        editorG.putString(this.f115487n, str);
        j1(editorG);
        return true;
    }

    @Nullable
    public PreferenceGroup x() {
        return this.f115468L;
    }

    public boolean x0(Set<String> set) {
        if (!i1()) {
            return false;
        }
        if (set.equals(D(null))) {
            return true;
        }
        j jVarE = E();
        if (jVarE != null) {
            jVarE.l(this.f115487n, set);
            return true;
        }
        SharedPreferences.Editor editorG = this.f115475b.g();
        editorG.putStringSet(this.f115487n, set);
        j1(editorG);
        return true;
    }

    public boolean y(boolean z10) {
        if (!i1()) {
            return z10;
        }
        j jVarE = E();
        return jVarE != null ? jVarE.a(this.f115487n, z10) : this.f115475b.o().getBoolean(this.f115487n, z10);
    }

    public final void y0() {
        if (TextUtils.isEmpty(this.f115495v)) {
            return;
        }
        Preference preferenceH = h(this.f115495v);
        if (preferenceH != null) {
            preferenceH.z0(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.f115495v + "\" not found for preference \"" + this.f115487n + "\" (title: \"" + ((Object) this.f115483j) + "\"");
    }

    public float z(float f10) {
        if (!i1()) {
            return f10;
        }
        j jVarE = E();
        return jVarE != null ? jVarE.b(this.f115487n, f10) : this.f115475b.o().getFloat(this.f115487n, f10);
    }

    public final void z0(Preference preference) {
        if (this.f115467K == null) {
            this.f115467K = new ArrayList();
        }
        this.f115467K.add(preference);
        preference.f0(this, h1());
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, D0.n.a(context, w.a.f115748Q, R.attr.preferenceStyle));
    }

    public Preference(@NonNull Context context) {
        this(context, null);
    }
}
