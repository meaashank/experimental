package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.C2507z0;
import androidx.customview.view.AbsSavedState;
import com.google.firebase.sessions.settings.RemoteSettings;
import d1.AbstractC4294a;
import e.InterfaceC4345t;
import g.C4426a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.InterfaceC5127c;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements InterfaceC5127c {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final boolean f86144b0 = false;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f86145c0 = "SearchView";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f86146d0 = "nm";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final o f86147e0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f86148A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f86149B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public AbstractC4294a f86150C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f86151D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public CharSequence f86152E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f86153F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f86154G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f86155H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f86156I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public CharSequence f86157J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public CharSequence f86158K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f86159L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f86160M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public SearchableInfo f86161N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Bundle f86162O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Runnable f86163P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Runnable f86164Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f86165R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final View.OnClickListener f86166S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public View.OnKeyListener f86167T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final TextView.OnEditorActionListener f86168U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f86169V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f86170W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchAutoComplete f86171a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextWatcher f86172a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f86173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f86174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f86175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f86176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f86177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f86178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f86179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f86180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f86181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f86182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Rect f86183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f86184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f86185n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f86186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Drawable f86187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f86188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f86189r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Intent f86190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Intent f86191t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CharSequence f86192u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m f86193v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public l f86194w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View.OnFocusChangeListener f86195x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n f86196y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View.OnClickListener f86197z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean isIconified;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.isIconified + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.isIconified));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isIconified = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SearchView f86199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f86200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Runnable f86201d;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.f();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public void a() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f86147e0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public final int b() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void d(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(G7.a.f45348f);
            if (!z10) {
                this.f86200c = false;
                removeCallbacks(this.f86201d);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f86200c = true;
                    return;
                }
                this.f86200c = false;
                removeCallbacks(this.f86201d);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void e(SearchView searchView) {
            this.f86199b = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f86198a <= 0 || super.enoughToFilter();
        }

        public void f() {
            if (this.f86200c) {
                ((InputMethodManager) getContext().getSystemService(G7.a.f45348f)).showSoftInput(this, 0);
                this.f86200c = false;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f86200c) {
                removeCallbacks(this.f86201d);
                post(this.f86201d);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, b(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f86199b.P();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f86199b.clearFocus();
                        d(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f86199b.hasFocus() && getVisibility() == 0) {
                this.f86200c = true;
                if (SearchView.A(getContext())) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f86198a = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C4426a.b.f200795S);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f86201d = new a();
            this.f86198a = getThreshold();
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.O(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4294a abstractC4294a = SearchView.this.f86150C;
            if (abstractC4294a instanceof P) {
                abstractC4294a.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f86195x;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.e();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f86176e) {
                searchView.L();
                return;
            }
            if (view == searchView.f86178g) {
                searchView.H();
                return;
            }
            if (view == searchView.f86177f) {
                searchView.M();
            } else if (view == searchView.f86179h) {
                searchView.Q();
            } else if (view == searchView.f86171a) {
                searchView.k();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f86161N == null) {
                return false;
            }
            if (searchView.f86171a.isPopupShowing() && SearchView.this.f86171a.getListSelection() != -1) {
                return SearchView.this.N(view, i10, keyEvent);
            }
            if (SearchView.this.f86171a.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.F(0, null, searchView2.f86171a.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.M();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.I(i10, 0, null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.J(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @e.T(29)
    public static class k {
        @InterfaceC4345t
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @InterfaceC4345t
        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean onClose();
    }

    public interface m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface n {
        boolean onSuggestionClick(int i10);

        boolean onSuggestionSelect(int i10);
    }

    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f86213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f86214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f86215c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            this.f86213a = null;
            this.f86214b = null;
            this.f86215c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f86213a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f86214b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f86215c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f86214b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f86213a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f86215c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class p extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f86216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f86217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f86218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f86219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f86220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f86221f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f86220e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f86217b = new Rect();
            this.f86219d = new Rect();
            this.f86218c = new Rect();
            a(rect, rect2);
            this.f86216a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f86217b.set(rect);
            this.f86219d.set(rect);
            Rect rect3 = this.f86219d;
            int i10 = this.f86220e;
            rect3.inset(-i10, -i10);
            this.f86218c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f86221f;
                    if (z11 && !this.f86219d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f86221f;
                        this.f86221f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f86217b.contains(x10, y10)) {
                this.f86221f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f86218c.contains(x10, y10)) {
                Rect rect = this.f86218c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f86216a.getWidth() / 2, this.f86216a.getHeight() / 2);
            }
            return this.f86216a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f86147e0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean A(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public boolean B() {
        return this.f86153F;
    }

    public final boolean C() {
        return (this.f86151D || this.f86156I) && !z();
    }

    public boolean D() {
        return this.f86151D;
    }

    public final void E(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e(f86145c0, "Failed launch activity: " + intent, e10);
        }
    }

    public void F(int i10, String str, String str2) {
        getContext().startActivity(f("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    public final boolean G(int i10, int i11, String str) {
        Cursor cursorB = this.f86150C.b();
        if (cursorB == null || !cursorB.moveToPosition(i10)) {
            return false;
        }
        E(g(cursorB, i11, str));
        return true;
    }

    public void H() {
        if (!TextUtils.isEmpty(this.f86171a.getText())) {
            this.f86171a.setText("");
            this.f86171a.requestFocus();
            this.f86171a.d(true);
        } else if (this.f86148A) {
            l lVar = this.f86194w;
            if (lVar == null || !lVar.onClose()) {
                clearFocus();
                r0(true);
            }
        }
    }

    public boolean I(int i10, int i11, String str) {
        n nVar = this.f86196y;
        if (nVar != null && nVar.onSuggestionClick(i10)) {
            return false;
        }
        G(i10, 0, null);
        this.f86171a.d(false);
        j();
        return true;
    }

    public boolean J(int i10) {
        n nVar = this.f86196y;
        if (nVar != null && nVar.onSuggestionSelect(i10)) {
            return false;
        }
        S(i10);
        return true;
    }

    public void K(@Nullable CharSequence charSequence) {
        e0(charSequence);
    }

    public void L() {
        r0(false);
        this.f86171a.requestFocus();
        this.f86171a.d(true);
        View.OnClickListener onClickListener = this.f86197z;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void M() {
        Editable text = this.f86171a.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f86193v != null) {
            text.toString();
        }
        if (this.f86161N != null) {
            F(0, null, text.toString());
        }
        this.f86171a.d(false);
        j();
    }

    public boolean N(View view, int i10, KeyEvent keyEvent) {
        if (this.f86161N != null && this.f86150C != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return I(this.f86171a.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f86171a.setSelection(i10 == 21 ? 0 : this.f86171a.length());
                this.f86171a.setListSelection(0);
                this.f86171a.clearListSelection();
                this.f86171a.a();
                return true;
            }
            if (i10 == 19) {
                this.f86171a.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void O(CharSequence charSequence) {
        Editable text = this.f86171a.getText();
        this.f86158K = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        q0(!zIsEmpty);
        s0(zIsEmpty);
        l0();
        p0();
        if (this.f86193v != null && !TextUtils.equals(charSequence, this.f86157J)) {
            this.f86193v.onQueryTextChange(charSequence.toString());
        }
        this.f86157J = charSequence.toString();
    }

    public void P() {
        r0(z());
        R();
        if (this.f86171a.hasFocus()) {
            k();
        }
    }

    public void Q() {
        SearchableInfo searchableInfo = this.f86161N;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(i(this.f86190s, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(h(this.f86191t, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w(f86145c0, "Could not find voice search activity");
        }
    }

    public final void R() {
        post(this.f86163P);
    }

    public final void S(int i10) {
        Editable text = this.f86171a.getText();
        Cursor cursorB = this.f86150C.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i10)) {
            e0(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.f86150C.convertToString(cursorB);
        if (charSequenceConvertToString != null) {
            e0(charSequenceConvertToString);
        } else {
            e0(text);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void T(Bundle bundle) {
        this.f86162O = bundle;
    }

    public void U(boolean z10) {
        if (z10) {
            H();
        } else {
            L();
        }
    }

    public void V(boolean z10) {
        if (this.f86148A == z10) {
            return;
        }
        this.f86148A = z10;
        r0(z10);
        n0();
    }

    public void W(int i10) {
        this.f86171a.setImeOptions(i10);
    }

    public void X(int i10) {
        this.f86171a.setInputType(i10);
    }

    public void Y(int i10) {
        this.f86155H = i10;
        requestLayout();
    }

    public void Z(l lVar) {
        this.f86194w = lVar;
    }

    public void a0(View.OnFocusChangeListener onFocusChangeListener) {
        this.f86195x = onFocusChangeListener;
    }

    public void b0(m mVar) {
        this.f86193v = mVar;
    }

    public void c0(View.OnClickListener onClickListener) {
        this.f86197z = onClickListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f86154G = true;
        super.clearFocus();
        this.f86171a.clearFocus();
        this.f86171a.d(false);
        this.f86154G = false;
    }

    public void d0(n nVar) {
        this.f86196y = nVar;
    }

    public void e() {
        if (this.f86180i.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f86174c.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = h0.b(this);
            int dimensionPixelSize = this.f86148A ? resources.getDimensionPixelSize(C4426a.e.f201095Q) + resources.getDimensionPixelSize(C4426a.e.f201093P) : 0;
            this.f86171a.getDropDownBackground().getPadding(rect);
            this.f86171a.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f86171a.setDropDownWidth((((this.f86180i.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final void e0(CharSequence charSequence) {
        this.f86171a.setText(charSequence);
        this.f86171a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent f(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f86158K);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f86162O;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f86161N.getSearchActivity());
        return intent;
    }

    public void f0(CharSequence charSequence, boolean z10) {
        this.f86171a.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f86171a;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f86158K = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        M();
    }

    public final Intent g(Cursor cursor, int i10, String str) {
        int position;
        String strC;
        try {
            String strT = P.t(cursor, "suggest_intent_action");
            if (strT == null) {
                strT = this.f86161N.getSuggestIntentAction();
            }
            if (strT == null) {
                strT = "android.intent.action.SEARCH";
            }
            String str2 = strT;
            String strC2 = P.C(cursor, cursor.getColumnIndex("suggest_intent_data"));
            if (strC2 == null) {
                strC2 = this.f86161N.getSuggestIntentData();
            }
            if (strC2 != null && (strC = P.C(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                strC2 = strC2 + RemoteSettings.FORWARD_SLASH_STRING + Uri.encode(strC);
            }
            return f(str2, strC2 == null ? null : Uri.parse(strC2), P.C(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), P.C(cursor, cursor.getColumnIndex("suggest_intent_query")), i10, str);
        } catch (RuntimeException e10) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w(f86145c0, "Search suggestions cursor at row " + position + " returned exception.", e10);
            return null;
        }
    }

    public void g0(@Nullable CharSequence charSequence) {
        this.f86152E = charSequence;
        n0();
    }

    public final Intent h(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f86162O;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public void h0(boolean z10) {
        this.f86153F = z10;
        AbstractC4294a abstractC4294a = this.f86150C;
        if (abstractC4294a instanceof P) {
            ((P) abstractC4294a).D(z10 ? 2 : 1);
        }
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public void i0(SearchableInfo searchableInfo) {
        this.f86161N = searchableInfo;
        if (searchableInfo != null) {
            o0();
            n0();
        }
        boolean zX = x();
        this.f86156I = zX;
        if (zX) {
            this.f86171a.setPrivateImeOptions(f86146d0);
        }
        r0(z());
    }

    public final void j() {
        this.f86171a.dismissDropDown();
    }

    public void j0(boolean z10) {
        this.f86151D = z10;
        r0(z());
    }

    public void k() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f86171a);
            return;
        }
        o oVar = f86147e0;
        oVar.b(this.f86171a);
        oVar.a(this.f86171a);
    }

    public void k0(AbstractC4294a abstractC4294a) {
        this.f86150C = abstractC4294a;
        this.f86171a.setAdapter(abstractC4294a);
    }

    public final void l(View view, Rect rect) {
        view.getLocationInWindow(this.f86184m);
        getLocationInWindow(this.f86185n);
        int[] iArr = this.f86184m;
        int i10 = iArr[1];
        int[] iArr2 = this.f86185n;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    public final void l0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f86171a.getText());
        this.f86178g.setVisibility(!zIsEmpty || (this.f86148A && !this.f86159L) ? 0 : 8);
        Drawable drawable = this.f86178g.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final CharSequence m(CharSequence charSequence) {
        if (!this.f86148A || this.f86187p == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f86171a.getTextSize()) * 1.25d);
        this.f86187p.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f86187p), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public void m0() {
        int[] iArr = this.f86171a.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f86174c.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f86175d.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int n() {
        return this.f86171a.getImeOptions();
    }

    public final void n0() {
        CharSequence charSequenceT = t();
        SearchAutoComplete searchAutoComplete = this.f86171a;
        if (charSequenceT == null) {
            charSequenceT = "";
        }
        searchAutoComplete.setHint(m(charSequenceT));
    }

    public int o() {
        return this.f86171a.getInputType();
    }

    public final void o0() {
        this.f86171a.setThreshold(this.f86161N.getSuggestThreshold());
        this.f86171a.setImeOptions(this.f86161N.getImeOptions());
        int inputType = this.f86161N.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f86161N.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f86171a.setInputType(inputType);
        AbstractC4294a abstractC4294a = this.f86150C;
        if (abstractC4294a != null) {
            abstractC4294a.a(null);
        }
        if (this.f86161N.getSuggestAuthority() != null) {
            P p10 = new P(getContext(), this, this.f86161N, this.f86165R);
            this.f86150C = p10;
            this.f86171a.setAdapter(p10);
            ((P) this.f86150C).D(this.f86153F ? 2 : 1);
        }
    }

    @Override // l.InterfaceC5127c
    public void onActionViewCollapsed() {
        f0("", false);
        clearFocus();
        r0(true);
        this.f86171a.setImeOptions(this.f86160M);
        this.f86159L = false;
    }

    @Override // l.InterfaceC5127c
    public void onActionViewExpanded() {
        if (this.f86159L) {
            return;
        }
        this.f86159L = true;
        int imeOptions = this.f86171a.getImeOptions();
        this.f86160M = imeOptions;
        this.f86171a.setImeOptions(imeOptions | 33554432);
        this.f86171a.setText("");
        U(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f86163P);
        post(this.f86164Q);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            l(this.f86171a, this.f86182k);
            Rect rect = this.f86183l;
            Rect rect2 = this.f86182k;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            p pVar = this.f86181j;
            if (pVar != null) {
                pVar.a(this.f86183l, this.f86182k);
                return;
            }
            p pVar2 = new p(this.f86183l, this.f86182k, this.f86171a);
            this.f86181j = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (z()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f86155H;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(r(), size);
        } else if (mode == 0) {
            size = this.f86155H;
            if (size <= 0) {
                size = r();
            }
        } else if (mode == 1073741824 && (i12 = this.f86155H) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(q(), size2);
        } else if (mode2 == 0) {
            size2 = q();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        r0(savedState.isIconified);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.isIconified = z();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        R();
    }

    public int p() {
        return this.f86155H;
    }

    public final void p0() {
        this.f86175d.setVisibility((C() && (this.f86177f.getVisibility() == 0 || this.f86179h.getVisibility() == 0)) ? 0 : 8);
    }

    public final int q() {
        return getContext().getResources().getDimensionPixelSize(C4426a.e.f201114c0);
    }

    public final void q0(boolean z10) {
        this.f86177f.setVisibility((this.f86151D && C() && hasFocus() && (z10 || !this.f86156I)) ? 0 : 8);
    }

    public final int r() {
        return getContext().getResources().getDimensionPixelSize(C4426a.e.f201116d0);
    }

    public final void r0(boolean z10) {
        this.f86149B = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f86171a.getText());
        this.f86176e.setVisibility(i11);
        q0(!zIsEmpty);
        this.f86173b.setVisibility(z10 ? 8 : 0);
        if (this.f86186o.getDrawable() != null && !this.f86148A) {
            i10 = 0;
        }
        this.f86186o.setVisibility(i10);
        l0();
        s0(zIsEmpty);
        p0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f86154G || !isFocusable()) {
            return false;
        }
        if (z()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f86171a.requestFocus(i10, rect);
        if (zRequestFocus) {
            r0(false);
        }
        return zRequestFocus;
    }

    public CharSequence s() {
        return this.f86171a.getText();
    }

    public final void s0(boolean z10) {
        int i10 = 8;
        if (this.f86156I && !z() && z10) {
            this.f86177f.setVisibility(8);
            i10 = 0;
        }
        this.f86179h.setVisibility(i10);
    }

    @Nullable
    public CharSequence t() {
        CharSequence charSequence = this.f86152E;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f86161N;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f86192u : getContext().getText(this.f86161N.getHintId());
    }

    public int u() {
        return this.f86189r;
    }

    public int v() {
        return this.f86188q;
    }

    public AbstractC4294a w() {
        return this.f86150C;
    }

    public final boolean x() {
        SearchableInfo searchableInfo = this.f86161N;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.f86161N.getVoiceSearchLaunchWebSearch() ? this.f86190s : this.f86161N.getVoiceSearchLaunchRecognizer() ? this.f86191t : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean y() {
        return this.f86148A;
    }

    public boolean z() {
        return this.f86149B;
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C4426a.b.f200773N2);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f86182k = new Rect();
        this.f86183l = new Rect();
        this.f86184m = new int[2];
        this.f86185n = new int[2];
        this.f86163P = new b();
        this.f86164Q = new c();
        this.f86165R = new WeakHashMap<>();
        f fVar = new f();
        this.f86166S = fVar;
        this.f86167T = new g();
        h hVar = new h();
        this.f86168U = hVar;
        i iVar = new i();
        this.f86169V = iVar;
        j jVar = new j();
        this.f86170W = jVar;
        this.f86172a0 = new a();
        int[] iArr = C4426a.m.f201965b5;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        W w10 = new W(context, typedArrayObtainStyledAttributes);
        C2507z0.E1(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(C4426a.m.f202134v5, C4426a.j.f201370z), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C4426a.g.f201285e0);
        this.f86171a = searchAutoComplete;
        searchAutoComplete.e(this);
        this.f86173b = findViewById(C4426a.g.f201277a0);
        View viewFindViewById = findViewById(C4426a.g.f201283d0);
        this.f86174c = viewFindViewById;
        View viewFindViewById2 = findViewById(C4426a.g.f201305o0);
        this.f86175d = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(C4426a.g.f201274Y);
        this.f86176e = imageView;
        ImageView imageView2 = (ImageView) findViewById(C4426a.g.f201279b0);
        this.f86177f = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C4426a.g.f201275Z);
        this.f86178g = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C4426a.g.f201287f0);
        this.f86179h = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C4426a.g.f201281c0);
        this.f86186o = imageView5;
        viewFindViewById.setBackground(w10.h(C4426a.m.f202142w5));
        viewFindViewById2.setBackground(w10.h(C4426a.m.f201756B5));
        int i11 = C4426a.m.f202166z5;
        imageView.setImageDrawable(w10.h(i11));
        imageView2.setImageDrawable(w10.h(C4426a.m.f202102r5));
        imageView3.setImageDrawable(w10.h(C4426a.m.f202078o5));
        imageView4.setImageDrawable(w10.h(C4426a.m.f201780E5));
        imageView5.setImageDrawable(w10.h(i11));
        this.f86187p = w10.h(C4426a.m.f202158y5);
        b0.a(imageView, getResources().getString(C4426a.k.f201394v));
        this.f86188q = typedArrayObtainStyledAttributes.getResourceId(C4426a.m.f201764C5, C4426a.j.f201369y);
        this.f86189r = typedArrayObtainStyledAttributes.getResourceId(C4426a.m.f202086p5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f86172a0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f86167T);
        searchAutoComplete.setOnFocusChangeListener(new d());
        V(typedArrayObtainStyledAttributes.getBoolean(C4426a.m.f202126u5, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4426a.m.f201992e5, -1);
        if (dimensionPixelSize != -1) {
            Y(dimensionPixelSize);
        }
        this.f86192u = typedArrayObtainStyledAttributes.getText(C4426a.m.f202094q5);
        this.f86152E = typedArrayObtainStyledAttributes.getText(C4426a.m.f202150x5);
        int i12 = typedArrayObtainStyledAttributes.getInt(C4426a.m.f202028i5, -1);
        if (i12 != -1) {
            W(i12);
        }
        int i13 = typedArrayObtainStyledAttributes.getInt(C4426a.m.f202019h5, -1);
        if (i13 != -1) {
            X(i13);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(C4426a.m.f201983d5, true));
        w10.I();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f86190s = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f86191t = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f86180i = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        r0(this.f86148A);
        n0();
    }
}
