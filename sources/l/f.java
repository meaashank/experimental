package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.q;
import androidx.collection.U0;
import java.util.ArrayList;
import l.AbstractC5126b;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f220827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5126b f220828b;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class a implements AbstractC5126b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f220829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f220830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<f> f220831c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final U0<Menu, Menu> f220832d = new U0<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f220830b = context;
            this.f220829a = callback;
        }

        @Override // l.AbstractC5126b.a
        public boolean a(AbstractC5126b abstractC5126b, MenuItem menuItem) {
            return this.f220829a.onActionItemClicked(e(abstractC5126b), new l(this.f220830b, (L0.c) menuItem));
        }

        @Override // l.AbstractC5126b.a
        public boolean b(AbstractC5126b abstractC5126b, Menu menu) {
            return this.f220829a.onCreateActionMode(e(abstractC5126b), f(menu));
        }

        @Override // l.AbstractC5126b.a
        public boolean c(AbstractC5126b abstractC5126b, Menu menu) {
            return this.f220829a.onPrepareActionMode(e(abstractC5126b), f(menu));
        }

        @Override // l.AbstractC5126b.a
        public void d(AbstractC5126b abstractC5126b) {
            this.f220829a.onDestroyActionMode(e(abstractC5126b));
        }

        public ActionMode e(AbstractC5126b abstractC5126b) {
            int size = this.f220831c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f220831c.get(i10);
                if (fVar != null && fVar.f220828b == abstractC5126b) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f220830b, abstractC5126b);
            this.f220831c.add(fVar2);
            return fVar2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = this.f220832d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            q qVar = new q(this.f220830b, (L0.a) menu);
            this.f220832d.put(menu, qVar);
            return qVar;
        }
    }

    public f(Context context, AbstractC5126b abstractC5126b) {
        this.f220827a = context;
        this.f220828b = abstractC5126b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f220828b.a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f220828b.b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new q(this.f220827a, (L0.a) this.f220828b.c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f220828b.d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f220828b.e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f220828b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f220828b.g();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f220828b.h();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f220828b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f220828b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f220828b.l(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f220828b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f220828b.o(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f220828b.q(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f220828b.r(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f220828b.m(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f220828b.p(i10);
    }
}
