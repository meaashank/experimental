package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.B;
import androidx.appcompat.widget.W;
import androidx.core.view.AbstractC2440b;
import androidx.core.view.Q;
import e.G;
import g.C4426a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f220833e = "SupportMenuInflater";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f220834f = "menu";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f220835g = "group";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f220836h = "item";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f220837i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Class<?>[] f220838j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Class<?>[] f220839k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f220840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f220841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f220842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f220843d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class<?>[] f220844c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f220845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f220846b;

        public a(Object obj, String str) {
            this.f220845a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f220846b = cls.getMethod(str, f220844c);
            } catch (Exception e10) {
                StringBuilder sbA = androidx.activity.result.i.a("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbA.append(cls.getName());
                InflateException inflateException = new InflateException(sbA.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f220846b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f220846b.invoke(this.f220845a, menuItem)).booleanValue();
                }
                this.f220846b.invoke(this.f220845a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public class b {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final int f220847G = 0;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final int f220848H = 0;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final int f220849I = 0;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final int f220850J = 0;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static final int f220851K = 0;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final boolean f220852L = false;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public static final boolean f220853M = true;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final boolean f220854N = true;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public AbstractC2440b f220855A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public CharSequence f220856B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public CharSequence f220857C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public ColorStateList f220858D = null;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public PorterDuff.Mode f220859E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Menu f220861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f220862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f220863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f220864d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f220865e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f220866f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f220867g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f220868h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f220869i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f220870j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f220871k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f220872l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f220873m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public char f220874n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f220875o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public char f220876p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f220877q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f220878r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f220879s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f220880t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f220881u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f220882v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f220883w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f220884x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f220885y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f220886z;

        public b(Menu menu) {
            this.f220861a = menu;
            h();
        }

        public void a() {
            this.f220868h = true;
            i(this.f220861a.add(this.f220862b, this.f220869i, this.f220870j, this.f220871k));
        }

        public SubMenu b() {
            this.f220868h = true;
            SubMenu subMenuAddSubMenu = this.f220861a.addSubMenu(this.f220862b, this.f220869i, this.f220870j, this.f220871k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f220868h;
        }

        public final <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f220842c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w(g.f220833e, "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f220842c.obtainStyledAttributes(attributeSet, C4426a.m.f201982d4);
            this.f220862b = typedArrayObtainStyledAttributes.getResourceId(C4426a.m.f202000f4, 0);
            this.f220863c = typedArrayObtainStyledAttributes.getInt(C4426a.m.f202018h4, 0);
            this.f220864d = typedArrayObtainStyledAttributes.getInt(C4426a.m.f202027i4, 0);
            this.f220865e = typedArrayObtainStyledAttributes.getInt(C4426a.m.f202036j4, 0);
            this.f220866f = typedArrayObtainStyledAttributes.getBoolean(C4426a.m.f202009g4, true);
            this.f220867g = typedArrayObtainStyledAttributes.getBoolean(C4426a.m.f201991e4, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            W wF = W.F(g.this.f220842c, attributeSet, C4426a.m.f202045k4);
            this.f220869i = wF.f86249b.getResourceId(C4426a.m.f202069n4, 0);
            this.f220870j = (wF.f86249b.getInt(C4426a.m.f202093q4, this.f220863c) & (-65536)) | (wF.f86249b.getInt(C4426a.m.f202101r4, this.f220864d) & 65535);
            this.f220871k = wF.f86249b.getText(C4426a.m.f202109s4);
            this.f220872l = wF.f86249b.getText(C4426a.m.f202117t4);
            this.f220873m = wF.f86249b.getResourceId(C4426a.m.f202053l4, 0);
            this.f220874n = c(wF.f86249b.getString(C4426a.m.f202125u4));
            this.f220875o = wF.f86249b.getInt(C4426a.m.f201755B4, 4096);
            this.f220876p = c(wF.f86249b.getString(C4426a.m.f202133v4));
            this.f220877q = wF.f86249b.getInt(C4426a.m.f201787F4, 4096);
            int i10 = C4426a.m.f202141w4;
            if (wF.f86249b.hasValue(i10)) {
                this.f220878r = wF.f86249b.getBoolean(i10, false) ? 1 : 0;
            } else {
                this.f220878r = this.f220865e;
            }
            this.f220879s = wF.f86249b.getBoolean(C4426a.m.f202077o4, false);
            this.f220880t = wF.f86249b.getBoolean(C4426a.m.f202085p4, this.f220866f);
            this.f220881u = wF.f86249b.getBoolean(C4426a.m.f202061m4, this.f220867g);
            this.f220882v = wF.f86249b.getInt(C4426a.m.f201795G4, -1);
            this.f220886z = wF.f86249b.getString(C4426a.m.f202149x4);
            this.f220883w = wF.f86249b.getResourceId(C4426a.m.f202157y4, 0);
            this.f220884x = wF.f86249b.getString(C4426a.m.f201747A4);
            String string = wF.f86249b.getString(C4426a.m.f202165z4);
            this.f220885y = string;
            boolean z10 = string != null;
            if (z10 && this.f220883w == 0 && this.f220884x == null) {
                this.f220855A = (AbstractC2440b) e(string, g.f220839k, g.this.f220841b);
            } else {
                if (z10) {
                    Log.w(g.f220833e, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f220855A = null;
            }
            this.f220856B = wF.f86249b.getText(C4426a.m.f201763C4);
            this.f220857C = wF.f86249b.getText(C4426a.m.f201803H4);
            int i11 = C4426a.m.f201779E4;
            if (wF.f86249b.hasValue(i11)) {
                this.f220859E = B.e(wF.f86249b.getInt(i11, -1), this.f220859E);
            } else {
                this.f220859E = null;
            }
            int i12 = C4426a.m.f201771D4;
            if (wF.f86249b.hasValue(i12)) {
                this.f220858D = wF.d(i12);
            } else {
                this.f220858D = null;
            }
            wF.I();
            this.f220868h = false;
        }

        public void h() {
            this.f220862b = 0;
            this.f220863c = 0;
            this.f220864d = 0;
            this.f220865e = 0;
            this.f220866f = true;
            this.f220867g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f220879s).setVisible(this.f220880t).setEnabled(this.f220881u).setCheckable(this.f220878r >= 1).setTitleCondensed(this.f220872l).setIcon(this.f220873m);
            int i10 = this.f220882v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f220886z != null) {
                if (g.this.f220842c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f220886z));
            }
            if (this.f220878r >= 2) {
                if (menuItem instanceof k) {
                    ((k) menuItem).w(true);
                } else if (menuItem instanceof l) {
                    ((l) menuItem).j(true);
                }
            }
            String str = this.f220884x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f220838j, g.this.f220840a));
                z10 = true;
            }
            int i11 = this.f220883w;
            if (i11 > 0) {
                if (z10) {
                    Log.w(g.f220833e, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC2440b abstractC2440b = this.f220855A;
            if (abstractC2440b != null) {
                Q.l(menuItem, abstractC2440b);
            }
            Q.p(menuItem, this.f220856B);
            Q.w(menuItem, this.f220857C);
            Q.o(menuItem, this.f220874n, this.f220875o);
            Q.s(menuItem, this.f220876p, this.f220877q);
            PorterDuff.Mode mode = this.f220859E;
            if (mode != null) {
                Q.r(menuItem, mode);
            }
            ColorStateList colorStateList = this.f220858D;
            if (colorStateList != null) {
                Q.q(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f220838j = clsArr;
        f220839k = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f220842c = context;
        Object[] objArr = {context};
        this.f220840a = objArr;
        this.f220841b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f220843d == null) {
            this.f220843d = a(this.f220842c);
        }
        return this.f220843d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals(f220834f)) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        z11 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.f220868h) {
                            AbstractC2440b abstractC2440b = bVar.f220855A;
                            if (abstractC2440b == null || !abstractC2440b.b()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals(f220834f)) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals(f220834f)) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(@G int i10, Menu menu) {
        if (!(menu instanceof L0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f220842c.getResources().getLayout(i10);
                    c(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
