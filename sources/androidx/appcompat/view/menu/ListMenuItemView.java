package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.W;
import androidx.core.view.C2507z0;
import g.C4426a;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements p.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f85505r = "ListMenuItemView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f85506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f85507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f85508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f85509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f85510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f85511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f85512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f85513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f85514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f85515j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f85516k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f85517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f85518m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f85519n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f85520o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayoutInflater f85521p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f85522q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4426a.b.f200827Y1);
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f85513h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f85513h.getLayoutParams();
        rect.top = this.f85513h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    public final void b(View view, int i10) {
        LinearLayout linearLayout = this.f85514i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    public final LayoutInflater c() {
        if (this.f85521p == null) {
            this.f85521p = LayoutInflater.from(getContext());
        }
        return this.f85521p;
    }

    public final void d() {
        CheckBox checkBox = (CheckBox) c().inflate(C4426a.j.f201359o, (ViewGroup) this, false);
        this.f85510e = checkBox;
        b(checkBox, -1);
    }

    public final void e() {
        ImageView imageView = (ImageView) c().inflate(C4426a.j.f201360p, (ViewGroup) this, false);
        this.f85507b = imageView;
        b(imageView, 0);
    }

    public final void f() {
        RadioButton radioButton = (RadioButton) c().inflate(C4426a.j.f201362r, (ViewGroup) this, false);
        this.f85508c = radioButton;
        b(radioButton, -1);
    }

    public void g(boolean z10) {
        this.f85522q = z10;
        this.f85518m = z10;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public k getItemData() {
        return this.f85506a;
    }

    public void h(boolean z10) {
        ImageView imageView = this.f85513h;
        if (imageView != null) {
            imageView.setVisibility((this.f85520o || !z10) ? 8 : 0);
        }
    }

    public final void i(boolean z10) {
        ImageView imageView = this.f85512g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void initialize(k kVar, int i10) {
        this.f85506a = kVar;
        setVisibility(kVar.isVisible() ? 0 : 8);
        setTitle(kVar.l(this));
        setCheckable(kVar.isCheckable());
        setShortcut(kVar.D(), kVar.j());
        setIcon(kVar.getIcon());
        setEnabled(kVar.isEnabled());
        i(kVar.hasSubMenu());
        setContentDescription(kVar.f85636C);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        C2507z0.O1(this, this.f85515j);
        TextView textView = (TextView) findViewById(C4426a.g.f201313s0);
        this.f85509d = textView;
        int i10 = this.f85516k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f85517l, i10);
        }
        this.f85511f = (TextView) findViewById(C4426a.g.f201291h0);
        ImageView imageView = (ImageView) findViewById(C4426a.g.f201303n0);
        this.f85512g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f85519n);
        }
        this.f85513h = (ImageView) findViewById(C4426a.g.f201252C);
        this.f85514i = (LinearLayout) findViewById(C4426a.g.f201314t);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f85507b != null && this.f85518m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f85507b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f85508c == null && this.f85510e == null) {
            return;
        }
        if (this.f85506a.p()) {
            if (this.f85508c == null) {
                f();
            }
            compoundButton = this.f85508c;
            view = this.f85510e;
        } else {
            if (this.f85510e == null) {
                d();
            }
            compoundButton = this.f85510e;
            view = this.f85508c;
        }
        if (z10) {
            compoundButton.setChecked(this.f85506a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f85510e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f85508c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f85506a.p()) {
            if (this.f85508c == null) {
                f();
            }
            compoundButton = this.f85508c;
        } else {
            if (this.f85510e == null) {
                d();
            }
            compoundButton = this.f85510e;
        }
        compoundButton.setChecked(z10);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setIcon(Drawable drawable) {
        boolean z10 = this.f85506a.f85663y.getOptionalIconsVisible() || this.f85522q;
        if (z10 || this.f85518m) {
            ImageView imageView = this.f85507b;
            if (imageView == null && drawable == null && !this.f85518m) {
                return;
            }
            if (imageView == null) {
                e();
            }
            if (drawable == null && !this.f85518m) {
                this.f85507b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f85507b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f85507b.getVisibility() != 0) {
                this.f85507b.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setShortcut(boolean z10, char c10) {
        int i10 = (z10 && this.f85506a.D()) ? 0 : 8;
        if (i10 == 0) {
            this.f85511f.setText(this.f85506a.k());
        }
        if (this.f85511f.getVisibility() != i10) {
            this.f85511f.setVisibility(i10);
        }
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f85509d.getVisibility() != 8) {
                this.f85509d.setVisibility(8);
            }
        } else {
            this.f85509d.setText(charSequence);
            if (this.f85509d.getVisibility() != 0) {
                this.f85509d.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p.a
    public boolean showsIcon() {
        return this.f85522q;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        W wG = W.G(getContext(), attributeSet, C4426a.m.f201811I4, i10, 0);
        this.f85515j = wG.h(C4426a.m.f201859O4);
        this.f85516k = wG.f86249b.getResourceId(C4426a.m.f201827K4, -1);
        this.f85518m = wG.f86249b.getBoolean(C4426a.m.f201875Q4, false);
        this.f85517l = context;
        this.f85519n = wG.h(C4426a.m.f201883R4);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C4426a.b.f200925p1, 0);
        this.f85520o = typedArrayObtainStyledAttributes.hasValue(0);
        wG.I();
        typedArrayObtainStyledAttributes.recycle();
    }
}
