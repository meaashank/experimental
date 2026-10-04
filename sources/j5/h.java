package j5;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toolbar;
import androidx.annotation.Nullable;
import e.C;
import java.util.ArrayList;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public class h extends j {

    @TargetApi(21)
    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Toolbar f214177a;

        public a(Toolbar toolbar) {
            this.f214177a = toolbar;
        }

        @Override // j5.h.c
        public View a(int i10) {
            return this.f214177a.getChildAt(i10);
        }

        @Override // j5.h.c
        public int b() {
            return this.f214177a.getChildCount();
        }

        @Override // j5.h.c
        public void c(CharSequence charSequence) {
            this.f214177a.setNavigationContentDescription(charSequence);
        }

        @Override // j5.h.c
        public void d(ArrayList<View> arrayList, CharSequence charSequence, int i10) {
            this.f214177a.findViewsWithText(arrayList, charSequence, i10);
        }

        @Override // j5.h.c
        public CharSequence e() {
            return this.f214177a.getNavigationContentDescription();
        }

        @Override // j5.h.c
        public Drawable f() {
            return this.f214177a.getNavigationIcon();
        }

        @Override // j5.h.c
        @Nullable
        public Drawable g() {
            return this.f214177a.getOverflowIcon();
        }

        @Override // j5.h.c
        public Object h() {
            return this.f214177a;
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.appcompat.widget.Toolbar f214178a;

        public b(androidx.appcompat.widget.Toolbar toolbar) {
            this.f214178a = toolbar;
        }

        @Override // j5.h.c
        public View a(int i10) {
            return this.f214178a.getChildAt(i10);
        }

        @Override // j5.h.c
        public int b() {
            return this.f214178a.getChildCount();
        }

        @Override // j5.h.c
        public void c(CharSequence charSequence) {
            this.f214178a.setNavigationContentDescription(charSequence);
        }

        @Override // j5.h.c
        public void d(ArrayList<View> arrayList, CharSequence charSequence, int i10) {
            this.f214178a.findViewsWithText(arrayList, charSequence, i10);
        }

        @Override // j5.h.c
        public CharSequence e() {
            return this.f214178a.getNavigationContentDescription();
        }

        @Override // j5.h.c
        public Drawable f() {
            return this.f214178a.getNavigationIcon();
        }

        @Override // j5.h.c
        public Drawable g() {
            return this.f214178a.getOverflowIcon();
        }

        @Override // j5.h.c
        public Object h() {
            return this.f214178a;
        }
    }

    public interface c {
        View a(int i10);

        int b();

        void c(CharSequence charSequence);

        void d(ArrayList<View> arrayList, CharSequence charSequence, int i10);

        CharSequence e();

        Drawable f();

        @Nullable
        Drawable g();

        Object h();
    }

    public h(androidx.appcompat.widget.Toolbar toolbar, @C int i10, CharSequence charSequence, @Nullable CharSequence charSequence2) {
        super(toolbar.findViewById(i10), charSequence, charSequence2);
    }

    public static View f0(Object obj) {
        c cVarH0 = h0(obj);
        CharSequence charSequenceE = cVarH0.e();
        boolean zIsEmpty = TextUtils.isEmpty(charSequenceE);
        if (zIsEmpty) {
            charSequenceE = "taptarget-findme";
        }
        cVarH0.c(charSequenceE);
        ArrayList<View> arrayList = new ArrayList<>(1);
        cVarH0.d(arrayList, charSequenceE, 2);
        if (zIsEmpty) {
            cVarH0.c(null);
        }
        if (arrayList.size() > 0) {
            return arrayList.get(0);
        }
        Drawable drawableF = cVarH0.f();
        if (drawableF == null) {
            throw new IllegalStateException("Toolbar does not have a navigation view set!");
        }
        int iB = cVarH0.b();
        for (int i10 = 0; i10 < iB; i10++) {
            View viewA = cVarH0.a(i10);
            if ((viewA instanceof ImageButton) && ((ImageButton) viewA).getDrawable() == drawableF) {
                return viewA;
            }
        }
        throw new IllegalStateException("Could not find navigation view for Toolbar!");
    }

    public static View g0(Object obj) {
        c cVarH0 = h0(obj);
        Drawable drawableG = cVarH0.g();
        if (drawableG != null) {
            Stack stack = new Stack();
            stack.push((ViewGroup) cVarH0.h());
            while (!stack.empty()) {
                ViewGroup viewGroup = (ViewGroup) stack.pop();
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt instanceof ViewGroup) {
                        stack.push((ViewGroup) childAt);
                    } else if ((childAt instanceof ImageView) && ((ImageView) childAt).getDrawable() == drawableG) {
                        return childAt;
                    }
                }
            }
        }
        try {
            return (View) d.a(d.a(d.a(cVarH0.h(), "mMenuView"), "mPresenter"), "mOverflowButton");
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unable to access overflow view for Toolbar!", e10);
        } catch (NoSuchFieldException e11) {
            throw new IllegalStateException("Could not find overflow view for Toolbar!", e11);
        }
    }

    public static c h0(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Given null instance");
        }
        if (obj instanceof androidx.appcompat.widget.Toolbar) {
            return new b((androidx.appcompat.widget.Toolbar) obj);
        }
        if (obj instanceof Toolbar) {
            return new a((Toolbar) obj);
        }
        throw new IllegalStateException("Couldn't provide proper toolbar proxy instance");
    }

    public h(Toolbar toolbar, @C int i10, CharSequence charSequence, @Nullable CharSequence charSequence2) {
        super(toolbar.findViewById(i10), charSequence, charSequence2);
    }

    public h(androidx.appcompat.widget.Toolbar toolbar, boolean z10, CharSequence charSequence, @Nullable CharSequence charSequence2) {
        super(z10 ? f0(toolbar) : g0(toolbar), charSequence, charSequence2);
    }

    public h(Toolbar toolbar, boolean z10, CharSequence charSequence, @Nullable CharSequence charSequence2) {
        super(z10 ? f0(toolbar) : g0(toolbar), charSequence, charSequence2);
    }
}
