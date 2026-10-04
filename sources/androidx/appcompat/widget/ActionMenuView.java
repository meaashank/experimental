package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.LinearLayoutCompat;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements h.b, androidx.appcompat.view.menu.p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f85809m = "ActionMenuView";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f85810n = 56;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f85811o = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.appcompat.view.menu.h f85812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f85813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f85815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionMenuPresenter f85816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o.a f85817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h.a f85818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f85819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f85822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f85823l;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f85824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f85825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f85826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f85827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f85828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f85829f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f85824a = false;
        }

        public LayoutParams(int i10, int i11, boolean z10) {
            super(i10, i11);
            this.f85824a = z10;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f85824a = layoutParams.f85824a;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements o.a {
        @Override // androidx.appcompat.view.menu.o.a
        public boolean a(@NonNull androidx.appcompat.view.menu.h hVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.o.a
        public void onCloseMenu(@NonNull androidx.appcompat.view.menu.h hVar, boolean z10) {
        }
    }

    public class c implements h.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean onMenuItemSelected(@NonNull androidx.appcompat.view.menu.h hVar, @NonNull MenuItem menuItem) {
            d dVar = ActionMenuView.this.f85823l;
            return dVar != null && dVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void onMenuModeChange(@NonNull androidx.appcompat.view.menu.h hVar) {
            h.a aVar = ActionMenuView.this.f85818g;
            if (aVar != null) {
                aVar.onMenuModeChange(hVar);
            }
        }
    }

    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int r(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.e()
            if (r9 == 0) goto L28
            r9 = r2
            goto L29
        L28:
            r9 = r1
        L29:
            if (r7 <= 0) goto L4c
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4c
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L45
            int r4 = r4 + 1
        L45:
            if (r9 == 0) goto L4a
            if (r4 >= r3) goto L4a
            goto L4d
        L4a:
            r3 = r4
            goto L4d
        L4c:
            r3 = r1
        L4d:
            boolean r7 = r0.f85824a
            if (r7 != 0) goto L54
            if (r9 == 0) goto L54
            r1 = r2
        L54:
            r0.f85827d = r1
            r0.f85825b = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.r(android.view.View, int, int, int, int):int");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void A(ActionMenuPresenter actionMenuPresenter) {
        this.f85816e = actionMenuPresenter;
        actionMenuPresenter.B(this);
    }

    public boolean B() {
        ActionMenuPresenter actionMenuPresenter = this.f85816e;
        return actionMenuPresenter != null && actionMenuPresenter.F();
    }

    @Override // androidx.appcompat.view.menu.h.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean a(androidx.appcompat.view.menu.k kVar) {
        return this.f85812a.performItemAction(kVar, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public void e() {
        ActionMenuPresenter actionMenuPresenter = this.f85816e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.q();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.view.menu.p
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public LayoutParams i() {
        LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.f85824a = true;
        return layoutParamsGenerateDefaultLayoutParams;
    }

    @Override // androidx.appcompat.view.menu.p
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void initialize(androidx.appcompat.view.menu.h hVar) {
        this.f85812a = hVar;
    }

    public Menu j() {
        if (this.f85812a == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context);
            this.f85812a = hVar;
            hVar.setCallback(new c());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f85816e = actionMenuPresenter;
            actionMenuPresenter.D(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f85816e;
            o.a bVar = this.f85817f;
            if (bVar == null) {
                bVar = new b();
            }
            actionMenuPresenter2.setCallback(bVar);
            this.f85812a.addMenuPresenter(this.f85816e, this.f85813b);
            this.f85816e.B(this);
        }
        return this.f85812a;
    }

    @Nullable
    public Drawable k() {
        j();
        return this.f85816e.s();
    }

    public int l() {
        return this.f85814c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean m(int i10) {
        boolean zA = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? zA : ((a) childAt2).b() | zA;
    }

    public boolean n() {
        ActionMenuPresenter actionMenuPresenter = this.f85816e;
        return actionMenuPresenter != null && actionMenuPresenter.t();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean o() {
        ActionMenuPresenter actionMenuPresenter = this.f85816e;
        return actionMenuPresenter != null && actionMenuPresenter.v();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f85816e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.f85816e.w()) {
                this.f85816e.t();
                this.f85816e.F();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f85819h) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zB = h0.b(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f85824a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    m(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f85824a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f85824a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = C1497c.a(measuredWidth4, ((LinearLayout.LayoutParams) layoutParams3).rightMargin, iMax, i27);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.h hVar;
        boolean z10 = this.f85819h;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f85819h = z11;
        if (z10 != z11) {
            this.f85820i = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f85819h && (hVar = this.f85812a) != null && size != this.f85820i) {
            this.f85820i = size;
            hVar.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.f85819h && childCount > 0) {
            s(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public boolean p() {
        ActionMenuPresenter actionMenuPresenter = this.f85816e;
        return actionMenuPresenter != null && actionMenuPresenter.w();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean q() {
        return this.f85815d;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v47 */
    public final void s(int i10, int i11) {
        int i12;
        int i13;
        long j10;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        ?? r32;
        int i16;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size - paddingRight;
        int i18 = this.f85821j;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount = getChildCount();
        int iMax = 0;
        int i22 = 0;
        boolean z12 = false;
        int i23 = 0;
        int iMax2 = 0;
        int i24 = 0;
        long j11 = 0;
        while (i22 < childCount) {
            View childAt = getChildAt(i22);
            int i25 = size2;
            if (childAt.getVisibility() == 8) {
                i16 = paddingBottom;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i23++;
                if (z13) {
                    int i26 = this.f85822k;
                    z11 = z13;
                    r32 = 0;
                    childAt.setPadding(i26, 0, i26, 0);
                } else {
                    z11 = z13;
                    r32 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f85829f = r32;
                layoutParams.f85826c = r32;
                layoutParams.f85825b = r32;
                layoutParams.f85827d = r32;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r32;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r32;
                layoutParams.f85828e = z11 && ((ActionMenuItemView) childAt).e();
                int iR = r(childAt, i21, layoutParams.f85824a ? 1 : i19, childMeasureSpec, paddingBottom);
                iMax2 = Math.max(iMax2, iR);
                i16 = paddingBottom;
                if (layoutParams.f85827d) {
                    i24++;
                }
                if (layoutParams.f85824a) {
                    z12 = true;
                }
                i19 -= iR;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iR == 1) {
                    j11 |= (long) (1 << i22);
                    i19 = i19;
                }
            }
            i22++;
            size2 = i25;
            paddingBottom = i16;
        }
        int i27 = size2;
        char c10 = 2;
        boolean z14 = z12 && i23 == 2;
        boolean z15 = false;
        while (i24 > 0 && i19 > 0) {
            long j12 = 0;
            char c11 = c10;
            int i28 = Integer.MAX_VALUE;
            int i29 = 0;
            int i30 = 0;
            j10 = 1;
            while (i30 < childCount) {
                boolean z16 = z14;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i30).getLayoutParams();
                int i31 = i21;
                if (layoutParams2.f85827d) {
                    int i32 = layoutParams2.f85825b;
                    if (i32 < i28) {
                        j12 = 1 << i30;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        j12 |= 1 << i30;
                        i29++;
                    }
                }
                i30++;
                i21 = i31;
                z14 = z16;
            }
            boolean z17 = z14;
            i12 = i21;
            j11 |= j12;
            if (i29 > i19) {
                i13 = iMax;
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount) {
                View childAt2 = getChildAt(i34);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i35 = iMax;
                long j13 = 1 << i34;
                if ((j12 & j13) == 0) {
                    if (layoutParams3.f85825b == i33) {
                        j11 |= j13;
                    }
                    i15 = i34;
                } else {
                    if (!z17 || !layoutParams3.f85828e) {
                        i15 = i34;
                        z10 = true;
                    } else if (i19 == 1) {
                        int i36 = this.f85822k;
                        z10 = true;
                        i15 = i34;
                        childAt2.setPadding(i36 + i12, 0, i36, 0);
                    } else {
                        i15 = i34;
                        z10 = true;
                    }
                    layoutParams3.f85825b++;
                    layoutParams3.f85829f = z10;
                    i19--;
                }
                i34 = i15 + 1;
                iMax = i35;
            }
            i21 = i12;
            c10 = c11;
            z14 = z17;
            z15 = true;
        }
        i12 = i21;
        i13 = iMax;
        j10 = 1;
        boolean z18 = !z12 && i23 == 1;
        if (i19 <= 0 || j11 == 0 || (i19 >= i23 - 1 && !z18 && iMax2 <= 1)) {
            i14 = 0;
        } else {
            float fBitCount = Long.bitCount(j11);
            if (z18) {
                i14 = 0;
            } else {
                if ((j11 & j10) != 0) {
                    i14 = 0;
                    if (!((LayoutParams) getChildAt(0).getLayoutParams()).f85828e) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i14 = 0;
                }
                int i37 = childCount - 1;
                if ((j11 & ((long) (1 << i37))) != 0 && !((LayoutParams) getChildAt(i37).getLayoutParams()).f85828e) {
                    fBitCount -= 0.5f;
                }
            }
            int i38 = fBitCount > 0.0f ? (int) ((i19 * i12) / fBitCount) : i14;
            for (int i39 = i14; i39 < childCount; i39++) {
                if ((j11 & ((long) (1 << i39))) != 0) {
                    View childAt3 = getChildAt(i39);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f85826c = i38;
                        layoutParams4.f85829f = true;
                        if (i39 == 0 && !layoutParams4.f85828e) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i38) / 2;
                        }
                        z15 = true;
                    } else if (layoutParams4.f85824a) {
                        layoutParams4.f85826c = i38;
                        layoutParams4.f85829f = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i38) / 2;
                        z15 = true;
                    } else {
                        if (i39 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i38 / 2;
                        }
                        if (i39 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i38 / 2;
                        }
                    }
                }
            }
        }
        if (z15) {
            for (int i40 = i14; i40 < childCount; i40++) {
                View childAt4 = getChildAt(i40);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f85829f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.f85825b * i12) + layoutParams5.f85826c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i13 : i27);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.menu.h t() {
        return this.f85812a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void u(boolean z10) {
        this.f85816e.z(z10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void v(o.a aVar, h.a aVar2) {
        this.f85817f = aVar;
        this.f85818g = aVar2;
    }

    public void w(d dVar) {
        this.f85823l = dVar;
    }

    public void x(@Nullable Drawable drawable) {
        j();
        this.f85816e.C(drawable);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void y(boolean z10) {
        this.f85815d = z10;
    }

    public void z(@e.a0 int i10) {
        if (this.f85814c != i10) {
            this.f85814c = i10;
            if (i10 == 0) {
                this.f85813b = getContext();
            } else {
                this.f85813b = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f85821j = (int) (56.0f * f10);
        this.f85822k = (int) (f10 * 4.0f);
        this.f85813b = context;
        this.f85814c = 0;
    }
}
