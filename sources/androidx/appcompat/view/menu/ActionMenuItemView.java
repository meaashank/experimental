package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.F;
import androidx.appcompat.widget.b0;
import g.C4426a;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionMenuItemView extends AppCompatTextView implements p.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f85488l = "ActionMenuItemView";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f85489m = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f85490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f85491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f85492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h.b f85493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public F f85494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f85495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f85496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f85497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f85500k;

    public class a extends F {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.F
        public r b() {
            b bVar = ActionMenuItemView.this.f85495f;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.F
        public boolean c() {
            r rVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            h.b bVar = actionMenuItemView.f85493d;
            return bVar != null && bVar.a(actionMenuItemView.f85490a) && (rVarB = b()) != null && rVarB.a();
        }
    }

    public static abstract class b {
        public abstract r a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return e();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return e() && this.f85490a.getIcon() == null;
    }

    public boolean e() {
        return !TextUtils.isEmpty(getText());
    }

    public void f(boolean z10) {
        if (this.f85497h != z10) {
            this.f85497h = z10;
            k kVar = this.f85490a;
            if (kVar != null) {
                kVar.e();
            }
        }
    }

    public void g(h.b bVar) {
        this.f85493d = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.p.a
    public k getItemData() {
        return this.f85490a;
    }

    public void h(b bVar) {
        this.f85495f = bVar;
    }

    public final boolean i() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void initialize(k kVar, int i10) {
        this.f85490a = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.l(this));
        setId(kVar.f85650l);
        setVisibility(kVar.isVisible() ? 0 : 8);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f85494e == null) {
            this.f85494e = new a();
        }
    }

    public final void j() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f85491b);
        if (this.f85492c != null && (!this.f85490a.E() || (!this.f85496g && !this.f85497h))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f85491b : null);
        CharSequence charSequence = this.f85490a.f85636C;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z12 ? null : this.f85490a.f85654p);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f85490a.f85637D;
        if (TextUtils.isEmpty(charSequence2)) {
            b0.a(this, z12 ? null : this.f85490a.f85654p);
        } else {
            b0.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        h.b bVar = this.f85493d;
        if (bVar != null) {
            bVar.a(this.f85490a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f85496g = i();
        j();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean zE = e();
        if (zE && (i12 = this.f85499j) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f85498i) : this.f85498i;
        if (mode != 1073741824 && this.f85498i > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zE || this.f85492c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f85492c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        F f10;
        if (this.f85490a.hasSubMenu() && (f10 = this.f85494e) != null && f10.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public boolean prefersCondensedTitle() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setCheckable(boolean z10) {
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setChecked(boolean z10) {
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setIcon(Drawable drawable) {
        this.f85492c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f85500k;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        j();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f85499j = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setShortcut(boolean z10, char c10) {
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setTitle(CharSequence charSequence) {
        this.f85491b = charSequence;
        j();
    }

    @Override // androidx.appcompat.view.menu.p.a
    public boolean showsIcon() {
        return true;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f85496g = i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4426a.m.f201790G, i10, 0);
        this.f85498i = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4426a.m.f201798H, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f85500k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f85499j = -1;
        setSaveEnabled(false);
    }
}
